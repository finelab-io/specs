package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dk.finelab.product.api.model.ProductPageItem;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:24:00.870426+02:00[Europe/Copenhagen]")
public class ProductPage {

  @JsonProperty("url")
  private String url;

  @JsonProperty("items")
  @Valid
  private List<ProductPageItem> items = null;

  public ProductPage url(String url) {
    this.url = url;
    return this;
  }

  /**
   * url to the page
   * @return url
  */
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ProductPage items(List<ProductPageItem> items) {
    this.items = items;
    return this;
  }

  public ProductPage addItemsItem(ProductPageItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  public List<ProductPageItem> getItems() {
    return items;
  }

  public void setItems(List<ProductPageItem> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPage productPage = (ProductPage) o;
    return Objects.equals(this.url, productPage.url) &&
        Objects.equals(this.items, productPage.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPage {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

