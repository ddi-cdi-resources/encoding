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
 *             Universe with time and geography specified.
 *             
 *             Examples
 *             ==========
 *             1. Canadian adult persons residing in Canada on 13 November 1956.
 *             2. US computer companies at the end of 2012.  
 *             3. Universities in Denmark 1 January 2011.
 *             
 *             Explanatory notes
 *             ===================
 *             Population is the most specific in the conceptually narrowing hierarchy of unit type, universe and population. Several populations having differing time and or geography may specialize the same universe.
 * 
 * <p>Java class for Population complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Population">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Universe">
 *       <sequence>
 *         <element name="timePeriodOfPopulation" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DateRange" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Population_isComposedOf_Unit" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Unit"/>
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
@XmlType(name = "Population", propOrder = {
    "timePeriodOfPopulation",
    "populationIsComposedOfUnit"
})
public class Population
    extends Universe
{

    protected List<DateRange> timePeriodOfPopulation;
    @XmlElement(name = "Population_isComposedOf_Unit")
    protected List<Population.PopulationIsComposedOfUnit> populationIsComposedOfUnit;

    /**
     * Gets the value of the timePeriodOfPopulation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the timePeriodOfPopulation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePeriodOfPopulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRange }
     * 
     * 
     * @return
     *     The value of the timePeriodOfPopulation property.
     */
    public List<DateRange> getTimePeriodOfPopulation() {
        if (timePeriodOfPopulation == null) {
            timePeriodOfPopulation = new ArrayList<>();
        }
        return this.timePeriodOfPopulation;
    }

    /**
     * Gets the value of the populationIsComposedOfUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the populationIsComposedOfUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulationIsComposedOfUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Population.PopulationIsComposedOfUnit }
     * 
     * 
     * @return
     *     The value of the populationIsComposedOfUnit property.
     */
    public List<Population.PopulationIsComposedOfUnit> getPopulationIsComposedOfUnit() {
        if (populationIsComposedOfUnit == null) {
            populationIsComposedOfUnit = new ArrayList<>();
        }
        return this.populationIsComposedOfUnit;
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
     *               <enumeration value="Unit"/>
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
    public static class PopulationIsComposedOfUnit
        extends AssociationReference
    {


    }

}
