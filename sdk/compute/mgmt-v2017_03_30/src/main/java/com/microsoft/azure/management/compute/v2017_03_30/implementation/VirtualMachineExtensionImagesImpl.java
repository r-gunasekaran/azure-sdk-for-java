/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensionImages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensionImage;
import java.util.List;

class VirtualMachineExtensionImagesImpl extends WrapperImpl<VirtualMachineExtensionImagesInner> implements VirtualMachineExtensionImages {
    private final ComputeManager manager;

    VirtualMachineExtensionImagesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineExtensionImages());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private VirtualMachineExtensionImageImpl wrapVirtualMachineExtensionImageModel(VirtualMachineExtensionImageInner inner) {
        return  new VirtualMachineExtensionImageImpl(inner, manager());
    }

    private Observable<VirtualMachineExtensionImageInner> getVirtualMachineExtensionImageInnerUsingVirtualMachineExtensionImagesInnerAsync(String id) {
        String location = IdParsingUtils.getValueFromIdByName(id, "locations");
        String publisherName = IdParsingUtils.getValueFromIdByName(id, "publishers");
        String type = IdParsingUtils.getValueFromIdByName(id, "types");
        String version = IdParsingUtils.getValueFromIdByName(id, "versions");
        VirtualMachineExtensionImagesInner client = this.inner();
        return client.getAsync(location, publisherName, type, version);
    }

    @Override
    public Observable<VirtualMachineExtensionImage> getAsync(String location, String publisherName, String type, String version) {
        VirtualMachineExtensionImagesInner client = this.inner();
        return client.getAsync(location, publisherName, type, version)
        .map(new Func1<VirtualMachineExtensionImageInner, VirtualMachineExtensionImage>() {
            @Override
            public VirtualMachineExtensionImage call(VirtualMachineExtensionImageInner inner) {
                return wrapVirtualMachineExtensionImageModel(inner);
            }
       });
    }

    @Override
    public Observable<VirtualMachineExtensionImage> listVersionsAsync(String location, String publisherName, String type) {
        VirtualMachineExtensionImagesInner client = this.inner();
        return client.listVersionsAsync(location, publisherName, type)
        .flatMap(new Func1<List<VirtualMachineExtensionImageInner>, Observable<VirtualMachineExtensionImageInner>>() {
            @Override
            public Observable<VirtualMachineExtensionImageInner> call(List<VirtualMachineExtensionImageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineExtensionImageInner, VirtualMachineExtensionImage>() {
            @Override
            public VirtualMachineExtensionImage call(VirtualMachineExtensionImageInner inner) {
                return wrapVirtualMachineExtensionImageModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineExtensionImage> listTypesAsync(String location, String publisherName) {
        VirtualMachineExtensionImagesInner client = this.inner();
        return client.listTypesAsync(location, publisherName)
        .flatMap(new Func1<List<VirtualMachineExtensionImageInner>, Observable<VirtualMachineExtensionImageInner>>() {
            @Override
            public Observable<VirtualMachineExtensionImageInner> call(List<VirtualMachineExtensionImageInner> innerList) {
                return Observable.from(innerList);
            }
        })    .map(new Func1<VirtualMachineExtensionImageInner, VirtualMachineExtensionImage>() {
            @Override
            public VirtualMachineExtensionImage call(VirtualMachineExtensionImageInner inner) {
                return new VirtualMachineExtensionImageImpl(inner, manager());
            }
        });
    }

}
