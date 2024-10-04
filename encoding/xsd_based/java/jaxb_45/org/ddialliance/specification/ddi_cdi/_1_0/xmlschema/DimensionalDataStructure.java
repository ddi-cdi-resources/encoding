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
 *             Structure of a dimensional data set (organized collection of multidimensional data). It is described by dimension, measure and attribute components.
 *             
 *             Examples
 *             ==========
 *             The structure described by [City, Average Income, Total Population] where City is a dimension and Average Income and Total Population are measures.
 * 
 * <p>Java class for DimensionalDataStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DimensionalDataStructure">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DataStructure">
 *       <sequence>
 *         <element name="DimensionalDataStructure_uses_DimensionGroup" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="DimensionGroup"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
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
@XmlType(name = "DimensionalDataStructure", propOrder = {
    "dimensionalDataStructureUsesDimensionGroup"
})
public class DimensionalDataStructure
    extends DataStructure
{

    @XmlElement(name = "DimensionalDataStructure_uses_DimensionGroup")
    protected List<DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup> dimensionalDataStructureUsesDimensionGroup;

    /**
     * Gets the value of the dimensionalDataStructureUsesDimensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dimensionalDataStructureUsesDimensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionalDataStructureUsesDimensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup }
     * 
     * 
     * @return
     *     The value of the dimensionalDataStructureUsesDimensionGroup property.
     */
    public List<DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup> getDimensionalDataStructureUsesDimensionGroup() {
        if (dimensionalDataStructureUsesDimensionGroup == null) {
            dimensionalDataStructureUsesDimensionGroup = new ArrayList<>();
        }
        return this.dimensionalDataStructureUsesDimensionGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
     *       <sequence>
     *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
     *         <element name="validType" maxOccurs="unbounded" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="DimensionGroup"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "")
    public static class DimensionalDataStructureUsesDimensionGroup
        extends AssociationReference
    {


    }

}