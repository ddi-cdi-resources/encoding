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
 *             Statistics related to a specific category of an instance variable within a data set.  
 *             
 *             Examples 
 *             ========== 
 *             The percentage of females from a demographic data set.   
 *             
 *             Explanatory notes 
 *             =================== 
 *             Statistics at the data set are used as indicators during assessment of the appropriateness of using a some data for a particular purpose.
 * 
 * <p>Java class for CategoryStatistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategoryStatistic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifier" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Identifier" minOccurs="0"/>
 *         <element name="statistic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Statistic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeOfCategoryStatistic" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ControlledVocabularyEntry" minOccurs="0"/>
 *         <element name="CategoryStatistic_appliesTo_InstanceVariable" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="InstanceVariable"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CategoryStatistic_for_Category" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType" maxOccurs="unbounded" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="Category"/>
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
@XmlType(name = "CategoryStatistic", propOrder = {
    "identifier",
    "statistic",
    "typeOfCategoryStatistic",
    "categoryStatisticAppliesToInstanceVariable",
    "categoryStatisticForCategory"
})
public class CategoryStatistic {

    protected Identifier identifier;
    protected List<Statistic> statistic;
    protected ControlledVocabularyEntry typeOfCategoryStatistic;
    @XmlElement(name = "CategoryStatistic_appliesTo_InstanceVariable", required = true)
    protected List<CategoryStatistic.CategoryStatisticAppliesToInstanceVariable> categoryStatisticAppliesToInstanceVariable;
    @XmlElement(name = "CategoryStatistic_for_Category")
    protected CategoryStatistic.CategoryStatisticForCategory categoryStatisticForCategory;

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
     * Gets the value of the statistic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the statistic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statistic }
     * 
     * 
     * @return
     *     The value of the statistic property.
     */
    public List<Statistic> getStatistic() {
        if (statistic == null) {
            statistic = new ArrayList<>();
        }
        return this.statistic;
    }

    /**
     * Gets the value of the typeOfCategoryStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public ControlledVocabularyEntry getTypeOfCategoryStatistic() {
        return typeOfCategoryStatistic;
    }

    /**
     * Sets the value of the typeOfCategoryStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyEntry }
     *     
     */
    public void setTypeOfCategoryStatistic(ControlledVocabularyEntry value) {
        this.typeOfCategoryStatistic = value;
    }

    /**
     * Gets the value of the categoryStatisticAppliesToInstanceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categoryStatisticAppliesToInstanceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryStatisticAppliesToInstanceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryStatistic.CategoryStatisticAppliesToInstanceVariable }
     * 
     * 
     * @return
     *     The value of the categoryStatisticAppliesToInstanceVariable property.
     */
    public List<CategoryStatistic.CategoryStatisticAppliesToInstanceVariable> getCategoryStatisticAppliesToInstanceVariable() {
        if (categoryStatisticAppliesToInstanceVariable == null) {
            categoryStatisticAppliesToInstanceVariable = new ArrayList<>();
        }
        return this.categoryStatisticAppliesToInstanceVariable;
    }

    /**
     * Gets the value of the categoryStatisticForCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryStatistic.CategoryStatisticForCategory }
     *     
     */
    public CategoryStatistic.CategoryStatisticForCategory getCategoryStatisticForCategory() {
        return categoryStatisticForCategory;
    }

    /**
     * Sets the value of the categoryStatisticForCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryStatistic.CategoryStatisticForCategory }
     *     
     */
    public void setCategoryStatisticForCategory(CategoryStatistic.CategoryStatisticForCategory value) {
        this.categoryStatisticForCategory = value;
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
     *               <enumeration value="InstanceVariable"/>
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
    public static class CategoryStatisticAppliesToInstanceVariable
        extends AssociationReference
    {


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
     *               <enumeration value="Category"/>
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
    public static class CategoryStatisticForCategory
        extends AssociationReference
    {


    }

}
