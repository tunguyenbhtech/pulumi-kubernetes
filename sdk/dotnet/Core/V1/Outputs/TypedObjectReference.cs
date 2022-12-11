// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Core.V1
{

    [OutputType]
    public sealed class TypedObjectReference
    {
        /// <summary>
        /// APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
        /// </summary>
        public readonly string ApiGroup;
        /// <summary>
        /// Kind is the type of resource being referenced
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// Name is the name of resource being referenced
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Namespace is the namespace of resource being referenced Note that when a namespace is specified, a gateway.networking.k8s.io/ReferenceGrant object is required in the referent namespace to allow that namespace's owner to accept the reference. See the ReferenceGrant documentation for details. (Alpha) This field requires the CrossNamespaceVolumeDataSource feature gate to be enabled.
        /// </summary>
        public readonly string Namespace;

        [OutputConstructor]
        private TypedObjectReference(
            string apiGroup,

            string kind,

            string name,

            string @namespace)
        {
            ApiGroup = apiGroup;
            Kind = kind;
            Name = name;
            Namespace = @namespace;
        }
    }
}