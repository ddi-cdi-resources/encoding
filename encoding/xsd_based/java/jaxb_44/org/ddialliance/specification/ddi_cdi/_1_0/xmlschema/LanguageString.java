//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Definition
 *             ============
 *             A language/scope-type specific variant of an InternationalString. It contains the following attributes: language to designate the language, isTranslated with a default value of false to designate if an object is a translation of another language, isTranslatable with a default value of true to designate if the content can be translated, translationSourceLanguage to indicate the source languages used in creating this translation, translationDate, and scope which can be used to define intended audience or use such as internal, external, etc.
 * 
 * <p>Java class for LanguageString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LanguageString">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isTranslatable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isTranslated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="structureUsed" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="translationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="translationSourceLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageString", propOrder = {
    "content",
    "isTranslatable",
    "isTranslated",
    "scope",
    "structureUsed",
    "translationDate",
    "translationSourceLanguage"
})
public class LanguageString {

    @XmlElement(required = true)
    protected String content;
    protected Boolean isTranslatable;
    protected Boolean isTranslated;
    protected String scope;
    protected ControlledVocabularyEntry structureUsed;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar translationDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> translationSourceLanguage;

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
     * Gets the value of the isTranslatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTranslatable() {
        return isTranslatable;
    }

    /**
     * Sets the value of the isTranslatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTranslatable(Boolean value) {
        this.isTranslatable = value;
    }

    /**
     * Gets the value of the isTranslated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTranslated() {
        return isTranslated;
    }

    /**
     * Sets the value of the isTranslated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTranslated(Boolean value) {
        this.isTranslated = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the structureUsed property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getStructureUsed() {
        return structureUsed;
    }

    /**
     * Sets the value of the structureUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setStructureUsed(ControlledVocabularyEntry value) {
        this.structureUsed = value;
    }

    /**
     * Gets the value of the translationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslationDate() {
        return translationDate;
    }

    /**
     * Sets the value of the translationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslationDate(XMLGregorianCalendar value) {
        this.translationDate = value;
    }

    /**
     * Gets the value of the translationSourceLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the translationSourceLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslationSourceLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the translationSourceLanguage property.
     */
    public List<String> getTranslationSourceLanguage() {
        if (translationSourceLanguage == null) {
            translationSourceLanguage = new ArrayList<>();
        }
        return this.translationSourceLanguage;
    }

}