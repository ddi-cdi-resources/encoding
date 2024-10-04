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
 *             Key value relationship for two or more logical records where the key is one or more equivalent instance variables and the value is a defined relationship or a relationship to a set value.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             The instance variable map identifies the variables which are used to connect two data sets, as when persons in one structure are associated with households in another structure. For logical records Household and Person, the keys are Household ID (HHID in Household Record), and Person ID (HHIDP in Person Record). Their value relationship is Equal, and set value is n.a. For each person in the person record, the value of HHIDP will be exactly the same as the value of HHID in the household record for the household to which they belong. (Correspondence type refers to the variables themselves rather than the value of the variables concerned.) In this context correspondence type will normally be set to ExactMatch.
 * 
 * <p>Java class for InstanceVariableMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstanceVariableMap">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="comparison" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ComparisonOperator"/>
 *         <element name="correspondence" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CorrespondenceDefinition"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="setValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="InstanceVariableMap_hasTarget_InstanceVariable" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="InstanceVariable"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="InstanceVariableMap_hasSource_InstanceVariable" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="InstanceVariable"/>
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
@XmlType(name = "InstanceVariableMap", propOrder = {
    "comparison",
    "correspondence",
    "identifier",
    "setValue",
    "instanceVariableMapHasTargetInstanceVariable",
    "instanceVariableMapHasSourceInstanceVariable"
})
public class InstanceVariableMap {

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ComparisonOperator comparison;
    @XmlElement(required = true)
    protected CorrespondenceDefinition correspondence;
    protected Identifier identifier;
    @XmlElement(required = true)
    protected String setValue;
    @XmlElement(name = "InstanceVariableMap_hasTarget_InstanceVariable")
    protected List<InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable> instanceVariableMapHasTargetInstanceVariable;
    @XmlElement(name = "InstanceVariableMap_hasSource_InstanceVariable", required = true)
    protected List<InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable> instanceVariableMapHasSourceInstanceVariable;

    /**
     * Gets the value of the comparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperator }
     *     
     */
    public ComparisonOperator getComparison() {
        return comparison;
    }

    /**
     * Sets the value of the comparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperator }
     *     
     */
    public void setComparison(ComparisonOperator value) {
        this.comparison = value;
    }

    /**
     * Gets the value of the correspondence property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceDefinition }
     *     
     */
    public CorrespondenceDefinition getCorrespondence() {
        return correspondence;
    }

    /**
     * Sets the value of the correspondence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceDefinition }
     *     
     */
    public void setCorrespondence(CorrespondenceDefinition value) {
        this.correspondence = value;
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
     * Gets the value of the setValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetValue() {
        return setValue;
    }

    /**
     * Sets the value of the setValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetValue(String value) {
        this.setValue = value;
    }

    /**
     * Gets the value of the instanceVariableMapHasTargetInstanceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instanceVariableMapHasTargetInstanceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceVariableMapHasTargetInstanceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable }
     * 
     * 
     * @return
     *     The value of the instanceVariableMapHasTargetInstanceVariable property.
     */
    public List<InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable> getInstanceVariableMapHasTargetInstanceVariable() {
        if (instanceVariableMapHasTargetInstanceVariable == null) {
            instanceVariableMapHasTargetInstanceVariable = new ArrayList<>();
        }
        return this.instanceVariableMapHasTargetInstanceVariable;
    }

    /**
     * Gets the value of the instanceVariableMapHasSourceInstanceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instanceVariableMapHasSourceInstanceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceVariableMapHasSourceInstanceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable }
     * 
     * 
     * @return
     *     The value of the instanceVariableMapHasSourceInstanceVariable property.
     */
    public List<InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable> getInstanceVariableMapHasSourceInstanceVariable() {
        if (instanceVariableMapHasSourceInstanceVariable == null) {
            instanceVariableMapHasSourceInstanceVariable = new ArrayList<>();
        }
        return this.instanceVariableMapHasSourceInstanceVariable;
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
     *               <enumeration value="InstanceVariable"/>
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
    public static class InstanceVariableMapHasSourceInstanceVariable
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
     *               <enumeration value="InstanceVariable"/>
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
    public static class InstanceVariableMapHasTargetInstanceVariable
        extends AssociationReference
    {


    }

}
