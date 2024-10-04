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
 *             Relationships among record types within and between logical records.
 *             
 *             Examples
 *             ==========
 *             One logical record containing a PersonIdentifier and a PersonName and another logical record containing a MeasurementID, a PersonID, a SystolicPressure, and a DiastolicPressure could be linked by a record relation. The record relation could employ an instance variable value map to describe the linkage between  PersonIdentifier and PersonID.
 *             
 *             A household-level logical record might contain an instance variable called HouseholdID and a person-level logical record might contain an instance variable called HID. Describing a link between HouseholdID and HID would allow the linking of a person-level LogicalRecord to their corresponding household-level logical record.
 *             
 *             Explanatory notes
 *             ===================
 *             For instance variables existing in a logical record with multiple record layouts, pairs of instance variables may function as paired keys to permit the expression of hierarchical links between records of different types. These links between keys in different record types could also be used to link records in a relational structure.
 * 
 * <p>Java class for RecordRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecordRelation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="displayLabel" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}LabelForDisplay" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="usage" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="RecordRelation_maps_LogicalRecord" maxOccurs="unbounded" minOccurs="2">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="LogicalRecord"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RecordRelation_has_InstanceVariableMap" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="InstanceVariableMap"/>
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
@XmlType(name = "RecordRelation", propOrder = {
    "catalogDetails",
    "displayLabel",
    "identifier",
    "purpose",
    "usage",
    "recordRelationMapsLogicalRecord",
    "recordRelationHasInstanceVariableMap"
})
public class RecordRelation {

    protected CatalogDetails catalogDetails;
    protected List<LabelForDisplay> displayLabel;
    protected Identifier identifier;
    protected InternationalString purpose;
    protected InternationalString usage;
    @XmlElement(name = "RecordRelation_maps_LogicalRecord", required = true)
    protected List<RecordRelation.RecordRelationMapsLogicalRecord> recordRelationMapsLogicalRecord;
    @XmlElement(name = "RecordRelation_has_InstanceVariableMap")
    protected List<RecordRelation.RecordRelationHasInstanceVariableMap> recordRelationHasInstanceVariableMap;

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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setUsage(InternationalString value) {
        this.usage = value;
    }

    /**
     * Gets the value of the recordRelationMapsLogicalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recordRelationMapsLogicalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordRelationMapsLogicalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRelation.RecordRelationMapsLogicalRecord }
     * 
     * 
     * @return
     *     The value of the recordRelationMapsLogicalRecord property.
     */
    public List<RecordRelation.RecordRelationMapsLogicalRecord> getRecordRelationMapsLogicalRecord() {
        if (recordRelationMapsLogicalRecord == null) {
            recordRelationMapsLogicalRecord = new ArrayList<>();
        }
        return this.recordRelationMapsLogicalRecord;
    }

    /**
     * Gets the value of the recordRelationHasInstanceVariableMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recordRelationHasInstanceVariableMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordRelationHasInstanceVariableMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRelation.RecordRelationHasInstanceVariableMap }
     * 
     * 
     * @return
     *     The value of the recordRelationHasInstanceVariableMap property.
     */
    public List<RecordRelation.RecordRelationHasInstanceVariableMap> getRecordRelationHasInstanceVariableMap() {
        if (recordRelationHasInstanceVariableMap == null) {
            recordRelationHasInstanceVariableMap = new ArrayList<>();
        }
        return this.recordRelationHasInstanceVariableMap;
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
     *               <enumeration value="InstanceVariableMap"/>
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
    public static class RecordRelationHasInstanceVariableMap
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
     *               <enumeration value="LogicalRecord"/>
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
    public static class RecordRelationMapsLogicalRecord
        extends AssociationReference
    {


    }

}
