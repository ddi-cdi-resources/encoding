/*
 * An XML document type.
 * Localname: DataPointPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataPointPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataPointPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "datapointposition83abdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition getDataPointPosition();

    /**
     * Sets the "DataPointPosition" element
     */
    void setDataPointPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition dataPointPosition);

    /**
     * Appends and returns a new empty "DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition addNewDataPointPosition();
}
