/*
 * An XML document type.
 * Localname: DimensionalKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "dimensionalkeyc1bcdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey getDimensionalKey();

    /**
     * Sets the "DimensionalKey" element
     */
    void setDimensionalKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey dimensionalKey);

    /**
     * Appends and returns a new empty "DimensionalKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey addNewDimensionalKey();
}