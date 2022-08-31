// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 * 
 */
public final class OwnerReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OwnerReferenceArgs Empty = new OwnerReferenceArgs();

    /**
     * API version of the referent.
     * 
     */
    @Import(name="apiVersion", required=true)
    private Output<String> apiVersion;

    /**
     * @return API version of the referent.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }

    /**
     * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    @Import(name="blockOwnerDeletion")
    private @Nullable Output<Boolean> blockOwnerDeletion;

    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    public Optional<Output<Boolean>> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }

    /**
     * If true, this reference points to the managing controller.
     * 
     */
    @Import(name="controller")
    private @Nullable Output<Boolean> controller;

    /**
     * @return If true, this reference points to the managing controller.
     * 
     */
    public Optional<Output<Boolean>> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid", required=true)
    private Output<String> uid;

    /**
     * @return UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }

    private OwnerReferenceArgs() {}

    private OwnerReferenceArgs(OwnerReferenceArgs $) {
        this.apiVersion = $.apiVersion;
        this.blockOwnerDeletion = $.blockOwnerDeletion;
        this.controller = $.controller;
        this.kind = $.kind;
        this.name = $.name;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnerReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnerReferenceArgs $;

        public Builder() {
            $ = new OwnerReferenceArgs();
        }

        public Builder(OwnerReferenceArgs defaults) {
            $ = new OwnerReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(@Nullable Output<Boolean> blockOwnerDeletion) {
            $.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(Boolean blockOwnerDeletion) {
            return blockOwnerDeletion(Output.of(blockOwnerDeletion));
        }

        /**
         * @param controller If true, this reference points to the managing controller.
         * 
         * @return builder
         * 
         */
        public Builder controller(@Nullable Output<Boolean> controller) {
            $.controller = controller;
            return this;
        }

        /**
         * @param controller If true, this reference points to the managing controller.
         * 
         * @return builder
         * 
         */
        public Builder controller(Boolean controller) {
            return controller(Output.of(controller));
        }

        /**
         * @param kind Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param uid UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * 
         * @return builder
         * 
         */
        public Builder uid(Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public OwnerReferenceArgs build() {
            $.apiVersion = Objects.requireNonNull($.apiVersion, "expected parameter 'apiVersion' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            return $;
        }
    }

}