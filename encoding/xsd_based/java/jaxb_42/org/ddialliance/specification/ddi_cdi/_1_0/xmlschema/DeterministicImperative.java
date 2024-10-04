//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ============ 
 *             Deterministic imperative is a subtype of control logic. Deterministic control logic consists of control constructs.   
 *             
 *             Examples 
 *             ========== 
 *             A Loop control construct is deterministic control logic. A script is deterministic control logic.  
 *             
 *             Explanatory notes 
 *             =================== 
 *             Because control logic covers both deterministic and non-deterministic forms, it has been divided into the appropriate subtypes.
 * 
 * <p>Java class for DeterministicImperative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeterministicImperative">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlLogic">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeterministicImperative")
@XmlSeeAlso({
    ConditionalControlLogic.class,
    Sequence.class
})
public class DeterministicImperative
    extends ControlLogic
{


}