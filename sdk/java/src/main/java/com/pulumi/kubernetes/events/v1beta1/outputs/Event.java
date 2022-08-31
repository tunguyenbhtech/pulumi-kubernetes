// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.events.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.EventSource;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReference;
import com.pulumi.kubernetes.events.v1beta1.outputs.EventSeries;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Event {
    /**
     * @return What action was taken/failed regarding to the regarding object.
     * 
     */
    private @Nullable String action;
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    private @Nullable Integer deprecatedCount;
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    private @Nullable String deprecatedFirstTimestamp;
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    private @Nullable String deprecatedLastTimestamp;
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    private @Nullable EventSource deprecatedSource;
    /**
     * @return Required. Time when this Event was first observed.
     * 
     */
    private String eventTime;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    private @Nullable ObjectMeta metadata;
    /**
     * @return Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    private @Nullable String note;
    /**
     * @return Why the action was taken.
     * 
     */
    private @Nullable String reason;
    /**
     * @return The object this Event is about. In most cases it&#39;s an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    private @Nullable ObjectReference regarding;
    /**
     * @return Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    private @Nullable ObjectReference related;
    /**
     * @return Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     * 
     */
    private @Nullable String reportingController;
    /**
     * @return ID of the controller instance, e.g. `kubelet-xyzf`.
     * 
     */
    private @Nullable String reportingInstance;
    /**
     * @return Data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    private @Nullable EventSeries series;
    /**
     * @return Type of this event (Normal, Warning), new types could be added in the future.
     * 
     */
    private @Nullable String type;

    private Event() {}
    /**
     * @return What action was taken/failed regarding to the regarding object.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    public Optional<Integer> deprecatedCount() {
        return Optional.ofNullable(this.deprecatedCount);
    }
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    public Optional<String> deprecatedFirstTimestamp() {
        return Optional.ofNullable(this.deprecatedFirstTimestamp);
    }
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    public Optional<String> deprecatedLastTimestamp() {
        return Optional.ofNullable(this.deprecatedLastTimestamp);
    }
    /**
     * @return Deprecated field assuring backward compatibility with core.v1 Event type
     * 
     */
    public Optional<EventSource> deprecatedSource() {
        return Optional.ofNullable(this.deprecatedSource);
    }
    /**
     * @return Required. Time when this Event was first observed.
     * 
     */
    public String eventTime() {
        return this.eventTime;
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    public Optional<String> note() {
        return Optional.ofNullable(this.note);
    }
    /**
     * @return Why the action was taken.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return The object this Event is about. In most cases it&#39;s an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    public Optional<ObjectReference> regarding() {
        return Optional.ofNullable(this.regarding);
    }
    /**
     * @return Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    public Optional<ObjectReference> related() {
        return Optional.ofNullable(this.related);
    }
    /**
     * @return Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     * 
     */
    public Optional<String> reportingController() {
        return Optional.ofNullable(this.reportingController);
    }
    /**
     * @return ID of the controller instance, e.g. `kubelet-xyzf`.
     * 
     */
    public Optional<String> reportingInstance() {
        return Optional.ofNullable(this.reportingInstance);
    }
    /**
     * @return Data about the Event series this event represents or nil if it&#39;s a singleton Event.
     * 
     */
    public Optional<EventSeries> series() {
        return Optional.ofNullable(this.series);
    }
    /**
     * @return Type of this event (Normal, Warning), new types could be added in the future.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Event defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable String apiVersion;
        private @Nullable Integer deprecatedCount;
        private @Nullable String deprecatedFirstTimestamp;
        private @Nullable String deprecatedLastTimestamp;
        private @Nullable EventSource deprecatedSource;
        private String eventTime;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String note;
        private @Nullable String reason;
        private @Nullable ObjectReference regarding;
        private @Nullable ObjectReference related;
        private @Nullable String reportingController;
        private @Nullable String reportingInstance;
        private @Nullable EventSeries series;
        private @Nullable String type;
        public Builder() {}
        public Builder(Event defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.apiVersion = defaults.apiVersion;
    	      this.deprecatedCount = defaults.deprecatedCount;
    	      this.deprecatedFirstTimestamp = defaults.deprecatedFirstTimestamp;
    	      this.deprecatedLastTimestamp = defaults.deprecatedLastTimestamp;
    	      this.deprecatedSource = defaults.deprecatedSource;
    	      this.eventTime = defaults.eventTime;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.note = defaults.note;
    	      this.reason = defaults.reason;
    	      this.regarding = defaults.regarding;
    	      this.related = defaults.related;
    	      this.reportingController = defaults.reportingController;
    	      this.reportingInstance = defaults.reportingInstance;
    	      this.series = defaults.series;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedSource(@Nullable EventSource deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }
        @CustomType.Setter
        public Builder eventTime(String eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder note(@Nullable String note) {
            this.note = note;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder regarding(@Nullable ObjectReference regarding) {
            this.regarding = regarding;
            return this;
        }
        @CustomType.Setter
        public Builder related(@Nullable ObjectReference related) {
            this.related = related;
            return this;
        }
        @CustomType.Setter
        public Builder reportingController(@Nullable String reportingController) {
            this.reportingController = reportingController;
            return this;
        }
        @CustomType.Setter
        public Builder reportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }
        @CustomType.Setter
        public Builder series(@Nullable EventSeries series) {
            this.series = series;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Event build() {
            final var o = new Event();
            o.action = action;
            o.apiVersion = apiVersion;
            o.deprecatedCount = deprecatedCount;
            o.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            o.deprecatedLastTimestamp = deprecatedLastTimestamp;
            o.deprecatedSource = deprecatedSource;
            o.eventTime = eventTime;
            o.kind = kind;
            o.metadata = metadata;
            o.note = note;
            o.reason = reason;
            o.regarding = regarding;
            o.related = related;
            o.reportingController = reportingController;
            o.reportingInstance = reportingInstance;
            o.series = series;
            o.type = type;
            return o;
        }
    }
}