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
 * <p>Java class for SexSpecification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SexSpecification">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Feminine"/>
 *     <enumeration value="GenderNeutral"/>
 *     <enumeration value="Masculine"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SexSpecification")
@XmlEnum
public enum SexSpecification {


    /**
     * Use the feminine pronoun (equivalent of English she, her, her's).
     * 
     */
    @XmlEnumValue("Feminine")
    FEMININE("Feminine"),

    /**
     * Use a gender neutral or non-specified pronoun. (equivalent of English they, them, theirs).
     * 
     */
    @XmlEnumValue("GenderNeutral")
    GENDER_NEUTRAL("GenderNeutral"),

    /**
     * Use the masculine pronoun (equivalent of English he, him, his).
     * 
     */
    @XmlEnumValue("Masculine")
    MASCULINE("Masculine");
    private final String value;

    SexSpecification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SexSpecification fromValue(String v) {
        for (SexSpecification c: SexSpecification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
