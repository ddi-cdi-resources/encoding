//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             A structured display label. Label provides display content of a fully human readable display for the identification of the object.
 * 
 * <p>Java class for LabelForDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LabelForDisplay">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString">
 *       <sequence>
 *         <element name="locationVariant" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="validDates" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DateRange" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelForDisplay", propOrder = {
    "locationVariant",
    "maxLength",
    "validDates"
})
public class LabelForDisplay
    extends InternationalString
{

    protected ControlledVocabularyEntry locationVariant;
    protected BigInteger maxLength;
    protected DateRange validDates;

    /**
     * Gets the value of the locationVariant property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getLocationVariant() {
        return locationVariant;
    }

    /**
     * Sets the value of the locationVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setLocationVariant(ControlledVocabularyEntry value) {
        this.locationVariant = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the validDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getValidDates() {
        return validDates;
    }

    /**
     * Sets the value of the validDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setValidDates(DateRange value) {
        this.validDates = value;
    }

}
