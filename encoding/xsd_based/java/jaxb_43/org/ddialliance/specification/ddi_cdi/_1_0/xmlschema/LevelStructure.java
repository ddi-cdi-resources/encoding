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
 *             Nesting structure of a hierarchical collection.   
 *             
 *             Examples 
 *             ========== 
 *             The International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) Major, Sub-Major, and Minor or the North American Industry Classification System (NAICS: https://www.census.gov/naics/) 2 digit sector codes, 3 digit subsector code list, 4 digit industry group code list, and 5 digit industry code list.
 *             
 *             Explanatory notes 
 *             =================== 
 *             The levels within the structure begin at the root level '1' and continue as an ordered array through each level of nesting. Levels are used to organize a hierarchy. Usually, a hierarchy contains one root member at the top, though it could contain several. These are the first level. All members directly related to those  in the first level compose the second level. The third and subsequent levels are defined similarly.  A level often is associated with a concept, which defines it. These correspond to kinds of aggregates. For example, in the US Standard Occupational Classification (2010), the level below the top is called Major Occupation Groups, and the next level is called Minor Occupational Groups. These ideas convey the structure. In particular, Health Care Practitioners (a major group) can be broken into Chiropractors, Dentists, Physicians, Vets, Therapists, etc. (minor groups) The categories in the nodes at the lower level aggregate to the category in node above them.  "Classification schemes are frequently organized in nested levels of increasing detail. ISCO-08, for example, has four levels: at the top level are ten major groups, each of which contain sub-major groups, which in turn are subdivided in minor groups, which contain unit groups. Even when a classification is not structured in levels ("flat classification"), the usual convention, which is adopted here, is to consider that it contains one unique level." (From the W3C Simple Knowlegde Organization System: http://rdf-vocabulary.ddialliance.org/xkos.html#) Individual classification items organized in a hierarchy may be associated with a specific level.
 * 
 * <p>Java class for LevelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LevelStructure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="catalogDetails" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}CatalogDetails" minOccurs="0"/>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="name" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ObjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="usage" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalString" minOccurs="0"/>
 *         <element name="validDateRange" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DateRange" minOccurs="0"/>
 *         <element name="LevelStructure_has_Level" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Level"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
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
@XmlType(name = "LevelStructure", propOrder = {
    "catalogDetails",
    "identifier",
    "name",
    "usage",
    "validDateRange",
    "levelStructureHasLevel"
})
public class LevelStructure {

    protected CatalogDetails catalogDetails;
    protected Identifier identifier;
    protected List<ObjectName> name;
    protected InternationalString usage;
    protected DateRange validDateRange;
    @XmlElement(name = "LevelStructure_has_Level")
    protected List<LevelStructure.LevelStructureHasLevel> levelStructureHasLevel;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectName }
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<ObjectName> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalString }
     *     
     */
    public InternationalString getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalString }
     *     
     */
    public void setUsage(InternationalString value) {
        this.usage = value;
    }

    /**
     * Gets the value of the validDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getValidDateRange() {
        return validDateRange;
    }

    /**
     * Sets the value of the validDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setValidDateRange(DateRange value) {
        this.validDateRange = value;
    }

    /**
     * Gets the value of the levelStructureHasLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the levelStructureHasLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelStructureHasLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelStructure.LevelStructureHasLevel }
     * 
     * 
     * @return
     *     The value of the levelStructureHasLevel property.
     */
    public List<LevelStructure.LevelStructureHasLevel> getLevelStructureHasLevel() {
        if (levelStructureHasLevel == null) {
            levelStructureHasLevel = new ArrayList<>();
        }
        return this.levelStructureHasLevel;
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
     *               <enumeration value="Level"/>
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
    public static class LevelStructureHasLevel
        extends AssociationReference
    {


    }

}