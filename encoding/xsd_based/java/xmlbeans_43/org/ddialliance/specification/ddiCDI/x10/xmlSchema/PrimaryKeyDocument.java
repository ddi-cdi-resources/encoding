/*
 * An XML document type.
 * Localname: PrimaryKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PrimaryKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PrimaryKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "primarykey062bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey getPrimaryKey();

    /**
     * Sets the "PrimaryKey" element
     */
    void setPrimaryKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey primaryKey);

    /**
     * Appends and returns a new empty "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey addNewPrimaryKey();
}