/*
 * An XML document type.
 * Localname: ControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogicDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ControlLogicDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogicDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "controllogic20efdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic getControlLogic();

    /**
     * Sets the "ControlLogic" element
     */
    void setControlLogic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic controlLogic);

    /**
     * Appends and returns a new empty "ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic addNewControlLogic();
}