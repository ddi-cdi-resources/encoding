/*
 * An XML document type.
 * Localname: ClassificationSeriesStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationSeriesStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationSeriesStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "classificationseriesstructure3d52doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationSeriesStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure getClassificationSeriesStructure();

    /**
     * Sets the "ClassificationSeriesStructure" element
     */
    void setClassificationSeriesStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure classificationSeriesStructure);

    /**
     * Appends and returns a new empty "ClassificationSeriesStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure addNewClassificationSeriesStructure();
}
