// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.admissionregistration.v1beta1.ValidatingAdmissionPolicyArgs;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ValidatingAdmissionPolicySpec;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.ValidatingAdmissionPolicyStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ValidatingAdmissionPolicy describes the definition of an admission validation policy that accepts or rejects an object without changing it.
 * 
 */
@ResourceType(type="kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicy")
public class ValidatingAdmissionPolicy extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    @Export(name="metadata", refs={ObjectMeta.class}, tree="[0]")
    private Output<ObjectMeta> metadata;

    /**
     * @return Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    public Output<ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired behavior of the ValidatingAdmissionPolicy.
     * 
     */
    @Export(name="spec", refs={ValidatingAdmissionPolicySpec.class}, tree="[0]")
    private Output<ValidatingAdmissionPolicySpec> spec;

    /**
     * @return Specification of the desired behavior of the ValidatingAdmissionPolicy.
     * 
     */
    public Output<ValidatingAdmissionPolicySpec> spec() {
        return this.spec;
    }
    /**
     * The status of the ValidatingAdmissionPolicy, including warnings that are useful to determine if the policy behaves in the expected way. Populated by the system. Read-only.
     * 
     */
    @Export(name="status", refs={ValidatingAdmissionPolicyStatus.class}, tree="[0]")
    private Output</* @Nullable */ ValidatingAdmissionPolicyStatus> status;

    /**
     * @return The status of the ValidatingAdmissionPolicy, including warnings that are useful to determine if the policy behaves in the expected way. Populated by the system. Read-only.
     * 
     */
    public Output<Optional<ValidatingAdmissionPolicyStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ValidatingAdmissionPolicy(String name) {
        this(name, ValidatingAdmissionPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ValidatingAdmissionPolicy(String name, @Nullable ValidatingAdmissionPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ValidatingAdmissionPolicy(String name, @Nullable ValidatingAdmissionPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicy", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ValidatingAdmissionPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingAdmissionPolicy", name, null, makeResourceOptions(options, id));
    }

    private static ValidatingAdmissionPolicyArgs makeArgs(@Nullable ValidatingAdmissionPolicyArgs args) {
        var builder = args == null ? ValidatingAdmissionPolicyArgs.builder() : ValidatingAdmissionPolicyArgs.builder(args);
        return builder
            .apiVersion("admissionregistration.k8s.io/v1beta1")
            .kind("ValidatingAdmissionPolicy")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:admissionregistration.k8s.io/v1alpha1:ValidatingAdmissionPolicy").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ValidatingAdmissionPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ValidatingAdmissionPolicy(name, id, options);
    }
}