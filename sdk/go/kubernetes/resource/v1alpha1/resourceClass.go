// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	corev1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/core/v1"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ResourceClass is used by administrators to influence how resources are allocated.
//
// This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
type ResourceClass struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
	//
	// Resource drivers have a unique name in forward domain order (acme.example.com).
	DriverName pulumi.StringOutput `pulumi:"driverName"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
	ParametersRef ResourceClassParametersReferencePtrOutput `pulumi:"parametersRef"`
	// Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
	//
	// Setting this field is optional. If null, all nodes are candidates.
	SuitableNodes corev1.NodeSelectorPtrOutput `pulumi:"suitableNodes"`
}

// NewResourceClass registers a new resource with the given unique name, arguments, and options.
func NewResourceClass(ctx *pulumi.Context,
	name string, args *ResourceClassArgs, opts ...pulumi.ResourceOption) (*ResourceClass, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DriverName == nil {
		return nil, errors.New("invalid value for required argument 'DriverName'")
	}
	args.ApiVersion = pulumi.StringPtr("resource.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("ResourceClass")
	var resource ResourceClass
	err := ctx.RegisterResource("kubernetes:resource.k8s.io/v1alpha1:ResourceClass", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceClass gets an existing ResourceClass resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceClass(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceClassState, opts ...pulumi.ResourceOption) (*ResourceClass, error) {
	var resource ResourceClass
	err := ctx.ReadResource("kubernetes:resource.k8s.io/v1alpha1:ResourceClass", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceClass resources.
type resourceClassState struct {
}

type ResourceClassState struct {
}

func (ResourceClassState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClassState)(nil)).Elem()
}

type resourceClassArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
	//
	// Resource drivers have a unique name in forward domain order (acme.example.com).
	DriverName string `pulumi:"driverName"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
	ParametersRef *ResourceClassParametersReference `pulumi:"parametersRef"`
	// Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
	//
	// Setting this field is optional. If null, all nodes are candidates.
	SuitableNodes *corev1.NodeSelector `pulumi:"suitableNodes"`
}

// The set of arguments for constructing a ResourceClass resource.
type ResourceClassArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
	//
	// Resource drivers have a unique name in forward domain order (acme.example.com).
	DriverName pulumi.StringInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata
	Metadata metav1.ObjectMetaPtrInput
	// ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
	ParametersRef ResourceClassParametersReferencePtrInput
	// Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
	//
	// Setting this field is optional. If null, all nodes are candidates.
	SuitableNodes corev1.NodeSelectorPtrInput
}

func (ResourceClassArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceClassArgs)(nil)).Elem()
}

type ResourceClassInput interface {
	pulumi.Input

	ToResourceClassOutput() ResourceClassOutput
	ToResourceClassOutputWithContext(ctx context.Context) ResourceClassOutput
}

func (*ResourceClass) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClass)(nil)).Elem()
}

func (i *ResourceClass) ToResourceClassOutput() ResourceClassOutput {
	return i.ToResourceClassOutputWithContext(context.Background())
}

func (i *ResourceClass) ToResourceClassOutputWithContext(ctx context.Context) ResourceClassOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassOutput)
}

// ResourceClassArrayInput is an input type that accepts ResourceClassArray and ResourceClassArrayOutput values.
// You can construct a concrete instance of `ResourceClassArrayInput` via:
//
//	ResourceClassArray{ ResourceClassArgs{...} }
type ResourceClassArrayInput interface {
	pulumi.Input

	ToResourceClassArrayOutput() ResourceClassArrayOutput
	ToResourceClassArrayOutputWithContext(context.Context) ResourceClassArrayOutput
}

type ResourceClassArray []ResourceClassInput

func (ResourceClassArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClass)(nil)).Elem()
}

func (i ResourceClassArray) ToResourceClassArrayOutput() ResourceClassArrayOutput {
	return i.ToResourceClassArrayOutputWithContext(context.Background())
}

func (i ResourceClassArray) ToResourceClassArrayOutputWithContext(ctx context.Context) ResourceClassArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassArrayOutput)
}

// ResourceClassMapInput is an input type that accepts ResourceClassMap and ResourceClassMapOutput values.
// You can construct a concrete instance of `ResourceClassMapInput` via:
//
//	ResourceClassMap{ "key": ResourceClassArgs{...} }
type ResourceClassMapInput interface {
	pulumi.Input

	ToResourceClassMapOutput() ResourceClassMapOutput
	ToResourceClassMapOutputWithContext(context.Context) ResourceClassMapOutput
}

type ResourceClassMap map[string]ResourceClassInput

func (ResourceClassMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClass)(nil)).Elem()
}

func (i ResourceClassMap) ToResourceClassMapOutput() ResourceClassMapOutput {
	return i.ToResourceClassMapOutputWithContext(context.Background())
}

func (i ResourceClassMap) ToResourceClassMapOutputWithContext(ctx context.Context) ResourceClassMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceClassMapOutput)
}

type ResourceClassOutput struct{ *pulumi.OutputState }

func (ResourceClassOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceClass)(nil)).Elem()
}

func (o ResourceClassOutput) ToResourceClassOutput() ResourceClassOutput {
	return o
}

func (o ResourceClassOutput) ToResourceClassOutputWithContext(ctx context.Context) ResourceClassOutput {
	return o
}

// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o ResourceClassOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClass) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

// DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
//
// Resource drivers have a unique name in forward domain order (acme.example.com).
func (o ResourceClassOutput) DriverName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceClass) pulumi.StringOutput { return v.DriverName }).(pulumi.StringOutput)
}

// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o ResourceClassOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceClass) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Standard object metadata
func (o ResourceClassOutput) Metadata() metav1.ObjectMetaPtrOutput {
	return o.ApplyT(func(v *ResourceClass) metav1.ObjectMetaPtrOutput { return v.Metadata }).(metav1.ObjectMetaPtrOutput)
}

// ParametersRef references an arbitrary separate object that may hold parameters that will be used by the driver when allocating a resource that uses this class. A dynamic resource driver can distinguish between parameters stored here and and those stored in ResourceClaimSpec.
func (o ResourceClassOutput) ParametersRef() ResourceClassParametersReferencePtrOutput {
	return o.ApplyT(func(v *ResourceClass) ResourceClassParametersReferencePtrOutput { return v.ParametersRef }).(ResourceClassParametersReferencePtrOutput)
}

// Only nodes matching the selector will be considered by the scheduler when trying to find a Node that fits a Pod when that Pod uses a ResourceClaim that has not been allocated yet.
//
// Setting this field is optional. If null, all nodes are candidates.
func (o ResourceClassOutput) SuitableNodes() corev1.NodeSelectorPtrOutput {
	return o.ApplyT(func(v *ResourceClass) corev1.NodeSelectorPtrOutput { return v.SuitableNodes }).(corev1.NodeSelectorPtrOutput)
}

type ResourceClassArrayOutput struct{ *pulumi.OutputState }

func (ResourceClassArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceClass)(nil)).Elem()
}

func (o ResourceClassArrayOutput) ToResourceClassArrayOutput() ResourceClassArrayOutput {
	return o
}

func (o ResourceClassArrayOutput) ToResourceClassArrayOutputWithContext(ctx context.Context) ResourceClassArrayOutput {
	return o
}

func (o ResourceClassArrayOutput) Index(i pulumi.IntInput) ResourceClassOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceClass {
		return vs[0].([]*ResourceClass)[vs[1].(int)]
	}).(ResourceClassOutput)
}

type ResourceClassMapOutput struct{ *pulumi.OutputState }

func (ResourceClassMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceClass)(nil)).Elem()
}

func (o ResourceClassMapOutput) ToResourceClassMapOutput() ResourceClassMapOutput {
	return o
}

func (o ResourceClassMapOutput) ToResourceClassMapOutputWithContext(ctx context.Context) ResourceClassMapOutput {
	return o
}

func (o ResourceClassMapOutput) MapIndex(k pulumi.StringInput) ResourceClassOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceClass {
		return vs[0].(map[string]*ResourceClass)[vs[1].(string)]
	}).(ResourceClassOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassInput)(nil)).Elem(), &ResourceClass{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassArrayInput)(nil)).Elem(), ResourceClassArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceClassMapInput)(nil)).Elem(), ResourceClassMap{})
	pulumi.RegisterOutputType(ResourceClassOutput{})
	pulumi.RegisterOutputType(ResourceClassArrayOutput{})
	pulumi.RegisterOutputType(ResourceClassMapOutput{})
}