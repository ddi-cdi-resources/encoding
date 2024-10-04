/*
 * An XML document type.
 * Localname: Organization
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface OrganizationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "organization7b21doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization getOrganization();

    /**
     * Sets the "Organization" element
     */
    void setOrganization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization organization);

    /**
     * Appends and returns a new empty "Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization addNewOrganization();
}
