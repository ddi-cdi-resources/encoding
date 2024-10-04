/*
 * An XML document type.
 * Localname: ConceptRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ConceptRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConceptRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public ConceptRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptRelationship"),
    };


    /**
     * Gets the "ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship getConceptRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConceptRelationship" element
     */
    @Override
    public void setConceptRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship conceptRelationship) {
        generatedSetterHelperImpl(conceptRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship addNewConceptRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}