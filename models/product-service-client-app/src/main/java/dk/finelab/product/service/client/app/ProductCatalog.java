package dk.finelab.product.service.client.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCatalog {

	public ProductCatalog () {
	}

	public ProductCatalog (
		String uri, 
		String tenantName, 
		String businessUnitName, 
		String contentLanguage, 
		String currency, 
		String name, 
		String displayName, 
		Integer revision, 
		java.time.OffsetDateTime publishedAt, 
		java.time.OffsetDateTime validFrom, 
		java.time.OffsetDateTime validTo, 
		java.time.OffsetDateTime expiredAt) {
		this.uri = uri;
		this.tenantName = tenantName;
		this.businessUnitName = businessUnitName;
		this.contentLanguage = contentLanguage;
		this.currency = currency;
		this.name = name;
		this.displayName = displayName;
		this.revision = revision;
		this.publishedAt = publishedAt;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.expiredAt = expiredAt;
	}

	private String uri;
	@JsonProperty("tenant_name")
	private String tenantName;
	@JsonProperty("business_unit_name")
	private String businessUnitName;
	@JsonProperty("content_language")
	private String contentLanguage;
	private String currency;
	private String name;
	@JsonProperty("display_name")
	private String displayName;
	private Integer revision;
	@JsonProperty("published_at")
	private java.time.OffsetDateTime publishedAt;
	@JsonProperty("valid_from")
	private java.time.OffsetDateTime validFrom;
	@JsonProperty("valid_to")
	private java.time.OffsetDateTime validTo;
	@JsonProperty("expired_at")
	private java.time.OffsetDateTime expiredAt;
	public String getUri() {
		return uri;
	}

	public ProductCatalog setUri(String uri) {
		this.uri = uri;
		return this;
	}


	public String getTenantName() {
		return tenantName;
	}

	public ProductCatalog setTenantName(String tenantName) {
		this.tenantName = tenantName;
		return this;
	}


	public String getBusinessUnitName() {
		return businessUnitName;
	}

	public ProductCatalog setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
		return this;
	}


	public String getContentLanguage() {
		return contentLanguage;
	}

	public ProductCatalog setContentLanguage(String contentLanguage) {
		this.contentLanguage = contentLanguage;
		return this;
	}


	public String getCurrency() {
		return currency;
	}

	public ProductCatalog setCurrency(String currency) {
		this.currency = currency;
		return this;
	}


	public String getName() {
		return name;
	}

	public ProductCatalog setName(String name) {
		this.name = name;
		return this;
	}


	public String getDisplayName() {
		return displayName;
	}

	public ProductCatalog setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}


	public Integer getRevision() {
		return revision;
	}

	public ProductCatalog setRevision(Integer revision) {
		this.revision = revision;
		return this;
	}


	public java.time.OffsetDateTime getPublishedAt() {
		return publishedAt;
	}

	public ProductCatalog setPublishedAt(java.time.OffsetDateTime publishedAt) {
		this.publishedAt = publishedAt;
		return this;
	}


	public java.time.OffsetDateTime getValidFrom() {
		return validFrom;
	}

	public ProductCatalog setValidFrom(java.time.OffsetDateTime validFrom) {
		this.validFrom = validFrom;
		return this;
	}


	public java.time.OffsetDateTime getValidTo() {
		return validTo;
	}

	public ProductCatalog setValidTo(java.time.OffsetDateTime validTo) {
		this.validTo = validTo;
		return this;
	}


	public java.time.OffsetDateTime getExpiredAt() {
		return expiredAt;
	}

	public ProductCatalog setExpiredAt(java.time.OffsetDateTime expiredAt) {
		this.expiredAt = expiredAt;
		return this;
	}

	public String toString() {
		return "ProductCatalog ["
		+ " uri: " + uri
		+ " tenantName: " + tenantName
		+ " businessUnitName: " + businessUnitName
		+ " contentLanguage: " + contentLanguage
		+ " currency: " + currency
		+ " name: " + name
		+ " displayName: " + displayName
		+ " revision: " + revision
		+ " publishedAt: " + publishedAt
		+ " validFrom: " + validFrom
		+ " validTo: " + validTo
		+ " expiredAt: " + expiredAt
		+ " ]";
	}
}
