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
 *             Lists the value and format type for the coordinate value. Note that this is a single value (X coordinate or Y coordinate) rather than a coordinate pair.
 * 
 * <p>Java class for SpatialCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SpatialCoordinate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="coordinateType" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}PointFormat" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialCoordinate", propOrder = {
    "content",
    "coordinateType"
})
public class SpatialCoordinate {

    protected String content;
    @XmlSchemaType(name = "NMTOKEN")
    protected PointFormat coordinateType;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the coordinateType property.
     * 
     * @return
     *     possible object is
     *     {@link PointFormat }
     *     
     */
    public PointFormat getCoordinateType() {
        return coordinateType;
    }

    /**
     * Sets the value of the coordinateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointFormat }
     *     
     */
    public void setCoordinateType(PointFormat value) {
        this.coordinateType = value;
    }

}