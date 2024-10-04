/*
 * An XML document type.
 * Localname: TemporalControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TemporalControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TemporalControlConstructDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "temporalcontrolconstruct132adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct getTemporalControlConstruct();

    /**
     * Sets the "TemporalControlConstruct" element
     */
    void setTemporalControlConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct temporalControlConstruct);

    /**
     * Appends and returns a new empty "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct addNewTemporalControlConstruct();
}