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
 *             Source-target relationship between classification items in a classification item relation structure.
 * 
 * <p>Java class for ClassificationItemRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClassificationItemRelationship">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="semantics" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="ClassificationItemRelationship_hasSource_ClassificationItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationItem"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ClassificationItemRelationship_hasTarget_ClassificationItem" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ClassificationItem"/>
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
@XmlType(name = "ClassificationItemRelationship", propOrder = {
    "identifier",
    "semantics",
    "classificationItemRelationshipHasSourceClassificationItem",
    "classificationItemRelationshipHasTargetClassificationItem"
})
public class ClassificationItemRelationship {

    protected Identifier identifier;
    protected ControlledVocabularyEntry semantics;
    @XmlElement(name = "ClassificationItemRelationship_hasSource_ClassificationItem")
    protected List<ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem> classificationItemRelationshipHasSourceClassificationItem;
    @XmlElement(name = "ClassificationItemRelationship_hasTarget_ClassificationItem")
    protected List<ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem> classificationItemRelationshipHasTargetClassificationItem;

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
     * Gets the value of the classificationItemRelationshipHasSourceClassificationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationItemRelationshipHasSourceClassificationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationItemRelationshipHasSourceClassificationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem }
     * 
     * 
     * @return
     *     The value of the classificationItemRelationshipHasSourceClassificationItem property.
     */
    public List<ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem> getClassificationItemRelationshipHasSourceClassificationItem() {
        if (classificationItemRelationshipHasSourceClassificationItem == null) {
            classificationItemRelationshipHasSourceClassificationItem = new ArrayList<>();
        }
        return this.classificationItemRelationshipHasSourceClassificationItem;
    }

    /**
     * Gets the value of the classificationItemRelationshipHasTargetClassificationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationItemRelationshipHasTargetClassificationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationItemRelationshipHasTargetClassificationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem }
     * 
     * 
     * @return
     *     The value of the classificationItemRelationshipHasTargetClassificationItem property.
     */
    public List<ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem> getClassificationItemRelationshipHasTargetClassificationItem() {
        if (classificationItemRelationshipHasTargetClassificationItem == null) {
            classificationItemRelationshipHasTargetClassificationItem = new ArrayList<>();
        }
        return this.classificationItemRelationshipHasTargetClassificationItem;
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
     *               <enumeration value="ClassificationItem"/>
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
    public static class ClassificationItemRelationshipHasSourceClassificationItem
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
     *               <enumeration value="ClassificationItem"/>
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
    public static class ClassificationItemRelationshipHasTargetClassificationItem
        extends Reference
    {


    }

}
