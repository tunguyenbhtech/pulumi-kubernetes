// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricIdentifier;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricTarget;
import java.util.Objects;

@CustomType
public final class ExternalMetricSource {
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    private MetricIdentifier metric;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private MetricTarget target;

    private ExternalMetricSource() {}
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public MetricIdentifier metric() {
        return this.metric;
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public MetricTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MetricIdentifier metric;
        private MetricTarget target;
        public Builder() {}
        public Builder(ExternalMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder metric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        @CustomType.Setter
        public Builder target(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ExternalMetricSource build() {
            final var o = new ExternalMetricSource();
            o.metric = metric;
            o.target = target;
            return o;
        }
    }
}