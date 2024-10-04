/*
 * XML Type:  ClassificationIndexEntryPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ClassificationIndexEntryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ClassificationIndexEntryPositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition {
    private static final long serialVersionUID = 1L;

    public ClassificationIndexEntryPositionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "value"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry"),
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
     * Gets the "ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry getClassificationIndexEntryPositionIndexesClassificationIndexEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry" element
     */
    @Override
    public void setClassificationIndexEntryPositionIndexesClassificationIndexEntry(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry classificationIndexEntryPositionIndexesClassificationIndexEntry) {
        generatedSetterHelperImpl(classificationIndexEntryPositionIndexesClassificationIndexEntry, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry addNewClassificationIndexEntryPositionIndexesClassificationIndexEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }
    /**
     * An XML ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexEntryPositionIndexesClassificationIndexEntryImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexEntryPositionIndexesClassificationIndexEntryImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition$ClassificationIndexEntryPositionIndexesClassificationIndexEntry$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry.ValidType {
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