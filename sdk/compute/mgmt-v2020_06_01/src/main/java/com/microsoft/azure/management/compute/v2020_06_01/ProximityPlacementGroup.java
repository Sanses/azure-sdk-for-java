/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ComputeManager;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ProximityPlacementGroupInner;

/**
 * Type representing ProximityPlacementGroup.
 */
public interface ProximityPlacementGroup extends HasInner<ProximityPlacementGroupInner>, Resource, GroupableResourceCore<ComputeManager, ProximityPlacementGroupInner>, HasResourceGroup, Refreshable<ProximityPlacementGroup>, Updatable<ProximityPlacementGroup.Update>, HasManager<ComputeManager> {
    /**
     * @return the availabilitySets value.
     */
    List<SubResourceWithColocationStatus> availabilitySets();

    /**
     * @return the colocationStatus value.
     */
    InstanceViewStatus colocationStatus();

    /**
     * @return the proximityPlacementGroupType value.
     */
    ProximityPlacementGroupType proximityPlacementGroupType();

    /**
     * @return the virtualMachines value.
     */
    List<SubResourceWithColocationStatus> virtualMachines();

    /**
     * @return the virtualMachineScaleSets value.
     */
    List<SubResourceWithColocationStatus> virtualMachineScaleSets();

    /**
     * The entirety of the ProximityPlacementGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProximityPlacementGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProximityPlacementGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ProximityPlacementGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the proximityplacementgroup definition allowing to specify ColocationStatus.
         */
        interface WithColocationStatus {
            /**
             * Specifies colocationStatus.
             * @param colocationStatus Describes colocation status of the Proximity Placement Group
             * @return the next definition stage
             */
            WithCreate withColocationStatus(InstanceViewStatus colocationStatus);
        }

        /**
         * The stage of the proximityplacementgroup definition allowing to specify ProximityPlacementGroupType.
         */
        interface WithProximityPlacementGroupType {
            /**
             * Specifies proximityPlacementGroupType.
             * @param proximityPlacementGroupType Specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use. Possible values include: 'Standard', 'Ultra'
             * @return the next definition stage
             */
            WithCreate withProximityPlacementGroupType(ProximityPlacementGroupType proximityPlacementGroupType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProximityPlacementGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithColocationStatus, DefinitionStages.WithProximityPlacementGroupType {
        }
    }
    /**
     * The template for a ProximityPlacementGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProximityPlacementGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithTags {
    }

    /**
     * Grouping of ProximityPlacementGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the proximityplacementgroup update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
