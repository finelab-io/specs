package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dk.finelab.product.api.model.CriterionAllowLimit;
import dk.finelab.product.api.model.CriterionAllowValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Criterion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T12:26:12.844058+02:00[Europe/Copenhagen]")
public class Criterion {

  @JsonProperty("name")
  private String name;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("value")
  private String value;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BOOLEAN("BOOLEAN"),
    
    INTEGER("INTEGER"),
    
    DECIMAL("DECIMAL"),
    
    DATE("DATE"),
    
    STRING("STRING"),
    
    EMAIL("EMAIL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("allow_values")
  @Valid
  private List<CriterionAllowValue> allowValues = null;

  @JsonProperty("allow_mulitiselect")
  private Boolean allowMulitiselect;

  @JsonProperty("allow_limit")
  private CriterionAllowLimit allowLimit;

  public Criterion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Criterion displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Criterion value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Criterion type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Criterion allowValues(List<CriterionAllowValue> allowValues) {
    this.allowValues = allowValues;
    return this;
  }

  public Criterion addAllowValuesItem(CriterionAllowValue allowValuesItem) {
    if (this.allowValues == null) {
      this.allowValues = new ArrayList<>();
    }
    this.allowValues.add(allowValuesItem);
    return this;
  }

  /**
   * Get allowValues
   * @return allowValues
  */
  @Valid 
  public List<CriterionAllowValue> getAllowValues() {
    return allowValues;
  }

  public void setAllowValues(List<CriterionAllowValue> allowValues) {
    this.allowValues = allowValues;
  }

  public Criterion allowMulitiselect(Boolean allowMulitiselect) {
    this.allowMulitiselect = allowMulitiselect;
    return this;
  }

  /**
   * Get allowMulitiselect
   * @return allowMulitiselect
  */
  
  public Boolean getAllowMulitiselect() {
    return allowMulitiselect;
  }

  public void setAllowMulitiselect(Boolean allowMulitiselect) {
    this.allowMulitiselect = allowMulitiselect;
  }

  public Criterion allowLimit(CriterionAllowLimit allowLimit) {
    this.allowLimit = allowLimit;
    return this;
  }

  /**
   * Get allowLimit
   * @return allowLimit
  */
  @Valid 
  public CriterionAllowLimit getAllowLimit() {
    return allowLimit;
  }

  public void setAllowLimit(CriterionAllowLimit allowLimit) {
    this.allowLimit = allowLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criterion criterion = (Criterion) o;
    return Objects.equals(this.name, criterion.name) &&
        Objects.equals(this.displayName, criterion.displayName) &&
        Objects.equals(this.value, criterion.value) &&
        Objects.equals(this.type, criterion.type) &&
        Objects.equals(this.allowValues, criterion.allowValues) &&
        Objects.equals(this.allowMulitiselect, criterion.allowMulitiselect) &&
        Objects.equals(this.allowLimit, criterion.allowLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, value, type, allowValues, allowMulitiselect, allowLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criterion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowValues: ").append(toIndentedString(allowValues)).append("\n");
    sb.append("    allowMulitiselect: ").append(toIndentedString(allowMulitiselect)).append("\n");
    sb.append("    allowLimit: ").append(toIndentedString(allowLimit)).append("\n");
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

