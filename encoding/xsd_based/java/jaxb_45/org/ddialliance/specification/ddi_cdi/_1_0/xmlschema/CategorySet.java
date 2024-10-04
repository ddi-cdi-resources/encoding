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
 *             Concept system where the underlying concepts are categories.
 *             
 *             Examples
 *             ==========
 *             "Male" and "Female" categories in a category set named "Gender".
 *             
 *             Explanatory notes
 *             ===================
 *             The categories in a category set help define the meaning of the category set. Gender can be defined as "male or female" - see example above. A category set can be used directly by questions to express a set of response choices.
 * 
 * <p>Java class for CategorySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategorySet">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ConceptSystem">
 *       <sequence>
 *         <element name="CategorySet_has_Category" maxOccurs="unbounded" minOccurs="0">
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
 *         <element name="CategorySet_has_CategoryPosition" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}AssociationReference">
 *                 <sequence>
 *                   <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *                   <element name="validType">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         <enumeration value="CategoryPosition"/>
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
@XmlType(name = "CategorySet", propOrder = {
    "categorySetHasCategory",
    "categorySetHasCategoryPosition"
})
public class CategorySet
    extends ConceptSystem
{

    @XmlElement(name = "CategorySet_has_Category")
    protected List<CategorySet.CategorySetHasCategory> categorySetHasCategory;
    @XmlElement(name = "CategorySet_has_CategoryPosition")
    protected List<CategorySet.CategorySetHasCategoryPosition> categorySetHasCategoryPosition;

    /**
     * Gets the value of the categorySetHasCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categorySetHasCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySetHasCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySet.CategorySetHasCategory }
     * 
     * 
     * @return
     *     The value of the categorySetHasCategory property.
     */
    public List<CategorySet.CategorySetHasCategory> getCategorySetHasCategory() {
        if (categorySetHasCategory == null) {
            categorySetHasCategory = new ArrayList<>();
        }
        return this.categorySetHasCategory;
    }

    /**
     * Gets the value of the categorySetHasCategoryPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categorySetHasCategoryPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySetHasCategoryPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySet.CategorySetHasCategoryPosition }
     * 
     * 
     * @return
     *     The value of the categorySetHasCategoryPosition property.
     */
    public List<CategorySet.CategorySetHasCategoryPosition> getCategorySetHasCategoryPosition() {
        if (categorySetHasCategoryPosition == null) {
            categorySetHasCategoryPosition = new ArrayList<>();
        }
        return this.categorySetHasCategoryPosition;
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
    public static class CategorySetHasCategory
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
     *         <element name="validType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               <enumeration value="CategoryPosition"/>
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
    public static class CategorySetHasCategoryPosition
        extends AssociationReference
    {


    }

}
