/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.SubscriptionContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.SubscriptionCreateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2019_12_01.SubscriptionState;
import rx.functions.Func1;

class SubscriptionContractImpl extends CreatableUpdatableImpl<SubscriptionContract, SubscriptionContractInner, SubscriptionContractImpl> implements SubscriptionContract, SubscriptionContract.Definition, SubscriptionContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private String sid;
    private Boolean cnotify;
    private String cifMatch;
    private Boolean unotify;
    private String uifMatch;
    private SubscriptionCreateParameters createOrUpdateParameter;
    private final ApiManagementManager manager;

    SubscriptionContractImpl(String name, ApiManagementManager manager) {
        super(name, new SubscriptionContractInner());
        this.manager = manager;
        // Set resource name
        this.sid = name;
        //
        this.createOrUpdateParameter = new SubscriptionCreateParameters();
    }

    SubscriptionContractImpl(SubscriptionContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sid = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.sid = IdParsingUtils.getValueFromIdByName(inner.id(), "subscriptions");
        // set other parameters for create and update
        this.createOrUpdateParameter = new SubscriptionCreateParameters();
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SubscriptionContract> createResourceAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.sid, this.createOrUpdateParameter, this.cnotify, this.cifMatch)
            .map(new Func1<SubscriptionContractInner, SubscriptionContractInner>() {
               @Override
               public SubscriptionContractInner call(SubscriptionContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SubscriptionContract> updateResourceAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.sid, this.createOrUpdateParameter, this.unotify, this.uifMatch)
            .map(new Func1<SubscriptionContractInner, SubscriptionContractInner>() {
               @Override
               public SubscriptionContractInner call(SubscriptionContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SubscriptionContractInner> getInnerAsync() {
        SubscriptionsInner client = this.manager().inner().subscriptions();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SubscriptionCreateParameters();
    }

    @Override
    public Boolean allowTracing() {
        return this.inner().allowTracing();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public DateTime endDate() {
        return this.inner().endDate();
    }

    @Override
    public DateTime expirationDate() {
        return this.inner().expirationDate();
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
    public DateTime notificationDate() {
        return this.inner().notificationDate();
    }

    @Override
    public String ownerId() {
        return this.inner().ownerId();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

    @Override
    public DateTime startDate() {
        return this.inner().startDate();
    }

    @Override
    public SubscriptionState state() {
        return this.inner().state();
    }

    @Override
    public String stateComment() {
        return this.inner().stateComment();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SubscriptionContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public SubscriptionContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public SubscriptionContractImpl withDisplayName(String displayName) {
        this.createOrUpdateParameter.withDisplayName(displayName);
        return this;
    }

    @Override
    public SubscriptionContractImpl withScope(String scope) {
        this.createOrUpdateParameter.withScope(scope);
        return this;
    }

    @Override
    public SubscriptionContractImpl withNotify(Boolean notify) {
        if (isInCreateMode()) {
            this.cnotify = notify;
        } else {
            this.unotify = notify;
        }
        return this;
    }

    @Override
    public SubscriptionContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public SubscriptionContractImpl withAllowTracing(Boolean allowTracing) {
        this.createOrUpdateParameter.withAllowTracing(allowTracing);
        return this;
    }

    @Override
    public SubscriptionContractImpl withOwnerId(String ownerId) {
        this.createOrUpdateParameter.withOwnerId(ownerId);
        return this;
    }

    @Override
    public SubscriptionContractImpl withPrimaryKey(String primaryKey) {
        this.createOrUpdateParameter.withPrimaryKey(primaryKey);
        return this;
    }

    @Override
    public SubscriptionContractImpl withSecondaryKey(String secondaryKey) {
        this.createOrUpdateParameter.withSecondaryKey(secondaryKey);
        return this;
    }

    @Override
    public SubscriptionContractImpl withState(SubscriptionState state) {
        this.createOrUpdateParameter.withState(state);
        return this;
    }

}
