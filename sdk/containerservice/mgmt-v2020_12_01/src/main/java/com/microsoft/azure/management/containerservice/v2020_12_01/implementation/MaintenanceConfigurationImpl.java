/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01.implementation;

import com.microsoft.azure.management.containerservice.v2020_12_01.MaintenanceConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_12_01.SystemData;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_12_01.TimeInWeek;
import com.microsoft.azure.management.containerservice.v2020_12_01.TimeSpan;

class MaintenanceConfigurationImpl extends CreatableUpdatableImpl<MaintenanceConfiguration, MaintenanceConfigurationInner, MaintenanceConfigurationImpl> implements MaintenanceConfiguration, MaintenanceConfiguration.Definition, MaintenanceConfiguration.Update {
    private final ContainerServiceManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String configName;

    MaintenanceConfigurationImpl(String name, ContainerServiceManager manager) {
        super(name, new MaintenanceConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.configName = name;
        //
    }

    MaintenanceConfigurationImpl(MaintenanceConfigurationInner inner, ContainerServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.configName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedClusters");
        this.configName = IdParsingUtils.getValueFromIdByName(inner.id(), "maintenanceConfigurations");
        //
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<MaintenanceConfiguration> createResourceAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.configName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MaintenanceConfiguration> updateResourceAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.configName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MaintenanceConfigurationInner> getInnerAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.configName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<TimeSpan> notAllowedTime() {
        return this.inner().notAllowedTime();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public List<TimeInWeek> timeInWeek() {
        return this.inner().timeInWeek();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public MaintenanceConfigurationImpl withExistingManagedCluster(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    @Override
    public MaintenanceConfigurationImpl withNotAllowedTime(List<TimeSpan> notAllowedTime) {
        this.inner().withNotAllowedTime(notAllowedTime);
        return this;
    }

    @Override
    public MaintenanceConfigurationImpl withTimeInWeek(List<TimeInWeek> timeInWeek) {
        this.inner().withTimeInWeek(timeInWeek);
        return this;
    }

}
