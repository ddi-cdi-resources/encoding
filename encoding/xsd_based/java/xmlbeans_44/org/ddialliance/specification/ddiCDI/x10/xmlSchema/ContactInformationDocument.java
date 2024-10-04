/*
 * An XML document type.
 * Localname: ContactInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ContactInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ContactInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "contactinformation589adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ContactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation();

    /**
     * Sets the "ContactInformation" element
     */
    void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation);

    /**
     * Appends and returns a new empty "ContactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation();
}
