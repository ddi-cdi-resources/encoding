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
 *             Collection of data instances that uniquely identify a collection of data points in a dataset.
 * 
 * <p>Java class for Key complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Key">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="Key_correspondsTo_Unit" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
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
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Key_represents_KeyDefinition" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DimensionalKeyDefinition"/>
 *                         <enumeration value="KeyDefinition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Key_identifies_DataPoint" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DataPoint"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Key_correspondsTo_Universe" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
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
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Key_has_KeyMember" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Descriptor"/>
 *                         <enumeration value="DimensionalKeyMember"/>
 *                         <enumeration value="KeyMember"/>
 *                         <enumeration value="LongMainKeyMember"/>
 *                         <enumeration value="MainKeyMember"/>
 *                         <enumeration value="WideKeyMember"/>
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
@XmlType(name = "Key", propOrder = {
    "identifier",
    "keyCorrespondsToUnit",
    "keyRepresentsKeyDefinition",
    "keyIdentifiesDataPoint",
    "keyCorrespondsToUniverse",
    "keyHasKeyMember"
})
@XmlSeeAlso({
    DimensionalKey.class,
    InstanceKey.class,
    LongKey.class,
    WideKey.class
})
public class Key {

    protected Identifier identifier;
    @XmlElement(name = "Key_correspondsTo_Unit")
    protected Key.KeyCorrespondsToUnit keyCorrespondsToUnit;
    @XmlElement(name = "Key_represents_KeyDefinition")
    protected Key.KeyRepresentsKeyDefinition keyRepresentsKeyDefinition;
    @XmlElement(name = "Key_identifies_DataPoint", required = true)
    protected List<Key.KeyIdentifiesDataPoint> keyIdentifiesDataPoint;
    @XmlElement(name = "Key_correspondsTo_Universe")
    protected Key.KeyCorrespondsToUniverse keyCorrespondsToUniverse;
    @XmlElement(name = "Key_has_KeyMember")
    protected List<Key.KeyHasKeyMember> keyHasKeyMember;

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
     * Gets the value of the keyCorrespondsToUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Key.KeyCorrespondsToUnit }
     *     
     */
    public Key.KeyCorrespondsToUnit getKeyCorrespondsToUnit() {
        return keyCorrespondsToUnit;
    }

    /**
     * Sets the value of the keyCorrespondsToUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key.KeyCorrespondsToUnit }
     *     
     */
    public void setKeyCorrespondsToUnit(Key.KeyCorrespondsToUnit value) {
        this.keyCorrespondsToUnit = value;
    }

    /**
     * Gets the value of the keyRepresentsKeyDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Key.KeyRepresentsKeyDefinition }
     *     
     */
    public Key.KeyRepresentsKeyDefinition getKeyRepresentsKeyDefinition() {
        return keyRepresentsKeyDefinition;
    }

    /**
     * Sets the value of the keyRepresentsKeyDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key.KeyRepresentsKeyDefinition }
     *     
     */
    public void setKeyRepresentsKeyDefinition(Key.KeyRepresentsKeyDefinition value) {
        this.keyRepresentsKeyDefinition = value;
    }

    /**
     * Gets the value of the keyIdentifiesDataPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyIdentifiesDataPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyIdentifiesDataPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key.KeyIdentifiesDataPoint }
     * 
     * 
     * @return
     *     The value of the keyIdentifiesDataPoint property.
     */
    public List<Key.KeyIdentifiesDataPoint> getKeyIdentifiesDataPoint() {
        if (keyIdentifiesDataPoint == null) {
            keyIdentifiesDataPoint = new ArrayList<>();
        }
        return this.keyIdentifiesDataPoint;
    }

    /**
     * Gets the value of the keyCorrespondsToUniverse property.
     * 
     * @return
     *     possible object is
     *     {@link Key.KeyCorrespondsToUniverse }
     *     
     */
    public Key.KeyCorrespondsToUniverse getKeyCorrespondsToUniverse() {
        return keyCorrespondsToUniverse;
    }

    /**
     * Sets the value of the keyCorrespondsToUniverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key.KeyCorrespondsToUniverse }
     *     
     */
    public void setKeyCorrespondsToUniverse(Key.KeyCorrespondsToUniverse value) {
        this.keyCorrespondsToUniverse = value;
    }

    /**
     * Gets the value of the keyHasKeyMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyHasKeyMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyHasKeyMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key.KeyHasKeyMember }
     * 
     * 
     * @return
     *     The value of the keyHasKeyMember property.
     */
    public List<Key.KeyHasKeyMember> getKeyHasKeyMember() {
        if (keyHasKeyMember == null) {
            keyHasKeyMember = new ArrayList<>();
        }
        return this.keyHasKeyMember;
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
     *               <enumeration value="Unit"/>
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
    public static class KeyCorrespondsToUnit
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
     *               <enumeration value="Population"/>
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
    public static class KeyCorrespondsToUniverse
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
     *         <element name="validType" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="Descriptor"/>
     *               <enumeration value="DimensionalKeyMember"/>
     *               <enumeration value="KeyMember"/>
     *               <enumeration value="LongMainKeyMember"/>
     *               <enumeration value="MainKeyMember"/>
     *               <enumeration value="WideKeyMember"/>
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
    public static class KeyHasKeyMember
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
     *         <element name="validType" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="DataPoint"/>
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
    public static class KeyIdentifiesDataPoint
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
     *         <element name="validType" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="DimensionalKeyDefinition"/>
     *               <enumeration value="KeyDefinition"/>
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
    public static class KeyRepresentsKeyDefinition
        extends Reference
    {


    }

}
