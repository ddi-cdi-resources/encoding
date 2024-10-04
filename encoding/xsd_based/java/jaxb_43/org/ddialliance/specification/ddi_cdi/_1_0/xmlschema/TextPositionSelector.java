//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ==========
 *             Describes a range of text by recording the start and end positions of the selection in the object. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on. It is defined accordingly the related selector of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/#textpositionselector.
 * 
 * <p>Java class for TextPositionSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TextPositionSelector">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Selector">
 *       <sequence>
 *         <element name="end" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="start" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextPositionSelector", propOrder = {
    "end",
    "start"
})
public class TextPositionSelector
    extends Selector
{

    @XmlElement(required = true)
    protected BigInteger end;
    @XmlElement(required = true)
    protected BigInteger start;

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnd(BigInteger value) {
        this.end = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

}