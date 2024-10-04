/*
 * An XML document type.
 * Localname: RepresentedVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RepresentedVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RepresentedVariableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "representedvariableddffdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable getRepresentedVariable();

    /**
     * Sets the "RepresentedVariable" element
     */
    void setRepresentedVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable representedVariable);

    /**
     * Appends and returns a new empty "RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable addNewRepresentedVariable();
}