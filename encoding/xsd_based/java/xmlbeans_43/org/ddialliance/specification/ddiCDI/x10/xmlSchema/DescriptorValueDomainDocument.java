/*
 * An XML document type.
 * Localname: DescriptorValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DescriptorValueDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "descriptorvaluedomain4f02doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain getDescriptorValueDomain();

    /**
     * Sets the "DescriptorValueDomain" element
     */
    void setDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain descriptorValueDomain);

    /**
     * Appends and returns a new empty "DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain addNewDescriptorValueDomain();
}
