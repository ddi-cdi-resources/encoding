/*
 * An XML document type.
 * Localname: PhysicalSegmentLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PhysicalSegmentLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PhysicalSegmentLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocationDocument {
    private static final long serialVersionUID = 1L;

    public PhysicalSegmentLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLocation"),
    };


    /**
     * Gets the "PhysicalSegmentLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation getPhysicalSegmentLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PhysicalSegmentLocation" element
     */
    @Override
    public void setPhysicalSegmentLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation physicalSegmentLocation) {
        generatedSetterHelperImpl(physicalSegmentLocation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalSegmentLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation addNewPhysicalSegmentLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}