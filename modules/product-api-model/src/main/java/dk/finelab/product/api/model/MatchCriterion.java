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
 * MatchCriterion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T12:26:12.844058+02:00[Europe/Copenhagen]")
public class MatchCriterion {

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public MatchCriterion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the parameter name (key) for the criterion
   * @return name
  */
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MatchCriterion value(String value) {
    this.value = value;
    return this;
  }

  /**
   * the value to match for the criterion
   * @return value
  */
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriterion matchCriterion = (MatchCriterion) o;
    return Objects.equals(this.name, matchCriterion.name) &&
        Objects.equals(this.value, matchCriterion.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriterion {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

