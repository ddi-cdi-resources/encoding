/*
 * An XML document type.
 * Localname: ConceptMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptMapDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMapDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptmap4a82doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap getConceptMap();

    /**
     * Sets the "ConceptMap" element
     */
    void setConceptMap(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap conceptMap);

    /**
     * Appends and returns a new empty "ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap addNewConceptMap();
}
