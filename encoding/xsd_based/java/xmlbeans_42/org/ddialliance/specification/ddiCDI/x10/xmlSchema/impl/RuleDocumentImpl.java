/*
 * An XML document type.
 * Localname: Rule
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Rule(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleDocument {
    private static final long serialVersionUID = 1L;

    public RuleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Rule"),
    };


    /**
     * Gets the "Rule" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule getRule() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Rule" element
     */
    @Override
    public void setRule(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule rule) {
        generatedSetterHelperImpl(rule, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Rule" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule addNewRule() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}