package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CriterionAllowLimit
 */

@JsonTypeName("Criterion_allow_limit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T10:45:54.887260+02:00[Europe/Copenhagen]")
public class CriterionAllowLimit {

  @JsonProperty("min_value")
  private String minValue;

  @JsonProperty("min_inclusive")
  private Boolean minInclusive;

  @JsonProperty("max_value")
  private String maxValue;

  @JsonProperty("max_inclusive")
  private String maxInclusive;

  public CriterionAllowLimit minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Get minValue
   * @return minValue
  */
  
  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }

  public CriterionAllowLimit minInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
    return this;
  }

  /**
   * Get minInclusive
   * @return minInclusive
  */
  
  public Boolean getMinInclusive() {
    return minInclusive;
  }

  public void setMinInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
  }

  public CriterionAllowLimit maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Get maxValue
   * @return maxValue
  */
  
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }

  public CriterionAllowLimit maxInclusive(String maxInclusive) {
    this.maxInclusive = maxInclusive;
    return this;
  }

  /**
   * Get maxInclusive
   * @return maxInclusive
  */
  
  public String getMaxInclusive() {
    return maxInclusive;
  }

  public void setMaxInclusive(String maxInclusive) {
    this.maxInclusive = maxInclusive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriterionAllowLimit criterionAllowLimit = (CriterionAllowLimit) o;
    return Objects.equals(this.minValue, criterionAllowLimit.minValue) &&
        Objects.equals(this.minInclusive, criterionAllowLimit.minInclusive) &&
        Objects.equals(this.maxValue, criterionAllowLimit.maxValue) &&
        Objects.equals(this.maxInclusive, criterionAllowLimit.maxInclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minValue, minInclusive, maxValue, maxInclusive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriterionAllowLimit {\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    minInclusive: ").append(toIndentedString(minInclusive)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    maxInclusive: ").append(toIndentedString(maxInclusive)).append("\n");
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

