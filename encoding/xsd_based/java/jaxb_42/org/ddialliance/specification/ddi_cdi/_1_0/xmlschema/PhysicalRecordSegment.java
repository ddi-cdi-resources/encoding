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
 *             ==========
 *             Description of each physical storage segment required to completely cover a physical record representing the logical record.
 *             
 *             Examples
 *             ========
 *             The file below has four instance variables: PersonId, SegmentId, AgeYr, and HeightCm. The data for each person (identified by PersonId) is recorded in two segments (identified by SegmentId), "a" and "b". AgeYr is on physical segment a, and HeightCm is on segment b. These are the same data as described in the unit segment layout documentation. ::
 *             
 *                1 a  22  
 *                1 b 183  
 *                2 a  45
 *                2 b 175  
 *             
 *             Explanatory notes
 *             =================
 *             A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment.
 * 
 * <p>Java class for PhysicalRecordSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PhysicalRecordSegment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="allowsDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="physicalFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="PhysicalRecordSegment_represents_Population" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Population"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PhysicalRecordSegment_isDefinedBy_Concept" maxOccurs="unbounded" minOccurs="0">
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
 *         <element name="PhysicalRecordSegment_has_PhysicalSegmentLayout" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="PhysicalSegmentLayout"/>
 *                         <enumeration value="UnitSegmentLayout"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PhysicalRecordSegment_mapsTo_LogicalRecord" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
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
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PhysicalRecordSegment_has_DataPointPosition" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DataPointPosition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PhysicalRecordSegment_has_DataPoint" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalRecordSegment", propOrder = {
    "allowsDuplicates",
    "catalogDetails",
    "identifier",
    "name",
    "physicalFileName",
    "purpose",
    "physicalRecordSegmentRepresentsPopulation",
    "physicalRecordSegmentIsDefinedByConcept",
    "physicalRecordSegmentHasPhysicalSegmentLayout",
    "physicalRecordSegmentMapsToLogicalRecord",
    "physicalRecordSegmentHasDataPointPosition",
    "physicalRecordSegmentHasDataPoint"
})
public class PhysicalRecordSegment {

    protected boolean allowsDuplicates;
    protected CatalogDetails catalogDetails;
    protected Identifier identifier;
    protected List<ObjectName> name;
    protected String physicalFileName;
    protected InternationalString purpose;
    @XmlElement(name = "PhysicalRecordSegment_represents_Population")
    protected PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation physicalRecordSegmentRepresentsPopulation;
    @XmlElement(name = "PhysicalRecordSegment_isDefinedBy_Concept")
    protected List<PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept> physicalRecordSegmentIsDefinedByConcept;
    @XmlElement(name = "PhysicalRecordSegment_has_PhysicalSegmentLayout")
    protected PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout physicalRecordSegmentHasPhysicalSegmentLayout;
    @XmlElement(name = "PhysicalRecordSegment_mapsTo_LogicalRecord")
    protected PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord physicalRecordSegmentMapsToLogicalRecord;
    @XmlElement(name = "PhysicalRecordSegment_has_DataPointPosition")
    protected List<PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition> physicalRecordSegmentHasDataPointPosition;
    @XmlElement(name = "PhysicalRecordSegment_has_DataPoint")
    protected List<PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint> physicalRecordSegmentHasDataPoint;

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
     * Gets the value of the physicalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalFileName() {
        return physicalFileName;
    }

    /**
     * Sets the value of the physicalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalFileName(String value) {
        this.physicalFileName = value;
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
     * Gets the value of the physicalRecordSegmentRepresentsPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation }
     *     
     */
    public PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation getPhysicalRecordSegmentRepresentsPopulation() {
        return physicalRecordSegmentRepresentsPopulation;
    }

    /**
     * Sets the value of the physicalRecordSegmentRepresentsPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation }
     *     
     */
    public void setPhysicalRecordSegmentRepresentsPopulation(PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation value) {
        this.physicalRecordSegmentRepresentsPopulation = value;
    }

    /**
     * Gets the value of the physicalRecordSegmentIsDefinedByConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the physicalRecordSegmentIsDefinedByConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalRecordSegmentIsDefinedByConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept }
     * 
     * 
     * @return
     *     The value of the physicalRecordSegmentIsDefinedByConcept property.
     */
    public List<PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept> getPhysicalRecordSegmentIsDefinedByConcept() {
        if (physicalRecordSegmentIsDefinedByConcept == null) {
            physicalRecordSegmentIsDefinedByConcept = new ArrayList<>();
        }
        return this.physicalRecordSegmentIsDefinedByConcept;
    }

    /**
     * Gets the value of the physicalRecordSegmentHasPhysicalSegmentLayout property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout }
     *     
     */
    public PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout getPhysicalRecordSegmentHasPhysicalSegmentLayout() {
        return physicalRecordSegmentHasPhysicalSegmentLayout;
    }

    /**
     * Sets the value of the physicalRecordSegmentHasPhysicalSegmentLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout }
     *     
     */
    public void setPhysicalRecordSegmentHasPhysicalSegmentLayout(PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout value) {
        this.physicalRecordSegmentHasPhysicalSegmentLayout = value;
    }

    /**
     * Gets the value of the physicalRecordSegmentMapsToLogicalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord }
     *     
     */
    public PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord getPhysicalRecordSegmentMapsToLogicalRecord() {
        return physicalRecordSegmentMapsToLogicalRecord;
    }

    /**
     * Sets the value of the physicalRecordSegmentMapsToLogicalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord }
     *     
     */
    public void setPhysicalRecordSegmentMapsToLogicalRecord(PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord value) {
        this.physicalRecordSegmentMapsToLogicalRecord = value;
    }

    /**
     * Gets the value of the physicalRecordSegmentHasDataPointPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the physicalRecordSegmentHasDataPointPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalRecordSegmentHasDataPointPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition }
     * 
     * 
     * @return
     *     The value of the physicalRecordSegmentHasDataPointPosition property.
     */
    public List<PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition> getPhysicalRecordSegmentHasDataPointPosition() {
        if (physicalRecordSegmentHasDataPointPosition == null) {
            physicalRecordSegmentHasDataPointPosition = new ArrayList<>();
        }
        return this.physicalRecordSegmentHasDataPointPosition;
    }

    /**
     * Gets the value of the physicalRecordSegmentHasDataPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the physicalRecordSegmentHasDataPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalRecordSegmentHasDataPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint }
     * 
     * 
     * @return
     *     The value of the physicalRecordSegmentHasDataPoint property.
     */
    public List<PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint> getPhysicalRecordSegmentHasDataPoint() {
        if (physicalRecordSegmentHasDataPoint == null) {
            physicalRecordSegmentHasDataPoint = new ArrayList<>();
        }
        return this.physicalRecordSegmentHasDataPoint;
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
    public static class PhysicalRecordSegmentHasDataPoint
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
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="DataPointPosition"/>
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
    public static class PhysicalRecordSegmentHasDataPointPosition
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
     *               <enumeration value="PhysicalSegmentLayout"/>
     *               <enumeration value="UnitSegmentLayout"/>
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
    public static class PhysicalRecordSegmentHasPhysicalSegmentLayout
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
    public static class PhysicalRecordSegmentIsDefinedByConcept
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
     *               <enumeration value="LogicalRecord"/>
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
    public static class PhysicalRecordSegmentMapsToLogicalRecord
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
    public static class PhysicalRecordSegmentRepresentsPopulation
        extends Reference
    {


    }

}
