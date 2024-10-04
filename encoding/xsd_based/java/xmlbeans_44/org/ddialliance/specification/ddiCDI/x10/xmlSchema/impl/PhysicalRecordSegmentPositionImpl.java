/*
 * XML Type:  PhysicalRecordSegmentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PhysicalRecordSegmentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class PhysicalRecordSegmentPositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition {
    private static final long serialVersionUID = 1L;

    public PhysicalRecordSegmentPositionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "value"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "value" element
     */
    @Override
    public java.math.BigInteger getValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "value" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "value" element
     */
    @Override
    public void setValue(java.math.BigInteger value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(value);
        }
    }

    /**
     * Sets (as xml) the "value" element
     */
    @Override
    public void xsetValue(org.apache.xmlbeans.XmlInteger value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(value);
        }
    }

    /**
     * Gets the "PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment getPhysicalRecordSegmentPositionIndexesPhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment" element
     */
    @Override
    public void setPhysicalRecordSegmentPositionIndexesPhysicalRecordSegment(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment physicalRecordSegmentPositionIndexesPhysicalRecordSegment) {
        generatedSetterHelperImpl(physicalRecordSegmentPositionIndexesPhysicalRecordSegment, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment addNewPhysicalRecordSegmentPositionIndexesPhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }
    /**
     * An XML PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalRecordSegmentPositionIndexesPhysicalRecordSegmentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment {
        private static final long serialVersionUID = 1L;

        public PhysicalRecordSegmentPositionIndexesPhysicalRecordSegmentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition$PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
