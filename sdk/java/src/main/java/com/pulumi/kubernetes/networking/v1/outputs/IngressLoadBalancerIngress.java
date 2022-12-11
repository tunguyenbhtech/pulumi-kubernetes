// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.networking.v1.outputs.IngressPortStatus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressLoadBalancerIngress {
    /**
     * @return Hostname is set for load-balancer ingress points that are DNS based.
     * 
     */
    private @Nullable String hostname;
    /**
     * @return IP is set for load-balancer ingress points that are IP based.
     * 
     */
    private @Nullable String ip;
    /**
     * @return Ports provides information about the ports exposed by this LoadBalancer.
     * 
     */
    private @Nullable List<IngressPortStatus> ports;

    private IngressLoadBalancerIngress() {}
    /**
     * @return Hostname is set for load-balancer ingress points that are DNS based.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return IP is set for load-balancer ingress points that are IP based.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return Ports provides information about the ports exposed by this LoadBalancer.
     * 
     */
    public List<IngressPortStatus> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressLoadBalancerIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ip;
        private @Nullable List<IngressPortStatus> ports;
        public Builder() {}
        public Builder(IngressLoadBalancerIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
        }

        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<IngressPortStatus> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(IngressPortStatus... ports) {
            return ports(List.of(ports));
        }
        public IngressLoadBalancerIngress build() {
            final var o = new IngressLoadBalancerIngress();
            o.hostname = hostname;
            o.ip = ip;
            o.ports = ports;
            return o;
        }
    }
}