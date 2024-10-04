/*
 * XML Type:  AgentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AgentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AgentPositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition {
    private static final long serialVersionUID = 1L;

    public AgentPositionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "value"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentPosition_indexes_Agent"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "value" element
     */
    @Override
    public java.math.BigInteger getValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "value" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "value" element
     */
    @Override
    public void setValue(java.math.BigInteger value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(value);
        }
    }

    /**
     * Sets (as xml) the "value" element
     */
    @Override
    public void xsetValue(org.apache.xmlbeans.XmlInteger value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(value);
        }
    }

    /**
     * Gets the "AgentPosition_indexes_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent getAgentPositionIndexesAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AgentPosition_indexes_Agent" element
     */
    @Override
    public boolean isSetAgentPositionIndexesAgent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "AgentPosition_indexes_Agent" element
     */
    @Override
    public void setAgentPositionIndexesAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent agentPositionIndexesAgent) {
        generatedSetterHelperImpl(agentPositionIndexesAgent, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgentPosition_indexes_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent addNewAgentPositionIndexesAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "AgentPosition_indexes_Agent" element
     */
    @Override
    public void unsetAgentPositionIndexesAgent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
    /**
     * An XML AgentPosition_indexes_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class AgentPositionIndexesAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent {
        private static final long serialVersionUID = 1L;

        public AgentPositionIndexesAgentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition$AgentPositionIndexesAgent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition.AgentPositionIndexesAgent.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}