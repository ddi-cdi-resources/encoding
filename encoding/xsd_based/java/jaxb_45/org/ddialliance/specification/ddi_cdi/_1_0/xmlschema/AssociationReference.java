//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata.
 * 
 * <p>Java class for AssociationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssociationReference">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ddiReference" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}InternationalRegistrationDataIdentifier" minOccurs="0"/>
 *         <element name="validType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="isAssociationReference" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationReference", propOrder = {
    "ddiReference",
    "validType"
})
@XmlSeeAlso({
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentListing.AgentListingIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentListing.AgentListingIsMaintainedByAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentListing.AgentListingHasAgentPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentListing.AgentListingHasAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentPosition.AgentPositionIndexesAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentRelationship.AgentRelationshipHasSourceAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentRelationship.AgentRelationshipHasTargetAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentStructure.AgentStructureStructuresAgentListing.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AgentStructure.AgentStructureHasAgentRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AttributeComponent.AttributeComponentQualifiesDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.AuthorizationSource.AuthorizationSourceHasAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryPosition.CategoryPositionIndexesCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryRelationStructure.CategoryRelationStructureStructuresCategorySet.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryRelationStructure.CategoryRelationStructureHasCategoryRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryRelationship.CategoryRelationshipHasSourceCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryRelationship.CategoryRelationshipHasTargetCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategorySet.CategorySetHasCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategorySet.CategorySetHasCategoryPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CategoryStatistic.CategoryStatisticForCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationFamily.ClassificationFamilyUsesClassificationIndex.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationFamily.ClassificationFamilyIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationFamily.ClassificationFamilyGroupsClassificationSeries.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndex.ClassificationIndexHasContactAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndex.ClassificationIndexIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationIndexEntryPosition.ClassificationIndexEntryPositionIndexesClassificationIndexEntry.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItem.ClassificationItemExcludesClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItem.ClassificationItemDenotesCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItem.ClassificationItemUsesNotation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItem.ClassificationItemHasRulingByAuthorizationSource.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItemPosition.ClassificationItemPositionIndexesClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItemRelationship.ClassificationItemRelationshipHasSourceClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItemRelationship.ClassificationItemRelationshipHasTargetClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItemStructure.ClassificationItemStructureStructuresStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationItemStructure.ClassificationItemStructureHasClassificationItemRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationPosition.ClassificationPositionIndexesStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeries.ClassificationSeriesIsOwnedByAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeries.ClassificationSeriesIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeries.ClassificationSeriesHasStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeries.ClassificationSeriesHasClassificationPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeriesStructure.ClassificationSeriesStructureStructuresClassificationSeries.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ClassificationSeriesStructure.ClassificationSeriesStructureHasStatisticalClassificationRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Code.CodeDenotesCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Code.CodeUsesNotation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeList.CodeListHasCodePosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeList.CodeListHasCode.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeListStructure.CodeListStructureStructuresCodeList.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeListStructure.CodeListStructureHasCodeRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodePosition.CodePositionIndexesCode.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeRelationship.CodeRelationshipHasTargetCode.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CodeRelationship.CodeRelationshipHasSourceCode.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ComponentPosition.ComponentPositionIndexesDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptMap.ConceptMapHasSourceConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptMap.ConceptMapHasTargetConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptRelationship.ConceptRelationshipHasSourceConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptRelationship.ConceptRelationshipHasTargetConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptStructure.ConceptStructureStructuresConceptSystem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptStructure.ConceptStructureHasConceptRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptSystem.ConceptSystemIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptSystem.ConceptSystemHasConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceMapsConceptSystem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptSystemCorrespondence.ConceptSystemCorrespondenceHasConceptMap.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableHasSourceLevel.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableHasTargetLevel.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableIsOwnedByAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableMapsToStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableHasContactAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableIsMaintainedByAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.CorrespondenceTable.CorrespondenceTableHasConceptMap.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataPoint.DataPointCorrespondsToDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataPoint.DataPointIsDescribedByInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataPointPosition.DataPointPositionIndexesDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStore.DataStoreIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStore.DataStoreHasLogicalRecordPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStore.DataStoreHasLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStore.DataStoreHasRecordRelation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Descriptor.DescriptorRefersToReferenceValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Descriptor.DescriptorIdentifiesReferenceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Descriptor.DescriptorHasValueFromDescriptorValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionComponent.DimensionComponentIsStructuredByValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionGroup.DimensionGroupHasDimensionComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionalDataSet.DimensionalDataSetRepresentsScopedMeasure.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ForeignKey.ForeignKeyIsComposedOfForeignKeyComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InformationFlowDefinition.InformationFlowDefinitionFromParameter.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InformationFlowDefinition.InformationFlowDefinitionToParameter.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceKey.InstanceKeyHasInstanceValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceKey.InstanceKeyRefersToReferenceValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.KeyDefinition.KeyDefinitionCorrespondsToUniverse.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.KeyDefinition.KeyDefinitionCorrespondsToUnit.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Level.LevelIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Level.LevelGroupsClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LevelStructure.LevelStructureHasLevel.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecord.LogicalRecordOrganizesDataSet.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecord.LogicalRecordIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecord.LogicalRecordHasInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecordPosition.LogicalRecordPositionIndexesLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecordRelationStructure.LogicalRecordRelationStructureStructuresDataStore.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecordRelationStructure.LogicalRecordRelationStructureHasLogicalRecordRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Notation.NotationRepresentsCategory.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSet.PhysicalDataSetFormatsDataStore.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalLayoutRelationStructure.PhysicalLayoutRelationStructureStructuresPhysicalSegmentLayout.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalLayoutRelationStructure.PhysicalLayoutRelationStructureHasValueMappingRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegmentPosition.PhysicalRecordSegmentPositionIndexesPhysicalRecordSegment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegmentStructure.PhysicalRecordSegmentStructureStructuresPhysicalRecordSegment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalRecordSegmentStructure.PhysicalRecordSegmentStructureHasDataPointRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Population.PopulationIsComposedOfUnit.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PrimaryKey.PrimaryKeyIsComposedOfPrimaryKeyComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PrimaryKeyComponent.PrimaryKeyComponentCorrespondsToDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RecordRelation.RecordRelationMapsLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RecordRelation.RecordRelationHasInstanceVariableMap.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualVariable.ConceptualVariableMeasuresUnitType.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Datum.DatumUsesNotation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Datum.DatumDenotesConceptualValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Datum.DatumUsesInstanceValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Datum.DatumIsBoundedByInstanceVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RevisableDatum.RevisableDatumCorrespondsToRevision.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Rule.RuleHasPreconditionConditionalControlLogic.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RuleBasedScheduling.RuleBasedSchedulingHasCurator.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.RuleSet.RuleSetHasRule.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Sequence.SequenceHasSequencePosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ProcessingAgent.ProcessingAgentPerformsActivity.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ProcessingAgent.ProcessingAgentOperatesOnProductionEnvironment.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.EnumerationDomain.EnumerationDomainUsesLevelStructure.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.EnumerationDomain.EnumerationDomainReferencesCategorySet.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.EnumerationDomain.EnumerationDomainIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationHasClassificationItem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassification.StatisticalClassificationHasLevelStructure.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Activity.ActivityHasInternalControlLogic.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Activity.ActivityHasSubActivityActivity.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Activity.ActivityHasStep.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Step.StepProducesParameter.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Step.StepReceivesParameter.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Step.StepHasSubStepStep.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ControlLogic.ControlLogicInformsProcessingAgent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ControlLogic.ControlLogicInvokesActivity.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ControlLogic.ControlLogicHasSubControlLogicControlLogic.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ControlLogic.ControlLogicHasInformationFlowDefinition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Unit.UnitHasUnitType.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Concept.ConceptUsesConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ValueMapping.ValueMappingFormatsDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ValueMappingPosition.ValueMappingPositionIndexesValueMapping.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableCollection.VariableCollectionIsDefinedByConcept.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableCollection.VariableCollectionHasConceptualVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableCollection.VariableCollectionHasVariablePosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariablePosition.VariablePositionIndexesConceptualVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableStructure.VariableStructureStructuresVariableCollection.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.VariableStructure.VariableStructureHasVariableRelationship.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataSet.DataSetIsStructuredByDataStructure.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataSet.DataSetHasDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataSet.DataSetHasKey.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStructure.DataStructureHasForeignKey.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStructure.DataStructureHasDataStructureComponent.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStructure.DataStructureHasComponentPosition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.DataStructure.DataStructureHasPrimaryKey.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Key.KeyCorrespondsToUnit.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Key.KeyRepresentsKeyDefinition.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Key.KeyIdentifiesDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Key.KeyCorrespondsToUniverse.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.Key.KeyHasKeyMember.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceValue.InstanceValueHasValueFromValueDomain.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceValue.InstanceValueIsStoredInDataPoint.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.InstanceValue.InstanceValueRepresentsConceptualValue.class,
    org.ddialliance.specification.ddi_cdi._1_0.xmlschema.KeyMember.KeyMemberIsBasedOnDataStructureComponent.class
})
public class AssociationReference {

    protected InternationalRegistrationDataIdentifier ddiReference;
    protected List<String> validType;
    @XmlAttribute(name = "isAssociationReference")
    protected Boolean isAssociationReference;

    /**
     * Gets the value of the ddiReference property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalRegistrationDataIdentifier }
     *     
     */
    public InternationalRegistrationDataIdentifier getDdiReference() {
        return ddiReference;
    }

    /**
     * Sets the value of the ddiReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalRegistrationDataIdentifier }
     *     
     */
    public void setDdiReference(InternationalRegistrationDataIdentifier value) {
        this.ddiReference = value;
    }

    /**
     * Gets the value of the validType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the validType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the validType property.
     */
    public List<String> getValidType() {
        if (validType == null) {
            validType = new ArrayList<>();
        }
        return this.validType;
    }

    /**
     * Gets the value of the isAssociationReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAssociationReference() {
        if (isAssociationReference == null) {
            return true;
        } else {
            return isAssociationReference;
        }
    }

    /**
     * Sets the value of the isAssociationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssociationReference(Boolean value) {
        this.isAssociationReference = value;
    }

}
