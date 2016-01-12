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
 * Tenant Id information.
 */
public class TenantIdDescription {
    /**
     * Gets or sets Id.
     */
    private String id;

    /**
     * Gets or sets tenantId.
     */
    private String tenantId;

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
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

}
