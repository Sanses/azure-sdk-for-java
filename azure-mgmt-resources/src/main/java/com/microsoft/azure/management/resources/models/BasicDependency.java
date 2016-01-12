/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources.models;


/**
 * Deployment dependency information.
 */
public class BasicDependency {
    /**
     * Gets or sets the ID of the dependency.
     */
    private String id;

    /**
     * Gets or sets the dependency resource type.
     */
    private String resourceType;

    /**
     * Gets or sets the dependency resource name.
     */
    private String resourceName;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Get the resourceName value.
     *
     * @return the resourceName value
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName value.
     *
     * @param resourceName the resourceName value to set
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

}
