//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import org.cqframework.cql.execution.Context;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;


/**
 * The ProperIncludedIn operator returns true if the first operand is included in the second, and is strictly smaller.
 * 			
 * There are two overloads of this operator:
 * 	List, List : The element type of both lists must be the same.
 * 	Interval, Interval : The point type of both intervals must be the same.
 * 
 * For the List, List overload, this operator returns true if every element of the first list is included in the second list, using equivalence semantics, and the first list is strictly smaller.
 * 
 * For the Interval, Interval overload, this operator returns true if the first interval is included in the second interval, and the intervals are not equal.
 * 
 * This operator uses the semantics described in the Start and End operators to determine interval boundaries.
 * 
 * If either argument is null, the result is null.
 * 
 * <p>Java class for ProperIncludedIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProperIncludedIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}BinaryExpression"&gt;
 *       &lt;attribute name="precision" type="{urn:hl7-org:elm:r1}DateTimePrecision" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProperIncludedIn", namespace = "urn:hl7-org:elm:r1")
public class ProperIncludedIn
    extends BinaryExpression
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "precision")
    protected DateTimePrecision precision;

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePrecision }
     *     
     */
    public DateTimePrecision getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePrecision }
     *     
     */
    public void setPrecision(DateTimePrecision value) {
        this.precision = value;
    }

    public ProperIncludedIn withPrecision(DateTimePrecision value) {
        setPrecision(value);
        return this;
    }

    @Override
    public ProperIncludedIn withOperand(Expression... values) {
        if (values!= null) {
            for (Expression value: values) {
                getOperand().add(value);
            }
        }
        return this;
    }

    @Override
    public ProperIncludedIn withOperand(Collection<Expression> values) {
        if (values!= null) {
            getOperand().addAll(values);
        }
        return this;
    }

    @Override
    public ProperIncludedIn withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public ProperIncludedIn withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public ProperIncludedIn withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProperIncludedIn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProperIncludedIn that = ((ProperIncludedIn) object);
        {
            DateTimePrecision lhsPrecision;
            lhsPrecision = this.getPrecision();
            DateTimePrecision rhsPrecision;
            rhsPrecision = that.getPrecision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "precision", lhsPrecision), LocatorUtils.property(thatLocator, "precision", rhsPrecision), lhsPrecision, rhsPrecision)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DateTimePrecision thePrecision;
            thePrecision = this.getPrecision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "precision", thePrecision), currentHashCode, thePrecision);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            DateTimePrecision thePrecision;
            thePrecision = this.getPrecision();
            strategy.appendField(locator, this, "precision", buffer, thePrecision);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        java.util.List<Expression> expressions = getOperand();
        if (expressions.size() == 0) return null;

        Object left = expressions.get(0).evaluate(context);
        Object right = expressions.get(1).evaluate(context);

        if (left == null || right == null || left instanceof Iterable == false || right instanceof Iterable == false) {
            return null;
        }

        ArrayList leftList = null;
        if(left instanceof java.util.List){
            leftList = new ArrayList((java.util.List)left);
        }else  {
            leftList = new ArrayList();
            ((Iterable) left).forEach(leftList::add);
        }

        ArrayList rightList = null;
        if(right instanceof java.util.List){
            rightList = new ArrayList((java.util.List)right);
        }else  {
            rightList = new ArrayList();
            ((Iterable) right).forEach(rightList::add);
        }

        return rightList.size() > leftList.size() ? rightList.containsAll(leftList) : false;
    }
}
