/*
 * An XML document type.
 * Localname: CombinedDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CombinedDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CombinedDateDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDateDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "combineddate2241doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CombinedDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getCombinedDate();

    /**
     * Sets the "CombinedDate" element
     */
    void setCombinedDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate combinedDate);

    /**
     * Appends and returns a new empty "CombinedDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewCombinedDate();
}
