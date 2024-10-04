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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ============ 
 *             Role given to a represented variable in the context of a data structure.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             A represented variable can have different roles in different data structures. For instance, the variable sex can be a measure in a wide data structure and a dimension in a dimensional data structure.
 * 
 * <p>Java class for DataStructureComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DataStructureComponent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="semantic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}PairedControlledVocabularyEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="specialization" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}SpecializationRole" minOccurs="0"/>
 *         <element name="DataStructureComponent_isDefinedBy_RepresentedVariable" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DescriptorVariable"/>
 *                         <enumeration value="InstanceVariable"/>
 *                         <enumeration value="ReferenceVariable"/>
 *                         <enumeration value="RepresentedVariable"/>
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
@XmlType(name = "DataStructureComponent", propOrder = {
    "identifier",
    "semantic",
    "specialization",
    "dataStructureComponentIsDefinedByRepresentedVariable"
})
@XmlSeeAlso({
    AttributeComponent.class,
    ContextualComponent.class,
    DimensionComponent.class,
    IdentifierComponent.class,
    MeasureComponent.class,
    SyntheticIdComponent.class,
    VariableDescriptorComponent.class,
    VariableValueComponent.class,
    DataStructure.class
})
public class DataStructureComponent {

    protected Identifier identifier;
    protected List<PairedControlledVocabularyEntry> semantic;
    protected SpecializationRole specialization;
    @XmlElement(name = "DataStructureComponent_isDefinedBy_RepresentedVariable")
    protected DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable dataStructureComponentIsDefinedByRepresentedVariable;

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
     * Gets the value of the semantic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the semantic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemantic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PairedControlledVocabularyEntry }
     * 
     * 
     * @return
     *     The value of the semantic property.
     */
    public List<PairedControlledVocabularyEntry> getSemantic() {
        if (semantic == null) {
            semantic = new ArrayList<>();
        }
        return this.semantic;
    }

    /**
     * Gets the value of the specialization property.
     * 
     * @return
     *     possible object is
     *     {@link SpecializationRole }
     *     
     */
    public SpecializationRole getSpecialization() {
        return specialization;
    }

    /**
     * Sets the value of the specialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecializationRole }
     *     
     */
    public void setSpecialization(SpecializationRole value) {
        this.specialization = value;
    }

    /**
     * Gets the value of the dataStructureComponentIsDefinedByRepresentedVariable property.
     * 
     * @return
     *     possible object is
     *     {@link DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable }
     *     
     */
    public DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable getDataStructureComponentIsDefinedByRepresentedVariable() {
        return dataStructureComponentIsDefinedByRepresentedVariable;
    }

    /**
     * Sets the value of the dataStructureComponentIsDefinedByRepresentedVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable }
     *     
     */
    public void setDataStructureComponentIsDefinedByRepresentedVariable(DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable value) {
        this.dataStructureComponentIsDefinedByRepresentedVariable = value;
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
     *               <enumeration value="DescriptorVariable"/>
     *               <enumeration value="InstanceVariable"/>
     *               <enumeration value="ReferenceVariable"/>
     *               <enumeration value="RepresentedVariable"/>
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
    public static class DataStructureComponentIsDefinedByRepresentedVariable
        extends AssociationReference
    {


    }

}
