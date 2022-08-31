// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.ExecActionPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.HTTPGetActionPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.TCPSocketActionPatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 * 
 */
public final class LifecycleHandlerPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecycleHandlerPatchArgs Empty = new LifecycleHandlerPatchArgs();

    /**
     * Exec specifies the action to take.
     * 
     */
    @Import(name="exec")
    private @Nullable Output<ExecActionPatchArgs> exec;

    /**
     * @return Exec specifies the action to take.
     * 
     */
    public Optional<Output<ExecActionPatchArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    @Import(name="httpGet")
    private @Nullable Output<HTTPGetActionPatchArgs> httpGet;

    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<Output<HTTPGetActionPatchArgs>> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    @Import(name="tcpSocket")
    private @Nullable Output<TCPSocketActionPatchArgs> tcpSocket;

    /**
     * @return Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    public Optional<Output<TCPSocketActionPatchArgs>> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }

    private LifecycleHandlerPatchArgs() {}

    private LifecycleHandlerPatchArgs(LifecycleHandlerPatchArgs $) {
        this.exec = $.exec;
        this.httpGet = $.httpGet;
        this.tcpSocket = $.tcpSocket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleHandlerPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleHandlerPatchArgs $;

        public Builder() {
            $ = new LifecycleHandlerPatchArgs();
        }

        public Builder(LifecycleHandlerPatchArgs defaults) {
            $ = new LifecycleHandlerPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exec Exec specifies the action to take.
         * 
         * @return builder
         * 
         */
        public Builder exec(@Nullable Output<ExecActionPatchArgs> exec) {
            $.exec = exec;
            return this;
        }

        /**
         * @param exec Exec specifies the action to take.
         * 
         * @return builder
         * 
         */
        public Builder exec(ExecActionPatchArgs exec) {
            return exec(Output.of(exec));
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(@Nullable Output<HTTPGetActionPatchArgs> httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(HTTPGetActionPatchArgs httpGet) {
            return httpGet(Output.of(httpGet));
        }

        /**
         * @param tcpSocket Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
         * 
         * @return builder
         * 
         */
        public Builder tcpSocket(@Nullable Output<TCPSocketActionPatchArgs> tcpSocket) {
            $.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * @param tcpSocket Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
         * 
         * @return builder
         * 
         */
        public Builder tcpSocket(TCPSocketActionPatchArgs tcpSocket) {
            return tcpSocket(Output.of(tcpSocket));
        }

        public LifecycleHandlerPatchArgs build() {
            return $;
        }
    }

}