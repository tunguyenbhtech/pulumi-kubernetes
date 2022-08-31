// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Patch resources are used to modify existing Kubernetes resources by using
// Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
// one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
// Conflicts will result in an error by default, but can be forced using the "pulumi.com/patchForce" annotation. See the
// [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
// additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
// ClusterCIDR represents a single configuration for per-Node Pod CIDR allocations when the MultiCIDRRangeAllocator is enabled (see the config for kube-controller-manager).  A cluster may have any number of ClusterCIDR resources, all of which will be considered when allocating a CIDR for a Node.  A ClusterCIDR is eligible to be used for a given Node when the node selector matches the node in question and has free CIDRs to allocate.  In case of multiple matching ClusterCIDR resources, the allocator will attempt to break ties using internal heuristics, but any ClusterCIDR whose node selector matches the Node may be used.
type ClusterCIDRPatch struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrOutput `pulumi:"metadata"`
	// Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec ClusterCIDRSpecPatchPtrOutput `pulumi:"spec"`
}

// NewClusterCIDRPatch registers a new resource with the given unique name, arguments, and options.
func NewClusterCIDRPatch(ctx *pulumi.Context,
	name string, args *ClusterCIDRPatchArgs, opts ...pulumi.ResourceOption) (*ClusterCIDRPatch, error) {
	if args == nil {
		args = &ClusterCIDRPatchArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("networking.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("ClusterCIDR")
	var resource ClusterCIDRPatch
	err := ctx.RegisterResource("kubernetes:networking.k8s.io/v1alpha1:ClusterCIDRPatch", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterCIDRPatch gets an existing ClusterCIDRPatch resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterCIDRPatch(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterCIDRPatchState, opts ...pulumi.ResourceOption) (*ClusterCIDRPatch, error) {
	var resource ClusterCIDRPatch
	err := ctx.ReadResource("kubernetes:networking.k8s.io/v1alpha1:ClusterCIDRPatch", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterCIDRPatch resources.
type clusterCIDRPatchState struct {
}

type ClusterCIDRPatchState struct {
}

func (ClusterCIDRPatchState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterCIDRPatchState)(nil)).Elem()
}

type clusterCIDRPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMetaPatch `pulumi:"metadata"`
	// Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *ClusterCIDRSpecPatch `pulumi:"spec"`
}

// The set of arguments for constructing a ClusterCIDRPatch resource.
type ClusterCIDRPatchArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPatchPtrInput
	// Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec ClusterCIDRSpecPatchPtrInput
}

func (ClusterCIDRPatchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterCIDRPatchArgs)(nil)).Elem()
}

type ClusterCIDRPatchInput interface {
	pulumi.Input

	ToClusterCIDRPatchOutput() ClusterCIDRPatchOutput
	ToClusterCIDRPatchOutputWithContext(ctx context.Context) ClusterCIDRPatchOutput
}

func (*ClusterCIDRPatch) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterCIDRPatch)(nil)).Elem()
}

func (i *ClusterCIDRPatch) ToClusterCIDRPatchOutput() ClusterCIDRPatchOutput {
	return i.ToClusterCIDRPatchOutputWithContext(context.Background())
}

func (i *ClusterCIDRPatch) ToClusterCIDRPatchOutputWithContext(ctx context.Context) ClusterCIDRPatchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterCIDRPatchOutput)
}

// ClusterCIDRPatchArrayInput is an input type that accepts ClusterCIDRPatchArray and ClusterCIDRPatchArrayOutput values.
// You can construct a concrete instance of `ClusterCIDRPatchArrayInput` via:
//
//	ClusterCIDRPatchArray{ ClusterCIDRPatchArgs{...} }
type ClusterCIDRPatchArrayInput interface {
	pulumi.Input

	ToClusterCIDRPatchArrayOutput() ClusterCIDRPatchArrayOutput
	ToClusterCIDRPatchArrayOutputWithContext(context.Context) ClusterCIDRPatchArrayOutput
}

type ClusterCIDRPatchArray []ClusterCIDRPatchInput

func (ClusterCIDRPatchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterCIDRPatch)(nil)).Elem()
}

func (i ClusterCIDRPatchArray) ToClusterCIDRPatchArrayOutput() ClusterCIDRPatchArrayOutput {
	return i.ToClusterCIDRPatchArrayOutputWithContext(context.Background())
}

func (i ClusterCIDRPatchArray) ToClusterCIDRPatchArrayOutputWithContext(ctx context.Context) ClusterCIDRPatchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterCIDRPatchArrayOutput)
}

// ClusterCIDRPatchMapInput is an input type that accepts ClusterCIDRPatchMap and ClusterCIDRPatchMapOutput values.
// You can construct a concrete instance of `ClusterCIDRPatchMapInput` via:
//
//	ClusterCIDRPatchMap{ "key": ClusterCIDRPatchArgs{...} }
type ClusterCIDRPatchMapInput interface {
	pulumi.Input

	ToClusterCIDRPatchMapOutput() ClusterCIDRPatchMapOutput
	ToClusterCIDRPatchMapOutputWithContext(context.Context) ClusterCIDRPatchMapOutput
}

type ClusterCIDRPatchMap map[string]ClusterCIDRPatchInput

func (ClusterCIDRPatchMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterCIDRPatch)(nil)).Elem()
}

func (i ClusterCIDRPatchMap) ToClusterCIDRPatchMapOutput() ClusterCIDRPatchMapOutput {
	return i.ToClusterCIDRPatchMapOutputWithContext(context.Background())
}

func (i ClusterCIDRPatchMap) ToClusterCIDRPatchMapOutputWithContext(ctx context.Context) ClusterCIDRPatchMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterCIDRPatchMapOutput)
}

type ClusterCIDRPatchOutput struct{ *pulumi.OutputState }

func (ClusterCIDRPatchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterCIDRPatch)(nil)).Elem()
}

func (o ClusterCIDRPatchOutput) ToClusterCIDRPatchOutput() ClusterCIDRPatchOutput {
	return o
}

func (o ClusterCIDRPatchOutput) ToClusterCIDRPatchOutputWithContext(ctx context.Context) ClusterCIDRPatchOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ClusterCIDRPatchOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterCIDRPatch) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ClusterCIDRPatchOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterCIDRPatch) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o ClusterCIDRPatchOutput) Metadata() metav1.ObjectMetaPatchPtrOutput {
	return o.ApplyT(func(v *ClusterCIDRPatch) metav1.ObjectMetaPatchPtrOutput { return v.Metadata }).(metav1.ObjectMetaPatchPtrOutput)
}

// Spec is the desired state of the ClusterCIDR. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o ClusterCIDRPatchOutput) Spec() ClusterCIDRSpecPatchPtrOutput {
	return o.ApplyT(func(v *ClusterCIDRPatch) ClusterCIDRSpecPatchPtrOutput { return v.Spec }).(ClusterCIDRSpecPatchPtrOutput)
}

type ClusterCIDRPatchArrayOutput struct{ *pulumi.OutputState }

func (ClusterCIDRPatchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterCIDRPatch)(nil)).Elem()
}

func (o ClusterCIDRPatchArrayOutput) ToClusterCIDRPatchArrayOutput() ClusterCIDRPatchArrayOutput {
	return o
}

func (o ClusterCIDRPatchArrayOutput) ToClusterCIDRPatchArrayOutputWithContext(ctx context.Context) ClusterCIDRPatchArrayOutput {
	return o
}

func (o ClusterCIDRPatchArrayOutput) Index(i pulumi.IntInput) ClusterCIDRPatchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterCIDRPatch {
		return vs[0].([]*ClusterCIDRPatch)[vs[1].(int)]
	}).(ClusterCIDRPatchOutput)
}

type ClusterCIDRPatchMapOutput struct{ *pulumi.OutputState }

func (ClusterCIDRPatchMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterCIDRPatch)(nil)).Elem()
}

func (o ClusterCIDRPatchMapOutput) ToClusterCIDRPatchMapOutput() ClusterCIDRPatchMapOutput {
	return o
}

func (o ClusterCIDRPatchMapOutput) ToClusterCIDRPatchMapOutputWithContext(ctx context.Context) ClusterCIDRPatchMapOutput {
	return o
}

func (o ClusterCIDRPatchMapOutput) MapIndex(k pulumi.StringInput) ClusterCIDRPatchOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterCIDRPatch {
		return vs[0].(map[string]*ClusterCIDRPatch)[vs[1].(string)]
	}).(ClusterCIDRPatchOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterCIDRPatchInput)(nil)).Elem(), &ClusterCIDRPatch{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterCIDRPatchArrayInput)(nil)).Elem(), ClusterCIDRPatchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterCIDRPatchMapInput)(nil)).Elem(), ClusterCIDRPatchMap{})
	pulumi.RegisterOutputType(ClusterCIDRPatchOutput{})
	pulumi.RegisterOutputType(ClusterCIDRPatchArrayOutput{})
	pulumi.RegisterOutputType(ClusterCIDRPatchMapOutput{})
}