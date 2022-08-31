// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.LoadBalancerStatus;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressStatus {
    /**
     * @return LoadBalancer contains the current status of the load-balancer.
     * 
     */
    private @Nullable LoadBalancerStatus loadBalancer;

    private IngressStatus() {}
    /**
     * @return LoadBalancer contains the current status of the load-balancer.
     * 
     */
    public Optional<LoadBalancerStatus> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LoadBalancerStatus loadBalancer;
        public Builder() {}
        public Builder(IngressStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancer = defaults.loadBalancer;
        }

        @CustomType.Setter
        public Builder loadBalancer(@Nullable LoadBalancerStatus loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public IngressStatus build() {
            final var o = new IngressStatus();
            o.loadBalancer = loadBalancer;
            return o;
        }
    }
}