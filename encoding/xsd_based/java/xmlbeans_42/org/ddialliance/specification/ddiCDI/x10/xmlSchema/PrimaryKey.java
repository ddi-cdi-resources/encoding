/*
 * XML Type:  PrimaryKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PrimaryKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PrimaryKey extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "primarykey541btype");
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
     * Gets a List of "PrimaryKey_isComposedOf_PrimaryKeyComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent> getPrimaryKeyIsComposedOfPrimaryKeyComponentList();

    /**
     * Gets array of all "PrimaryKey_isComposedOf_PrimaryKeyComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent[] getPrimaryKeyIsComposedOfPrimaryKeyComponentArray();

    /**
     * Gets ith "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent getPrimaryKeyIsComposedOfPrimaryKeyComponentArray(int i);

    /**
     * Returns number of "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    int sizeOfPrimaryKeyIsComposedOfPrimaryKeyComponentArray();

    /**
     * Sets array of all "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    void setPrimaryKeyIsComposedOfPrimaryKeyComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent[] primaryKeyIsComposedOfPrimaryKeyComponentArray);

    /**
     * Sets ith "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    void setPrimaryKeyIsComposedOfPrimaryKeyComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent primaryKeyIsComposedOfPrimaryKeyComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent insertNewPrimaryKeyIsComposedOfPrimaryKeyComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent addNewPrimaryKeyIsComposedOfPrimaryKeyComponent();

    /**
     * Removes the ith "PrimaryKey_isComposedOf_PrimaryKeyComponent" element
     */
    void removePrimaryKeyIsComposedOfPrimaryKeyComponent(int i);

    /**
     * An XML PrimaryKey_isComposedOf_PrimaryKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PrimaryKeyIsComposedOfPrimaryKeyComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "primarykeyiscomposedofprimarykeycomponent1599elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey$PrimaryKeyIsComposedOfPrimaryKeyComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypebb97elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PRIMARY_KEY_COMPONENT = Enum.forString("PrimaryKeyComponent");

            int INT_PRIMARY_KEY_COMPONENT = Enum.INT_PRIMARY_KEY_COMPONENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey$PrimaryKeyIsComposedOfPrimaryKeyComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PRIMARY_KEY_COMPONENT
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

                static final int INT_PRIMARY_KEY_COMPONENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PrimaryKeyComponent", INT_PRIMARY_KEY_COMPONENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
