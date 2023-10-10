# Store

Access to Petstore orders

```java
StoreController storeController = client.getStoreController();
```

## Class Name

`StoreController`

## Methods

* [Get Inventory](../../doc/controllers/store.md#get-inventory)
* [Get Order by Id](../../doc/controllers/store.md#get-order-by-id)
* [Delete Order](../../doc/controllers/store.md#delete-order)
* [Place Order](../../doc/controllers/store.md#place-order)


# Get Inventory

Returns a map of status codes to quantities

```java
CompletableFuture<Map<String, Integer>> getInventoryAsync()
```

## Response Type

`Map<String, Integer>`

## Example Usage

```java
storeController.getInventoryAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get Order by Id

For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions

```java
CompletableFuture<Order> getOrderByIdAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of pet that needs to be fetched<br>**Constraints**: `>= 1`, `<= 10` |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
long orderId = 62L;

storeController.getOrderByIdAsync(orderId).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |


# Delete Order

For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors

```java
CompletableFuture<Void> deleteOrderAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of the order that needs to be deleted<br>**Constraints**: `>= 1` |

## Response Type

`void`

## Example Usage

```java
long orderId = 62L;

storeController.deleteOrderAsync(orderId).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |


# Place Order

Place an order for a pet

```java
CompletableFuture<Order> placeOrderAsync(
    final Order body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Order`](../../doc/models/order.md) | Body, Required | order placed for purchasing the pet |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
Order body = new Order.Builder()
    .build();

storeController.placeOrderAsync(body).thenAccept(result -> {
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
| 400 | Invalid Order | `ApiException` |

