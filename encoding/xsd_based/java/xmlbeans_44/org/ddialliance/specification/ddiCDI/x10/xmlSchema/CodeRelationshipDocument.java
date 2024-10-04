/*
 * An XML document type.
 * Localname: CodeRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CodeRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CodeRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "coderelationship1f33doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CodeRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship getCodeRelationship();

    /**
     * Sets the "CodeRelationship" element
     */
    void setCodeRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship codeRelationship);

    /**
     * Appends and returns a new empty "CodeRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship addNewCodeRelationship();
}