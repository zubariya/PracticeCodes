
# Pet

## Structure

`Pet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Category` | [`Category`](../../doc/models/category.md) | Optional | - | Category getCategory() | setCategory(Category category) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PhotoUrls` | `List<String>` | Required | - | List<String> getPhotoUrls() | setPhotoUrls(List<String> photoUrls) |
| `Tags` | [`List<Tag>`](../../doc/models/tag.md) | Optional | - | List<Tag> getTags() | setTags(List<Tag> tags) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | pet status in the store | StatusEnum getStatus() | setStatus(StatusEnum status) |

## Example (as JSON)

```json
{
  "id": 120,
  "category": {
    "id": 232,
    "name": "name2"
  },
  "name": "name0",
  "photoUrls": [
    "photoUrls5",
    "photoUrls6"
  ],
  "tags": [
    {
      "id": 26,
      "name": "name0"
    }
  ],
  "status": "available"
}
```

