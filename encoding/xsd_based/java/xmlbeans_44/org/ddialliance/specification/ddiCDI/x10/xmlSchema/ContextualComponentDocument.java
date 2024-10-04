/*
 * An XML document type.
 * Localname: ContextualComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ContextualComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ContextualComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "contextualcomponent91c8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ContextualComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent getContextualComponent();

    /**
     * Sets the "ContextualComponent" element
     */
    void setContextualComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent contextualComponent);

    /**
     * Appends and returns a new empty "ContextualComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent addNewContextualComponent();
}