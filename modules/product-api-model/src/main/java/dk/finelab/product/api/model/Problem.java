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
 * Problem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T10:45:54.887260+02:00[Europe/Copenhagen]")
public class Problem {

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("instance")
  private String instance;

  public Problem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * URI that identifies the problem type.
   * @return type
  */
  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Problem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, summary of the problem type.
   * @return title
  */
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Problem status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code
   * @return status
  */
  
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Problem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * An explanation specific to the problem.
   * @return detail
  */
  
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Problem instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * An URI that identifies the occurrence of the problem.
   * @return instance
  */
  
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

