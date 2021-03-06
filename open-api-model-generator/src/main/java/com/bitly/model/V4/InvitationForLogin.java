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


package com.bitly.model.V4;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvitationForLogin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class InvitationForLogin {
  public static final String SERIALIZED_NAME_INVITED_ORG_NAME = "invited_org_name";
  @SerializedName(SERIALIZED_NAME_INVITED_ORG_NAME)
  private String invitedOrgName;

  public static final String SERIALIZED_NAME_INVITED_ORG_GUID = "invited_org_guid";
  @SerializedName(SERIALIZED_NAME_INVITED_ORG_GUID)
  private String invitedOrgGuid;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_INVITED_BY_EMAIL = "invited_by_email";
  @SerializedName(SERIALIZED_NAME_INVITED_BY_EMAIL)
  private String invitedByEmail;

  public static final String SERIALIZED_NAME_INVITED_BY = "invited_by";
  @SerializedName(SERIALIZED_NAME_INVITED_BY)
  private String invitedBy;


  public InvitationForLogin invitedOrgName(String invitedOrgName) {
    
    this.invitedOrgName = invitedOrgName;
    return this;
  }

   /**
   * Get invitedOrgName
   * @return invitedOrgName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getInvitedOrgName() {
    return invitedOrgName;
  }


  public void setInvitedOrgName(String invitedOrgName) {
    this.invitedOrgName = invitedOrgName;
  }


  public InvitationForLogin invitedOrgGuid(String invitedOrgGuid) {
    
    this.invitedOrgGuid = invitedOrgGuid;
    return this;
  }

   /**
   * Get invitedOrgGuid
   * @return invitedOrgGuid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getInvitedOrgGuid() {
    return invitedOrgGuid;
  }


  public void setInvitedOrgGuid(String invitedOrgGuid) {
    this.invitedOrgGuid = invitedOrgGuid;
  }


  public InvitationForLogin token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public InvitationForLogin invitedByEmail(String invitedByEmail) {
    
    this.invitedByEmail = invitedByEmail;
    return this;
  }

   /**
   * Get invitedByEmail
   * @return invitedByEmail
  **/
  @ApiModelProperty(required = true, value = "")

  public String getInvitedByEmail() {
    return invitedByEmail;
  }


  public void setInvitedByEmail(String invitedByEmail) {
    this.invitedByEmail = invitedByEmail;
  }


  public InvitationForLogin invitedBy(String invitedBy) {
    
    this.invitedBy = invitedBy;
    return this;
  }

   /**
   * Get invitedBy
   * @return invitedBy
  **/
  @ApiModelProperty(required = true, value = "")

  public String getInvitedBy() {
    return invitedBy;
  }


  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationForLogin invitationForLogin = (InvitationForLogin) o;
    return Objects.equals(this.invitedOrgName, invitationForLogin.invitedOrgName) &&
        Objects.equals(this.invitedOrgGuid, invitationForLogin.invitedOrgGuid) &&
        Objects.equals(this.token, invitationForLogin.token) &&
        Objects.equals(this.invitedByEmail, invitationForLogin.invitedByEmail) &&
        Objects.equals(this.invitedBy, invitationForLogin.invitedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitedOrgName, invitedOrgGuid, token, invitedByEmail, invitedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationForLogin {\n");
    sb.append("    invitedOrgName: ").append(toIndentedString(invitedOrgName)).append("\n");
    sb.append("    invitedOrgGuid: ").append(toIndentedString(invitedOrgGuid)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    invitedByEmail: ").append(toIndentedString(invitedByEmail)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
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

