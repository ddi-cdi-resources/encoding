/*
 * An XML document type.
 * Localname: UnitType
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface UnitTypeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitTypeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "unittype72ccdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType getUnitType();

    /**
     * Sets the "UnitType" element
     */
    void setUnitType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType unitType);

    /**
     * Appends and returns a new empty "UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType addNewUnitType();
}