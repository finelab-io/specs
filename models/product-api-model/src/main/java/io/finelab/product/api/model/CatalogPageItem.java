package io.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogPageItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T22:44:55.180417+02:00[Europe/Copenhagen]")
public class CatalogPageItem {

  @JsonProperty("id")
  private String id;

  @JsonProperty("url")
  private String url;

  @JsonProperty("tenant_name")
  private String tenantName;

  @JsonProperty("business_unit_name")
  private String businessUnitName;

  @JsonProperty("content_language")
  private String contentLanguage;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("name")
  private String name;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("revision")
  private Integer revision;

  @JsonProperty("published_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedAt;

  @JsonProperty("valid_from")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validFrom;

  @JsonProperty("valid_to")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validTo;

  @JsonProperty("expired_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiredAt;

  public CatalogPageItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier for the catalog.
   * @return id
  */
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogPageItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * unique identifier for the catalog.
   * @return url
  */
  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CatalogPageItem tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * tenant to which catalog belongs.
   * @return tenantName
  */
  
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public CatalogPageItem businessUnitName(String businessUnitName) {
    this.businessUnitName = businessUnitName;
    return this;
  }

  /**
   * business unit to which catalog belongs.
   * @return businessUnitName
  */
  
  public String getBusinessUnitName() {
    return businessUnitName;
  }

  public void setBusinessUnitName(String businessUnitName) {
    this.businessUnitName = businessUnitName;
  }

  public CatalogPageItem contentLanguage(String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * language in which displayed text is presented.
   * @return contentLanguage
  */
  
  public String getContentLanguage() {
    return contentLanguage;
  }

  public void setContentLanguage(String contentLanguage) {
    this.contentLanguage = contentLanguage;
  }

  public CatalogPageItem currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * currency in which price amount is presented.
   * @return currency
  */
  
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CatalogPageItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * unique name for the catalog.
   * @return name
  */
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogPageItem displayName(String displayName) {
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

  public CatalogPageItem revision(Integer revision) {
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

  public CatalogPageItem publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * date and time at which the catalog is pusblished.
   * @return publishedAt
  */
  @Valid 
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public CatalogPageItem validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * date and time from which the catalog is valid.
   * @return validFrom
  */
  @Valid 
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public CatalogPageItem validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * date and time to which the catalog is valid.
   * @return validTo
  */
  @Valid 
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public CatalogPageItem expiredAt(OffsetDateTime expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * date and time at which the catalog is expired and can be removed.
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
    CatalogPageItem catalogPageItem = (CatalogPageItem) o;
    return Objects.equals(this.id, catalogPageItem.id) &&
        Objects.equals(this.url, catalogPageItem.url) &&
        Objects.equals(this.tenantName, catalogPageItem.tenantName) &&
        Objects.equals(this.businessUnitName, catalogPageItem.businessUnitName) &&
        Objects.equals(this.contentLanguage, catalogPageItem.contentLanguage) &&
        Objects.equals(this.currency, catalogPageItem.currency) &&
        Objects.equals(this.name, catalogPageItem.name) &&
        Objects.equals(this.displayName, catalogPageItem.displayName) &&
        Objects.equals(this.revision, catalogPageItem.revision) &&
        Objects.equals(this.publishedAt, catalogPageItem.publishedAt) &&
        Objects.equals(this.validFrom, catalogPageItem.validFrom) &&
        Objects.equals(this.validTo, catalogPageItem.validTo) &&
        Objects.equals(this.expiredAt, catalogPageItem.expiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, tenantName, businessUnitName, contentLanguage, currency, name, displayName, revision, publishedAt, validFrom, validTo, expiredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogPageItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    businessUnitName: ").append(toIndentedString(businessUnitName)).append("\n");
    sb.append("    contentLanguage: ").append(toIndentedString(contentLanguage)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

