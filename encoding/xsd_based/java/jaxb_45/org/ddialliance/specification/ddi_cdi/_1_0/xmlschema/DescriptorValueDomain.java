//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Set of permissible values for a variable playing the role of a variable descriptor component.
 *             
 *             Examples
 *             ==========
 *             Consider two variables, i.e. income and age, with values appearing in the same column. 
 *             Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable.
 * 
 * <p>Java class for DescriptorValueDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DescriptorValueDomain">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}SubstantiveValueDomain">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptorValueDomain")
public class DescriptorValueDomain
    extends SubstantiveValueDomain
{


}