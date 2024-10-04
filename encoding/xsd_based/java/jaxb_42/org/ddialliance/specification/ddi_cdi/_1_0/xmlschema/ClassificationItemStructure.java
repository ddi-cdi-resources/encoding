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


/**
 * Definition 
 *             ============ 
 *             Complex relation structure for use with statistical classification.  
 *             
 *             Examples 
 *             ========== 
 *             A classification item structure for the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) would describe each of the major classifications as a parent of its sub-classifications. 1 Managers, for example would be listed as a parent of four sub groups: 11 Chief Executives, Senior Officials and Legislators; 12 Chief Executives, Senior Officials and Legislators; 13 Production and Specialized Services Managers; and 14 Hospitality, Retail and Other Services Managers.   
 *             
 *             Explanatory notes 
 *             =================== 
 *             The classification item structure has a set of classification item relationships which are basically adjacency lists. A source classification item has a described relationship to a target list of classification items. The semantic might be, for example, "parentOf", or "contains", etc.
 * 
 * <p>Java class for ClassificationItemStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationItemStructure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="displayLabel" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}LabelForDisplay" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="semantics" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="specification" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}StructureSpecification" minOccurs="0"/>
 *         <element name="topology" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="totality" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}StructureExtent" minOccurs="0"/>
 *         <element name="ClassificationItemStructure_structures_StatisticalClassification" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="StatisticalClassification"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationItemStructure_has_ClassificationItemRelationship" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationItemRelationship"/>
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
@XmlType(name = "ClassificationItemStructure", propOrder = {
    "displayLabel",
    "identifier",
    "name",
    "purpose",
    "semantics",
    "specification",
    "topology",
    "totality",
    "classificationItemStructureStructuresStatisticalClassification",
    "classificationItemStructureHasClassificationItemRelationship"
})
public class ClassificationItemStructure {

    protected List<LabelForDisplay> displayLabel;
    protected Identifier identifier;
    protected List<ObjectName> name;
    protected InternationalString purpose;
    protected ControlledVocabularyEntry semantics;
    protected StructureSpecification specification;
    protected ControlledVocabularyEntry topology;
    @XmlSchemaType(name = "NMTOKEN")
    protected StructureExtent totality;
    @XmlElement(name = "ClassificationItemStructure_structures_StatisticalClassification")
    protected ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification classificationItemStructureStructuresStatisticalClassification;
    @XmlElement(name = "ClassificationItemStructure_has_ClassificationItemRelationship")
    protected List<ClassificationItemStructure.ClassificationItemStructureHasClassificationItemRelationship> classificationItemStructureHasClassificationItemRelationship;

    /**
     * Gets the value of the displayLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the displayLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelForDisplay }
     * 
     * 
     * @return
     *     The value of the displayLabel property.
     */
    public List<LabelForDisplay> getDisplayLabel() {
        if (displayLabel == null) {
            displayLabel = new ArrayList<>();
        }
        return this.displayLabel;
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
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getSemantics() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setSemantics(ControlledVocabularyEntry value) {
        this.semantics = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link StructureSpecification }
     *     
     */
    public StructureSpecification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureSpecification }
     *     
     */
    public void setSpecification(StructureSpecification value) {
        this.specification = value;
    }

    /**
     * Gets the value of the topology property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getTopology() {
        return topology;
    }

    /**
     * Sets the value of the topology property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setTopology(ControlledVocabularyEntry value) {
        this.topology = value;
    }

    /**
     * Gets the value of the totality property.
     * 
     * @return
     *     possible object is
     *     {@link StructureExtent }
     *     
     */
    public StructureExtent getTotality() {
        return totality;
    }

    /**
     * Sets the value of the totality property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureExtent }
     *     
     */
    public void setTotality(StructureExtent value) {
        this.totality = value;
    }

    /**
     * Gets the value of the classificationItemStructureStructuresStatisticalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification }
     *     
     */
    public ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification getClassificationItemStructureStructuresStatisticalClassification() {
        return classificationItemStructureStructuresStatisticalClassification;
    }

    /**
     * Sets the value of the classificationItemStructureStructuresStatisticalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification }
     *     
     */
    public void setClassificationItemStructureStructuresStatisticalClassification(ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification value) {
        this.classificationItemStructureStructuresStatisticalClassification = value;
    }

    /**
     * Gets the value of the classificationItemStructureHasClassificationItemRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationItemStructureHasClassificationItemRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationItemStructureHasClassificationItemRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItemStructure.ClassificationItemStructureHasClassificationItemRelationship }
     * 
     * 
     * @return
     *     The value of the classificationItemStructureHasClassificationItemRelationship property.
     */
    public List<ClassificationItemStructure.ClassificationItemStructureHasClassificationItemRelationship> getClassificationItemStructureHasClassificationItemRelationship() {
        if (classificationItemStructureHasClassificationItemRelationship == null) {
            classificationItemStructureHasClassificationItemRelationship = new ArrayList<>();
        }
        return this.classificationItemStructureHasClassificationItemRelationship;
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
     *               <enumeration value="ClassificationItemRelationship"/>
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
    public static class ClassificationItemStructureHasClassificationItemRelationship
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
     *               <enumeration value="StatisticalClassification"/>
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
    public static class ClassificationItemStructureStructuresStatisticalClassification
        extends Reference
    {


    }

}
