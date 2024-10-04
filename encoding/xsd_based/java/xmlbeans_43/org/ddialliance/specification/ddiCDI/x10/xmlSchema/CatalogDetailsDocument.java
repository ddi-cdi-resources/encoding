/*
 * An XML document type.
 * Localname: CatalogDetails
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CatalogDetails(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CatalogDetailsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetailsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "catalogdetailsb297doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CatalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * Sets the "CatalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "CatalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();
}