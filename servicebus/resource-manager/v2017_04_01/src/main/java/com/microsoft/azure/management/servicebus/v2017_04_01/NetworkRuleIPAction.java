/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkRuleIPAction.
 */
public final class NetworkRuleIPAction extends ExpandableStringEnum<NetworkRuleIPAction> {
    /** Static value Allow for NetworkRuleIPAction. */
    public static final NetworkRuleIPAction ALLOW = fromString("Allow");

    /**
     * Creates or finds a NetworkRuleIPAction from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkRuleIPAction
     */
    @JsonCreator
    public static NetworkRuleIPAction fromString(String name) {
        return fromString(name, NetworkRuleIPAction.class);
    }

    /**
     * @return known NetworkRuleIPAction values
     */
    public static Collection<NetworkRuleIPAction> values() {
        return values(NetworkRuleIPAction.class);
    }
}
