/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An entity extractor update object.
 */
public class EntityModelUpdateObject {
    /**
     * Entity name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The instance of model name.
     */
    @JsonProperty(value = "instanceOf")
    private String instanceOfProperty;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EntityModelUpdateObject object itself.
     */
    public EntityModelUpdateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the instanceOfProperty value.
     *
     * @return the instanceOfProperty value
     */
    public String instanceOfProperty() {
        return this.instanceOfProperty;
    }

    /**
     * Set the instanceOfProperty value.
     *
     * @param instanceOfProperty the instanceOfProperty value to set
     * @return the EntityModelUpdateObject object itself.
     */
    public EntityModelUpdateObject withInstanceOfProperty(String instanceOfProperty) {
        this.instanceOfProperty = instanceOfProperty;
        return this;
    }

}
