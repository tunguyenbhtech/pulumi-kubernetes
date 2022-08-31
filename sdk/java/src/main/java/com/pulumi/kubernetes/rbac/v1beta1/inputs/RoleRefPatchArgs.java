// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RoleRef contains information that points to the role being used
 * 
 */
public final class RoleRefPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleRefPatchArgs Empty = new RoleRefPatchArgs();

    /**
     * APIGroup is the group for the resource being referenced
     * 
     */
    @Import(name="apiGroup")
    private @Nullable Output<String> apiGroup;

    /**
     * @return APIGroup is the group for the resource being referenced
     * 
     */
    public Optional<Output<String>> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is the type of resource being referenced
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name is the name of resource being referenced
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RoleRefPatchArgs() {}

    private RoleRefPatchArgs(RoleRefPatchArgs $) {
        this.apiGroup = $.apiGroup;
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleRefPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleRefPatchArgs $;

        public Builder() {
            $ = new RoleRefPatchArgs();
        }

        public Builder(RoleRefPatchArgs defaults) {
            $ = new RoleRefPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            $.apiGroup = apiGroup;
            return this;
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(String apiGroup) {
            return apiGroup(Output.of(apiGroup));
        }

        /**
         * @param kind Kind is the type of resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is the type of resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name is the name of resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the name of resource being referenced
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RoleRefPatchArgs build() {
            return $;
        }
    }

}