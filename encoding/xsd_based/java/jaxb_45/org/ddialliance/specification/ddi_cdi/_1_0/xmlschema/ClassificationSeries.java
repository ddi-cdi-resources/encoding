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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Ensemble of one or more statistical classifications, based on the same concept, and related to each other as versions or updates.
 *             
 *             Examples
 *             ==========
 *             ISIC or ISCO
 *             SIC (with different published versions related to the publication year).
 *             
 *             Explanatory notes
 *             ===================
 *             Typically, these statistical classifications have the same name.
 * 
 * <p>Java class for ClassificationSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationSeries">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="allowsDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="context" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="keyword" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="objectsOrUnitsClassified" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="subject" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClassificationSeries_isOwnedBy_Agent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Agent"/>
 *                         <enumeration value="Curator"/>
 *                         <enumeration value="Individual"/>
 *                         <enumeration value="Machine"/>
 *                         <enumeration value="Organization"/>
 *                         <enumeration value="ProcessingAgent"/>
 *                         <enumeration value="Service"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationSeries_isDefinedBy_Concept" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Category"/>
 *                         <enumeration value="Concept"/>
 *                         <enumeration value="ConceptualValue"/>
 *                         <enumeration value="ConceptualVariable"/>
 *                         <enumeration value="DescriptorVariable"/>
 *                         <enumeration value="DimensionalKeyDefinitionMember"/>
 *                         <enumeration value="InstanceVariable"/>
 *                         <enumeration value="KeyDefinitionMember"/>
 *                         <enumeration value="Population"/>
 *                         <enumeration value="ReferenceVariable"/>
 *                         <enumeration value="RepresentedVariable"/>
 *                         <enumeration value="UnitType"/>
 *                         <enumeration value="Universe"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationSeries_has_StatisticalClassification" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="StatisticalClassification"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationSeries_has_ClassificationPosition" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationPosition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
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
@XmlType(name = "ClassificationSeries", propOrder = {
    "allowsDuplicates",
    "catalogDetails",
    "context",
    "identifier",
    "keyword",
    "name",
    "objectsOrUnitsClassified",
    "purpose",
    "subject",
    "classificationSeriesIsOwnedByAgent",
    "classificationSeriesIsDefinedByConcept",
    "classificationSeriesHasStatisticalClassification",
    "classificationSeriesHasClassificationPosition"
})
public class ClassificationSeries {

    protected boolean allowsDuplicates;
    protected CatalogDetails catalogDetails;
    protected ControlledVocabularyEntry context;
    protected Identifier identifier;
    protected List<ControlledVocabularyEntry> keyword;
    protected List<ObjectName> name;
    protected ControlledVocabularyEntry objectsOrUnitsClassified;
    protected InternationalString purpose;
    protected List<ControlledVocabularyEntry> subject;
    @XmlElement(name = "ClassificationSeries_isOwnedBy_Agent")
    protected List<ClassificationSeries.ClassificationSeriesIsOwnedByAgent> classificationSeriesIsOwnedByAgent;
    @XmlElement(name = "ClassificationSeries_isDefinedBy_Concept")
    protected List<ClassificationSeries.ClassificationSeriesIsDefinedByConcept> classificationSeriesIsDefinedByConcept;
    @XmlElement(name = "ClassificationSeries_has_StatisticalClassification")
    protected List<ClassificationSeries.ClassificationSeriesHasStatisticalClassification> classificationSeriesHasStatisticalClassification;
    @XmlElement(name = "ClassificationSeries_has_ClassificationPosition")
    protected List<ClassificationSeries.ClassificationSeriesHasClassificationPosition> classificationSeriesHasClassificationPosition;

    /**
     * Gets the value of the allowsDuplicates property.
     * 
     */
    public boolean isAllowsDuplicates() {
        return allowsDuplicates;
    }

    /**
     * Sets the value of the allowsDuplicates property.
     * 
     */
    public void setAllowsDuplicates(boolean value) {
        this.allowsDuplicates = value;
    }

    /**
     * Gets the value of the catalogDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogDetails }
     *     
     */
    public CatalogDetails getCatalogDetails() {
        return catalogDetails;
    }

    /**
     * Sets the value of the catalogDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogDetails }
     *     
     */
    public void setCatalogDetails(CatalogDetails value) {
        this.catalogDetails = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setContext(ControlledVocabularyEntry value) {
        this.context = value;
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
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabularyEntry }
     * 
     * 
     * @return
     *     The value of the keyword property.
     */
    public List<ControlledVocabularyEntry> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectName }
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<ObjectName> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the objectsOrUnitsClassified property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getObjectsOrUnitsClassified() {
        return objectsOrUnitsClassified;
    }

    /**
     * Sets the value of the objectsOrUnitsClassified property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setObjectsOrUnitsClassified(ControlledVocabularyEntry value) {
        this.objectsOrUnitsClassified = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setPurpose(InternationalString value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabularyEntry }
     * 
     * 
     * @return
     *     The value of the subject property.
     */
    public List<ControlledVocabularyEntry> getSubject() {
        if (subject == null) {
            subject = new ArrayList<>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the classificationSeriesIsOwnedByAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationSeriesIsOwnedByAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationSeriesIsOwnedByAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSeries.ClassificationSeriesIsOwnedByAgent }
     * 
     * 
     * @return
     *     The value of the classificationSeriesIsOwnedByAgent property.
     */
    public List<ClassificationSeries.ClassificationSeriesIsOwnedByAgent> getClassificationSeriesIsOwnedByAgent() {
        if (classificationSeriesIsOwnedByAgent == null) {
            classificationSeriesIsOwnedByAgent = new ArrayList<>();
        }
        return this.classificationSeriesIsOwnedByAgent;
    }

    /**
     * Gets the value of the classificationSeriesIsDefinedByConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationSeriesIsDefinedByConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationSeriesIsDefinedByConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSeries.ClassificationSeriesIsDefinedByConcept }
     * 
     * 
     * @return
     *     The value of the classificationSeriesIsDefinedByConcept property.
     */
    public List<ClassificationSeries.ClassificationSeriesIsDefinedByConcept> getClassificationSeriesIsDefinedByConcept() {
        if (classificationSeriesIsDefinedByConcept == null) {
            classificationSeriesIsDefinedByConcept = new ArrayList<>();
        }
        return this.classificationSeriesIsDefinedByConcept;
    }

    /**
     * Gets the value of the classificationSeriesHasStatisticalClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationSeriesHasStatisticalClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationSeriesHasStatisticalClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSeries.ClassificationSeriesHasStatisticalClassification }
     * 
     * 
     * @return
     *     The value of the classificationSeriesHasStatisticalClassification property.
     */
    public List<ClassificationSeries.ClassificationSeriesHasStatisticalClassification> getClassificationSeriesHasStatisticalClassification() {
        if (classificationSeriesHasStatisticalClassification == null) {
            classificationSeriesHasStatisticalClassification = new ArrayList<>();
        }
        return this.classificationSeriesHasStatisticalClassification;
    }

    /**
     * Gets the value of the classificationSeriesHasClassificationPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationSeriesHasClassificationPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationSeriesHasClassificationPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSeries.ClassificationSeriesHasClassificationPosition }
     * 
     * 
     * @return
     *     The value of the classificationSeriesHasClassificationPosition property.
     */
    public List<ClassificationSeries.ClassificationSeriesHasClassificationPosition> getClassificationSeriesHasClassificationPosition() {
        if (classificationSeriesHasClassificationPosition == null) {
            classificationSeriesHasClassificationPosition = new ArrayList<>();
        }
        return this.classificationSeriesHasClassificationPosition;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="ClassificationPosition"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "")
    public static class ClassificationSeriesHasClassificationPosition
        extends AssociationReference
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
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="StatisticalClassification"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "")
    public static class ClassificationSeriesHasStatisticalClassification
        extends AssociationReference
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
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Category"/>
     *               <enumeration value="Concept"/>
     *               <enumeration value="ConceptualValue"/>
     *               <enumeration value="ConceptualVariable"/>
     *               <enumeration value="DescriptorVariable"/>
     *               <enumeration value="DimensionalKeyDefinitionMember"/>
     *               <enumeration value="InstanceVariable"/>
     *               <enumeration value="KeyDefinitionMember"/>
     *               <enumeration value="Population"/>
     *               <enumeration value="ReferenceVariable"/>
     *               <enumeration value="RepresentedVariable"/>
     *               <enumeration value="UnitType"/>
     *               <enumeration value="Universe"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "")
    public static class ClassificationSeriesIsDefinedByConcept
        extends AssociationReference
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
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Agent"/>
     *               <enumeration value="Curator"/>
     *               <enumeration value="Individual"/>
     *               <enumeration value="Machine"/>
     *               <enumeration value="Organization"/>
     *               <enumeration value="ProcessingAgent"/>
     *               <enumeration value="Service"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "")
    public static class ClassificationSeriesIsOwnedByAgent
        extends AssociationReference
    {


    }

}
