/*
 * Bitly API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@bitly.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package bitly.api.model.bitly.V4;

import java.util.Objects;
import java.util.Arrays;
import bitly.api.model.bitly.V4.Pagination;
import bitly.api.model.bitly.V4.UserInternal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Users
 */
@JsonPropertyOrder({
  Users.JSON_PROPERTY_PAGINATION,
  Users.JSON_PROPERTY_USERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class Users {
  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private Pagination pagination;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<UserInternal> users = null;


  public Users pagination(Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pagination getPagination() {
    return pagination;
  }


  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  public Users users(List<UserInternal> users) {
    
    this.users = users;
    return this;
  }

  public Users addUsersItem(UserInternal usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserInternal>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserInternal> getUsers() {
    return users;
  }


  public void setUsers(List<UserInternal> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users users = (Users) o;
    return Objects.equals(this.pagination, users.pagination) &&
        Objects.equals(this.users, users.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

