/*
 * An XML document type.
 * Localname: WideKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one WideKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WideKeyMemberDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMemberDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "widekeymember33a2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "WideKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember getWideKeyMember();

    /**
     * Sets the "WideKeyMember" element
     */
    void setWideKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember wideKeyMember);

    /**
     * Appends and returns a new empty "WideKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember addNewWideKeyMember();
}
