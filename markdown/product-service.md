# Product AsyncAPI 1.0.0 documentation

* Specification ID: `finetech:sales:product`
* License: [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0)
* Email support: [api@finetech.dk](mailto:api@finetech.dk)

The Product AsyncAPI publishes events whenever changes occurs to catalogs, products or prices.


## Table of Contents

* [Servers](#servers)
  * [staging-broker](#staging-broker-server)
* [Operations](#operations)
  * [PUB sales.product.catalog](#pub-salesproductcatalog-operation)
  * [PUB sales.product.information](#pub-salesproductinformation-operation)
  * [PUB sales.product.price](#pub-salesproductprice-operation)

## Servers

### `staging-broker` Server

* URL: `pkc-1wvvj.westeurope.azure.confluent.cloud:9092`
* Protocol: `kafka 2.6.0`

Finetech Test Broker

#### Security

##### Security Requirement 1

* Type: `User/Password`
  * security.protocol: SASL_PLAINTEXT







## Operations

### PUB `sales.product.catalog` Operation

* Operation ID: `handleSalesProductCatalog`

#### `kafka` Operation specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| clientId | string | - | - | pattern (`^[a-z]{22}$`) | - |
| groupId | string | - | - | pattern (`^[A-Z]{10}[1-5]$`) | - |

#### Message `ProductCatalogEvent`

* Content type: [application/json](https://www.iana.org/assignments/media-types/application/json)

The `ProductCatalogEvent` contains information about the published product catalog .

##### Payload

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| (root) | object | - | - | - | **additional properties are allowed** |
| uri | string | unique identifier for the catalog. | - | - | - |
| tenant_name | string | tenant to which catalog belongs. | - | - | - |
| business_unit_name | string | business unit to which catalog belongs. | - | - | - |
| content_language | string | language in which displayed text is presented. | - | - | - |
| currency | string | currency in which price amount is presented. | - | - | - |
| name | string | unique name for the catalog. | - | - | - |
| display_name | string | displayed name. | - | - | - |
| revision | integer | revision of the catalog. | - | - | - |
| published_at | string | date and time at which the catalog is pusblished. | - | format (`date-time`) | - |
| valid_from | string | date and time from which the catalog is valid. | - | format (`date-time`) | - |
| valid_to | string | date and time to which the catalog is valid. | - | format (`date-time`) | - |
| expired_at | string | date and time at which the catalog is expired and can be removed. | - | format (`date-time`) | - |

> Examples of payload _(generated)_

```json
{
  "uri": "urn:finetech:catalog:private_customers:private_insurance:da_DK",
  "tenant_name": "finetech",
  "business_unit_name": "private_customers",
  "content_language": "da_DK",
  "currency": "DKK",
  "name": "private_insurance",
  "display_name": "Privatforsikring",
  "revision": 1,
  "published_at": "2022-05-07T00:00:00.000Z",
  "valid_from": "2022-05-07T00:00:00.000Z",
  "valid_to": "2022-05-07T00:00:00.000Z",
  "expired_at": null
}
```


#### `kafka` Message specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| key | string | - | - | - | - |


### PUB `sales.product.information` Operation

* Operation ID: `handleSalesProductInformation`

#### `kafka` Operation specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| clientId | string | - | - | pattern (`^[a-z]{22}$`) | - |
| groupId | string | - | - | pattern (`^[A-Z]{10}[1-5]$`) | - |

#### Message `ProductInformationEvent`

* Content type: [application/json](https://www.iana.org/assignments/media-types/application/json)

The `ProductInformation` contains information about the published product.

##### Payload

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| (root) | object | - | - | - | **additional properties are allowed** |
| uri | string | unique identifier for the product. | - | - | - |
| catalog_uri | string | tenant to which catalog belongs. | - | - | - |
| number | string | unique number in catalog for the product. | - | - | - |
| name | string | unique name in catalog for the product. | - | - | - |
| display_name | string | displayed name. | - | - | - |
| quote_criteria | array<object> | - | - | - | - |
| quote_criteria.name | string | - | - | - | - |
| quote_criteria.display_name | string | - | - | - | - |
| quote_criteria.value | string | - | - | - | - |
| quote_criteria.type | string | - | allowed (`"BOOLEAN"`, `"INTEGER"`, `"DECIMAL"`, `"DATE"`, `"STRING"`, `"EMAIL"`) | - | - |
| quote_criteria.allow_values | array<object> | - | - | - | - |
| quote_criteria.allow_values.key | string | - | - | - | - |
| quote_criteria.allow_values.display_value | string | - | - | - | - |
| quote_criteria.allow_values.selected | boolean | - | - | - | - |
| quote_criteria.allow_mulitiselect | boolean | - | - | - | - |
| quote_criteria.allow_limit | object | - | - | - | **additional properties are allowed** |
| quote_criteria.allow_limit.min_value | string | - | - | - | - |
| quote_criteria.allow_limit.min_inclusive | boolean | - | - | - | - |
| quote_criteria.allow_limit.max_value | string | - | - | - | - |
| quote_criteria.allow_limit.max_inclusive | string | - | - | - | - |
| revision | integer | revision of the product. | - | - | - |
| published_at" | string | date and time at which the product is pusblished. | - | format (`date-time`) | - |
| expired_at | string | date and time at which the product is expired and can be removed. | - | format (`date-time`) | - |

> Examples of payload _(generated)_

```json
{
  "uri": "urn:finetech:product:private_customers:private_insurance:da_DK:7000",
  "catalog_uri": "urn:finetech:product:private_customers:private_insurance:da_DK",
  "number": 7000,
  "name": "car_insurance",
  "display_name": "Bilforsikring",
  "quote_criteria": [
    {
      "name": "string",
      "display_name": "string",
      "value": "string",
      "type": "BOOLEAN",
      "allow_values": [
        {
          "key": "string",
          "display_value": "string",
          "selected": true
        }
      ],
      "allow_mulitiselect": true,
      "allow_limit": {
        "min_value": "string",
        "min_inclusive": true,
        "max_value": "string",
        "max_inclusive": "string"
      }
    }
  ],
  "revision": 1,
  "published_at\"": "2019-08-24T14:15:22Z",
  "expired_at": "2019-08-24T14:15:22Z"
}
```


#### `kafka` Message specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| key | string | - | - | - | - |


### PUB `sales.product.price` Operation

* Operation ID: `handleSalesProductPrice`

#### `kafka` Operation specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| clientId | string | - | - | pattern (`^[a-z]{22}$`) | - |
| groupId | string | - | - | pattern (`^[A-Z]{10}[1-5]$`) | - |

#### Message `ProductPriceEvent`

* Content type: [application/json](https://www.iana.org/assignments/media-types/application/json)

The `ProductPriceEvent` contains information about the published product price.

##### Payload

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| (root) | object | - | - | - | **additional properties are allowed** |
| uri | string | unique identifier for the price. | - | - | - |
| product_information_uri | string | unique identifier for the product to which the price belongs. | - | - | - |
| amount | number | unique identifier for the product to which the price belongs. | - | - | - |
| charged | string | how often is the amount charged eg per_month, per_year ... | - | - | - |
| match_criteria | array<object> | the criteria to be matched to get the price quote. | - | - | - |
| match_criteria.name | string | the parameter name (key) for the criterion | - | - | - |
| match_criteria.value | string | the value to match for the criterion | - | - | - |
| display_name | string | displayed name. | - | - | - |
| revision | integer | revision of the catalog. | - | - | - |
| published_at" | string | date and time at which the catalog is pusblished. | - | format (`datetime`) | - |
| valid_from | string | date and time from which the catalog is valid. | - | format (`datetime`) | - |
| valid_to | string | date and time to which the catalog is valid. | - | format (`datetime`) | - |
| expired_at | string | date and time at which the catalog is expired and can be removed. | - | format (`datetime`) | - |

> Examples of payload _(generated)_

```json
{
  "uri": "urn:finetech:price:private_customers:private_insurance:da_DK:7000:1",
  "product_information_uri": "urn:finetech:price:private_customers:private_insurance:da_DK:7000",
  "amount": 100,
  "charged": "per_month",
  "match_criteria": [
    {
      "name": "string",
      "value": "string"
    }
  ],
  "display_name": "string",
  "revision": 0,
  "published_at\"": "string",
  "valid_from": "string",
  "valid_to": "string",
  "expired_at": "string"
}
```


#### `kafka` Message specific information

| Name | Type | Description | Value | Constraints | Notes |
|---|---|---|---|---|---|
| key | string | - | - | - | - |


