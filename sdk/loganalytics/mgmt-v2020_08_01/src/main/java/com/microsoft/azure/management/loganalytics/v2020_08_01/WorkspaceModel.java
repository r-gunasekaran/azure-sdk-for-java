/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.LogAnalyticsManager;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.WorkspaceInner;

/**
 * Type representing WorkspaceModel.
 */
public interface WorkspaceModel extends HasInner<WorkspaceInner>, Resource, GroupableResourceCore<LogAnalyticsManager, WorkspaceInner>, HasResourceGroup, HasManager<LogAnalyticsManager> {
    /**
     * @return the customerId value.
     */
    String customerId();

    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the privateLinkScopedResources value.
     */
    List<PrivateLinkScopedResource> privateLinkScopedResources();

    /**
     * @return the provisioningState value.
     */
    WorkspaceEntityStatus provisioningState();

    /**
     * @return the publicNetworkAccessForIngestion value.
     */
    PublicNetworkAccessType publicNetworkAccessForIngestion();

    /**
     * @return the publicNetworkAccessForQuery value.
     */
    PublicNetworkAccessType publicNetworkAccessForQuery();

    /**
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * @return the sku value.
     */
    WorkspaceSku sku();

    /**
     * @return the workspaceCapping value.
     */
    WorkspaceCapping workspaceCapping();

}
