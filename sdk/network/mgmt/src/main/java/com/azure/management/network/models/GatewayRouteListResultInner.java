// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.GatewayRoute;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GatewayRouteListResult model. */
@Fluent
public final class GatewayRouteListResultInner {
    /*
     * List of gateway routes.
     */
    @JsonProperty(value = "value")
    private List<GatewayRoute> value;

    /**
     * Get the value property: List of gateway routes.
     *
     * @return the value value.
     */
    public List<GatewayRoute> value() {
        return this.value;
    }

    /**
     * Set the value property: List of gateway routes.
     *
     * @param value the value value to set.
     * @return the GatewayRouteListResultInner object itself.
     */
    public GatewayRouteListResultInner withValue(List<GatewayRoute> value) {
        this.value = value;
        return this;
    }
}