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
 *             Relationship between any variables in the variable cascade (conceptual, represented, instance), based on an ordered relation.
 * 
 * <p>Java class for VariableRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VariableRelationship">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="semantics" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="VariableRelationship_hasTarget_ConceptualVariable" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ConceptualVariable"/>
 *                         <enumeration value="DescriptorVariable"/>
 *                         <enumeration value="InstanceVariable"/>
 *                         <enumeration value="ReferenceVariable"/>
 *                         <enumeration value="RepresentedVariable"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="VariableRelationship_hasSource_ConceptualVariable" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ConceptualVariable"/>
 *                         <enumeration value="DescriptorVariable"/>
 *                         <enumeration value="InstanceVariable"/>
 *                         <enumeration value="ReferenceVariable"/>
 *                         <enumeration value="RepresentedVariable"/>
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
@XmlType(name = "VariableRelationship", propOrder = {
    "identifier",
    "semantics",
    "variableRelationshipHasTargetConceptualVariable",
    "variableRelationshipHasSourceConceptualVariable"
})
public class VariableRelationship {

    protected Identifier identifier;
    protected ControlledVocabularyEntry semantics;
    @XmlElement(name = "VariableRelationship_hasTarget_ConceptualVariable")
    protected List<VariableRelationship.VariableRelationshipHasTargetConceptualVariable> variableRelationshipHasTargetConceptualVariable;
    @XmlElement(name = "VariableRelationship_hasSource_ConceptualVariable")
    protected List<VariableRelationship.VariableRelationshipHasSourceConceptualVariable> variableRelationshipHasSourceConceptualVariable;

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
     * Gets the value of the variableRelationshipHasTargetConceptualVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the variableRelationshipHasTargetConceptualVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableRelationshipHasTargetConceptualVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableRelationship.VariableRelationshipHasTargetConceptualVariable }
     * 
     * 
     * @return
     *     The value of the variableRelationshipHasTargetConceptualVariable property.
     */
    public List<VariableRelationship.VariableRelationshipHasTargetConceptualVariable> getVariableRelationshipHasTargetConceptualVariable() {
        if (variableRelationshipHasTargetConceptualVariable == null) {
            variableRelationshipHasTargetConceptualVariable = new ArrayList<>();
        }
        return this.variableRelationshipHasTargetConceptualVariable;
    }

    /**
     * Gets the value of the variableRelationshipHasSourceConceptualVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the variableRelationshipHasSourceConceptualVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableRelationshipHasSourceConceptualVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableRelationship.VariableRelationshipHasSourceConceptualVariable }
     * 
     * 
     * @return
     *     The value of the variableRelationshipHasSourceConceptualVariable property.
     */
    public List<VariableRelationship.VariableRelationshipHasSourceConceptualVariable> getVariableRelationshipHasSourceConceptualVariable() {
        if (variableRelationshipHasSourceConceptualVariable == null) {
            variableRelationshipHasSourceConceptualVariable = new ArrayList<>();
        }
        return this.variableRelationshipHasSourceConceptualVariable;
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
     *               <enumeration value="ConceptualVariable"/>
     *               <enumeration value="DescriptorVariable"/>
     *               <enumeration value="InstanceVariable"/>
     *               <enumeration value="ReferenceVariable"/>
     *               <enumeration value="RepresentedVariable"/>
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
    public static class VariableRelationshipHasSourceConceptualVariable
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
     *               <enumeration value="ConceptualVariable"/>
     *               <enumeration value="DescriptorVariable"/>
     *               <enumeration value="InstanceVariable"/>
     *               <enumeration value="ReferenceVariable"/>
     *               <enumeration value="RepresentedVariable"/>
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
    public static class VariableRelationshipHasTargetConceptualVariable
        extends Reference
    {


    }

}
