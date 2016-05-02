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

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.Collection;


/**
 * The As operator allows the result of an expression to be cast as a given target type. This allows expressions to be written that are statically typed against the expected run-time type of the argument. If the argument is not of the specified type, and the strict attribute is false (the default), the result is null. If the argument is not of the specified type and the strict attribute is true, an exception is thrown.
 * 
 * <p>Java class for As complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="As"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asTypeSpecifier" type="{urn:hl7-org:elm:r1}TypeSpecifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="asType" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="strict" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "As", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "asTypeSpecifier"
})
public class As
    extends UnaryExpression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected TypeSpecifier asTypeSpecifier;
    @XmlAttribute(name = "asType")
    protected QName asType;
    @XmlAttribute(name = "strict")
    protected Boolean strict;

    /**
     * Gets the value of the asTypeSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecifier }
     *     
     */
    public TypeSpecifier getAsTypeSpecifier() {
        return asTypeSpecifier;
    }

    /**
     * Sets the value of the asTypeSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecifier }
     *     
     */
    public void setAsTypeSpecifier(TypeSpecifier value) {
        this.asTypeSpecifier = value;
    }

    /**
     * Gets the value of the asType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getAsType() {
        return asType;
    }

    /**
     * Sets the value of the asType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setAsType(QName value) {
        this.asType = value;
    }

    /**
     * Gets the value of the strict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrict() {
        if (strict == null) {
            return false;
        } else {
            return strict;
        }
    }

    /**
     * Sets the value of the strict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrict(Boolean value) {
        this.strict = value;
    }

    public As withAsTypeSpecifier(TypeSpecifier value) {
        setAsTypeSpecifier(value);
        return this;
    }

    public As withAsType(QName value) {
        setAsType(value);
        return this;
    }

    public As withStrict(Boolean value) {
        setStrict(value);
        return this;
    }

    @Override
    public As withOperand(Expression value) {
        setOperand(value);
        return this;
    }

    @Override
    public As withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public As withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public As withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof As)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final As that = ((As) object);
        {
            TypeSpecifier lhsAsTypeSpecifier;
            lhsAsTypeSpecifier = this.getAsTypeSpecifier();
            TypeSpecifier rhsAsTypeSpecifier;
            rhsAsTypeSpecifier = that.getAsTypeSpecifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asTypeSpecifier", lhsAsTypeSpecifier), LocatorUtils.property(thatLocator, "asTypeSpecifier", rhsAsTypeSpecifier), lhsAsTypeSpecifier, rhsAsTypeSpecifier)) {
                return false;
            }
        }
        {
            QName lhsAsType;
            lhsAsType = this.getAsType();
            QName rhsAsType;
            rhsAsType = that.getAsType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asType", lhsAsType), LocatorUtils.property(thatLocator, "asType", rhsAsType), lhsAsType, rhsAsType)) {
                return false;
            }
        }
        {
            boolean lhsStrict;
            lhsStrict = ((this.strict!= null)?this.isStrict():false);
            boolean rhsStrict;
            rhsStrict = ((that.strict!= null)?that.isStrict():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strict", lhsStrict), LocatorUtils.property(thatLocator, "strict", rhsStrict), lhsStrict, rhsStrict)) {
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
            TypeSpecifier theAsTypeSpecifier;
            theAsTypeSpecifier = this.getAsTypeSpecifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asTypeSpecifier", theAsTypeSpecifier), currentHashCode, theAsTypeSpecifier);
        }
        {
            QName theAsType;
            theAsType = this.getAsType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asType", theAsType), currentHashCode, theAsType);
        }
        {
            boolean theStrict;
            theStrict = ((this.strict!= null)?this.isStrict():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strict", theStrict), currentHashCode, theStrict);
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
            TypeSpecifier theAsTypeSpecifier;
            theAsTypeSpecifier = this.getAsTypeSpecifier();
            strategy.appendField(locator, this, "asTypeSpecifier", buffer, theAsTypeSpecifier);
        }
        {
            QName theAsType;
            theAsType = this.getAsType();
            strategy.appendField(locator, this, "asType", buffer, theAsType);
        }
        {
            boolean theStrict;
            theStrict = ((this.strict!= null)?this.isStrict():false);
            strategy.appendField(locator, this, "strict", buffer, theStrict);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        Expression operand = getOperand();
        if(operand != null){

        }

        return null;
    }
}
