// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { ClusterTrustBundleArgs } from "./clusterTrustBundle";
export type ClusterTrustBundle = import("./clusterTrustBundle").ClusterTrustBundle;
export const ClusterTrustBundle: typeof import("./clusterTrustBundle").ClusterTrustBundle = null as any;
utilities.lazyLoad(exports, ["ClusterTrustBundle"], () => require("./clusterTrustBundle"));

export { ClusterTrustBundleListArgs } from "./clusterTrustBundleList";
export type ClusterTrustBundleList = import("./clusterTrustBundleList").ClusterTrustBundleList;
export const ClusterTrustBundleList: typeof import("./clusterTrustBundleList").ClusterTrustBundleList = null as any;
utilities.lazyLoad(exports, ["ClusterTrustBundleList"], () => require("./clusterTrustBundleList"));

export { ClusterTrustBundlePatchArgs } from "./clusterTrustBundlePatch";
export type ClusterTrustBundlePatch = import("./clusterTrustBundlePatch").ClusterTrustBundlePatch;
export const ClusterTrustBundlePatch: typeof import("./clusterTrustBundlePatch").ClusterTrustBundlePatch = null as any;
utilities.lazyLoad(exports, ["ClusterTrustBundlePatch"], () => require("./clusterTrustBundlePatch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:certificates.k8s.io/v1alpha1:ClusterTrustBundle":
                return new ClusterTrustBundle(name, <any>undefined, { urn })
            case "kubernetes:certificates.k8s.io/v1alpha1:ClusterTrustBundleList":
                return new ClusterTrustBundleList(name, <any>undefined, { urn })
            case "kubernetes:certificates.k8s.io/v1alpha1:ClusterTrustBundlePatch":
                return new ClusterTrustBundlePatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "certificates.k8s.io/v1alpha1", _module)