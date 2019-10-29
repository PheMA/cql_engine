package org.opencds.cqf.cql.retrieve;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.instance.model.Bundle;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.opencds.cqf.cql.exception.UnknownElement;

import java.util.Iterator;

public class FhirBundleCursor implements Iterable<Object> {

    public FhirBundleCursor(IGenericClient fhirClient, Bundle results)
    {
        this(fhirClient, results, null);
    }

    // This constructor filters the bundle based on dataType
    public FhirBundleCursor(IGenericClient fhirClient, Bundle results, String dataType) {
        this.fhirClient = fhirClient;

        if (dataType != null) {
            results = cleanEntry(results, dataType);
        }

        this.results = results;
    }

    private IGenericClient fhirClient;
    private Bundle results;

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<Object> iterator() {
        return new FhirBundleIterator(fhirClient, results);
    }


    private org.hl7.fhir.instance.model.Bundle cleanEntry(org.hl7.fhir.instance.model.Bundle bundle, String dataType) {
        org.hl7.fhir.instance.model.Bundle cleanBundle = new org.hl7.fhir.instance.model.Bundle();
        for (org.hl7.fhir.instance.model.Bundle.BundleEntryComponent comp : bundle.getEntry()){
            if (comp.getResource().getResourceType().name().equals(dataType)) {
                cleanBundle.addEntry(comp);
            }
        }

        return cleanBundle;
    }

    private class FhirBundleIterator implements Iterator<Object> {
        public FhirBundleIterator(IGenericClient fhirClient, Bundle results) {
            this.fhirClient = fhirClient;
            this.results =  results;
            this.current = -1;
        }

        private IGenericClient fhirClient;
        private Bundle results;
        private int current;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        public boolean hasNext() {
            return current < results.getEntry().size() - 1
                    || results.getLink(IBaseBundle.LINK_NEXT) != null;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws UnknownElement if the iteration has no more elements
         */
        public Object next() {
            current++;
            if (current < results.getEntry().size()) {
                return results.getEntry().get(current).getResource();
            } else {
                results = fhirClient.loadPage().next(results).execute();
                current = 0;
                if (current < results.getEntry().size()) {
                    return results.getEntry().get(current).getResource();
                }
            }

            // TODO: It would be possible to get here if the next link was present, but the returned page had 0 entries...
            throw new UnknownElement("The iteration has no more elements.");
        }
    }
}
