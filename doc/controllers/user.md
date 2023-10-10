# User

Operations about user

Find out more about our store: [http://swagger.io](http://swagger.io)

```java
UserController userController = client.getUserController();
```

## Class Name

`UserController`

## Methods

* [Get User by Name](../../doc/controllers/user.md#get-user-by-name)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)
* [Create User](../../doc/controllers/user.md#create-user)
* [Create Users With Array Input](../../doc/controllers/user.md#create-users-with-array-input)
* [Create Users With List Input](../../doc/controllers/user.md#create-users-with-list-input)
* [Login User](../../doc/controllers/user.md#login-user)
* [Logout User](../../doc/controllers/user.md#logout-user)


# Get User by Name

Get user by user name

```java
CompletableFuture<User> getUserByNameAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The name that needs to be fetched. Use user1 for testing. |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
String username = "username0";

userController.getUserByNameAsync(username).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |


# Update User

This can only be done by the logged in user.

```java
CompletableFuture<Void> updateUserAsync(
    final String username,
    final User body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | name that need to be updated |
| `body` | [`User`](../../doc/models/user.md) | Body, Required | Updated user object |

## Response Type

`void`

## Example Usage

```java
String username = "username0";
User body = new User.Builder()
    .build();

userController.updateUserAsync(username, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid user supplied | `ApiException` |
| 404 | User not found | `ApiException` |


# Delete User

This can only be done by the logged in user.

```java
CompletableFuture<Void> deleteUserAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The name that needs to be deleted |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

userController.deleteUserAsync(username).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |


# Create User

This can only be done by the logged in user.

```java
CompletableFuture<Void> createUserAsync(
    final User body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`User`](../../doc/models/user.md) | Body, Required | Created user object |

## Response Type

`void`

## Example Usage

```java
User body = new User.Builder()
    .build();

userController.createUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |


# Create Users With Array Input

Creates list of users with given input array

```java
CompletableFuture<Void> createUsersWithArrayInputAsync(
    final List<User> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<User>`](../../doc/models/user.md) | Body, Required | List of user object |

## Response Type

`void`

## Example Usage

```java
List<User> body = Arrays.asList(
    new User.Builder()
        .build()
);

userController.createUsersWithArrayInputAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |


# Create Users With List Input

Creates list of users with given input array

```java
CompletableFuture<Void> createUsersWithListInputAsync(
    final List<User> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<User>`](../../doc/models/user.md) | Body, Required | List of user object |

## Response Type

`void`

## Example Usage

```java
List<User> body = Arrays.asList(
    new User.Builder()
        .build()
);

userController.createUsersWithListInputAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |


# Login User

Logs user into the system

```java
CompletableFuture<String> loginUserAsync(
    final String username,
    final String password)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Query, Required | The user name for login |
| `password` | `String` | Query, Required | The password for login in clear text |

## Response Type

`String`

## Example Usage

```java
String username = "username0";
String password = "password4";

userController.loginUserAsync(username, password).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username/password supplied | `ApiException` |


# Logout User

Logs out current logged in user session

```java
CompletableFuture<Void> logoutUserAsync()
```

## Response Type

`void`

## Example Usage

```java
userController.logoutUserAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |

