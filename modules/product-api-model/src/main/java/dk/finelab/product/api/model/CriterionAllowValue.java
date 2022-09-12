package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CriterionAllowValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T12:26:12.844058+02:00[Europe/Copenhagen]")
public class CriterionAllowValue {

  @JsonProperty("key")
  private String key;

  @JsonProperty("display_value")
  private String displayValue;

  @JsonProperty("selected")
  private Boolean selected;

  public CriterionAllowValue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CriterionAllowValue displayValue(String displayValue) {
    this.displayValue = displayValue;
    return this;
  }

  /**
   * Get displayValue
   * @return displayValue
  */
  
  public String getDisplayValue() {
    return displayValue;
  }

  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }

  public CriterionAllowValue selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Get selected
   * @return selected
  */
  
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriterionAllowValue criterionAllowValue = (CriterionAllowValue) o;
    return Objects.equals(this.key, criterionAllowValue.key) &&
        Objects.equals(this.displayValue, criterionAllowValue.displayValue) &&
        Objects.equals(this.selected, criterionAllowValue.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, displayValue, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriterionAllowValue {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

