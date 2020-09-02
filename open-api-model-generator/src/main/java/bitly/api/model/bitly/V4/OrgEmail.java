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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OrgEmail
 */
@JsonPropertyOrder({
  OrgEmail.JSON_PROPERTY_ORG_GUID,
  OrgEmail.JSON_PROPERTY_CREATED_TS,
  OrgEmail.JSON_PROPERTY_LOGIN,
  OrgEmail.JSON_PROPERTY_EMAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class OrgEmail {
  public static final String JSON_PROPERTY_ORG_GUID = "org_guid";
  private String orgGuid;

  public static final String JSON_PROPERTY_CREATED_TS = "created_ts";
  private Integer createdTs;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public OrgEmail orgGuid(String orgGuid) {
    
    this.orgGuid = orgGuid;
    return this;
  }

   /**
   * Get orgGuid
   * @return orgGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgGuid() {
    return orgGuid;
  }


  public void setOrgGuid(String orgGuid) {
    this.orgGuid = orgGuid;
  }


  public OrgEmail createdTs(Integer createdTs) {
    
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Get createdTs
   * @return createdTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedTs() {
    return createdTs;
  }


  public void setCreatedTs(Integer createdTs) {
    this.createdTs = createdTs;
  }


  public OrgEmail login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public OrgEmail email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgEmail orgEmail = (OrgEmail) o;
    return Objects.equals(this.orgGuid, orgEmail.orgGuid) &&
        Objects.equals(this.createdTs, orgEmail.createdTs) &&
        Objects.equals(this.login, orgEmail.login) &&
        Objects.equals(this.email, orgEmail.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgGuid, createdTs, login, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgEmail {\n");
    sb.append("    orgGuid: ").append(toIndentedString(orgGuid)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

