/*
 * An XML document type.
 * Localname: WebLink
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one WebLink(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WebLinkDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLinkDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "weblinkde0adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "WebLink" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink getWebLink();

    /**
     * Sets the "WebLink" element
     */
    void setWebLink(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink webLink);

    /**
     * Appends and returns a new empty "WebLink" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink addNewWebLink();
}