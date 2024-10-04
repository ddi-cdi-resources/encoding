/*
 * XML Type:  LogicalRecordRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LogicalRecordRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class LogicalRecordRelationStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure {
    private static final long serialVersionUID = 1L;

    public LogicalRecordRelationStructureImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "specification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "topology"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "totality"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationStructure_structures_DataStore"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationStructure_has_LogicalRecordRelationship"),
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
     * Gets a List of "name" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "name" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "purpose" element
     */
    @Override
    public boolean isSetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "purpose" element
     */
    @Override
    public void unsetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "specification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification getSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "specification" element
     */
    @Override
    public boolean isSetSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "specification" element
     */
    @Override
    public void setSpecification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification specification) {
        generatedSetterHelperImpl(specification, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "specification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification addNewSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "specification" element
     */
    @Override
    public void unsetSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "topology" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTopology() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "topology" element
     */
    @Override
    public boolean isSetTopology() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "topology" element
     */
    @Override
    public void setTopology(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry topology) {
        generatedSetterHelperImpl(topology, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "topology" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTopology() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "topology" element
     */
    @Override
    public void unsetTopology() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "totality" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum getTotality() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "totality" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent xgetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "totality" element
     */
    @Override
    public boolean isSetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "totality" element
     */
    @Override
    public void setTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum totality) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(totality);
        }
    }

    /**
     * Sets (as xml) the "totality" element
     */
    @Override
    public void xsetTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent totality) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(totality);
        }
    }

    /**
     * Unsets the "totality" element
     */
    @Override
    public void unsetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationStructure_structures_DataStore" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore> getLogicalRecordRelationStructureStructuresDataStoreList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationStructureStructuresDataStoreArray,
                this::setLogicalRecordRelationStructureStructuresDataStoreArray,
                this::insertNewLogicalRecordRelationStructureStructuresDataStore,
                this::removeLogicalRecordRelationStructureStructuresDataStore,
                this::sizeOfLogicalRecordRelationStructureStructuresDataStoreArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationStructure_structures_DataStore" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore[] getLogicalRecordRelationStructureStructuresDataStoreArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore getLogicalRecordRelationStructureStructuresDataStoreArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public int sizeOfLogicalRecordRelationStructureStructuresDataStoreArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationStructure_structures_DataStore" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationStructureStructuresDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore[] logicalRecordRelationStructureStructuresDataStoreArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationStructureStructuresDataStoreArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public void setLogicalRecordRelationStructureStructuresDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore logicalRecordRelationStructureStructuresDataStore) {
        generatedSetterHelperImpl(logicalRecordRelationStructureStructuresDataStore, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore insertNewLogicalRecordRelationStructureStructuresDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore addNewLogicalRecordRelationStructureStructuresDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationStructure_structures_DataStore" element
     */
    @Override
    public void removeLogicalRecordRelationStructureStructuresDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationStructure_has_LogicalRecordRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship> getLogicalRecordRelationStructureHasLogicalRecordRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationStructureHasLogicalRecordRelationshipArray,
                this::setLogicalRecordRelationStructureHasLogicalRecordRelationshipArray,
                this::insertNewLogicalRecordRelationStructureHasLogicalRecordRelationship,
                this::removeLogicalRecordRelationStructureHasLogicalRecordRelationship,
                this::sizeOfLogicalRecordRelationStructureHasLogicalRecordRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationStructure_has_LogicalRecordRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship[] getLogicalRecordRelationStructureHasLogicalRecordRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship getLogicalRecordRelationStructureHasLogicalRecordRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public int sizeOfLogicalRecordRelationStructureHasLogicalRecordRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationStructureHasLogicalRecordRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship[] logicalRecordRelationStructureHasLogicalRecordRelationshipArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationStructureHasLogicalRecordRelationshipArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public void setLogicalRecordRelationStructureHasLogicalRecordRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship logicalRecordRelationStructureHasLogicalRecordRelationship) {
        generatedSetterHelperImpl(logicalRecordRelationStructureHasLogicalRecordRelationship, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship insertNewLogicalRecordRelationStructureHasLogicalRecordRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship addNewLogicalRecordRelationStructureHasLogicalRecordRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationStructure_has_LogicalRecordRelationship" element
     */
    @Override
    public void removeLogicalRecordRelationStructureHasLogicalRecordRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }
    /**
     * An XML LogicalRecordRelationStructure_structures_DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordRelationStructureStructuresDataStoreImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore {
        private static final long serialVersionUID = 1L;

        public LogicalRecordRelationStructureStructuresDataStoreImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure$LogicalRecordRelationStructureStructuresDataStore$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML LogicalRecordRelationStructure_has_LogicalRecordRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class LogicalRecordRelationStructureHasLogicalRecordRelationshipImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship {
        private static final long serialVersionUID = 1L;

        public LogicalRecordRelationStructureHasLogicalRecordRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
        };


        /**
         * Gets a List of "validType" elements
         */
        @Override
        public java.util.List<java.lang.String> getValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                    this::getValidTypeArray,
                    this::setValidTypeArray,
                    this::insertValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets array of all "validType" elements
         */
        @Override
        public java.lang.String[] getValidTypeArray() {
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) a List of "validType" elements
         */
        @Override
        public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::xgetValidTypeArray,
                    this::xsetValidTypeArray,
                    this::insertNewValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets (as xml) array of all "validType" elements
         */
        @Override
        public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "validType" element
         */
        @Override
        public int sizeOfValidTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets ith "validType" element
         */
        @Override
        public void setValidTypeArray(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validType);
            }
        }

        /**
         * Sets (as xml) array of all "validType" element
         */
        @Override
        public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets (as xml) ith "validType" element
         */
        @Override
        public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validType);
            }
        }

        /**
         * Inserts the value as the ith "validType" element
         */
        @Override
        public void insertValidType(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target =
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                target.setStringValue(validType);
            }
        }

        /**
         * Appends the value as the last "validType" element
         */
        @Override
        public void addValidType(java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                target.setStringValue(validType);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString addNewValidType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "validType" element
         */
        @Override
        public void removeValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure$LogicalRecordRelationStructureHasLogicalRecordRelationship$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship.ValidType {
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
