/*
 * An XML document type.
 * Localname: PrimaryKeyComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PrimaryKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PrimaryKeyComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "primarykeycomponent579cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent getPrimaryKeyComponent();

    /**
     * Sets the "PrimaryKeyComponent" element
     */
    void setPrimaryKeyComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent primaryKeyComponent);

    /**
     * Appends and returns a new empty "PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent addNewPrimaryKeyComponent();
}
