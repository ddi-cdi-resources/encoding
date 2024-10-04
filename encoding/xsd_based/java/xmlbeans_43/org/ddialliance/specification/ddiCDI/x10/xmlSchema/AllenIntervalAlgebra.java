/*
 * XML Type:  AllenIntervalAlgebra
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AllenIntervalAlgebra(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AllenIntervalAlgebra extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "allenintervalalgebra3917type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "temporalIntervalRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.Enum getTemporalIntervalRelation();

    /**
     * Gets (as xml) the "temporalIntervalRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation xgetTemporalIntervalRelation();

    /**
     * Sets the "temporalIntervalRelation" element
     */
    void setTemporalIntervalRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.Enum temporalIntervalRelation);

    /**
     * Sets (as xml) the "temporalIntervalRelation" element
     */
    void xsetTemporalIntervalRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation temporalIntervalRelation);
}