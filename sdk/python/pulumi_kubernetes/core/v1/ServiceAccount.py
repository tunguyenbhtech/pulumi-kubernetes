# *** WARNING: this file was generated by the Pulumi Kubernetes codegen tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
from typing import Optional

import pulumi
import pulumi.runtime
from pulumi import Input, ResourceOptions

from ... import tables, version


class ServiceAccount(pulumi.CustomResource):
    """
    ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems,
    for an identity * a principal that can be authenticated and authorized * a set of secrets
    """

    apiVersion: pulumi.Output[str]
    """
    APIVersion defines the versioned schema of this representation of an object. Servers should
    convert recognized schemas to the latest internal value, and may reject unrecognized values.
    More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    """

    kind: pulumi.Output[str]
    """
    Kind is a string value representing the REST resource this object represents. Servers may infer
    this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
    info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    """

    automount_service_account_token: pulumi.Output[bool]
    """
    AutomountServiceAccountToken indicates whether pods running as this service account should have
    an API token automatically mounted. Can be overridden at the pod level.
    """

    image_pull_secrets: pulumi.Output[list]
    """
    ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any
    images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets
    because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the
    kubelet. More info:
    https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    """

    metadata: pulumi.Output[dict]
    """
    Standard object's metadata. More info:
    https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    """

    secrets: pulumi.Output[list]
    """
    Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount.
    More info: https://kubernetes.io/docs/concepts/configuration/secret
    """

    def __init__(self, resource_name, opts=None, automount_service_account_token=None, image_pull_secrets=None, metadata=None, secrets=None, __name__=None, __opts__=None):
        """
        Create a ServiceAccount resource with the given unique name, arguments, and options.

        :param str resource_name: The _unique_ name of the resource.
        :param pulumi.ResourceOptions opts: A bag of options that control this resource's behavior.
        :param pulumi.Input[bool] automount_service_account_token: AutomountServiceAccountToken indicates whether pods running as this service account
               should have an API token automatically mounted. Can be overridden at the pod level.
        :param pulumi.Input[list] image_pull_secrets: ImagePullSecrets is a list of references to secrets in the same namespace to use for
               pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
               distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets
               are only accessed by the kubelet. More info:
               https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
        :param pulumi.Input[dict] metadata: Standard object's metadata. More info:
               https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        :param pulumi.Input[list] secrets: Secrets is the list of secrets allowed to be used by pods running using this
               ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['apiVersion'] = 'v1'
        __props__['kind'] = 'ServiceAccount'
        __props__['automountServiceAccountToken'] = automount_service_account_token
        __props__['imagePullSecrets'] = image_pull_secrets
        __props__['metadata'] = metadata
        __props__['secrets'] = secrets

        __props__['status'] = None

        additional_secret_outputs = [
        ]

        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(
            version=version.get_version(), additional_secret_outputs=additional_secret_outputs))

        parent = opts.parent if opts and opts.parent else None
        aliases = [
        ]

        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(
            version=version.get_version(), aliases=aliases))

        super(ServiceAccount, self).__init__(
            "kubernetes:core/v1:ServiceAccount",
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None):
        """
        Get the state of an existing `ServiceAccount` resource, as identified by `id`.
        The ID is of the form `[namespace]/[name]`; if `[namespace]` is omitted,
        then (per Kubernetes convention) the ID becomes `default/[name]`.

        Pulumi will keep track of this resource using `resource_name` as the Pulumi ID.

        :param str resource_name: _Unique_ name used to register this resource with Pulumi.
        :param pulumi.Input[str] id: An ID for the Kubernetes resource to retrieve.
               Takes the form `[namespace]/[name]` or `[name]`.
        :param Optional[pulumi.ResourceOptions] opts: A bag of options that control this
               resource's behavior.
        """
        opts = ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))
        return ServiceAccount(resource_name, opts)

    def translate_output_property(self, prop: str) -> str:
        return tables._CASING_FORWARD_TABLE.get(prop) or prop

    def translate_input_property(self, prop: str) -> str:
        return tables._CASING_BACKWARD_TABLE.get(prop) or prop
