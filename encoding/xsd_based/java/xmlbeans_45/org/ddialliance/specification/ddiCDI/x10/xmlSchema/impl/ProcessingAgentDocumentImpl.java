/*
 * An XML document type.
 * Localname: ProcessingAgent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ProcessingAgentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgentDocument {
    private static final long serialVersionUID = 1L;

    public ProcessingAgentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProcessingAgent"),
    };


    /**
     * Gets the "ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent getProcessingAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ProcessingAgent" element
     */
    @Override
    public void setProcessingAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent processingAgent) {
        generatedSetterHelperImpl(processingAgent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent addNewProcessingAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
