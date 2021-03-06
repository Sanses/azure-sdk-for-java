/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.InboundSecurityRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing InboundSecurityRule.
 */
public interface InboundSecurityRule extends HasInner<InboundSecurityRuleInner>, Indexable, Updatable<InboundSecurityRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the rules value.
     */
    List<InboundSecurityRules> rules();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the InboundSecurityRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkVirtualAppliance, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of InboundSecurityRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a InboundSecurityRule definition.
         */
        interface Blank extends WithNetworkVirtualAppliance {
        }

        /**
         * The stage of the inboundsecurityrule definition allowing to specify NetworkVirtualAppliance.
         */
        interface WithNetworkVirtualAppliance {
           /**
            * Specifies resourceGroupName, networkVirtualApplianceName.
            * @param resourceGroupName The name of the resource group
            * @param networkVirtualApplianceName The name of the Network Virtual Appliance
            * @return the next definition stage
            */
            WithCreate withExistingNetworkVirtualAppliance(String resourceGroupName, String networkVirtualApplianceName);
        }

        /**
         * The stage of the inboundsecurityrule definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the inboundsecurityrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of security rule collection
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the inboundsecurityrule definition allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules List of allowed rules
             * @return the next definition stage
             */
            WithCreate withRules(List<InboundSecurityRules> rules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<InboundSecurityRule>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithRules {
        }
    }
    /**
     * The template for a InboundSecurityRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<InboundSecurityRule>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithRules {
    }

    /**
     * Grouping of InboundSecurityRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the inboundsecurityrule update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the inboundsecurityrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of security rule collection
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the inboundsecurityrule update allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules List of allowed rules
             * @return the next update stage
             */
            Update withRules(List<InboundSecurityRules> rules);
        }

    }
}
