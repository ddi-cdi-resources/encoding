/*
 * An XML document type.
 * Localname: RecordRelation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RecordRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RecordRelationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "recordrelation521bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation getRecordRelation();

    /**
     * Sets the "RecordRelation" element
     */
    void setRecordRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation recordRelation);

    /**
     * Appends and returns a new empty "RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation addNewRecordRelation();
}
