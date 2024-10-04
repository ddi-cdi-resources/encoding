/*
 * An XML document type.
 * Localname: ValueMappingRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ValueMappingRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ValueMappingRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "valuemappingrelationship6663doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ValueMappingRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship getValueMappingRelationship();

    /**
     * Sets the "ValueMappingRelationship" element
     */
    void setValueMappingRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship valueMappingRelationship);

    /**
     * Appends and returns a new empty "ValueMappingRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship addNewValueMappingRelationship();
}
