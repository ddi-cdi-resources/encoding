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
 *             Collection of concepts that uniquely defines a collection of data points in a dataset.
 * 
 * <p>Java class for KeyDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyDefinition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="KeyDefinition_correspondsTo_Universe" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Population"/>
 *                         <enumeration value="Universe"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="KeyDefinition_correspondsTo_Unit" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Unit"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="KeyDefinition_has_KeyDefinitionMember" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="KeyDefinitionMember"/>
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
@XmlType(name = "KeyDefinition", propOrder = {
    "identifier",
    "keyDefinitionCorrespondsToUniverse",
    "keyDefinitionCorrespondsToUnit",
    "keyDefinitionHasKeyDefinitionMember"
})
@XmlSeeAlso({
    DimensionalKeyDefinition.class
})
public class KeyDefinition {

    protected Identifier identifier;
    @XmlElement(name = "KeyDefinition_correspondsTo_Universe")
    protected KeyDefinition.KeyDefinitionCorrespondsToUniverse keyDefinitionCorrespondsToUniverse;
    @XmlElement(name = "KeyDefinition_correspondsTo_Unit")
    protected KeyDefinition.KeyDefinitionCorrespondsToUnit keyDefinitionCorrespondsToUnit;
    @XmlElement(name = "KeyDefinition_has_KeyDefinitionMember")
    protected List<KeyDefinition.KeyDefinitionHasKeyDefinitionMember> keyDefinitionHasKeyDefinitionMember;

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
     * Gets the value of the keyDefinitionCorrespondsToUniverse property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDefinition.KeyDefinitionCorrespondsToUniverse }
     *     
     */
    public KeyDefinition.KeyDefinitionCorrespondsToUniverse getKeyDefinitionCorrespondsToUniverse() {
        return keyDefinitionCorrespondsToUniverse;
    }

    /**
     * Sets the value of the keyDefinitionCorrespondsToUniverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDefinition.KeyDefinitionCorrespondsToUniverse }
     *     
     */
    public void setKeyDefinitionCorrespondsToUniverse(KeyDefinition.KeyDefinitionCorrespondsToUniverse value) {
        this.keyDefinitionCorrespondsToUniverse = value;
    }

    /**
     * Gets the value of the keyDefinitionCorrespondsToUnit property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDefinition.KeyDefinitionCorrespondsToUnit }
     *     
     */
    public KeyDefinition.KeyDefinitionCorrespondsToUnit getKeyDefinitionCorrespondsToUnit() {
        return keyDefinitionCorrespondsToUnit;
    }

    /**
     * Sets the value of the keyDefinitionCorrespondsToUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDefinition.KeyDefinitionCorrespondsToUnit }
     *     
     */
    public void setKeyDefinitionCorrespondsToUnit(KeyDefinition.KeyDefinitionCorrespondsToUnit value) {
        this.keyDefinitionCorrespondsToUnit = value;
    }

    /**
     * Gets the value of the keyDefinitionHasKeyDefinitionMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyDefinitionHasKeyDefinitionMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyDefinitionHasKeyDefinitionMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyDefinition.KeyDefinitionHasKeyDefinitionMember }
     * 
     * 
     * @return
     *     The value of the keyDefinitionHasKeyDefinitionMember property.
     */
    public List<KeyDefinition.KeyDefinitionHasKeyDefinitionMember> getKeyDefinitionHasKeyDefinitionMember() {
        if (keyDefinitionHasKeyDefinitionMember == null) {
            keyDefinitionHasKeyDefinitionMember = new ArrayList<>();
        }
        return this.keyDefinitionHasKeyDefinitionMember;
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
     *               <enumeration value="Unit"/>
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
    public static class KeyDefinitionCorrespondsToUnit
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
     *               <enumeration value="Population"/>
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
    public static class KeyDefinitionCorrespondsToUniverse
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
     *               <enumeration value="KeyDefinitionMember"/>
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
    public static class KeyDefinitionHasKeyDefinitionMember
        extends AssociationReference
    {


    }

}
