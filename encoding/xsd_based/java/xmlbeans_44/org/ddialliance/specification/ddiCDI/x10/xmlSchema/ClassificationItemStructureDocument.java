/*
 * An XML document type.
 * Localname: ClassificationItemStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationItemStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationItemStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationitemstructure9e76doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationItemStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure getClassificationItemStructure();

    /**
     * Sets the "ClassificationItemStructure" element
     */
    void setClassificationItemStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure classificationItemStructure);

    /**
     * Appends and returns a new empty "ClassificationItemStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure addNewClassificationItemStructure();
}