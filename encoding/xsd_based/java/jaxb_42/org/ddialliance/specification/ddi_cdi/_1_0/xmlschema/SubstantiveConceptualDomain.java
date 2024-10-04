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
 *             ==========
 *             Conceptual domain of substantive concepts.  
 *             
 *             Examples 
 *             ======== 
 *             An enumeration of concepts for a categorical variable like "male" and "female" for gender, or "ozone" and "particulate matter less than 2.5 microns in diameter" for pollutant in an air quality measure.  
 *             
 *             Explanatory notes 
 *             =================
 *             A conceptual variable links a unit type to a substantive conceptual domain. The latter can be an enumeration or description of the values that the variable may take on. In the enumerated case these are the categories in a category set that can be values, not the codes that represent the values. An example might be the conceptual domain for a variable representing self-identified gender. An enumeration might include the concept of "male" and the concept of "female". These, in turn, would be represented in a substantive value domain by codes in a code list like "m" and "f", or "0" and "1". A conceptual domain might be described through a value and concept description's description property of "a real number greater than 0" or through a more formal logical expression of "all reals x such that x > 0". Even in the described case, what is being described are conceptual, not the symbols used to represent the values. This may be a subtle distinction, but allows specifying that the same numeric value might be represented by 32 bits or by 64 bits or by an Arabic numeral or a Roman numeral.
 * 
 * <p>Java class for SubstantiveConceptualDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubstantiveConceptualDomain">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ConceptualDomain">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstantiveConceptualDomain")
public class SubstantiveConceptualDomain
    extends ConceptualDomain
{


}
