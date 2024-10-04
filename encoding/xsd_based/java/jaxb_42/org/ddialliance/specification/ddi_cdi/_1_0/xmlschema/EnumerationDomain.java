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
 *             A base class acting as an extension point to allow all codifications (codelist, statistical classification, etc.) to be understood as enumerated value domains.
 * 
 * <p>Java class for EnumerationDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnumerationDomain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="EnumerationDomain_uses_LevelStructure" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="LevelStructure"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="EnumerationDomain_references_CategorySet" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="CategorySet"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="EnumerationDomain_isDefinedBy_Concept" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
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
@XmlType(name = "EnumerationDomain", propOrder = {
    "identifier",
    "name",
    "purpose",
    "enumerationDomainUsesLevelStructure",
    "enumerationDomainReferencesCategorySet",
    "enumerationDomainIsDefinedByConcept"
})
@XmlSeeAlso({
    CodeList.class,
    StatisticalClassification.class
})
public class EnumerationDomain {

    protected Identifier identifier;
    protected List<ObjectName> name;
    protected InternationalString purpose;
    @XmlElement(name = "EnumerationDomain_uses_LevelStructure")
    protected EnumerationDomain.EnumerationDomainUsesLevelStructure enumerationDomainUsesLevelStructure;
    @XmlElement(name = "EnumerationDomain_references_CategorySet")
    protected EnumerationDomain.EnumerationDomainReferencesCategorySet enumerationDomainReferencesCategorySet;
    @XmlElement(name = "EnumerationDomain_isDefinedBy_Concept")
    protected List<EnumerationDomain.EnumerationDomainIsDefinedByConcept> enumerationDomainIsDefinedByConcept;

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
     * Gets the value of the enumerationDomainUsesLevelStructure property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationDomain.EnumerationDomainUsesLevelStructure }
     *     
     */
    public EnumerationDomain.EnumerationDomainUsesLevelStructure getEnumerationDomainUsesLevelStructure() {
        return enumerationDomainUsesLevelStructure;
    }

    /**
     * Sets the value of the enumerationDomainUsesLevelStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationDomain.EnumerationDomainUsesLevelStructure }
     *     
     */
    public void setEnumerationDomainUsesLevelStructure(EnumerationDomain.EnumerationDomainUsesLevelStructure value) {
        this.enumerationDomainUsesLevelStructure = value;
    }

    /**
     * Gets the value of the enumerationDomainReferencesCategorySet property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationDomain.EnumerationDomainReferencesCategorySet }
     *     
     */
    public EnumerationDomain.EnumerationDomainReferencesCategorySet getEnumerationDomainReferencesCategorySet() {
        return enumerationDomainReferencesCategorySet;
    }

    /**
     * Sets the value of the enumerationDomainReferencesCategorySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationDomain.EnumerationDomainReferencesCategorySet }
     *     
     */
    public void setEnumerationDomainReferencesCategorySet(EnumerationDomain.EnumerationDomainReferencesCategorySet value) {
        this.enumerationDomainReferencesCategorySet = value;
    }

    /**
     * Gets the value of the enumerationDomainIsDefinedByConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the enumerationDomainIsDefinedByConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationDomainIsDefinedByConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationDomain.EnumerationDomainIsDefinedByConcept }
     * 
     * 
     * @return
     *     The value of the enumerationDomainIsDefinedByConcept property.
     */
    public List<EnumerationDomain.EnumerationDomainIsDefinedByConcept> getEnumerationDomainIsDefinedByConcept() {
        if (enumerationDomainIsDefinedByConcept == null) {
            enumerationDomainIsDefinedByConcept = new ArrayList<>();
        }
        return this.enumerationDomainIsDefinedByConcept;
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
    public static class EnumerationDomainIsDefinedByConcept
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
     *               <enumeration value="CategorySet"/>
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
    public static class EnumerationDomainReferencesCategorySet
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
     *               <enumeration value="LevelStructure"/>
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
    public static class EnumerationDomainUsesLevelStructure
        extends Reference
    {


    }

}