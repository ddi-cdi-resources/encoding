/*
 * XML Type:  TextDirectionValues
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TextDirectionValues(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.
 */
public interface TextDirectionValues extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "textdirectionvalues01c0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum AUTO = Enum.forString("Auto");
    Enum INHERIT = Enum.forString("Inherit");
    Enum LTR = Enum.forString("Ltr");
    Enum RTL = Enum.forString("Rtl");

    int INT_AUTO = Enum.INT_AUTO;
    int INT_INHERIT = Enum.INT_INHERIT;
    int INT_LTR = Enum.INT_LTR;
    int INT_RTL = Enum.INT_RTL;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AUTO
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

        static final int INT_AUTO = 1;
        static final int INT_INHERIT = 2;
        static final int INT_LTR = 3;
        static final int INT_RTL = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Auto", INT_AUTO),
            new Enum("Inherit", INT_INHERIT),
            new Enum("Ltr", INT_LTR),
            new Enum("Rtl", INT_RTL),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
