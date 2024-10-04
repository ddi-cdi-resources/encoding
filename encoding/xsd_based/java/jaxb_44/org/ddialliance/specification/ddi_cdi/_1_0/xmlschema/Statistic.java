//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             The value of the statistic expressed as a decimal, float and/or double. Indicates whether it is weighted value and the computation base.
 * 
 * <p>Java class for Statistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Statistic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="computationBase" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ComputationBaseList" minOccurs="0"/>
 *         <element name="content" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="isWeighted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="typeOfNumericValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statistic", propOrder = {
    "computationBase",
    "content",
    "isWeighted",
    "typeOfNumericValue"
})
public class Statistic {

    @XmlSchemaType(name = "NMTOKEN")
    protected ComputationBaseList computationBase;
    protected Double content;
    protected Boolean isWeighted;
    protected String typeOfNumericValue;

    /**
     * Gets the value of the computationBase property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationBaseList }
     *     
     */
    public ComputationBaseList getComputationBase() {
        return computationBase;
    }

    /**
     * Sets the value of the computationBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationBaseList }
     *     
     */
    public void setComputationBase(ComputationBaseList value) {
        this.computationBase = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent(Double value) {
        this.content = value;
    }

    /**
     * Gets the value of the isWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWeighted() {
        return isWeighted;
    }

    /**
     * Sets the value of the isWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWeighted(Boolean value) {
        this.isWeighted = value;
    }

    /**
     * Gets the value of the typeOfNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfNumericValue() {
        return typeOfNumericValue;
    }

    /**
     * Sets the value of the typeOfNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfNumericValue(String value) {
        this.typeOfNumericValue = value;
    }

}
