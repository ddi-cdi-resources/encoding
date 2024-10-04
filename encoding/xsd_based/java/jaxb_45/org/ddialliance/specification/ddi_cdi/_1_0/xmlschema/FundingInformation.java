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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Information regarding the source of funds used to develop or support the resource being described.
 * 
 * <p>Java class for FundingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundingInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fundingAgent" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AgentInRole" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="grantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingInformation", propOrder = {
    "fundingAgent",
    "grantNumber"
})
public class FundingInformation {

    protected List<AgentInRole> fundingAgent;
    protected String grantNumber;

    /**
     * Gets the value of the fundingAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fundingAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentInRole }
     * 
     * 
     * @return
     *     The value of the fundingAgent property.
     */
    public List<AgentInRole> getFundingAgent() {
        if (fundingAgent == null) {
            fundingAgent = new ArrayList<>();
        }
        return this.fundingAgent;
    }

    /**
     * Gets the value of the grantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantNumber() {
        return grantNumber;
    }

    /**
     * Sets the value of the grantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantNumber(String value) {
        this.grantNumber = value;
    }

}