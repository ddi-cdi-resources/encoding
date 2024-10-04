/*
 * An XML document type.
 * Localname: WideDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one WideDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WideDataSetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "widedataset0aa1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "WideDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet getWideDataSet();

    /**
     * Sets the "WideDataSet" element
     */
    void setWideDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet wideDataSet);

    /**
     * Appends and returns a new empty "WideDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet addNewWideDataSet();
}
