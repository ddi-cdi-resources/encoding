//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Allows for unstructured content which may be an entry from an externally maintained controlled vocabulary.If the content is from a controlled vocabulary provide the code value of the entry, as well as a reference to the controlled vocabulary from which the value is taken. Provide as many of the identifying attributes as needed to adequately identify the controlled vocabulary. Note that DDI has published a number of controlled vocabularies applicable to several locations using the external controlled vocabulary entry structure. If the code portion of the controlled vocabulary entry is language specific (i.e. a list of keywords or subject headings) use language to specify that language. In most cases the code portion of an entry is not language specific although the description and usage may be managed in one or more languages. Use of shared controlled vocabularies helps support interoperability and machine actionability.
 * 
 * <p>Java class for ControlledVocabularyEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ControlledVocabularyEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="entryReference" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="deepLink" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Selector" minOccurs="0"/>
 *                   <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="location" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *                   <element name="nonDdiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}NonDdiIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="semantic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *                   <element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   <element name="validType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="entryValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="valueForOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vocabulary" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="deepLink" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Selector" minOccurs="0"/>
 *                   <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="location" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *                   <element name="nonDdiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}NonDdiIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="semantic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *                   <element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   <element name="validType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" />
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
@XmlType(name = "ControlledVocabularyEntry", propOrder = {
    "entryReference",
    "entryValue",
    "name",
    "valueForOther",
    "vocabulary"
})
public class ControlledVocabularyEntry {

    protected List<ControlledVocabularyEntry.EntryReference> entryReference;
    protected List<String> entryValue;
    protected String name;
    protected String valueForOther;
    protected ControlledVocabularyEntry.Vocabulary vocabulary;

    /**
     * Gets the value of the entryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabularyEntry.EntryReference }
     * 
     * 
     * @return
     *     The value of the entryReference property.
     */
    public List<ControlledVocabularyEntry.EntryReference> getEntryReference() {
        if (entryReference == null) {
            entryReference = new ArrayList<>();
        }
        return this.entryReference;
    }

    /**
     * Gets the value of the entryValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entryValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the entryValue property.
     */
    public List<String> getEntryValue() {
        if (entryValue == null) {
            entryValue = new ArrayList<>();
        }
        return this.entryValue;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the valueForOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueForOther() {
        return valueForOther;
    }

    /**
     * Sets the value of the valueForOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueForOther(String value) {
        this.valueForOther = value;
    }

    /**
     * Gets the value of the vocabulary property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry.Vocabulary }
     *     
     */
    public ControlledVocabularyEntry.Vocabulary getVocabulary() {
        return vocabulary;
    }

    /**
     * Sets the value of the vocabulary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry.Vocabulary }
     *     
     */
    public void setVocabulary(ControlledVocabularyEntry.Vocabulary value) {
        this.vocabulary = value;
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
     *         <element name="deepLink" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Selector" minOccurs="0"/>
     *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="location" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
     *         <element name="nonDdiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}NonDdiIdentifier" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="semantic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
     *         <element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         <element name="validType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EntryReference
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
     *         <element name="deepLink" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Selector" minOccurs="0"/>
     *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="location" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
     *         <element name="nonDdiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}NonDdiIdentifier" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="semantic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
     *         <element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         <element name="validType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vocabulary
        extends Reference
    {


    }

}