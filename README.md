
# Getting Started with Swagger Petstore

## Introduction

This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.

Find out more about Swagger: [http://swagger.io](http://swagger.io)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.sufyankhanrao</groupId>
  <artifactId>test-sdk</artifactId>
  <version>1.0.2</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.github.sufyankhanrao/test-sdk/1.0.2

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `apiKey` | `String` |  |

The API client can be initialized as follows:

```java
SwaggerPetstoreClient client = new SwaggerPetstoreClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("api_key")
    .environment(Environment.PRODUCTION)
    .build();
```

## Authorization

This API uses `Custom Header Signature`.

## List of APIs

* [Pet](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/controllers/pet.md)
* [Store](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/controllers/store.md)
* [User](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/controllers/user.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-request.md)
* [HttpResponse](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-string-response.md)
* [HttpContext](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-body-request.md)
* [Headers](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/headers.md)
* [ApiException](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/zubariya/PracticeCodes/tree/1.0.2/doc/http-client-configuration-builder.md)

