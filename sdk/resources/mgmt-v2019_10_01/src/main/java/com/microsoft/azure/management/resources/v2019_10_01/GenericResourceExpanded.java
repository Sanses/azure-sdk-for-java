/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2019_10_01.implementation.GenericResourceExpandedInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2019_10_01.implementation.ResourcesManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing GenericResourceExpanded.
 */
public interface GenericResourceExpanded extends HasInner<GenericResourceExpandedInner>, HasManager<ResourcesManager> {
    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the plan value.
     */
    Plan plan();

    /**
     * @return the properties value.
     */
    Object properties();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
