//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ==========
 *             Physical characteristics for the value of an instance variable stored in a data point as part of a physical segment layout.
 *             
 *             Examples 
 *             ========
 *             A variable "age" might be represented in a file as a string with a maximum length of 5 characters and a number pattern of ##0.0  
 *             
 *             Explanatory notes 
 *             =================
 *             An instance variable has details of value domain and data type, but will not have the final details of how a value is physically represented in a data file. A variable for height, for example, may be represented as a real number, but may be represented as a string in multiple ways. The decimal separator might be, for example a period or a comma. The string representing the value of a payment might be preceded by a currency symbol. The same numeric value might be written as "1,234,567" or "1.234567". A missing value might be written as ".", "NA", ".R" or as "R". The value mapping describes how the value of an instance variable is physically expressed. The properties of the value mapping as intended to be compatible with the W3C Metadata Vocabulary for Tabular Data (https://www.w3.org/TR/tabular-metadata/) as well as common programming languages and statistical packages. The 'format' property, for example, can draw from an external controlled vocabulary such as the set of formats for Stata, SPSS, or SAS.
 * 
 * <p>Java class for ValueMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValueMapping">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="decimalPositions" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="defaultDecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultDigitGroupSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="format" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="length" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="maximumLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="minimumLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="nullSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numberPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="physicalDataType" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="scale" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="ValueMapping_formats_DataPoint" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DataPoint"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ValueMapping_uses_PhysicalSegmentLocation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="PhysicalSegmentLocation"/>
 *                         <enumeration value="SegmentByText"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueMapping", propOrder = {
    "decimalPositions",
    "defaultDecimalSeparator",
    "defaultDigitGroupSeparator",
    "defaultValue",
    "format",
    "identifier",
    "isRequired",
    "length",
    "maximumLength",
    "minimumLength",
    "nullSequence",
    "numberPattern",
    "physicalDataType",
    "scale",
    "valueMappingFormatsDataPoint",
    "valueMappingUsesPhysicalSegmentLocation"
})
public class ValueMapping {

    protected BigInteger decimalPositions;
    protected String defaultDecimalSeparator;
    protected String defaultDigitGroupSeparator;
    @XmlElement(required = true)
    protected String defaultValue;
    protected ControlledVocabularyEntry format;
    protected Identifier identifier;
    protected Boolean isRequired;
    protected BigInteger length;
    protected BigInteger maximumLength;
    protected BigInteger minimumLength;
    protected String nullSequence;
    protected String numberPattern;
    protected ControlledVocabularyEntry physicalDataType;
    protected BigInteger scale;
    @XmlElement(name = "ValueMapping_formats_DataPoint")
    protected List<ValueMapping.ValueMappingFormatsDataPoint> valueMappingFormatsDataPoint;
    @XmlElement(name = "ValueMapping_uses_PhysicalSegmentLocation")
    protected ValueMapping.ValueMappingUsesPhysicalSegmentLocation valueMappingUsesPhysicalSegmentLocation;

    /**
     * Gets the value of the decimalPositions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPositions() {
        return decimalPositions;
    }

    /**
     * Sets the value of the decimalPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPositions(BigInteger value) {
        this.decimalPositions = value;
    }

    /**
     * Gets the value of the defaultDecimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDecimalSeparator() {
        return defaultDecimalSeparator;
    }

    /**
     * Sets the value of the defaultDecimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDecimalSeparator(String value) {
        this.defaultDecimalSeparator = value;
    }

    /**
     * Gets the value of the defaultDigitGroupSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDigitGroupSeparator() {
        return defaultDigitGroupSeparator;
    }

    /**
     * Sets the value of the defaultDigitGroupSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDigitGroupSeparator(String value) {
        this.defaultDigitGroupSeparator = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setFormat(ControlledVocabularyEntry value) {
        this.format = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the maximumLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumLength() {
        return maximumLength;
    }

    /**
     * Sets the value of the maximumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumLength(BigInteger value) {
        this.maximumLength = value;
    }

    /**
     * Gets the value of the minimumLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumLength() {
        return minimumLength;
    }

    /**
     * Sets the value of the minimumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumLength(BigInteger value) {
        this.minimumLength = value;
    }

    /**
     * Gets the value of the nullSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullSequence() {
        return nullSequence;
    }

    /**
     * Sets the value of the nullSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullSequence(String value) {
        this.nullSequence = value;
    }

    /**
     * Gets the value of the numberPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPattern() {
        return numberPattern;
    }

    /**
     * Sets the value of the numberPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPattern(String value) {
        this.numberPattern = value;
    }

    /**
     * Gets the value of the physicalDataType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getPhysicalDataType() {
        return physicalDataType;
    }

    /**
     * Sets the value of the physicalDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setPhysicalDataType(ControlledVocabularyEntry value) {
        this.physicalDataType = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScale(BigInteger value) {
        this.scale = value;
    }

    /**
     * Gets the value of the valueMappingFormatsDataPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valueMappingFormatsDataPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueMappingFormatsDataPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueMapping.ValueMappingFormatsDataPoint }
     * 
     * 
     * @return
     *     The value of the valueMappingFormatsDataPoint property.
     */
    public List<ValueMapping.ValueMappingFormatsDataPoint> getValueMappingFormatsDataPoint() {
        if (valueMappingFormatsDataPoint == null) {
            valueMappingFormatsDataPoint = new ArrayList<>();
        }
        return this.valueMappingFormatsDataPoint;
    }

    /**
     * Gets the value of the valueMappingUsesPhysicalSegmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ValueMapping.ValueMappingUsesPhysicalSegmentLocation }
     *     
     */
    public ValueMapping.ValueMappingUsesPhysicalSegmentLocation getValueMappingUsesPhysicalSegmentLocation() {
        return valueMappingUsesPhysicalSegmentLocation;
    }

    /**
     * Sets the value of the valueMappingUsesPhysicalSegmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMapping.ValueMappingUsesPhysicalSegmentLocation }
     *     
     */
    public void setValueMappingUsesPhysicalSegmentLocation(ValueMapping.ValueMappingUsesPhysicalSegmentLocation value) {
        this.valueMappingUsesPhysicalSegmentLocation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="DataPoint"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValueMappingFormatsDataPoint
        extends Reference
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="PhysicalSegmentLocation"/>
     *               <enumeration value="SegmentByText"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValueMappingUsesPhysicalSegmentLocation
        extends Reference
    {


    }

}
