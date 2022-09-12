miko@imac specs % openapi-generator-cli help generate
Usage: openapi-generator-cli generate [options]

Generate code with the specified generator.

Options:
  --generator-key <generator...>  Run generator by key. Separate by comma to run many generators

NAME
        openapi-generator-cli generate - Generate code with the specified
        generator.

SYNOPSIS
        openapi-generator-cli generate
                [(-a <authorization> | --auth <authorization>)]
                [--api-name-suffix <api name suffix>] [--api-package <api package>]
                [--artifact-id <artifact id>] [--artifact-version <artifact version>]
                [(-c <configuration file> | --config <configuration file>)] [--dry-run]
                [(-e <templating engine> | --engine <templating engine>)]
                [--enable-post-process-file]
                [(-g <generator name> | --generator-name <generator name>)]
                [--generate-alias-as-model] [--git-host <git host>]
                [--git-repo-id <git repo id>] [--git-user-id <git user id>]
                [--global-property <global properties>...] [--group-id <group id>]
                [--http-user-agent <http user agent>]
                [(-i <spec file> | --input-spec <spec file>)]
                [--ignore-file-override <ignore file override location>]
                [--import-mappings <import mappings>...]
                [--inline-schema-name-defaults <inline schema name defaults>...]
                [--inline-schema-name-mappings <inline schema name mappings>...]
                [--instantiation-types <instantiation types>...]
                [--invoker-package <invoker package>]
                [--language-specific-primitives <language specific primitives>...]
                [--legacy-discriminator-behavior] [--library <library>]
                [--log-to-stderr] [--minimal-update]
                [--model-name-prefix <model name prefix>]
                [--model-name-suffix <model name suffix>]
                [--model-package <model package>]
                [(-o <output directory> | --output <output directory>)] [(-p <additional properties> | --additional-properties <additional properties>)...]
                [--package-name <package name>] [--release-note <release note>]
                [--remove-operation-id-prefix]
                [--reserved-words-mappings <reserved word mappings>...]
                [(-s | --skip-overwrite)] [--schema-mappings <schema mappings>...]
                [--server-variables <server variables>...] [--skip-operation-example]
                [--skip-validate-spec] [--strict-spec <true/false strict behavior>]
                [(-t <template directory> | --template-dir <template directory>)]
                [--type-mappings <type mappings>...] [(-v | --verbose)]

OPTIONS
        -a <authorization>, --auth <authorization>
            adds authorization headers when fetching the OpenAPI definitions
            remotely. Pass in a URL-encoded string of name:header with a comma
            separating multiple values

        --api-name-suffix <api name suffix>
            Suffix that will be appended to all API names ('tags'). Default:
            Api. e.g. Pet => PetApi. Note: Only ruby, python, jaxrs generators
            support this feature at the moment.

        --api-package <api package>
            package for generated api classes

        --artifact-id <artifact id>
            artifactId in generated pom.xml. This also becomes part of the
            generated library's filename

        --artifact-version <artifact version>
            artifact version in generated pom.xml. This also becomes part of the
            generated library's filename

        -c <configuration file>, --config <configuration file>
            Path to configuration file. It can be JSON or YAML. If file is JSON,
            the content should have the format {"optionKey":"optionValue",
            "optionKey1":"optionValue1"...}. If file is YAML, the content should
            have the format optionKey: optionValue. Supported options can be
            different for each language. Run config-help -g {generator name}
            command for language-specific config options.

        --dry-run
            Try things out and report on potential changes (without actually
            making changes).

        -e <templating engine>, --engine <templating engine>
            templating engine: "mustache" (default) or "handlebars" (beta)

        --enable-post-process-file
            Enable post-processing file using environment variables.

        -g <generator name>, --generator-name <generator name>
            generator to use (see list command for list)

        --generate-alias-as-model
            Generate model implementation for aliases to map and array schemas.
            An 'alias' is an array, map, or list which is defined inline in a
            OpenAPI document and becomes a model in the generated code. A 'map'
            schema is an object that can have undeclared properties, i.e. the
            'additionalproperties' attribute is set on that object. An 'array'
            schema is a list of sub schemas in a OAS document

        --git-host <git host>
            Git host, e.g. gitlab.com.

        --git-repo-id <git repo id>
            Git repo ID, e.g. openapi-generator.

        --git-user-id <git user id>
            Git user ID, e.g. openapitools.

        --global-property <global properties>
            sets specified global properties (previously called 'system
            properties') in the format of name=value,name=value (or multiple
            options, each with name=value)

        --group-id <group id>
            groupId in generated pom.xml

        --http-user-agent <http user agent>
            HTTP user agent, e.g. codegen_csharp_api_client, default to
            'OpenAPI-Generator/{packageVersion}/{language}'

        -i <spec file>, --input-spec <spec file>
            location of the OpenAPI spec, as URL or file (required if not loaded
            via config using -c)

        --ignore-file-override <ignore file override location>
            Specifies an override location for the .openapi-generator-ignore
            file. Most useful on initial generation.

        --import-mappings <import mappings>
            specifies mappings between a given class and the import that should
            be used for that class in the format of type=import,type=import. You
            can also have multiple occurrences of this option.

        --inline-schema-name-defaults <inline schema name defaults>
            specifies the default values used when naming inline schema as such
            array items in the format of
            arrayItemSuffix=_inner,mapItemSuffix=_value. ONLY arrayItemSuffix,
            mapItemSuffix at the moment.

        --inline-schema-name-mappings <inline schema name mappings>
            specifies mappings between the inline schema name and the new name
            in the format of inline_object_2=Cat,inline_object_5=Bird. You can
            also have multiple occurrences of this option.

        --instantiation-types <instantiation types>
            sets instantiation type mappings in the format of
            type=instantiatedType,type=instantiatedType.For example (in Java):
            array=ArrayList,map=HashMap. In other words array types will get
            instantiated as ArrayList in generated code. You can also have
            multiple occurrences of this option.

        --invoker-package <invoker package>
            root package for generated code

        --language-specific-primitives <language specific primitives>
            specifies additional language specific primitive types in the format
            of type1,type2,type3,type3. For example:
            String,boolean,Boolean,Double. You can also have multiple
            occurrences of this option.

        --legacy-discriminator-behavior
            Set to false for generators with better support for discriminators.
            (Python, Java, Go, PowerShell, C#have this enabled by default).

        --library <library>
            library template (sub-template)

        --log-to-stderr
            write all log messages (not just errors) to STDOUT. Useful for
            piping the JSON output of debug options (e.g. `--global-property
            debugOperations`) to an external parser directly while testing a
            generator.

        --minimal-update
            Only write output files that have changed.

        --model-name-prefix <model name prefix>
            Prefix that will be prepended to all model names.

        --model-name-suffix <model name suffix>
            Suffix that will be appended to all model names.

        --model-package <model package>
            package for generated models

        -o <output directory>, --output <output directory>
            where to write the generated files (current dir by default)

        -p <additional properties>, --additional-properties <additional
        properties>
            sets additional properties that can be referenced by the mustache
            templates in the format of name=value,name=value. You can also have
            multiple occurrences of this option.

        --package-name <package name>
            package for generated classes (where supported)

        --release-note <release note>
            Release note, default to 'Minor update'.

        --remove-operation-id-prefix
            Remove prefix of operationId, e.g. config_getId => getId

        --reserved-words-mappings <reserved word mappings>
            specifies how a reserved name should be escaped to. Otherwise, the
            default _<name> is used. For example id=identifier. You can also
            have multiple occurrences of this option.

        -s, --skip-overwrite
            specifies if the existing files should be overwritten during the
            generation.

        --schema-mappings <schema mappings>
            specifies mappings between the schema and the new name in the format
            of schema_a=Cat,schema_b=Bird. You can also have multiple
            occurrences of this option.

        --server-variables <server variables>
            sets server variables overrides for spec documents which support
            variable templating of servers.

        --skip-operation-example
            Skip examples defined in operations to avoid out of memory errors.

        --skip-validate-spec
            Skips the default behavior of validating an input specification.

        --strict-spec <true/false strict behavior>
            'MUST' and 'SHALL' wording in OpenAPI spec is strictly adhered to.
            e.g. when false, no fixes will be applied to documents which pass
            validation but don't follow the spec.

        -t <template directory>, --template-dir <template directory>
            folder containing the template files

        --type-mappings <type mappings>
            sets mappings between OpenAPI spec types and generated code types in
            the format of OpenAPIType=generatedType,OpenAPIType=generatedType.
            For example: array=List,map=Map,string=String. You can also have
            multiple occurrences of this option. To map a specified format, use
            type+format, e.g. string+password=EncryptedString will map `type:
            string, format: password` to `EncryptedString`.

        -v, --verbose
            verbose mode


            ONFIG OPTIONS

        additionalEnumTypeAnnotations
            Additional annotations for enum type(class level annotations)

        additionalModelTypeAnnotations
            Additional annotations for model type(class level annotations). List separated by semicolon(;) or new line (Linux or Windows)

        allowUnicodeIdentifiers
            boolean, toggles whether unicode identifiers are allowed in names or not, default is false (Default: false)

        annotationLibrary
            Select the complementary documentation annotation library. (Default: swagger2)
                none - Do not annotate Model and Api with complementary annotations.
                swagger1 - Annotate Model and Api using the Swagger Annotations 1.x library.
                swagger2 - Annotate Model and Api using the Swagger Annotations 2.x library.

        apiFirst
            Generate the API from the OAI spec at server compile time (API first approach) (Default: false)

        apiPackage
            package for generated api classes (Default: org.openapitools.api)

        artifactDescription
            artifact description in generated pom.xml (Default: OpenAPI Java)

        artifactId
            artifactId in generated pom.xml. This also becomes part of the generated library's filename (Default: openapi-spring)

        artifactUrl
            artifact URL in generated pom.xml (Default: https://github.com/openapitools/openapi-generator)

        artifactVersion
            artifact version in generated pom.xml. This also becomes part of the generated library's filename (Default: 1.0.0)

        async
            use async Callable controllers (Default: false)

        basePackage
            base package (invokerPackage) for generated code (Default: org.openapitools)

        bigDecimalAsString
            Treat BigDecimal values as Strings to avoid precision loss. (Default: false)

        booleanGetterPrefix
            Set booleanGetterPrefix (Default: get)

        configPackage
            configuration package for generated code (Default: org.openapitools.configuration)

        dateLibrary
            Option. Date library to use (Default: java8)
                joda - Joda (for legacy app only)
                legacy - Legacy java.util.Date
                java8-localdatetime - Java 8 using LocalDateTime (for legacy app only)
                java8 - Java 8 native JSR310 (preferred for jdk 1.8+)

        delegatePattern
            Whether to generate the server files using the delegate pattern (Default: false)

        developerEmail
            developer email in generated pom.xml (Default: team@openapitools.org)

        developerName
            developer name in generated pom.xml (Default: OpenAPI-Generator Contributors)

        developerOrganization
            developer organization in generated pom.xml (Default: OpenAPITools.org)

        developerOrganizationUrl
            developer organization URL in generated pom.xml (Default: http://openapitools.org)

        disableHtmlEscaping
            Disable HTML escaping of JSON strings when using gson (needed to avoid problems with byte[] fields) (Default: false)

        disallowAdditionalPropertiesIfNotPresent
            If false, the 'additionalProperties' implementation (set to true by default) is compliant with the OAS and JSON schema specifications. If true (default), keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default. (Default: true)
                false - The 'additionalProperties' implementation is compliant with the OAS and JSON schema specifications.
                true - Keep the old (incorrect) behaviour that 'additionalProperties' is set to false by default.

        discriminatorCaseSensitive
            Whether the discriminator value lookup should be case-sensitive or not. This option only works for Java API client (Default: true)

        documentationProvider
            Select the OpenAPI documentation provider. (Default: springdoc)
                none - Do not publish an OpenAPI specification.
                source - Publish the original input OpenAPI specification.
                springfox - Generate an OpenAPI 2 (fka Swagger RESTful API Documentation Specification) specification using SpringFox 2.x. Deprecated (for removal); use springdoc instead.
                springdoc - Generate an OpenAPI 3 specification using SpringDoc.

        ensureUniqueParams
            Whether to ensure parameter names are unique in an operation (rename parameters that are not). (Default: true)

        enumUnknownDefaultCase
            If the server adds new enum cases, that are unknown by an old spec/client, the client will fail to parse the network response.With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the server sends an enum case that is not known by the client/spec, they can safely fallback to this case. (Default: false)
                false - No changes to the enum's are made, this is the default option.
                true - With this option enabled, each enum will have a new case, 'unknown_default_open_api', so that when the enum case sent by the server is not known by the client/spec, can safely be decoded to this case.

        fullJavaUtil
            whether to use fully qualified name for classes under java.util. This option only works for Java API client (Default: false)

        groupId
            groupId in generated pom.xml (Default: org.openapitools)

        hateoas
            Use Spring HATEOAS library to allow adding HATEOAS links (Default: false)

        hideGenerationTimestamp
            Hides the generation timestamp when files are generated. (Default: false)

        ignoreAnyOfInEnum
            Ignore anyOf keyword in enum (Default: false)

        implicitHeaders
            Skip header parameters in the generated API methods using @ApiImplicitParams annotation. (Default: false)

        implicitHeadersRegex
            Skip header parameters that matches given regex in the generated API methods using @ApiImplicitParams annotation. Note: this parameter is ignored when implicitHeaders=true

        interfaceOnly
            Whether to generate only API interface stubs without the server files. (Default: false)

        invokerPackage
            root package for generated code (Default: org.openapitools.api)

        legacyDiscriminatorBehavior
            Set to false for generators with better support for discriminators. (Python, Java, Go, PowerShell, C#have this enabled by default). (Default: true)
                true - The mapping in the discriminator includes descendent schemas that allOf inherit from self and the discriminator mapping schemas in the OAS document.
                false - The mapping in the discriminator includes any descendent schemas that allOf inherit from self, any oneOf schemas, any anyOf schemas, any x-discriminator-values, and the discriminator mapping schemas in the OAS document AND Codegen validates that oneOf and anyOf schemas contain the required discriminator and throws an error if the discriminator is missing.

        library
            library template (sub-template) (Default: spring-boot)
                spring-boot - Spring-boot Server application.
                spring-cloud - Spring-Cloud-Feign client with Spring-Boot auto-configured settings.

        licenseName
            The name of the license (Default: Unlicense)

        licenseUrl
            The URL of the license (Default: http://unlicense.org)

        modelPackage
            package for generated models (Default: org.openapitools.model)

        openApiNullable
            Enable OpenAPI Jackson Nullable library (Default: true)

        parentArtifactId
            parent artifactId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect

        parentGroupId
            parent groupId in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect

        parentVersion
            parent version in generated pom N.B. parentGroupId, parentArtifactId and parentVersion must all be specified for any of them to take effect

        performBeanValidation
            Use Bean Validation Impl. to perform BeanValidation (Default: false)

        prependFormOrBodyParameters
            Add form or body parameters to the beginning of the parameter list. (Default: false)

        reactive
            wrap responses in Mono/Flux Reactor types (spring-boot only) (Default: false)

        responseWrapper
            wrap the responses in given type (Future, Callable, CompletableFuture,ListenableFuture, DeferredResult, RxObservable, RxSingle or fully qualified type)

        returnSuccessCode
            Generated server returns 2xx code (Default: false)

        scmConnection
            SCM connection in generated pom.xml (Default: scm:git:git@github.com:openapitools/openapi-generator.git)

        scmDeveloperConnection
            SCM developer connection in generated pom.xml (Default: scm:git:git@github.com:openapitools/openapi-generator.git)

        scmUrl
            SCM URL in generated pom.xml (Default: https://github.com/openapitools/openapi-generator)

        serializableModel
            boolean - toggle "implements Serializable" for generated models (Default: false)

        singleContentTypes
            Whether to select only one produces/consumes content-type by operation. (Default: false)

        skipDefaultInterface
            Whether to skip generation of default implementations for java8 interfaces (Default: false)

        snapshotVersion
            Uses a SNAPSHOT version.
                true - Use a SnapShot Version
                false - Use a Release Version

        sortModelPropertiesByRequiredFlag
            Sort model properties to place required parameters before optional parameters. (Default: true)

        sortParamsByRequiredFlag
            Sort method arguments to place required parameters before optional parameters. (Default: true)

        sourceFolder
            source folder for generated code (Default: src/main/java)

        testOutput
            Set output folder for models and APIs tests (Default: ${project.build.directory}/generated-test-sources/openapi)

        title
            server title name or client service name (Default: OpenAPI Spring)

        unhandledException
            Declare operation methods to throw a generic exception and allow unhandled exceptions (useful for Spring `@ControllerAdvice` directives). (Default: false)

        useBeanValidation
            Use BeanValidation API annotations (Default: true)

        useFeignClientUrl
            Whether to generate Feign client with url parameter. (Default: true)

        useOptional
            Use Optional container for optional parameters (Default: false)

        useSpringBoot3
            Generate code and provide dependencies for use with Spring Boot 3.x. (Use jakarta instead of javax in imports). (Default: true)

        useSpringController
            Annotate the generated API as a Spring Controller (Default: false)

        useSwaggerUI
            Open the OpenApi specification in swagger-ui. Will also import and configure needed dependencies (Default: true)

        useTags
            use tags for creating interface and controller classnames (Default: false)

        virtualService
            Generates the virtual service. For more details refer - https://github.com/virtualansoftware/virtualan/wiki (Default: false)

        withXml
            whether to include support for application/xml content type and include XML annotations in the model (works with libraries that provide support for JSON and XML) (Default: false)