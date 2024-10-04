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
 *             Persistent, globally unique object identifier aligned with ISO/IEC 11179-6:2015, Information technology - Metadata registries (MDR) - Part 6: Registration, Annex A, Identifiers based on ISO/IEC 6523, http://standards.iso.org/ittf/PubliclyAvailableStandards/c060342_ISO_IEC_11179-6_2015.zip.
 *             The uniqueness of an InternationalRegistrationDataIdentifier (IRDI) is determined by the combination of the values of three identifying attributes.
 * 
 * <p>Java class for InternationalRegistrationDataIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InternationalRegistrationDataIdentifier">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="registrationAuthorityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="versionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalRegistrationDataIdentifier", propOrder = {
    "dataIdentifier",
    "registrationAuthorityIdentifier",
    "versionIdentifier"
})
public class InternationalRegistrationDataIdentifier {

    @XmlElement(required = true)
    protected String dataIdentifier;
    @XmlElement(required = true)
    protected String registrationAuthorityIdentifier;
    @XmlElement(required = true)
    protected String versionIdentifier;

    /**
     * Gets the value of the dataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdentifier() {
        return dataIdentifier;
    }

    /**
     * Sets the value of the dataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdentifier(String value) {
        this.dataIdentifier = value;
    }

    /**
     * Gets the value of the registrationAuthorityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationAuthorityIdentifier() {
        return registrationAuthorityIdentifier;
    }

    /**
     * Sets the value of the registrationAuthorityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationAuthorityIdentifier(String value) {
        this.registrationAuthorityIdentifier = value;
    }

    /**
     * Gets the value of the versionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionIdentifier() {
        return versionIdentifier;
    }

    /**
     * Sets the value of the versionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionIdentifier(String value) {
        this.versionIdentifier = value;
    }

}
