/*
 * An XML document type.
 * Localname: StatisticalClassification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class StatisticalClassificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationDocument {
    private static final long serialVersionUID = 1L;

    public StatisticalClassificationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification"),
    };


    /**
     * Gets the "StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification getStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification statisticalClassification) {
        generatedSetterHelperImpl(statisticalClassification, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification addNewStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
