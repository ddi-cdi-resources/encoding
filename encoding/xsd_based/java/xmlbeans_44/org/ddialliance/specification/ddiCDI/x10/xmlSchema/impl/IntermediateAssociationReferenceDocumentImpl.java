/*
 * An XML document type.
 * Localname: IntermediateAssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one IntermediateAssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class IntermediateAssociationReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReferenceDocument {
    private static final long serialVersionUID = 1L;

    public IntermediateAssociationReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "IntermediateAssociationReference"),
    };


    /**
     * Gets the "IntermediateAssociationReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference getIntermediateAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "IntermediateAssociationReference" element
     */
    @Override
    public void setIntermediateAssociationReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference intermediateAssociationReference) {
        generatedSetterHelperImpl(intermediateAssociationReference, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "IntermediateAssociationReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference addNewIntermediateAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}