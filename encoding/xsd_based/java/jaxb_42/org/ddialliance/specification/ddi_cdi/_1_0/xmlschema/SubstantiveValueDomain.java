//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ==========
 *             Value domain for a substantive conceptual domain. Typically a description and/or enumeration of allowed values of interest.  
 *             
 *             Examples 
 *             ========
 *             All real decimal numbers relating to the subject matter of interest between 0 and 1 specified in Arabic numerals. (From the Generic Statistical Information Model [GSIM] 1.1). The codes "M" male and "F" for female .   
 *             
 *             Explanatory notes 
 *             =================
 *             In DDI-CDI the value domain for a variable is separated into "substantive" and "sentinel" values. Substantive values are the values of primary interest. Sentinel values are additional values that may carry supplementary information, such as reasons for missing. This duality is described in ISO 11404. Substantive values for height might be real numbers expressed in meters. The full value domain might also include codes for different kinds of missing values - one code for "refused" and another for "don�t know". Sentinel values may also convey some substantive information and at the same time represent missing values.
 *             
 *             An example might be where a numeric variable like number of employees be sometimes a count and sometimes a code representing a range of counts in order to avoid disclosure of information about a specific entity. The substantive value domain may use either a value description, for described values, or a codelist for enumerated values, or both. A value domain may consist of substantive values or sentinel values. Substantive values are those associated directly with some subject matter area. They do not address concerns around processing, such as missing values. Substantive values are called "regular values" in ISO/IEC 11404 - General Purpose Datatypes. The enumerated case is one where all values are listed.
 *             
 *             An example is the categorical values for gender: the conceptual domain could consist of the concept of male and the concept of female. These might be represented in codes and associated labels as 1 ("Male") 2 ("Female"). The described case is one where some description is needed to define the set of values. Take the following description for height in meters: "a real number between 0 and 3, represented to two Arabic decimal places". This description might be structured in some way to be machine actionable (datatype="double�, min="0", max="3", decimals="2").
 * 
 * <p>Java class for SubstantiveValueDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubstantiveValueDomain">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ValueDomain">
 *       <sequence>
 *         <element name="SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="CodeList"/>
 *                         <enumeration value="EnumerationDomain"/>
 *                         <enumeration value="StatisticalClassification"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="ValueAndConceptDescription"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="SubstantiveConceptualDomain"/>
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
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstantiveValueDomain", propOrder = {
    "substantiveValueDomainTakesValuesFromEnumerationDomain",
    "substantiveValueDomainIsDescribedByValueAndConceptDescription",
    "substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain"
})
@XmlSeeAlso({
    DescriptorValueDomain.class
})
public class SubstantiveValueDomain
    extends ValueDomain
{

    @XmlElement(name = "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain")
    protected SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain substantiveValueDomainTakesValuesFromEnumerationDomain;
    @XmlElement(name = "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription")
    protected SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription substantiveValueDomainIsDescribedByValueAndConceptDescription;
    @XmlElement(name = "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain")
    protected SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain;

    /**
     * Gets the value of the substantiveValueDomainTakesValuesFromEnumerationDomain property.
     * 
     * @return
     *     possible object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain }
     *     
     */
    public SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain getSubstantiveValueDomainTakesValuesFromEnumerationDomain() {
        return substantiveValueDomainTakesValuesFromEnumerationDomain;
    }

    /**
     * Sets the value of the substantiveValueDomainTakesValuesFromEnumerationDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain }
     *     
     */
    public void setSubstantiveValueDomainTakesValuesFromEnumerationDomain(SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain value) {
        this.substantiveValueDomainTakesValuesFromEnumerationDomain = value;
    }

    /**
     * Gets the value of the substantiveValueDomainIsDescribedByValueAndConceptDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription }
     *     
     */
    public SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription getSubstantiveValueDomainIsDescribedByValueAndConceptDescription() {
        return substantiveValueDomainIsDescribedByValueAndConceptDescription;
    }

    /**
     * Sets the value of the substantiveValueDomainIsDescribedByValueAndConceptDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription }
     *     
     */
    public void setSubstantiveValueDomainIsDescribedByValueAndConceptDescription(SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription value) {
        this.substantiveValueDomainIsDescribedByValueAndConceptDescription = value;
    }

    /**
     * Gets the value of the substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain property.
     * 
     * @return
     *     possible object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain }
     *     
     */
    public SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain getSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain() {
        return substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain;
    }

    /**
     * Sets the value of the substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain }
     *     
     */
    public void setSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain(SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain value) {
        this.substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain = value;
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
     *               <enumeration value="ValueAndConceptDescription"/>
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
    public static class SubstantiveValueDomainIsDescribedByValueAndConceptDescription
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
     *               <enumeration value="SubstantiveConceptualDomain"/>
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
    public static class SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain
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
     *               <enumeration value="CodeList"/>
     *               <enumeration value="EnumerationDomain"/>
     *               <enumeration value="StatisticalClassification"/>
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
    public static class SubstantiveValueDomainTakesValuesFromEnumerationDomain
        extends Reference
    {


    }

}
