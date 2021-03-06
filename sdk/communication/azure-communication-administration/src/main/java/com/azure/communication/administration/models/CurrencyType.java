// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CurrencyType. */
public final class CurrencyType extends ExpandableStringEnum<CurrencyType> {
    /** Static value USD for CurrencyType. */
    public static final CurrencyType USD = fromString("USD");

    /**
     * Creates or finds a CurrencyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CurrencyType.
     */
    @JsonCreator
    public static CurrencyType fromString(String name) {
        return fromString(name, CurrencyType.class);
    }

    /** @return known CurrencyType values. */
    public static Collection<CurrencyType> values() {
        return values(CurrencyType.class);
    }
}
