// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;
using System.Text.Json;
using System.Text.Json.Serialization;
using Pulumi.Kubernetes.Yaml;
using Pulumi.Utilities;
using Pu = Pulumi;

namespace Pulumi.Kubernetes.Helm.V3
{
    /// <summary>
    /// Chart is a component representing a collection of resources described by an arbitrary Helm
    /// Chart. The Chart can be fetched from any source that is accessible to the `helm` command
    /// line. Values in the `values.yml` file can be overridden using
    /// <see cref="BaseChartArgsUnwrap.Values" /> (equivalent to `--set` or having multiple
    /// `values.yml` files). Objects can be transformed arbitrarily by supplying callbacks to
    /// <see cref="BaseChartArgsUnwrap.Transformations" />.
    /// <para />
    /// <see cref="Chart"/> does not use Tiller. The Chart specified is copied and expanded locally;
    /// the semantics are equivalent to running `helm template` and then using Pulumi to manage the
    /// resulting YAML manifests. Any values that would be retrieved in-cluster are assigned fake
    /// values, and none of Tiller's server-side validity testing is executed.
    ///
    /// ## Example Usage
    /// ### Local Chart Directory
    ///
    /// ```csharp
    /// using System.Threading.Tasks;
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Helm;
    /// using Pulumi.Kubernetes.Helm.V3;
    ///
    /// class HelmStack : Stack
    /// {
    ///     public HelmStack()
    ///     {
    ///         var nginx = new Chart("nginx-ingress", new LocalChartArgs
    ///         {
    ///             Path = "./nginx-ingress",
    ///         });
    ///
    ///     }
    /// }
    /// ```
    /// ### Remote Chart
    ///
    /// ```csharp
    /// using System.Threading.Tasks;
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Helm;
    /// using Pulumi.Kubernetes.Helm.V3;
    ///
    /// class HelmStack : Stack
    /// {
    ///     public HelmStack()
    ///     {
    ///         var nginx = new Chart("nginx-ingress", new ChartArgs
    ///         {
    ///             Chart = "nginx-ingress",
    ///             Version = "1.24.4",
    ///             FetchOptions = new ChartFetchArgs
    ///             {
    ///                 Repo = "https://kubernetes-charts.storage.googleapis.com/"
    ///             }
    ///         });
    ///
    ///     }
    /// }
    /// ```
    /// ### Set Chart Values
    ///
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Threading.Tasks;
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Helm;
    /// using Pulumi.Kubernetes.Helm.V3;
    ///
    /// class HelmStack : Stack
    /// {
    ///     public HelmStack()
    ///     {
    ///         var values = new Dictionary&lt;string, object&gt;
    ///         {
    ///             ["controller"] = new Dictionary&lt;string, object&gt;
    ///             {
    ///                 ["metrics"] = new Dictionary&lt;string, object&gt;
    ///                 {
    ///                     ["enabled"] = true
    ///                 }
    ///             },
    ///         };
    ///
    ///         var nginx = new Chart("nginx-ingress", new ChartArgs
    ///         {
    ///             Chart = "nginx-ingress",
    ///             Version = "1.24.4",
    ///             FetchOptions = new ChartFetchArgs
    ///             {
    ///                 Repo = "https://kubernetes-charts.storage.googleapis.com/"
    ///             },
    ///             Values = values,
    ///         });
    ///
    ///     }
    /// }
    /// ```
    /// ### Deploy Chart into Namespace
    ///
    /// ```csharp
    /// using System.Threading.Tasks;
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Helm;
    /// using Pulumi.Kubernetes.Helm.V3;
    ///
    /// class HelmStack : Stack
    /// {
    ///     public HelmStack()
    ///     {
    ///         var nginx = new Chart("nginx-ingress", new ChartArgs
    ///         {
    ///             Chart = "nginx-ingress",
    ///             Version = "1.24.4",
    ///             Namespace = "test-namespace",
    ///             FetchOptions = new ChartFetchArgs
    ///             {
    ///                 Repo = "https://kubernetes-charts.storage.googleapis.com/"
    ///             },
    ///         });
    ///
    ///     }
    /// }
    /// ```
    /// ### Chart with Transformations
    ///
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Collections.Immutable;
    /// using System.Threading.Tasks;
    /// using Pulumi;
    /// using Pulumi.Kubernetes.Helm;
    /// using Pulumi.Kubernetes.Helm.V3;
    ///
    /// class HelmStack : Stack
    /// {
    ///     public HelmStack()
    ///     {
    ///         var nginx = new Chart("nginx-ingress", new ChartArgs
    ///         {
    ///             Chart = "nginx-ingress",
    ///             Version = "1.24.4",
    ///             FetchOptions = new ChartFetchArgs
    ///             {
    ///                 Repo = "https://kubernetes-charts.storage.googleapis.com/"
    ///             },
    ///             Transformations =
    ///             {
    ///                 LoadBalancerToClusterIP,
    ///                 ResourceAlias,
    ///                 OmitTestPod,
    ///             }
    ///
    ///         });
    ///
    ///         // Make every service private to the cluster, i.e., turn all services into ClusterIP instead of LoadBalancer.
    ///         ImmutableDictionary&lt;string, object&gt; LoadBalancerToClusterIP(ImmutableDictionary&lt;string, object&gt; obj, CustomResourceOptions opts)
    ///         {
    ///             if ((string)obj["kind"] == "Service" &amp;&amp; (string)obj["apiVersion"] == "v1")
    ///             {
    ///                 var spec = (ImmutableDictionary&lt;string, object&gt;)obj["spec"];
    ///                 if (spec != null &amp;&amp; (string)spec["type"] == "LoadBalancer")
    ///                 {
    ///                     return obj.SetItem("spec", spec.SetItem("type", "ClusterIP"));
    ///                 }
    ///             }
    ///
    ///             return obj;
    ///         }
    ///
    ///         // Set a resource alias for a previous name.
    ///         ImmutableDictionary&lt;string, object&gt; ResourceAlias(ImmutableDictionary&lt;string, object&gt; obj, CustomResourceOptions opts)
    ///         {
    ///             if ((string)obj["kind"] == "Deployment")
    ///             {
    ///                 opts.Aliases.Add(new Alias { Name = "oldName" });
    ///             }
    ///
    ///             return obj;
    ///         }
    ///
    ///         // Omit a resource from the Chart by transforming the specified resource definition to an empty List.
    ///         ImmutableDictionary&lt;string, object&gt; OmitTestPod(ImmutableDictionary&lt;string, object&gt; obj, CustomResourceOptions opts)
    ///         {
    ///             var metadata = (ImmutableDictionary&lt;string, object&gt;)obj["metadata"];
    ///             if ((string)obj["kind"] == "Pod" &amp;&amp; (string)metadata["name"] == "test")
    ///             {
    ///                 return new Dictionary&lt;string, object&gt;
    ///                 {
    ///                     ["apiVersion"] = "v1",
    ///                     ["kind"] = "List",
    ///                     ["items"] = new Dictionary&lt;string, object&gt;(),
    ///                 }.ToImmutableDictionary();
    ///             }
    ///
    ///             return obj;
    ///         }
    ///     }
    /// }
    /// ```
    /// </summary>
    public sealed class Chart : CollectionComponentResource
    {
        /// <summary>
        /// Create a Chart resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="releaseName">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Chart(string releaseName, Union<ChartArgs, LocalChartArgs> args, ComponentResourceOptions? options = null)
            : base("kubernetes:helm.sh/v3:Chart", GetName(args, releaseName), MakeResourceOptions(options))
        {
            releaseName = GetName(args, releaseName);
            var config = args.Unwrap();

            var configDeps = Output.Create(OutputUtilities.GetDependenciesAsync(config));
            OutputUtilities.GetIsKnownAsync(config).ContinueWith(isKnown =>
            {
                if (!isKnown.Result)
                {
                    // Note that this can only happen during a preview.
                    Log.Info("[Can't preview] all chart values must be known ahead of time to generate an accurate preview.", this);
                }
            });

            var resources = Output.Tuple(config, configDeps).Apply(values =>
            {
                var chartArgs = values.Item1;
                var dependencies = values.Item2;

                try
                {
                    return ParseTemplate(chartArgs, releaseName, dependencies, options);
                }
                catch (Exception e)
                {
                    // Shed stack trace, only emit the error.
                    throw new ResourceException(e.Message, this);
                }
            });
            RegisterResources(resources);
        }

        private static ComponentResourceOptions MakeResourceOptions(ComponentResourceOptions? options)
        {
            var defaultOptions = new ComponentResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new Pulumi.Alias { Type = "kubernetes:helm.sh/v2:Chart"},
                },
            };
            var merged = ComponentResourceOptions.Merge(defaultOptions, options);
            return merged;
        }

        private static string GetName(Union<ChartArgs, LocalChartArgs> config, string releaseName)
        {
            var prefix = config.Match(v => v.ResourcePrefix, v => v.ResourcePrefix);
            return string.IsNullOrEmpty(prefix) ? releaseName : $"{prefix}-{releaseName}";
        }

        private Output<ImmutableDictionary<string, KubernetesResource>> ParseTemplate(Union<ChartArgsUnwrap, LocalChartArgsUnwrap> args, string releaseName, ImmutableHashSet<Pu.Resource> dependsOn, ComponentResourceOptions? options)
        {
            // Build JSON args to Helm provider invoke.
            var serializeOptions = new JsonSerializerOptions
            {
                IgnoreNullValues = true,
            };

            BaseChartArgsUnwrap cfgBase;

            // Convert args to JSON string format expected by the invoke function.
            JsonOpts jsonOpts;
            string jsonOptsString;

            if (args.IsT0)
            {
                var cfg = args.AsT0;
                cfgBase = cfg;
                jsonOpts = new JsonOpts
                {
                    ApiVersions = cfgBase.ApiVersions,
                    IncludeTestHookResources = cfgBase.IncludeTestHookResources,
                    SkipCRDRendering = cfgBase.SkipCRDRendering,
                    Namespace = cfgBase.Namespace,
                    Values = cfgBase.Values,
                    KubeVersion = cfgBase.KubeVersion,
                    ReleaseName = releaseName,
                    Repo = cfg.Repo,
                    Chart = cfg.Chart,
                    Version = cfg.Version,
                };
                if (cfg.FetchOptions != null)
                {
                    jsonOpts.FetchOptions = new JsonOptsFetch
                    {
                        Version = cfg.FetchOptions.Version,
                        CAFile = cfg.FetchOptions.CAFile,
                        CertFile = cfg.FetchOptions.CertFile,
                        KeyFile = cfg.FetchOptions.KeyFile,
                        Destination = cfg.FetchOptions.Destination,
                        Keyring = cfg.FetchOptions.Keyring,
                        Password = cfg.FetchOptions.Password,
                        Repo = cfg.FetchOptions.Repo,
                        UntarDir = cfg.FetchOptions.UntarDir,
                        Username = cfg.FetchOptions.Username,
                        Home = cfg.FetchOptions.Home,
                        Devel = cfg.FetchOptions.Devel,
                        Prov = cfg.FetchOptions.Prov,
                        Untar = cfg.FetchOptions.Untar,
                        Verify = cfg.FetchOptions.Verify,
                    };
                }
            }
            else
            {
                var cfg = args.AsT1;
                cfgBase = cfg;
                jsonOpts = new JsonOpts
                {
                    ApiVersions = cfgBase.ApiVersions,
                    IncludeTestHookResources = cfgBase.IncludeTestHookResources,
                    SkipCRDRendering = cfgBase.SkipCRDRendering,
                    Namespace = cfgBase.Namespace,
                    Values = cfgBase.Values,
                    KubeVersion = cfgBase.KubeVersion,
                    ReleaseName = releaseName,
                    Path = cfg.Path,
                };
            }
            jsonOptsString = JsonSerializer.Serialize(jsonOpts, serializeOptions);

            var childOpts = GetChildOptions(this, dependsOn.ToArray(), options);
            var invokeOpts = GetInvokeOptions(childOpts);
            return Invokes
                .HelmTemplate(new HelmTemplateArgs { JsonOpts = jsonOptsString }, invokeOpts)
                .Apply(objs =>
                {
                    var transformations = cfgBase.Transformations;
                    if (cfgBase.SkipAwait == true)
                    {
                        transformations = transformations.Append(Parser.SkipAwait).ToList();
                    }
                    return Parser.ParseYamlObjects(new ParseArgs
                    {
                        Objs = objs,
                        Transformations = transformations,
                        ResourcePrefix = cfgBase.ResourcePrefix
                    }, childOpts);
                });
        }

        internal class JsonOpts
        {
            [JsonPropertyName("api_versions")]
            public ImmutableArray<string> ApiVersions { get; set; }
            [JsonPropertyName("include_test_hook_resources")]
            public bool? IncludeTestHookResources { get; set; }
            [JsonPropertyName("skip_crd_rendering")]
            public bool? SkipCRDRendering { get; set; }
            [JsonPropertyName("namespace")]
            public string? Namespace { get; set; }
            [JsonPropertyName("values")]
            public ImmutableDictionary<string, object> Values { get; set; } = null!;
            [JsonPropertyName("repo")]
            public string? Repo { get; set; }
            [JsonPropertyName("chart")]
            public string? Chart { get; set; }
            [JsonPropertyName("version")]
            public string? KubeVersion { get; set; }
            [JsonPropertyName("kube_version")]
            public string? Version { get; set; }
            [JsonPropertyName("fetch_opts")]
            public JsonOptsFetch? FetchOptions { get; set; }
            [JsonPropertyName("path")]
            public string? Path { get; set; }
            [JsonPropertyName("release_name")]
            public string? ReleaseName { get; set; }
        }
        internal class JsonOptsFetch
        {
            [JsonPropertyName("version")]
            public string? Version { get; set; }
            [JsonPropertyName("ca_file")]
            public string? CAFile { get; set; }
            [JsonPropertyName("cert_file")]
            public string? CertFile { get; set; }
            [JsonPropertyName("key_file")]
            public string? KeyFile { get; set; }
            [JsonPropertyName("destination")]
            public string? Destination { get; set; }
            [JsonPropertyName("keyring")]
            public string? Keyring { get; set; }
            [JsonPropertyName("password")]
            public string? Password { get; set; }
            [JsonPropertyName("repo")]
            public string? Repo { get; set; }
            [JsonPropertyName("untar_dir")]
            public string? UntarDir { get; set; }
            [JsonPropertyName("username")]
            public string? Username { get; set; }
            [JsonPropertyName("home")]
            public string? Home { get; set; }
            [JsonPropertyName("devel")]
            public bool? Devel { get; set; }
            [JsonPropertyName("prov")]
            public bool? Prov { get; set; }
            [JsonPropertyName("untar")]
            public bool? Untar { get; set; }
            [JsonPropertyName("verify")]
            public bool? Verify { get; set; }
        }
    }
}
