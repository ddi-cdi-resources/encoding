//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ComparisonOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Equal"/>
 *     <enumeration value="GreaterThan"/>
 *     <enumeration value="GreaterThanOrEqualTo"/>
 *     <enumeration value="LessThan"/>
 *     <enumeration value="LessThanOrEqualTo"/>
 *     <enumeration value="NotEqual"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ComparisonOperator")
@XmlEnum
public enum ComparisonOperator {


    /**
     * The value the key's in the source and target must be equal.
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * The value the key in the source must be greater than the key in the target.
     * 
     */
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),

    /**
     * The value the key in the source must be greater than or equal to the key in the target.
     * 
     */
    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),

    /**
     * The value the key in the source must be less than the key in the target.
     * 
     */
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),

    /**
     * The value the key in the source must be less than or equal to the key in the target.
     * 
     */
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo"),

    /**
     * The value the key's in the source and target must be unequal.
     * 
     */
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual");
    private final String value;

    ComparisonOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperator fromValue(String v) {
        for (ComparisonOperator c: ComparisonOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
