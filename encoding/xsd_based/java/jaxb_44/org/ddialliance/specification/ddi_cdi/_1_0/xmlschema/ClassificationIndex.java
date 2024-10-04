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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Definition 
 *             ============ 
 *             Ordered list of classification index entries. 
 *             
 *             Examples 
 *             ========== 
 *             An alphabetical index of a topically ordered statistical classification.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             A classification index shows the relationship between text found in statistical data sources (responses to survey questionnaires, administrative records) and one or more statistical classifications.  A classification index may be used to assign the codes for classification items to observations in statistical collections. Note that a GenericStatistical Information Model (GSIM) Node is the equivalent of a DDI-CDI Member, and a GSIM Node Set is a DDI-CDI Collection. A classification index can relate to one particular or to several statistical classifications. (See the GSIM Statistical Classification Model: https://statswiki.unece.org/display/gsim/Statistical+Classification+Model.)
 * 
 * <p>Java class for ClassificationIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationIndex">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="allowsDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="availableLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="codingInstruction" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CommandCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="corrections" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="releaseDate" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CombinedDate" minOccurs="0"/>
 *         <element name="ClassificationIndex_isMaintainedBy_Agent" minOccurs="0">
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
 *         <element name="ClassificationIndex_hasContact_Agent" maxOccurs="unbounded" minOccurs="0">
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
 *         <element name="ClassificationIndex_isDefinedBy_Concept" maxOccurs="unbounded" minOccurs="0">
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
 *         <element name="ClassificationIndex_has_ClassificationIndexEntryPosition" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationIndexEntryPosition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationIndex_has_ClassificationIndexEntry" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationIndexEntry"/>
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
@XmlType(name = "ClassificationIndex", propOrder = {
    "allowsDuplicates",
    "availableLanguage",
    "catalogDetails",
    "codingInstruction",
    "corrections",
    "identifier",
    "name",
    "purpose",
    "releaseDate",
    "classificationIndexIsMaintainedByAgent",
    "classificationIndexHasContactAgent",
    "classificationIndexIsDefinedByConcept",
    "classificationIndexHasClassificationIndexEntryPosition",
    "classificationIndexHasClassificationIndexEntry"
})
public class ClassificationIndex {

    protected boolean allowsDuplicates;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> availableLanguage;
    protected CatalogDetails catalogDetails;
    protected List<CommandCode> codingInstruction;
    protected List<InternationalString> corrections;
    protected Identifier identifier;
    protected List<ObjectName> name;
    protected InternationalString purpose;
    protected CombinedDate releaseDate;
    @XmlElement(name = "ClassificationIndex_isMaintainedBy_Agent")
    protected ClassificationIndex.ClassificationIndexIsMaintainedByAgent classificationIndexIsMaintainedByAgent;
    @XmlElement(name = "ClassificationIndex_hasContact_Agent")
    protected List<ClassificationIndex.ClassificationIndexHasContactAgent> classificationIndexHasContactAgent;
    @XmlElement(name = "ClassificationIndex_isDefinedBy_Concept")
    protected List<ClassificationIndex.ClassificationIndexIsDefinedByConcept> classificationIndexIsDefinedByConcept;
    @XmlElement(name = "ClassificationIndex_has_ClassificationIndexEntryPosition")
    protected List<ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition> classificationIndexHasClassificationIndexEntryPosition;
    @XmlElement(name = "ClassificationIndex_has_ClassificationIndexEntry")
    protected List<ClassificationIndex.ClassificationIndexHasClassificationIndexEntry> classificationIndexHasClassificationIndexEntry;

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
     * Gets the value of the availableLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the availableLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the availableLanguage property.
     */
    public List<String> getAvailableLanguage() {
        if (availableLanguage == null) {
            availableLanguage = new ArrayList<>();
        }
        return this.availableLanguage;
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
     * Gets the value of the codingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the codingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommandCode }
     * 
     * 
     * @return
     *     The value of the codingInstruction property.
     */
    public List<CommandCode> getCodingInstruction() {
        if (codingInstruction == null) {
            codingInstruction = new ArrayList<>();
        }
        return this.codingInstruction;
    }

    /**
     * Gets the value of the corrections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corrections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalString }
     * 
     * 
     * @return
     *     The value of the corrections property.
     */
    public List<InternationalString> getCorrections() {
        if (corrections == null) {
            corrections = new ArrayList<>();
        }
        return this.corrections;
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
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedDate }
     *     
     */
    public CombinedDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedDate }
     *     
     */
    public void setReleaseDate(CombinedDate value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the classificationIndexIsMaintainedByAgent property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationIndex.ClassificationIndexIsMaintainedByAgent }
     *     
     */
    public ClassificationIndex.ClassificationIndexIsMaintainedByAgent getClassificationIndexIsMaintainedByAgent() {
        return classificationIndexIsMaintainedByAgent;
    }

    /**
     * Sets the value of the classificationIndexIsMaintainedByAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationIndex.ClassificationIndexIsMaintainedByAgent }
     *     
     */
    public void setClassificationIndexIsMaintainedByAgent(ClassificationIndex.ClassificationIndexIsMaintainedByAgent value) {
        this.classificationIndexIsMaintainedByAgent = value;
    }

    /**
     * Gets the value of the classificationIndexHasContactAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationIndexHasContactAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationIndexHasContactAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationIndex.ClassificationIndexHasContactAgent }
     * 
     * 
     * @return
     *     The value of the classificationIndexHasContactAgent property.
     */
    public List<ClassificationIndex.ClassificationIndexHasContactAgent> getClassificationIndexHasContactAgent() {
        if (classificationIndexHasContactAgent == null) {
            classificationIndexHasContactAgent = new ArrayList<>();
        }
        return this.classificationIndexHasContactAgent;
    }

    /**
     * Gets the value of the classificationIndexIsDefinedByConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationIndexIsDefinedByConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationIndexIsDefinedByConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationIndex.ClassificationIndexIsDefinedByConcept }
     * 
     * 
     * @return
     *     The value of the classificationIndexIsDefinedByConcept property.
     */
    public List<ClassificationIndex.ClassificationIndexIsDefinedByConcept> getClassificationIndexIsDefinedByConcept() {
        if (classificationIndexIsDefinedByConcept == null) {
            classificationIndexIsDefinedByConcept = new ArrayList<>();
        }
        return this.classificationIndexIsDefinedByConcept;
    }

    /**
     * Gets the value of the classificationIndexHasClassificationIndexEntryPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationIndexHasClassificationIndexEntryPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationIndexHasClassificationIndexEntryPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition }
     * 
     * 
     * @return
     *     The value of the classificationIndexHasClassificationIndexEntryPosition property.
     */
    public List<ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition> getClassificationIndexHasClassificationIndexEntryPosition() {
        if (classificationIndexHasClassificationIndexEntryPosition == null) {
            classificationIndexHasClassificationIndexEntryPosition = new ArrayList<>();
        }
        return this.classificationIndexHasClassificationIndexEntryPosition;
    }

    /**
     * Gets the value of the classificationIndexHasClassificationIndexEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationIndexHasClassificationIndexEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationIndexHasClassificationIndexEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationIndex.ClassificationIndexHasClassificationIndexEntry }
     * 
     * 
     * @return
     *     The value of the classificationIndexHasClassificationIndexEntry property.
     */
    public List<ClassificationIndex.ClassificationIndexHasClassificationIndexEntry> getClassificationIndexHasClassificationIndexEntry() {
        if (classificationIndexHasClassificationIndexEntry == null) {
            classificationIndexHasClassificationIndexEntry = new ArrayList<>();
        }
        return this.classificationIndexHasClassificationIndexEntry;
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
     *               <enumeration value="ClassificationIndexEntry"/>
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
    public static class ClassificationIndexHasClassificationIndexEntry
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
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="ClassificationIndexEntryPosition"/>
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
    public static class ClassificationIndexHasClassificationIndexEntryPosition
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
    public static class ClassificationIndexHasContactAgent
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
    public static class ClassificationIndexIsDefinedByConcept
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
    public static class ClassificationIndexIsMaintainedByAgent
        extends AssociationReference
    {


    }

}