/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Load balancer Probe.
 */
public class Probe extends SubResource {
    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Gets Load balancer rules that use this probe.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<SubResource> loadBalancingRules;

    /**
     * Gets or sets the protocol of the end point. Possible values are http pr
     * Tcp. If Tcp is specified, a received ACK is required for the probe to
     * be successful. If http is specified,a 200 OK response from the
     * specifies URI is required for the probe to be successful. Possible
     * values for this property include: 'Http', 'Tcp'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private String protocol;

    /**
     * Gets or sets Port for communicating the probe. Possible values range
     * from 1 to 65535, inclusive.
     */
    @JsonProperty(value = "properties.port", required = true)
    private int port;

    /**
     * Gets or sets the interval, in seconds, for how frequently to probe the
     * endpoint for health status. Typically, the interval is slightly less
     * than half the allocated timeout period (in seconds) which allows two
     * full probes before taking the instance out of rotation. The default
     * value is 15, the minimum value is 5.
     */
    @JsonProperty(value = "properties.intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * Gets or sets the number of probes where if no response, will result in
     * stopping further traffic from being delivered to the endpoint. This
     * values allows endponints to be taken out of rotation faster or slower
     * than the typical times used in Azure.
     */
    @JsonProperty(value = "properties.numberOfProbes")
    private Integer numberOfProbes;

    /**
     * Gets or sets the URI used for requesting health status from the VM.
     * Path is required if a protocol is set to http. Otherwise, it is not
     * allowed. There is no default value.
     */
    @JsonProperty(value = "properties.requestPath")
    private String requestPath;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Get the loadBalancingRules value.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules value.
     *
     * @param loadBalancingRules the loadBalancingRules value to set
     */
    public void setLoadBalancingRules(List<SubResource> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public int getPort() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * Get the intervalInSeconds value.
     *
     * @return the intervalInSeconds value
     */
    public Integer getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds value.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     */
    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * Get the numberOfProbes value.
     *
     * @return the numberOfProbes value
     */
    public Integer getNumberOfProbes() {
        return this.numberOfProbes;
    }

    /**
     * Set the numberOfProbes value.
     *
     * @param numberOfProbes the numberOfProbes value to set
     */
    public void setNumberOfProbes(Integer numberOfProbes) {
        this.numberOfProbes = numberOfProbes;
    }

    /**
     * Get the requestPath value.
     *
     * @return the requestPath value
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * Set the requestPath value.
     *
     * @param requestPath the requestPath value to set
     */
    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}
