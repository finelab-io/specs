package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dk.finelab.product.api.model.MatchCriterion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Price
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:24:00.870426+02:00[Europe/Copenhagen]")
public class Price {

  @JsonProperty("id")
  private String id;

  @JsonProperty("url")
  private String url;

  @JsonProperty("product_url")
  private String productUrl;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("charged")
  private String charged;

  @JsonProperty("match_criteria")
  @Valid
  private List<MatchCriterion> matchCriteria = null;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("revision")
  private Integer revision;

  @JsonProperty("published_at")
  private String publishedAt;

  @JsonProperty("valid_from")
  private String validFrom;

  @JsonProperty("valid_to")
  private String validTo;

  @JsonProperty("expired_at")
  private String expiredAt;

  public Price id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier for the price.
   * @return id
  */
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Price url(String url) {
    this.url = url;
    return this;
  }

  /**
   * unique identifier for the price.
   * @return url
  */
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Price productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * unique identifier for the product to which the price belongs.
   * @return productUrl
  */
  
  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public Price amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * unique identifier for the product to which the price belongs.
   * @return amount
  */
  @Valid 
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Price charged(String charged) {
    this.charged = charged;
    return this;
  }

  /**
   * how often is the amount charged eg per_month, per_year ...
   * @return charged
  */
  
  public String getCharged() {
    return charged;
  }

  public void setCharged(String charged) {
    this.charged = charged;
  }

  public Price matchCriteria(List<MatchCriterion> matchCriteria) {
    this.matchCriteria = matchCriteria;
    return this;
  }

  public Price addMatchCriteriaItem(MatchCriterion matchCriteriaItem) {
    if (this.matchCriteria == null) {
      this.matchCriteria = new ArrayList<>();
    }
    this.matchCriteria.add(matchCriteriaItem);
    return this;
  }

  /**
   * the criteria to be matched to get the price quote.
   * @return matchCriteria
  */
  @Valid 
  public List<MatchCriterion> getMatchCriteria() {
    return matchCriteria;
  }

  public void setMatchCriteria(List<MatchCriterion> matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  public Price displayName(String displayName) {
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

  public Price revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * revision of the catalog.
   * @return revision
  */
  
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public Price publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * date and time at which the catalog is pusblished.
   * @return publishedAt
  */
  
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Price validFrom(String validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * date and time from which the catalog is valid.
   * @return validFrom
  */
  
  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }

  public Price validTo(String validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * date and time to which the catalog is valid.
   * @return validTo
  */
  
  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }

  public Price expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * date and time at which the catalog is expired and can be removed.
   * @return expiredAt
  */
  
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
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
    Price price = (Price) o;
    return Objects.equals(this.id, price.id) &&
        Objects.equals(this.url, price.url) &&
        Objects.equals(this.productUrl, price.productUrl) &&
        Objects.equals(this.amount, price.amount) &&
        Objects.equals(this.charged, price.charged) &&
        Objects.equals(this.matchCriteria, price.matchCriteria) &&
        Objects.equals(this.displayName, price.displayName) &&
        Objects.equals(this.revision, price.revision) &&
        Objects.equals(this.publishedAt, price.publishedAt) &&
        Objects.equals(this.validFrom, price.validFrom) &&
        Objects.equals(this.validTo, price.validTo) &&
        Objects.equals(this.expiredAt, price.expiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, productUrl, amount, charged, matchCriteria, displayName, revision, publishedAt, validFrom, validTo, expiredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    charged: ").append(toIndentedString(charged)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

