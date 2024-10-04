/*
 * An XML document type.
 * Localname: LicenseInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LicenseInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LicenseInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "licenseinformation4959doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LicenseInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation getLicenseInformation();

    /**
     * Sets the "LicenseInformation" element
     */
    void setLicenseInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation licenseInformation);

    /**
     * Appends and returns a new empty "LicenseInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation addNewLicenseInformation();
}
