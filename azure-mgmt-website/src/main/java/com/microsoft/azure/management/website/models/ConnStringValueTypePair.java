/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database connection string value to type pair.
 */
public class ConnStringValueTypePair {
    /**
     * Value of pair.
     */
    private String value;

    /**
     * Type of database. Possible values for this property include: 'MySql',
     * 'SQLServer', 'SQLAzure', 'Custom'.
     */
    @JsonProperty(required = true)
    private DatabaseServerType type;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public DatabaseServerType getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(DatabaseServerType type) {
        this.type = type;
    }

}
