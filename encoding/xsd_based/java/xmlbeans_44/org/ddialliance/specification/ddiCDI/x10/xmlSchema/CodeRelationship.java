/*
 * XML Type:  CodeRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodeRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CodeRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "coderelationship3923type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();

    /**
     * Gets a List of "CodeRelationship_hasTarget_Code" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode> getCodeRelationshipHasTargetCodeList();

    /**
     * Gets array of all "CodeRelationship_hasTarget_Code" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode[] getCodeRelationshipHasTargetCodeArray();

    /**
     * Gets ith "CodeRelationship_hasTarget_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode getCodeRelationshipHasTargetCodeArray(int i);

    /**
     * Returns number of "CodeRelationship_hasTarget_Code" element
     */
    int sizeOfCodeRelationshipHasTargetCodeArray();

    /**
     * Sets array of all "CodeRelationship_hasTarget_Code" element
     */
    void setCodeRelationshipHasTargetCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode[] codeRelationshipHasTargetCodeArray);

    /**
     * Sets ith "CodeRelationship_hasTarget_Code" element
     */
    void setCodeRelationshipHasTargetCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode codeRelationshipHasTargetCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship_hasTarget_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode insertNewCodeRelationshipHasTargetCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship_hasTarget_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode addNewCodeRelationshipHasTargetCode();

    /**
     * Removes the ith "CodeRelationship_hasTarget_Code" element
     */
    void removeCodeRelationshipHasTargetCode(int i);

    /**
     * Gets a List of "CodeRelationship_hasSource_Code" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode> getCodeRelationshipHasSourceCodeList();

    /**
     * Gets array of all "CodeRelationship_hasSource_Code" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode[] getCodeRelationshipHasSourceCodeArray();

    /**
     * Gets ith "CodeRelationship_hasSource_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode getCodeRelationshipHasSourceCodeArray(int i);

    /**
     * Returns number of "CodeRelationship_hasSource_Code" element
     */
    int sizeOfCodeRelationshipHasSourceCodeArray();

    /**
     * Sets array of all "CodeRelationship_hasSource_Code" element
     */
    void setCodeRelationshipHasSourceCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode[] codeRelationshipHasSourceCodeArray);

    /**
     * Sets ith "CodeRelationship_hasSource_Code" element
     */
    void setCodeRelationshipHasSourceCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode codeRelationshipHasSourceCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship_hasSource_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode insertNewCodeRelationshipHasSourceCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship_hasSource_Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode addNewCodeRelationshipHasSourceCode();

    /**
     * Removes the ith "CodeRelationship_hasSource_Code" element
     */
    void removeCodeRelationshipHasSourceCode(int i);

    /**
     * An XML CodeRelationship_hasTarget_Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CodeRelationshipHasTargetCode extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "coderelationshiphastargetcode6a3celemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasTargetCode$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee6baelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE = Enum.forString("Code");

            int INT_CODE = Enum.INT_CODE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasTargetCode$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CODE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Code", INT_CODE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CodeRelationship_hasSource_Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CodeRelationshipHasSourceCode extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "coderelationshiphassourcecode67c6elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasSourceCode$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee444elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE = Enum.forString("Code");

            int INT_CODE = Enum.INT_CODE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasSourceCode$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CODE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Code", INT_CODE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}