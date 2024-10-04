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
 *             Identifies the authorizing agency and allows for the full text of the authorization (law, regulation, or other form of authorization).  
 *             
 *             Examples 
 *             ========== 
 *             May be used to list authorizations from oversight committees and other regulatory agencies.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             Supports requirements for some statistical offices to identify the agency or law authorizing the collection or management of data or metadata.
 * 
 * <p>Java class for AuthorizationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuthorizationSource">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="authorizationDate" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CombinedDate" minOccurs="0"/>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="legalMandate" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="purpose" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="statementOfAuthorization" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="AuthorizationSource_has_Agent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Reference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Agent"/>
 *                         <enumeration value="Curator"/>
 *                         <enumeration value="Individual"/>
 *                         <enumeration value="Machine"/>
 *                         <enumeration value="Organization"/>
 *                         <enumeration value="ProcessingAgent"/>
 *                         <enumeration value="Service"/>
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
@XmlType(name = "AuthorizationSource", propOrder = {
    "authorizationDate",
    "catalogDetails",
    "identifier",
    "legalMandate",
    "purpose",
    "statementOfAuthorization",
    "authorizationSourceHasAgent"
})
public class AuthorizationSource {

    protected CombinedDate authorizationDate;
    protected CatalogDetails catalogDetails;
    protected Identifier identifier;
    protected InternationalString legalMandate;
    protected InternationalString purpose;
    protected InternationalString statementOfAuthorization;
    @XmlElement(name = "AuthorizationSource_has_Agent")
    protected List<AuthorizationSource.AuthorizationSourceHasAgent> authorizationSourceHasAgent;

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedDate }
     *     
     */
    public CombinedDate getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedDate }
     *     
     */
    public void setAuthorizationDate(CombinedDate value) {
        this.authorizationDate = value;
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
     * Gets the value of the legalMandate property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getLegalMandate() {
        return legalMandate;
    }

    /**
     * Sets the value of the legalMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setLegalMandate(InternationalString value) {
        this.legalMandate = value;
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
     * Gets the value of the statementOfAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getStatementOfAuthorization() {
        return statementOfAuthorization;
    }

    /**
     * Sets the value of the statementOfAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setStatementOfAuthorization(InternationalString value) {
        this.statementOfAuthorization = value;
    }

    /**
     * Gets the value of the authorizationSourceHasAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authorizationSourceHasAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizationSourceHasAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationSource.AuthorizationSourceHasAgent }
     * 
     * 
     * @return
     *     The value of the authorizationSourceHasAgent property.
     */
    public List<AuthorizationSource.AuthorizationSourceHasAgent> getAuthorizationSourceHasAgent() {
        if (authorizationSourceHasAgent == null) {
            authorizationSourceHasAgent = new ArrayList<>();
        }
        return this.authorizationSourceHasAgent;
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
     *               <enumeration value="Agent"/>
     *               <enumeration value="Curator"/>
     *               <enumeration value="Individual"/>
     *               <enumeration value="Machine"/>
     *               <enumeration value="Organization"/>
     *               <enumeration value="ProcessingAgent"/>
     *               <enumeration value="Service"/>
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
    public static class AuthorizationSourceHasAgent
        extends Reference
    {


    }

}
