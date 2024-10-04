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
 *             Curator is a software agent that uses techniques such as natural language processing to map facts in the research data store to the condition part of a rule.  
 *             
 *             Examples 
 *             ========== 
 *             Domain-specific curators are available as both open source and commercial products.   
 *             
 *             Explanatory notes 
 *             =================== 
 *             The curator assists in identifying the rules that are currently in play in the rule set.
 * 
 * <p>Java class for Curator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Curator">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ProcessingAgent">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curator")
public class Curator
    extends ProcessingAgent
{


}
