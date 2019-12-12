// *** WARNING: this file was generated by the Pulumi Kubernetes codegen tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Apps.V1Beta1
{
    /// <summary>
    /// DEPRECATED - apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported
    /// by Kubernetes v1.16+ clusters.
    /// 
    /// StatefulSet represents a set of pods with consistent identities. Identities are defined as:
    ///  - Network: A single stable DNS and hostname.
    ///  - Storage: As many VolumeClaims as requested.
    /// The StatefulSet guarantees that a given network identity will always map to the same storage
    /// identity.
    /// 
    /// This resource waits until its status is ready before registering success
    /// for create/update, and populating output properties from the current state of the resource.
    /// The following conditions are used to determine whether the resource creation has
    /// succeeded or failed:
    /// 
    /// 1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
    ///    and '.status.readyReplicas'.
    /// 2. The value of '.status.updateRevision' matches '.status.currentRevision'.
    /// 
    /// If the StatefulSet has not reached a Ready state after 10 minutes, it will
    /// time out and mark the resource update as Failed. You can override the default timeout value
    /// by setting the 'customTimeouts' option on the resource.
    /// </summary>
    public partial class StatefulSet : Pulumi.CustomResource
    {
        /// <summary>
        /// APIVersion defines the versioned schema of this representation of an object. Servers
        /// should convert recognized schemas to the latest internal value, and may reject
        /// unrecognized values. More info:
        /// https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        /// </summary>
        [Output("apiVersion")]
        public Output<string> ApiVersion { get; private set; } = null!;

        /// <summary>
        /// Kind is a string value representing the REST resource this object represents. Servers
        /// may infer this from the endpoint the client submits requests to. Cannot be updated. In
        /// CamelCase. More info:
        /// https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        
        [Output("metadata")]
        public Output<Types.Outputs.Meta.V1.ObjectMeta> Metadata { get; private set; } = null!;

        /// <summary>
        /// Spec defines the desired identities of pods in this set.
        /// </summary>
        [Output("spec")]
        public Output<Types.Outputs.Apps.V1Beta1.StatefulSetSpec> Spec { get; private set; } = null!;

        /// <summary>
        /// Status is the current status of Pods in this StatefulSet. This data may be out of date
        /// by some window of time.
        /// </summary>
        [Output("status")]
        public Output<Types.Outputs.Apps.V1Beta1.StatefulSetStatus> Status { get; private set; } = null!;


        /// <summary>
        /// Create a StatefulSet resource with the given unique name, arguments, and options.
        /// </summary>
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StatefulSet(string name, Types.Inputs.Apps.V1Beta1.StatefulSetArgs? args = null, CustomResourceOptions? options = null)
            : base("kubernetes:apps/v1beta1:StatefulSet", name, SetAPIKindAndVersion(args), MakeResourceOptions(options))
        {
        }

        private static ResourceArgs SetAPIKindAndVersion(Types.Inputs.Apps.V1Beta1.StatefulSetArgs? args)
        {
            if (args != null) {
                args.ApiVersion = "apps/v1beta1";
                args.Kind = "StatefulSet";
            }
            return args ?? ResourceArgs.Empty;
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            return CustomResourceOptions.Merge(defaultOptions, options);
        }

        /// <summary>
        /// Get an existing StatefulSet resource's state with the given name and ID.
        /// </summary>
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StatefulSet Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new StatefulSet(name, null, CustomResourceOptions.Merge(options, new CustomResourceOptions
            {
                Id = id,
            }));
        }

    }
}
