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
 * BitlinkHistoryAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class BitlinkHistoryAllOf {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_GROUP_GUID = "group_guid";
  @SerializedName(SERIALIZED_NAME_GROUP_GUID)
  private String groupGuid;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LONG_URL = "long_url";
  @SerializedName(SERIALIZED_NAME_LONG_URL)
  private String longUrl;

  public static final String SERIALIZED_NAME_DEACTIVATED_AT = "deactivated_at";
  @SerializedName(SERIALIZED_NAME_DEACTIVATED_AT)
  private String deactivatedAt;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public BitlinkHistoryAllOf hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public BitlinkHistoryAllOf groupGuid(String groupGuid) {
    
    this.groupGuid = groupGuid;
    return this;
  }

   /**
   * Get groupGuid
   * @return groupGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupGuid() {
    return groupGuid;
  }


  public void setGroupGuid(String groupGuid) {
    this.groupGuid = groupGuid;
  }


  public BitlinkHistoryAllOf createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public BitlinkHistoryAllOf isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public BitlinkHistoryAllOf longUrl(String longUrl) {
    
    this.longUrl = longUrl;
    return this;
  }

   /**
   * Get longUrl
   * @return longUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLongUrl() {
    return longUrl;
  }


  public void setLongUrl(String longUrl) {
    this.longUrl = longUrl;
  }


  public BitlinkHistoryAllOf deactivatedAt(String deactivatedAt) {
    
    this.deactivatedAt = deactivatedAt;
    return this;
  }

   /**
   * Get deactivatedAt
   * @return deactivatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeactivatedAt() {
    return deactivatedAt;
  }


  public void setDeactivatedAt(String deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
  }


  public BitlinkHistoryAllOf login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public BitlinkHistoryAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitlinkHistoryAllOf bitlinkHistoryAllOf = (BitlinkHistoryAllOf) o;
    return Objects.equals(this.hash, bitlinkHistoryAllOf.hash) &&
        Objects.equals(this.groupGuid, bitlinkHistoryAllOf.groupGuid) &&
        Objects.equals(this.createdAt, bitlinkHistoryAllOf.createdAt) &&
        Objects.equals(this.isActive, bitlinkHistoryAllOf.isActive) &&
        Objects.equals(this.longUrl, bitlinkHistoryAllOf.longUrl) &&
        Objects.equals(this.deactivatedAt, bitlinkHistoryAllOf.deactivatedAt) &&
        Objects.equals(this.login, bitlinkHistoryAllOf.login) &&
        Objects.equals(this.id, bitlinkHistoryAllOf.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, groupGuid, createdAt, isActive, longUrl, deactivatedAt, login, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitlinkHistoryAllOf {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    groupGuid: ").append(toIndentedString(groupGuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    longUrl: ").append(toIndentedString(longUrl)).append("\n");
    sb.append("    deactivatedAt: ").append(toIndentedString(deactivatedAt)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

