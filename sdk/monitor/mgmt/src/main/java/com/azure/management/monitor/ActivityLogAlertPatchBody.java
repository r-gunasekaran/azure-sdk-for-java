// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ActivityLogAlertPatchBody model. */
@JsonFlatten
@Fluent
public class ActivityLogAlertPatchBody {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Indicates whether this activity log alert is enabled. If an activity log
     * alert is not enabled, then none of its actions will be activated.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ActivityLogAlertPatchBody object itself.
     */
    public ActivityLogAlertPatchBody withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     *
     * @param enabled the enabled value to set.
     * @return the ActivityLogAlertPatchBody object itself.
     */
    public ActivityLogAlertPatchBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}