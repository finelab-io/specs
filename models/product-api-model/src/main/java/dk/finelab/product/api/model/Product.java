package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dk.finelab.product.api.model.Criterion;
import dk.finelab.product.api.model.PricePage;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:24:00.870426+02:00[Europe/Copenhagen]")
public class Product {

  @JsonProperty("id")
  private String id;

  @JsonProperty("url")
  private String url;

  @JsonProperty("catalog_url")
  private String catalogUrl;

  @JsonProperty("number")
  private String number;

  @JsonProperty("name")
  private String name;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("quote_criteria")
  @Valid
  private List<Criterion> quoteCriteria = null;

  @JsonProperty("prices")
  private PricePage prices;

  @JsonProperty("revision")
  private Integer revision;

  @JsonProperty("published_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("expired_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiredAt;

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product url(String url) {
    this.url = url;
    return this;
  }

  /**
   * unique identifier for the product.
   * @return url
  */
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Product catalogUrl(String catalogUrl) {
    this.catalogUrl = catalogUrl;
    return this;
  }

  /**
   * tenant to which catalog belongs.
   * @return catalogUrl
  */
  
  public String getCatalogUrl() {
    return catalogUrl;
  }

  public void setCatalogUrl(String catalogUrl) {
    this.catalogUrl = catalogUrl;
  }

  public Product number(String number) {
    this.number = number;
    return this;
  }

  /**
   * unique number in catalog for the product.
   * @return number
  */
  
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * unique name in catalog for the product.
   * @return name
  */
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * displayed name.
   * @return displayName
  */
  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Product quoteCriteria(List<Criterion> quoteCriteria) {
    this.quoteCriteria = quoteCriteria;
    return this;
  }

  public Product addQuoteCriteriaItem(Criterion quoteCriteriaItem) {
    if (this.quoteCriteria == null) {
      this.quoteCriteria = new ArrayList<>();
    }
    this.quoteCriteria.add(quoteCriteriaItem);
    return this;
  }

  /**
   * Get quoteCriteria
   * @return quoteCriteria
  */
  @Valid 
  public List<Criterion> getQuoteCriteria() {
    return quoteCriteria;
  }

  public void setQuoteCriteria(List<Criterion> quoteCriteria) {
    this.quoteCriteria = quoteCriteria;
  }

  public Product prices(PricePage prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  public PricePage getPrices() {
    return prices;
  }

  public void setPrices(PricePage prices) {
    this.prices = prices;
  }

  public Product revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * revision of the product.
   * @return revision
  */
  
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public Product publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * date and time at which the product is pusblished.
   * @return publishedAt
  */
  @Valid 
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Product expiredAt(OffsetDateTime expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * date and time at which the product is expired and can be removed.
   * @return expiredAt
  */
  @Valid 
  public OffsetDateTime getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(OffsetDateTime expiredAt) {
    this.expiredAt = expiredAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.url, product.url) &&
        Objects.equals(this.catalogUrl, product.catalogUrl) &&
        Objects.equals(this.number, product.number) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.displayName, product.displayName) &&
        Objects.equals(this.quoteCriteria, product.quoteCriteria) &&
        Objects.equals(this.prices, product.prices) &&
        Objects.equals(this.revision, product.revision) &&
        Objects.equals(this.publishedAt, product.publishedAt) &&
        Objects.equals(this.expiredAt, product.expiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, catalogUrl, number, name, displayName, quoteCriteria, prices, revision, publishedAt, expiredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    catalogUrl: ").append(toIndentedString(catalogUrl)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    quoteCriteria: ").append(toIndentedString(quoteCriteria)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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

