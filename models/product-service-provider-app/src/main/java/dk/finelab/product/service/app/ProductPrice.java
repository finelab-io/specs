package dk.finelab.product.service.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductPrice {

	public ProductPrice () {
	}

	public ProductPrice (
		String uri, 
		String productInformationUri, 
		java.math.BigDecimal amount, 
		String charged, 
		MatchCriteria[] matchCriteria, 
		String displayName, 
		Integer revision, 
		String publishedAt, 
		String validFrom, 
		String validTo, 
		String expiredAt) {
		this.uri = uri;
		this.productInformationUri = productInformationUri;
		this.amount = amount;
		this.charged = charged;
		this.matchCriteria = matchCriteria;
		this.displayName = displayName;
		this.revision = revision;
		this.publishedAt = publishedAt;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.expiredAt = expiredAt;
	}

	private String uri;
	@JsonProperty("product_information_uri")
	private String productInformationUri;
	private java.math.BigDecimal amount;
	private String charged;
	@JsonProperty("match_criteria")
	private MatchCriteria[] matchCriteria;
	@JsonProperty("display_name")
	private String displayName;
	private Integer revision;
	@JsonProperty("published_at")
	private String publishedAt;
	@JsonProperty("valid_from")
	private String validFrom;
	@JsonProperty("valid_to")
	private String validTo;
	@JsonProperty("expired_at")
	private String expiredAt;
	public String getUri() {
		return uri;
	}

	public ProductPrice setUri(String uri) {
		this.uri = uri;
		return this;
	}


	public String getProductInformationUri() {
		return productInformationUri;
	}

	public ProductPrice setProductInformationUri(String productInformationUri) {
		this.productInformationUri = productInformationUri;
		return this;
	}


	public java.math.BigDecimal getAmount() {
		return amount;
	}

	public ProductPrice setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
		return this;
	}


	public String getCharged() {
		return charged;
	}

	public ProductPrice setCharged(String charged) {
		this.charged = charged;
		return this;
	}


	public MatchCriteria[] getMatchCriteria() {
		return matchCriteria;
	}

	public ProductPrice setMatchCriteria(MatchCriteria[] matchCriteria) {
		this.matchCriteria = matchCriteria;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class MatchCriteria {

		public MatchCriteria () {
		}
		public MatchCriteria (
			String name, 
			String value) {
			this.name = name;
			this.value = value;
		}


		private String name;
		private String value;
		public String getName() {
			return name;
		}

		public MatchCriteria setName(String name) {
			this.name = name;
			return this;
		}


		public String getValue() {
			return value;
		}

		public MatchCriteria setValue(String value) {
			this.value = value;
			return this;
		}

		public String toString() {
			return "MatchCriteria ["
			+ " name: " + name
			+ " value: " + value
			+ " ]";
		}
	}

	public String getDisplayName() {
		return displayName;
	}

	public ProductPrice setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}


	public Integer getRevision() {
		return revision;
	}

	public ProductPrice setRevision(Integer revision) {
		this.revision = revision;
		return this;
	}


	public String getPublishedAt() {
		return publishedAt;
	}

	public ProductPrice setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
		return this;
	}


	public String getValidFrom() {
		return validFrom;
	}

	public ProductPrice setValidFrom(String validFrom) {
		this.validFrom = validFrom;
		return this;
	}


	public String getValidTo() {
		return validTo;
	}

	public ProductPrice setValidTo(String validTo) {
		this.validTo = validTo;
		return this;
	}


	public String getExpiredAt() {
		return expiredAt;
	}

	public ProductPrice setExpiredAt(String expiredAt) {
		this.expiredAt = expiredAt;
		return this;
	}

	public String toString() {
		return "ProductPrice ["
		+ " uri: " + uri
		+ " productInformationUri: " + productInformationUri
		+ " amount: " + amount
		+ " charged: " + charged
		+ " matchCriteria: " + matchCriteria
		+ " displayName: " + displayName
		+ " revision: " + revision
		+ " publishedAt: " + publishedAt
		+ " validFrom: " + validFrom
		+ " validTo: " + validTo
		+ " expiredAt: " + expiredAt
		+ " ]";
	}
}
