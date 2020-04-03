// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVpnConnectionsResult model. */
@Fluent
public final class ListVpnConnectionsResultInner {
    /*
     * List of Vpn Connections.
     */
    @JsonProperty(value = "value")
    private List<VpnConnectionInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Vpn Connections.
     *
     * @return the value value.
     */
    public List<VpnConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Vpn Connections.
     *
     * @param value the value value to set.
     * @return the ListVpnConnectionsResultInner object itself.
     */
    public ListVpnConnectionsResultInner withValue(List<VpnConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVpnConnectionsResultInner object itself.
     */
    public ListVpnConnectionsResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}