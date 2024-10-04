/*
 * An XML document type.
 * Localname: Concept
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConceptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptDocument {
    private static final long serialVersionUID = 1L;

    public ConceptDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Concept"),
    };


    /**
     * Gets the "Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept getConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Concept" element
     */
    @Override
    public void setConcept(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept concept) {
        generatedSetterHelperImpl(concept, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept addNewConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}