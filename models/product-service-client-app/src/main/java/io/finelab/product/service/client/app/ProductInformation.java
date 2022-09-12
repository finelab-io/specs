package io.finelab.product.service.client.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductInformation {

	public ProductInformation () {
	}

	public ProductInformation (
		String uri, 
		String catalogUri, 
		String number, 
		String name, 
		String displayName, 
		QuoteCriteria[] quoteCriteria, 
		Integer revision, 
		java.time.OffsetDateTime publishedAt, 
		java.time.OffsetDateTime expiredAt) {
		this.uri = uri;
		this.catalogUri = catalogUri;
		this.number = number;
		this.name = name;
		this.displayName = displayName;
		this.quoteCriteria = quoteCriteria;
		this.revision = revision;
		this.publishedAt = publishedAt;
		this.expiredAt = expiredAt;
	}

	private String uri;
	@JsonProperty("catalog_uri")
	private String catalogUri;
	private String number;
	private String name;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("quote_criteria")
	private QuoteCriteria[] quoteCriteria;
	private Integer revision;
	@JsonProperty("published_at")
	private java.time.OffsetDateTime publishedAt;
	@JsonProperty("expired_at")
	private java.time.OffsetDateTime expiredAt;
	public String getUri() {
		return uri;
	}

	public ProductInformation setUri(String uri) {
		this.uri = uri;
		return this;
	}


	public String getCatalogUri() {
		return catalogUri;
	}

	public ProductInformation setCatalogUri(String catalogUri) {
		this.catalogUri = catalogUri;
		return this;
	}


	public String getNumber() {
		return number;
	}

	public ProductInformation setNumber(String number) {
		this.number = number;
		return this;
	}


	public String getName() {
		return name;
	}

	public ProductInformation setName(String name) {
		this.name = name;
		return this;
	}


	public String getDisplayName() {
		return displayName;
	}

	public ProductInformation setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}


	public QuoteCriteria[] getQuoteCriteria() {
		return quoteCriteria;
	}

	public ProductInformation setQuoteCriteria(QuoteCriteria[] quoteCriteria) {
		this.quoteCriteria = quoteCriteria;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class QuoteCriteria {

		public QuoteCriteria () {
		}
		public QuoteCriteria (
			String name, 
			String displayName, 
			String value, 
			Type type, 
			AllowValues[] allowValues, 
			Boolean allowMulitiselect, 
			AllowLimit allowLimit) {
			this.name = name;
			this.displayName = displayName;
			this.value = value;
			this.type = type;
			this.allowValues = allowValues;
			this.allowMulitiselect = allowMulitiselect;
			this.allowLimit = allowLimit;
		}


		private String name;
		@JsonProperty("display_name")
		private String displayName;
		private String value;
		private Type type;
		@JsonProperty("allow_values")
		private AllowValues[] allowValues;
		@JsonProperty("allow_mulitiselect")
		private Boolean allowMulitiselect;
		@JsonProperty("allow_limit")
		private AllowLimit allowLimit;
		public String getName() {
			return name;
		}

		public QuoteCriteria setName(String name) {
			this.name = name;
			return this;
		}


		public String getDisplayName() {
			return displayName;
		}

		public QuoteCriteria setDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}


		public String getValue() {
			return value;
		}

		public QuoteCriteria setValue(String value) {
			this.value = value;
			return this;
		}


		public Type getType() {
			return type;
		}

		public QuoteCriteria setType(Type type) {
			this.type = type;
			return this;
		}


		public static enum Type { BOOLEAN,INTEGER,DECIMAL,DATE,STRING,EMAIL }
		public AllowValues[] getAllowValues() {
			return allowValues;
		}

		public QuoteCriteria setAllowValues(AllowValues[] allowValues) {
			this.allowValues = allowValues;
			return this;
		}



		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class AllowValues {

			public AllowValues () {
			}
			public AllowValues (
				String key, 
				String displayValue, 
				Boolean selected) {
				this.key = key;
				this.displayValue = displayValue;
				this.selected = selected;
			}


			private String key;
			@JsonProperty("display_value")
			private String displayValue;
			private Boolean selected;
			public String getKey() {
				return key;
			}

			public AllowValues setKey(String key) {
				this.key = key;
				return this;
			}


			public String getDisplayValue() {
				return displayValue;
			}

			public AllowValues setDisplayValue(String displayValue) {
				this.displayValue = displayValue;
				return this;
			}


			public Boolean getSelected() {
				return selected;
			}

			public AllowValues setSelected(Boolean selected) {
				this.selected = selected;
				return this;
			}

			public String toString() {
				return "AllowValues ["
				+ " key: " + key
				+ " displayValue: " + displayValue
				+ " selected: " + selected
				+ " ]";
			}
		}

		public Boolean getAllowMulitiselect() {
			return allowMulitiselect;
		}

		public QuoteCriteria setAllowMulitiselect(Boolean allowMulitiselect) {
			this.allowMulitiselect = allowMulitiselect;
			return this;
		}


		public AllowLimit getAllowLimit() {
			return allowLimit;
		}

		public QuoteCriteria setAllowLimit(AllowLimit allowLimit) {
			this.allowLimit = allowLimit;
			return this;
		}



		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class AllowLimit {

			public AllowLimit () {
			}

			public AllowLimit (
				String minValue, 
				Boolean minInclusive, 
				String maxValue, 
				String maxInclusive) {
				this.minValue = minValue;
				this.minInclusive = minInclusive;
				this.maxValue = maxValue;
				this.maxInclusive = maxInclusive;
			}

			@JsonProperty("min_value")
			private String minValue;
			@JsonProperty("min_inclusive")
			private Boolean minInclusive;
			@JsonProperty("max_value")
			private String maxValue;
			@JsonProperty("max_inclusive")
			private String maxInclusive;
			public String getMinValue() {
				return minValue;
			}

			public AllowLimit setMinValue(String minValue) {
				this.minValue = minValue;
				return this;
			}


			public Boolean getMinInclusive() {
				return minInclusive;
			}

			public AllowLimit setMinInclusive(Boolean minInclusive) {
				this.minInclusive = minInclusive;
				return this;
			}


			public String getMaxValue() {
				return maxValue;
			}

			public AllowLimit setMaxValue(String maxValue) {
				this.maxValue = maxValue;
				return this;
			}


			public String getMaxInclusive() {
				return maxInclusive;
			}

			public AllowLimit setMaxInclusive(String maxInclusive) {
				this.maxInclusive = maxInclusive;
				return this;
			}

			public String toString() {
				return "AllowLimit ["
				+ " minValue: " + minValue
				+ " minInclusive: " + minInclusive
				+ " maxValue: " + maxValue
				+ " maxInclusive: " + maxInclusive
				+ " ]";
			}
		}
		public String toString() {
			return "QuoteCriteria ["
			+ " name: " + name
			+ " displayName: " + displayName
			+ " value: " + value
			+ " type: " + type
			+ " allowValues: " + allowValues
			+ " allowMulitiselect: " + allowMulitiselect
			+ " allowLimit: " + allowLimit
			+ " ]";
		}
	}

	public Integer getRevision() {
		return revision;
	}

	public ProductInformation setRevision(Integer revision) {
		this.revision = revision;
		return this;
	}


	public java.time.OffsetDateTime getPublishedAt() {
		return publishedAt;
	}

	public ProductInformation setPublishedAt(java.time.OffsetDateTime publishedAt) {
		this.publishedAt = publishedAt;
		return this;
	}


	public java.time.OffsetDateTime getExpiredAt() {
		return expiredAt;
	}

	public ProductInformation setExpiredAt(java.time.OffsetDateTime expiredAt) {
		this.expiredAt = expiredAt;
		return this;
	}

	public String toString() {
		return "ProductInformation ["
		+ " uri: " + uri
		+ " catalogUri: " + catalogUri
		+ " number: " + number
		+ " name: " + name
		+ " displayName: " + displayName
		+ " quoteCriteria: " + quoteCriteria
		+ " revision: " + revision
		+ " publishedAt: " + publishedAt
		+ " expiredAt: " + expiredAt
		+ " ]";
	}
}
