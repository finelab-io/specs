package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dk.finelab.product.api.model.PricePageItem;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * PricePage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:24:00.870426+02:00[Europe/Copenhagen]")
public class PricePage {

  @JsonProperty("url")
  private String url;

  @JsonProperty("items")
  @Valid
  private List<PricePageItem> items = null;

  public PricePage url(String url) {
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

  public PricePage items(List<PricePageItem> items) {
    this.items = items;
    return this;
  }

  public PricePage addItemsItem(PricePageItem itemsItem) {
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
  public List<PricePageItem> getItems() {
    return items;
  }

  public void setItems(List<PricePageItem> items) {
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
    PricePage pricePage = (PricePage) o;
    return Objects.equals(this.url, pricePage.url) &&
        Objects.equals(this.items, pricePage.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePage {\n");
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

