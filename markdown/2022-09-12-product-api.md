---
title: Product API v1.0.0
language_tabs:
  - http: HTTP
language_clients:
  - http: ""
toc_footers:
  - <a href="https://docs.finelab.io/sales/product-api">Product API</a>
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="product-api">Product API v1.0.0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

The Product API exposes catalog, products and prices information.

Base URLs:

* <a href="http://localhost:8080">http://localhost:8080</a>

* <a href="https://test-api.finelab.io">https://test-api.finelab.io</a>

Email: <a href="mailto:api@finelab.id">API support</a> 
License: <a href="https://www.apache.org/licenses/LICENSE-2.0">Apache 2.0</a>

# Authentication

- oAuth2 authentication. 

    - Flow: clientCredentials

    - Token URL = [https://finelab-test.eu.auth0.com/oauth/token](https://finelab-test.eu.auth0.com/oauth/token)

|Scope|Scope Description|
|---|---|
|read:catalog|Allows to read catalog|
|read:product|Allows to read product|
|read:price|Allows to read price|

<h1 id="product-api-sales">Sales</h1>

## getProductCatalogs

<a id="opIdgetProductCatalogs"></a>

> Code samples

```http
GET http://localhost:8080/catalogs HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /catalogs`

Get product catalogs

> Example responses

> 200 Response

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "tenant_name": "finelab",
      "business_unit_name": "private_customers",
      "content_language": "da_DK",
      "currency": "DKK",
      "name": "private_insurance",
      "display_name": "Privatforsikring",
      "revision": 1,
      "published_at": "2022-05-07T09:12:28Z",
      "valid_from": "2022-05-07T09:12:28Z",
      "valid_to": "2022-05-07T09:12:28Z",
      "expired_at": "2019-08-24T14:15:22Z"
    }
  ]
}
```

<h3 id="getproductcatalogs-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[CatalogPage](#schemacatalogpage)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:catalog )
</aside>

## getProductCatalog

<a id="opIdgetProductCatalog"></a>

> Code samples

```http
GET http://localhost:8080/catalogs/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /catalogs/{id}`

Get product catalog by id

<h3 id="getproductcatalog-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string|true|none|

> Example responses

> 200 Response

```json
{
  "id": "string",
  "url": "string",
  "tenant_name": "finelab",
  "business_unit_name": "private_customers",
  "content_language": "da_DK",
  "currency": "DKK",
  "name": "private_insurance",
  "display_name": "Privatforsikring",
  "products": {
    "items": [
      {
        "id": "string",
        "url": "string",
        "catalog_url": "string",
        "number": "7000",
        "name": "car_insurance",
        "display_name": "Bilforsikring",
        "revision": 1,
        "published_at": "2019-08-24T14:15:22Z",
        "expired_at": "2019-08-24T14:15:22Z"
      }
    ]
  },
  "revision": 1,
  "published_at": "2022-05-07T09:12:28Z",
  "valid_from": "2022-05-07T09:12:28Z",
  "valid_to": "2022-05-07T09:12:28Z",
  "expired_at": "2019-08-24T14:15:22Z"
}
```

<h3 id="getproductcatalog-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Catalog](#schemacatalog)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Not found|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:catalog )
</aside>

## getProducts

<a id="opIdgetProducts"></a>

> Code samples

```http
GET http://localhost:8080/products HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /products`

Get products

> Example responses

> 200 Response

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "catalog_url": "string",
      "number": "7000",
      "name": "car_insurance",
      "display_name": "Bilforsikring",
      "revision": 1,
      "published_at": "2019-08-24T14:15:22Z",
      "expired_at": "2019-08-24T14:15:22Z"
    }
  ]
}
```

<h3 id="getproducts-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[ProductPage](#schemaproductpage)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:product )
</aside>

## getProductById

<a id="opIdgetProductById"></a>

> Code samples

```http
GET http://localhost:8080/products/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /products/{id}`

Get product by id

<h3 id="getproductbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string|true|none|

> Example responses

> 200 Response

```json
{
  "id": "string",
  "url": "string",
  "catalog_url": "string",
  "number": "7000",
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
  "prices": {
    "items": [
      {
        "id": "string",
        "url": "string",
        "product_id": "urn:finelab:price:private_customers:private_insurance:da_DK:7000",
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
        "published_at": "string",
        "valid_from": "string",
        "valid_to": "string",
        "expired_at": "string"
      }
    ]
  },
  "revision": 1,
  "published_at": "2019-08-24T14:15:22Z",
  "expired_at": "2019-08-24T14:15:22Z"
}
```

<h3 id="getproductbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Product](#schemaproduct)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Not found|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:product )
</aside>

## getPrices

<a id="opIdgetPrices"></a>

> Code samples

```http
GET http://localhost:8080/prices HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /prices`

Get prices

> Example responses

> 200 Response

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "product_id": "urn:finelab:price:private_customers:private_insurance:da_DK:7000",
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
      "published_at": "string",
      "valid_from": "string",
      "valid_to": "string",
      "expired_at": "string"
    }
  ]
}
```

<h3 id="getprices-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[PricePage](#schemapricepage)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:price )
</aside>

## getPriceById

<a id="opIdgetPriceById"></a>

> Code samples

```http
GET http://localhost:8080/prices/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

`GET /prices/{id}`

Get price by id

<h3 id="getpricebyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|string|true|none|

> Example responses

> 200 Response

```json
{
  "id": "string",
  "url": "string",
  "product_url": "string",
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
  "published_at": "string",
  "valid_from": "string",
  "valid_to": "string",
  "expired_at": "string"
}
```

<h3 id="getpricebyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Price](#schemaprice)|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|[Problem](#schemaproblem)|
|403|[Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3)|Forbidden|[Problem](#schemaproblem)|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Not found|[Problem](#schemaproblem)|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal Server Error|[Problem](#schemaproblem)|

<aside class="warning">
To perform this operation, you must be authenticated by means of one of the following methods:
oauth2 ( Scopes: read:price )
</aside>

# Schemas

<h2 id="tocS_CatalogPage">CatalogPage</h2>
<!-- backwards compatibility -->
<a id="schemacatalogpage"></a>
<a id="schema_CatalogPage"></a>
<a id="tocScatalogpage"></a>
<a id="tocscatalogpage"></a>

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "tenant_name": "finelab",
      "business_unit_name": "private_customers",
      "content_language": "da_DK",
      "currency": "DKK",
      "name": "private_insurance",
      "display_name": "Privatforsikring",
      "revision": 1,
      "published_at": "2022-05-07T09:12:28Z",
      "valid_from": "2022-05-07T09:12:28Z",
      "valid_to": "2022-05-07T09:12:28Z",
      "expired_at": "2019-08-24T14:15:22Z"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|items|[[CatalogPageItem](#schemacatalogpageitem)]|false|none|none|

<h2 id="tocS_CatalogPageItem">CatalogPageItem</h2>
<!-- backwards compatibility -->
<a id="schemacatalogpageitem"></a>
<a id="schema_CatalogPageItem"></a>
<a id="tocScatalogpageitem"></a>
<a id="tocscatalogpageitem"></a>

```json
{
  "id": "string",
  "url": "string",
  "tenant_name": "finelab",
  "business_unit_name": "private_customers",
  "content_language": "da_DK",
  "currency": "DKK",
  "name": "private_insurance",
  "display_name": "Privatforsikring",
  "revision": 1,
  "published_at": "2022-05-07T09:12:28Z",
  "valid_from": "2022-05-07T09:12:28Z",
  "valid_to": "2022-05-07T09:12:28Z",
  "expired_at": "2019-08-24T14:15:22Z"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|unique identifier for the catalog.|
|url|string|false|none|unique identifier for the catalog.|
|tenant_name|string|false|none|tenant to which catalog belongs.|
|business_unit_name|string|false|none|business unit to which catalog belongs.|
|content_language|string|false|none|language in which displayed text is presented.|
|currency|string|false|none|currency in which price amount is presented.|
|name|string|false|none|unique name for the catalog.|
|display_name|string|false|none|displayed name.|
|revision|integer|false|none|revision of the catalog.|
|published_at|string(date-time)|false|none|date and time at which the catalog is pusblished.|
|valid_from|string(date-time)|false|none|date and time from which the catalog is valid.|
|valid_to|string(date-time)|false|none|date and time to which the catalog is valid.|
|expired_at|string(date-time)|false|none|date and time at which the catalog is expired and can be removed.|

<h2 id="tocS_Catalog">Catalog</h2>
<!-- backwards compatibility -->
<a id="schemacatalog"></a>
<a id="schema_Catalog"></a>
<a id="tocScatalog"></a>
<a id="tocscatalog"></a>

```json
{
  "id": "string",
  "url": "string",
  "tenant_name": "finelab",
  "business_unit_name": "private_customers",
  "content_language": "da_DK",
  "currency": "DKK",
  "name": "private_insurance",
  "display_name": "Privatforsikring",
  "products": {
    "items": [
      {
        "id": "string",
        "url": "string",
        "catalog_url": "string",
        "number": "7000",
        "name": "car_insurance",
        "display_name": "Bilforsikring",
        "revision": 1,
        "published_at": "2019-08-24T14:15:22Z",
        "expired_at": "2019-08-24T14:15:22Z"
      }
    ]
  },
  "revision": 1,
  "published_at": "2022-05-07T09:12:28Z",
  "valid_from": "2022-05-07T09:12:28Z",
  "valid_to": "2022-05-07T09:12:28Z",
  "expired_at": "2019-08-24T14:15:22Z"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|unique identifier for the catalog.|
|url|string|false|none|unique identifier for the catalog.|
|tenant_name|string|false|none|tenant to which catalog belongs.|
|business_unit_name|string|false|none|business unit to which catalog belongs.|
|content_language|string|false|none|language in which displayed text is presented.|
|currency|string|false|none|currency in which price amount is presented.|
|name|string|false|none|unique name for the catalog.|
|display_name|string|false|none|displayed name.|
|products|[ProductPage](#schemaproductpage)|false|none|none|
|revision|integer|false|none|revision of the catalog.|
|published_at|string(date-time)|false|none|date and time at which the catalog is pusblished.|
|valid_from|string(date-time)|false|none|date and time from which the catalog is valid.|
|valid_to|string(date-time)|false|none|date and time to which the catalog is valid.|
|expired_at|string(date-time)|false|none|date and time at which the catalog is expired and can be removed.|

<h2 id="tocS_ProductPage">ProductPage</h2>
<!-- backwards compatibility -->
<a id="schemaproductpage"></a>
<a id="schema_ProductPage"></a>
<a id="tocSproductpage"></a>
<a id="tocsproductpage"></a>

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "catalog_url": "string",
      "number": "7000",
      "name": "car_insurance",
      "display_name": "Bilforsikring",
      "revision": 1,
      "published_at": "2019-08-24T14:15:22Z",
      "expired_at": "2019-08-24T14:15:22Z"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|items|[[ProductPageItem](#schemaproductpageitem)]|false|none|none|

<h2 id="tocS_ProductPageItem">ProductPageItem</h2>
<!-- backwards compatibility -->
<a id="schemaproductpageitem"></a>
<a id="schema_ProductPageItem"></a>
<a id="tocSproductpageitem"></a>
<a id="tocsproductpageitem"></a>

```json
{
  "id": "string",
  "url": "string",
  "catalog_url": "string",
  "number": "7000",
  "name": "car_insurance",
  "display_name": "Bilforsikring",
  "revision": 1,
  "published_at": "2019-08-24T14:15:22Z",
  "expired_at": "2019-08-24T14:15:22Z"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|none|
|url|string|false|none|unique identifier for the product.|
|catalog_url|string|false|none|tenant to which catalog belongs.|
|number|string|false|none|unique number in catalog for the product.|
|name|string|false|none|unique name in catalog for the product.|
|display_name|string|false|none|displayed name.|
|revision|integer|false|none|revision of the product.|
|published_at|string(date-time)|false|none|date and time at which the product is pusblished.|
|expired_at|string(date-time)|false|none|date and time at which the product is expired and can be removed.|

<h2 id="tocS_Product">Product</h2>
<!-- backwards compatibility -->
<a id="schemaproduct"></a>
<a id="schema_Product"></a>
<a id="tocSproduct"></a>
<a id="tocsproduct"></a>

```json
{
  "id": "string",
  "url": "string",
  "catalog_url": "string",
  "number": "7000",
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
  "prices": {
    "items": [
      {
        "id": "string",
        "url": "string",
        "product_id": "urn:finelab:price:private_customers:private_insurance:da_DK:7000",
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
        "published_at": "string",
        "valid_from": "string",
        "valid_to": "string",
        "expired_at": "string"
      }
    ]
  },
  "revision": 1,
  "published_at": "2019-08-24T14:15:22Z",
  "expired_at": "2019-08-24T14:15:22Z"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|none|
|url|string|false|none|unique identifier for the product.|
|catalog_url|string|false|none|tenant to which catalog belongs.|
|number|string|false|none|unique number in catalog for the product.|
|name|string|false|none|unique name in catalog for the product.|
|display_name|string|false|none|displayed name.|
|quote_criteria|[[Criterion](#schemacriterion)]|false|none|none|
|prices|[PricePage](#schemapricepage)|false|none|none|
|revision|integer|false|none|revision of the product.|
|published_at|string(date-time)|false|none|date and time at which the product is pusblished.|
|expired_at|string(date-time)|false|none|date and time at which the product is expired and can be removed.|

<h2 id="tocS_Criterion">Criterion</h2>
<!-- backwards compatibility -->
<a id="schemacriterion"></a>
<a id="schema_Criterion"></a>
<a id="tocScriterion"></a>
<a id="tocscriterion"></a>

```json
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

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string|false|none|none|
|display_name|string|false|none|none|
|value|string|false|none|none|
|type|string|false|none|none|
|allow_values|[[CriterionAllowValue](#schemacriterionallowvalue)]|false|none|none|
|allow_mulitiselect|boolean|false|none|none|
|allow_limit|object|false|none|none|
|» min_value|string|false|none|none|
|» min_inclusive|boolean|false|none|none|
|» max_value|string|false|none|none|
|» max_inclusive|string|false|none|none|

#### Enumerated Values

|Property|Value|
|---|---|
|type|BOOLEAN|
|type|INTEGER|
|type|DECIMAL|
|type|DATE|
|type|STRING|
|type|EMAIL|

<h2 id="tocS_CriterionAllowValue">CriterionAllowValue</h2>
<!-- backwards compatibility -->
<a id="schemacriterionallowvalue"></a>
<a id="schema_CriterionAllowValue"></a>
<a id="tocScriterionallowvalue"></a>
<a id="tocscriterionallowvalue"></a>

```json
{
  "key": "string",
  "display_value": "string",
  "selected": true
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|key|string|false|none|none|
|display_value|string|false|none|none|
|selected|boolean|false|none|none|

<h2 id="tocS_PricePage">PricePage</h2>
<!-- backwards compatibility -->
<a id="schemapricepage"></a>
<a id="schema_PricePage"></a>
<a id="tocSpricepage"></a>
<a id="tocspricepage"></a>

```json
{
  "items": [
    {
      "id": "string",
      "url": "string",
      "product_id": "urn:finelab:price:private_customers:private_insurance:da_DK:7000",
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
      "published_at": "string",
      "valid_from": "string",
      "valid_to": "string",
      "expired_at": "string"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|items|[[PricePageItem](#schemapricepageitem)]|false|none|none|

<h2 id="tocS_PricePageItem">PricePageItem</h2>
<!-- backwards compatibility -->
<a id="schemapricepageitem"></a>
<a id="schema_PricePageItem"></a>
<a id="tocSpricepageitem"></a>
<a id="tocspricepageitem"></a>

```json
{
  "id": "string",
  "url": "string",
  "product_id": "urn:finelab:price:private_customers:private_insurance:da_DK:7000",
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
  "published_at": "string",
  "valid_from": "string",
  "valid_to": "string",
  "expired_at": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|unique identifier for the price.|
|url|string|false|none|unique identifier for the price.|
|product_id|string|false|none|unique identifier for the product to which the price belongs.|
|amount|number|false|none|unique identifier for the product to which the price belongs.|
|charged|string|false|none|how often is the amount charged eg per_month, per_year ...|
|match_criteria|[[MatchCriterion](#schemamatchcriterion)]|false|none|the criteria to be matched to get the price quote.|
|display_name|string|false|none|displayed name.|
|revision|integer|false|none|revision of the catalog.|
|published_at|string(datetime)|false|none|date and time at which the catalog is pusblished.|
|valid_from|string(datetime)|false|none|date and time from which the catalog is valid.|
|valid_to|string(datetime)|false|none|date and time to which the catalog is valid.|
|expired_at|string(datetime)|false|none|date and time at which the catalog is expired and can be removed.|

<h2 id="tocS_Price">Price</h2>
<!-- backwards compatibility -->
<a id="schemaprice"></a>
<a id="schema_Price"></a>
<a id="tocSprice"></a>
<a id="tocsprice"></a>

```json
{
  "id": "string",
  "url": "string",
  "product_url": "string",
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
  "published_at": "string",
  "valid_from": "string",
  "valid_to": "string",
  "expired_at": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|string|false|none|unique identifier for the price.|
|url|string|false|none|unique identifier for the price.|
|product_url|string|false|none|unique identifier for the product to which the price belongs.|
|amount|number|false|none|unique identifier for the product to which the price belongs.|
|charged|string|false|none|how often is the amount charged eg per_month, per_year ...|
|match_criteria|[[MatchCriterion](#schemamatchcriterion)]|false|none|the criteria to be matched to get the price quote.|
|display_name|string|false|none|displayed name.|
|revision|integer|false|none|revision of the catalog.|
|published_at|string(datetime)|false|none|date and time at which the catalog is pusblished.|
|valid_from|string(datetime)|false|none|date and time from which the catalog is valid.|
|valid_to|string(datetime)|false|none|date and time to which the catalog is valid.|
|expired_at|string(datetime)|false|none|date and time at which the catalog is expired and can be removed.|

<h2 id="tocS_MatchCriterion">MatchCriterion</h2>
<!-- backwards compatibility -->
<a id="schemamatchcriterion"></a>
<a id="schema_MatchCriterion"></a>
<a id="tocSmatchcriterion"></a>
<a id="tocsmatchcriterion"></a>

```json
{
  "name": "string",
  "value": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string|false|none|the parameter name (key) for the criterion|
|value|string|false|none|the value to match for the criterion|

<h2 id="tocS_Problem">Problem</h2>
<!-- backwards compatibility -->
<a id="schemaproblem"></a>
<a id="schema_Problem"></a>
<a id="tocSproblem"></a>
<a id="tocsproblem"></a>

```json
{
  "type": "string",
  "title": "string",
  "status": 0,
  "detail": "string",
  "instance": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|type|string|false|none|URI that identifies the problem type.|
|title|string|false|none|A short, summary of the problem type.|
|status|integer|false|none|The HTTP status code|
|detail|string|false|none|An explanation specific to the problem.|
|instance|string|false|none|An URI that identifies the occurrence of the problem.|

