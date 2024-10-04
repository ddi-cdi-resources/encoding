/*
 * XML Type:  ClassificationPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationPosition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationpositionf1cdtype");
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
     * Gets the "value" element
     */
    java.math.BigInteger getValue();

    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlInteger xgetValue();

    /**
     * Sets the "value" element
     */
    void setValue(java.math.BigInteger value);

    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlInteger value);

    /**
     * Gets the "ClassificationPosition_indexes_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification getClassificationPositionIndexesStatisticalClassification();

    /**
     * True if has "ClassificationPosition_indexes_StatisticalClassification" element
     */
    boolean isSetClassificationPositionIndexesStatisticalClassification();

    /**
     * Sets the "ClassificationPosition_indexes_StatisticalClassification" element
     */
    void setClassificationPositionIndexesStatisticalClassification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification classificationPositionIndexesStatisticalClassification);

    /**
     * Appends and returns a new empty "ClassificationPosition_indexes_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification addNewClassificationPositionIndexesStatisticalClassification();

    /**
     * Unsets the "ClassificationPosition_indexes_StatisticalClassification" element
     */
    void unsetClassificationPositionIndexesStatisticalClassification();

    /**
     * An XML ClassificationPosition_indexes_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationPositionIndexesStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationpositionindexesstatisticalclassificationf33felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition$ClassificationPositionIndexesStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype6701elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition$ClassificationPositionIndexesStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}