// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Core.V1
{

    /// <summary>
    /// EnvVarSource represents a source for the value of an EnvVar.
    /// </summary>
    [OutputType]
    public sealed class EnvVarSourcePatch
    {
        /// <summary>
        /// Selects a key of a ConfigMap.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.ConfigMapKeySelectorPatch ConfigMapKeyRef;
        /// <summary>
        /// Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['&lt;KEY&gt;']`, `metadata.annotations['&lt;KEY&gt;']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.ObjectFieldSelectorPatch FieldRef;
        /// <summary>
        /// Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceFieldSelectorPatch ResourceFieldRef;
        /// <summary>
        /// Selects a key of a secret in the pod's namespace
        /// </summary>
        public readonly Pulumi.Kubernetes.Types.Outputs.Core.V1.SecretKeySelectorPatch SecretKeyRef;

        [OutputConstructor]
        private EnvVarSourcePatch(
            Pulumi.Kubernetes.Types.Outputs.Core.V1.ConfigMapKeySelectorPatch configMapKeyRef,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.ObjectFieldSelectorPatch fieldRef,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.ResourceFieldSelectorPatch resourceFieldRef,

            Pulumi.Kubernetes.Types.Outputs.Core.V1.SecretKeySelectorPatch secretKeyRef)
        {
            ConfigMapKeyRef = configMapKeyRef;
            FieldRef = fieldRef;
            ResourceFieldRef = resourceFieldRef;
            SecretKeyRef = secretKeyRef;
        }
    }
}