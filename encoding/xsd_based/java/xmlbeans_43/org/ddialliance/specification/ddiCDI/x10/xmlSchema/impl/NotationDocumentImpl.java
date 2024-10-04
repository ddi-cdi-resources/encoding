/*
 * An XML document type.
 * Localname: Notation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Notation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class NotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.NotationDocument {
    private static final long serialVersionUID = 1L;

    public NotationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Notation"),
    };


    /**
     * Gets the "Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation getNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Notation" element
     */
    @Override
    public void setNotation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation notation) {
        generatedSetterHelperImpl(notation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation addNewNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
