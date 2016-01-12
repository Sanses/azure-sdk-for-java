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


/**
 * Describes Windows Configuration of the OS Profile.
 */
public class LinuxConfiguration {
    /**
     * Gets or sets whether Authentication using user name and password is
     * allowed or not.
     */
    private Boolean disablePasswordAuthentication;

    /**
     * Gets or sets the SSH configuration for linux VMs.
     */
    private SshConfiguration ssh;

    /**
     * Get the disablePasswordAuthentication value.
     *
     * @return the disablePasswordAuthentication value
     */
    public Boolean getDisablePasswordAuthentication() {
        return this.disablePasswordAuthentication;
    }

    /**
     * Set the disablePasswordAuthentication value.
     *
     * @param disablePasswordAuthentication the disablePasswordAuthentication value to set
     */
    public void setDisablePasswordAuthentication(Boolean disablePasswordAuthentication) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
    }

    /**
     * Get the ssh value.
     *
     * @return the ssh value
     */
    public SshConfiguration getSsh() {
        return this.ssh;
    }

    /**
     * Set the ssh value.
     *
     * @param ssh the ssh value to set
     */
    public void setSsh(SshConfiguration ssh) {
        this.ssh = ssh;
    }

}
