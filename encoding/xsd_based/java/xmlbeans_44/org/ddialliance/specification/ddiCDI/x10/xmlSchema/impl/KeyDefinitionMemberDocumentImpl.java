/*
 * An XML document type.
 * Localname: KeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one KeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class KeyDefinitionMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMemberDocument {
    private static final long serialVersionUID = 1L;

    public KeyDefinitionMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinitionMember"),
    };


    /**
     * Gets the "KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember getKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "KeyDefinitionMember" element
     */
    @Override
    public void setKeyDefinitionMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember keyDefinitionMember) {
        generatedSetterHelperImpl(keyDefinitionMember, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember addNewKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
