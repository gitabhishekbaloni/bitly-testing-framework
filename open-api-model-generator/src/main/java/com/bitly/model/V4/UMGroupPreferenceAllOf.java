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
 * UMGroupPreferenceAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class UMGroupPreferenceAllOf {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_GROUP_GUID = "group_guid";
  @SerializedName(SERIALIZED_NAME_GROUP_GUID)
  private String groupGuid;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_PREFERENCE = "preference";
  @SerializedName(SERIALIZED_NAME_PREFERENCE)
  private String preference;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_LAST_SEEN = "last_seen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private String lastSeen;


  public UMGroupPreferenceAllOf created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public UMGroupPreferenceAllOf groupGuid(String groupGuid) {
    
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


  public UMGroupPreferenceAllOf modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public UMGroupPreferenceAllOf value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public UMGroupPreferenceAllOf preference(String preference) {
    
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreference() {
    return preference;
  }


  public void setPreference(String preference) {
    this.preference = preference;
  }


  public UMGroupPreferenceAllOf expired(Boolean expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExpired() {
    return expired;
  }


  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public UMGroupPreferenceAllOf lastSeen(String lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastSeen() {
    return lastSeen;
  }


  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UMGroupPreferenceAllOf umGroupPreferenceAllOf = (UMGroupPreferenceAllOf) o;
    return Objects.equals(this.created, umGroupPreferenceAllOf.created) &&
        Objects.equals(this.groupGuid, umGroupPreferenceAllOf.groupGuid) &&
        Objects.equals(this.modified, umGroupPreferenceAllOf.modified) &&
        Objects.equals(this.value, umGroupPreferenceAllOf.value) &&
        Objects.equals(this.preference, umGroupPreferenceAllOf.preference) &&
        Objects.equals(this.expired, umGroupPreferenceAllOf.expired) &&
        Objects.equals(this.lastSeen, umGroupPreferenceAllOf.lastSeen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, groupGuid, modified, value, preference, expired, lastSeen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UMGroupPreferenceAllOf {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    groupGuid: ").append(toIndentedString(groupGuid)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
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

