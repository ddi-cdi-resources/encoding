//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ==========
 *             A qualified measure whose domain is a universe as an aggregate, i.e. a measure with a specific production method applied to a specific cell in a cube.
 *             
 *             Examples
 *             ========
 *             Seasonally adjusted income for Single, Ontarians, Females.
 * 
 * <p>Java class for ScopedMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ScopedMeasure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="frequency" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="ScopedMeasure_circumscribes_DimensionalKeyDefinition" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DimensionalKeyDefinition"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ScopedMeasure_restricts_QualifiedMeasure" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="QualifiedMeasure"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ScopedMeasure_generates_RevisableDatum">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="RevisableDatum"/>
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
@XmlType(name = "ScopedMeasure", propOrder = {
    "frequency",
    "identifier",
    "scopedMeasureCircumscribesDimensionalKeyDefinition",
    "scopedMeasureRestrictsQualifiedMeasure",
    "scopedMeasureGeneratesRevisableDatum"
})
public class ScopedMeasure {

    protected InternationalString frequency;
    protected Identifier identifier;
    @XmlElement(name = "ScopedMeasure_circumscribes_DimensionalKeyDefinition")
    protected ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition scopedMeasureCircumscribesDimensionalKeyDefinition;
    @XmlElement(name = "ScopedMeasure_restricts_QualifiedMeasure")
    protected ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure scopedMeasureRestrictsQualifiedMeasure;
    @XmlElement(name = "ScopedMeasure_generates_RevisableDatum", required = true)
    protected ScopedMeasure.ScopedMeasureGeneratesRevisableDatum scopedMeasureGeneratesRevisableDatum;

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setFrequency(InternationalString value) {
        this.frequency = value;
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
     * Gets the value of the scopedMeasureCircumscribesDimensionalKeyDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition }
     *     
     */
    public ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition getScopedMeasureCircumscribesDimensionalKeyDefinition() {
        return scopedMeasureCircumscribesDimensionalKeyDefinition;
    }

    /**
     * Sets the value of the scopedMeasureCircumscribesDimensionalKeyDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition }
     *     
     */
    public void setScopedMeasureCircumscribesDimensionalKeyDefinition(ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition value) {
        this.scopedMeasureCircumscribesDimensionalKeyDefinition = value;
    }

    /**
     * Gets the value of the scopedMeasureRestrictsQualifiedMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure }
     *     
     */
    public ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure getScopedMeasureRestrictsQualifiedMeasure() {
        return scopedMeasureRestrictsQualifiedMeasure;
    }

    /**
     * Sets the value of the scopedMeasureRestrictsQualifiedMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure }
     *     
     */
    public void setScopedMeasureRestrictsQualifiedMeasure(ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure value) {
        this.scopedMeasureRestrictsQualifiedMeasure = value;
    }

    /**
     * Gets the value of the scopedMeasureGeneratesRevisableDatum property.
     * 
     * @return
     *     possible object is
     *     {@link ScopedMeasure.ScopedMeasureGeneratesRevisableDatum }
     *     
     */
    public ScopedMeasure.ScopedMeasureGeneratesRevisableDatum getScopedMeasureGeneratesRevisableDatum() {
        return scopedMeasureGeneratesRevisableDatum;
    }

    /**
     * Sets the value of the scopedMeasureGeneratesRevisableDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopedMeasure.ScopedMeasureGeneratesRevisableDatum }
     *     
     */
    public void setScopedMeasureGeneratesRevisableDatum(ScopedMeasure.ScopedMeasureGeneratesRevisableDatum value) {
        this.scopedMeasureGeneratesRevisableDatum = value;
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
     *               <enumeration value="DimensionalKeyDefinition"/>
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
    public static class ScopedMeasureCircumscribesDimensionalKeyDefinition
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
     *               <enumeration value="RevisableDatum"/>
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
    public static class ScopedMeasureGeneratesRevisableDatum
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
     *               <enumeration value="QualifiedMeasure"/>
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
    public static class ScopedMeasureRestrictsQualifiedMeasure
        extends Reference
    {


    }

}
