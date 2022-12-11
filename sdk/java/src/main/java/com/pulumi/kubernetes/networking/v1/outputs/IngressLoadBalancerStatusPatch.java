// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1.outputs.IngressLoadBalancerIngressPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IngressLoadBalancerStatusPatch {
    /**
     * @return Ingress is a list containing ingress points for the load-balancer.
     * 
     */
    private @Nullable List<IngressLoadBalancerIngressPatch> ingress;

    private IngressLoadBalancerStatusPatch() {}
    /**
     * @return Ingress is a list containing ingress points for the load-balancer.
     * 
     */
    public List<IngressLoadBalancerIngressPatch> ingress() {
        return this.ingress == null ? List.of() : this.ingress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressLoadBalancerStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<IngressLoadBalancerIngressPatch> ingress;
        public Builder() {}
        public Builder(IngressLoadBalancerStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
        }

        @CustomType.Setter
        public Builder ingress(@Nullable List<IngressLoadBalancerIngressPatch> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(IngressLoadBalancerIngressPatch... ingress) {
            return ingress(List.of(ingress));
        }
        public IngressLoadBalancerStatusPatch build() {
            final var o = new IngressLoadBalancerStatusPatch();
            o.ingress = ingress;
            return o;
        }
    }
}