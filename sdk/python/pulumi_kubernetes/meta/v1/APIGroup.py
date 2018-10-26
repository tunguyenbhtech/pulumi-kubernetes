import pulumi
import pulumi.runtime

class APIGroup(pulumi.CustomResource):
    """
    APIGroup contains the name, the supported versions, and the preferred version of a group.
    """
    def __init__(self, __name__, __opts__=None, name=None, preferredVersion=None, serverAddressByClientCIDRs=None, versions=None):
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, str):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['apiVersion'] = 'v1'
        self.apiVersion = 'v1'

        __props__['kind'] = 'APIGroup'
        self.kind = 'APIGroup'

        if not name:
            raise TypeError('Missing required property name')
        elif not isinstance(name, str):
            raise TypeError('Expected property aliases to be a str')
        self.name = name
        """
        name is the name of the group.
        """
        __props__['name'] = name

        if not serverAddressByClientCIDRs:
            raise TypeError('Missing required property serverAddressByClientCIDRs')
        elif not isinstance(serverAddressByClientCIDRs, list):
            raise TypeError('Expected property aliases to be a list')
        self.serverAddressByClientCIDRs = serverAddressByClientCIDRs
        """
        a map of client CIDR to server address that is serving this group. This is to help clients
        reach servers in the most network-efficient way possible. Clients can use the appropriate
        server address as per the CIDR that they match. In case of multiple matches, clients should
        use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
        client can match. For example: the master will return an internal IP CIDR only, if the
        client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
        X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
        """
        __props__['serverAddressByClientCIDRs'] = serverAddressByClientCIDRs

        if not versions:
            raise TypeError('Missing required property versions')
        elif not isinstance(versions, list):
            raise TypeError('Expected property aliases to be a list')
        self.versions = versions
        """
        versions are the versions supported in this group.
        """
        __props__['versions'] = versions

        if preferredVersion and not isinstance(preferredVersion, dict):
            raise TypeError('Expected property aliases to be a dict')
        self.preferredVersion = preferredVersion
        """
        preferredVersion is the version preferred by the API server, which probably is the storage
        version.
        """
        __props__['preferredVersion'] = preferredVersion

        super(APIGroup, self).__init__(
            "kubernetes:core/v1:APIGroup",
            __name__,
            __props__,
            __opts__)
