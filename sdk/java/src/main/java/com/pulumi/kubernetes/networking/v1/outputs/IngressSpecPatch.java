// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1.outputs.IngressBackendPatch;
import com.pulumi.kubernetes.networking.v1.outputs.IngressRulePatch;
import com.pulumi.kubernetes.networking.v1.outputs.IngressTLSPatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressSpecPatch {
    /**
     * @return DefaultBackend is the backend that should handle requests that don&#39;t match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
     * 
     */
    private @Nullable IngressBackendPatch defaultBackend;
    /**
     * @return IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
     * 
     */
    private @Nullable String ingressClassName;
    /**
     * @return A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    private @Nullable List<IngressRulePatch> rules;
    /**
     * @return TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    private @Nullable List<IngressTLSPatch> tls;

    private IngressSpecPatch() {}
    /**
     * @return DefaultBackend is the backend that should handle requests that don&#39;t match any rule. If Rules are not specified, DefaultBackend must be specified. If DefaultBackend is not set, the handling of requests that do not match any of the rules will be up to the Ingress controller.
     * 
     */
    public Optional<IngressBackendPatch> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    /**
     * @return IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
     * 
     */
    public Optional<String> ingressClassName() {
        return Optional.ofNullable(this.ingressClassName);
    }
    /**
     * @return A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    public List<IngressRulePatch> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    public List<IngressTLSPatch> tls() {
        return this.tls == null ? List.of() : this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IngressBackendPatch defaultBackend;
        private @Nullable String ingressClassName;
        private @Nullable List<IngressRulePatch> rules;
        private @Nullable List<IngressTLSPatch> tls;
        public Builder() {}
        public Builder(IngressSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder defaultBackend(@Nullable IngressBackendPatch defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }
        @CustomType.Setter
        public Builder ingressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<IngressRulePatch> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(IngressRulePatch... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder tls(@Nullable List<IngressTLSPatch> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(IngressTLSPatch... tls) {
            return tls(List.of(tls));
        }
        public IngressSpecPatch build() {
            final var o = new IngressSpecPatch();
            o.defaultBackend = defaultBackend;
            o.ingressClassName = ingressClassName;
            o.rules = rules;
            o.tls = tls;
            return o;
        }
    }
}