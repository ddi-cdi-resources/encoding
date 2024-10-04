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
 *             Structure of a key-value datastore (organized collection of key-value data). It is described by identifier, contextual, synthetic id, dimension, variable descriptor and variable value components.
 *             
 *             Examples
 *             ==========
 *             The structure described by [Income distribution, Unit id, Period, Income] where Income distribution is the contextual component, Unit id identifies a statistical unit, period is a effective period and Income is the variable of interest.
 * 
 * <p>Java class for KeyValueStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyValueStructure">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DataStructure">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueStructure")
public class KeyValueStructure
    extends DataStructure
{


}
