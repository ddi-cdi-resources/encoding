/*
 * An XML document type.
 * Localname: Selector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Selector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SelectorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SelectorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "selector0c4ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Selector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector getSelector();

    /**
     * Sets the "Selector" element
     */
    void setSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector selector);

    /**
     * Appends and returns a new empty "Selector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector addNewSelector();
}
