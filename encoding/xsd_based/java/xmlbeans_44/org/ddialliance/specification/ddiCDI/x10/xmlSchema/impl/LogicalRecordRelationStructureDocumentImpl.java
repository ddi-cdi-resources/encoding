/*
 * An XML document type.
 * Localname: LogicalRecordRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LogicalRecordRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LogicalRecordRelationStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructureDocument {
    private static final long serialVersionUID = 1L;

    public LogicalRecordRelationStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationStructure"),
    };


    /**
     * Gets the "LogicalRecordRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure getLogicalRecordRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LogicalRecordRelationStructure" element
     */
    @Override
    public void setLogicalRecordRelationStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure logicalRecordRelationStructure) {
        generatedSetterHelperImpl(logicalRecordRelationStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LogicalRecordRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure addNewLogicalRecordRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
