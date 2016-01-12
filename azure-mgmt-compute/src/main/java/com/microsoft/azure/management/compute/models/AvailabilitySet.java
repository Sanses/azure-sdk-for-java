/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Create or update Availability Set parameters.
 */
public class AvailabilitySet extends Resource {
    /**
     * Gets or sets Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /**
     * Gets or sets Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * Gets or sets a list containing reference to all Virtual Machines
     * created under this Availability Set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachines;

    /**
     * Gets or sets the resource status information.
     */
    @JsonProperty(value = "properties.statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the platformUpdateDomainCount value.
     *
     * @return the platformUpdateDomainCount value
     */
    public Integer getPlatformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set the platformUpdateDomainCount value.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set
     */
    public void setPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
    }

    /**
     * Get the platformFaultDomainCount value.
     *
     * @return the platformFaultDomainCount value
     */
    public Integer getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount value.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     */
    public void setPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
    }

    /**
     * Get the virtualMachines value.
     *
     * @return the virtualMachines value
     */
    public List<SubResource> getVirtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set the virtualMachines value.
     *
     * @param virtualMachines the virtualMachines value to set
     */
    public void setVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     */
    public void setStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
    }

}
