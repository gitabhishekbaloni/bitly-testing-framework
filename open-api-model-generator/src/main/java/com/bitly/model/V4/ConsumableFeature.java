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
 * ConsumableFeature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class ConsumableFeature {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_IS_TIER_DEFAULT = "is_tier_default";
  @SerializedName(SERIALIZED_NAME_IS_TIER_DEFAULT)
  private Boolean isTierDefault;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public ConsumableFeature name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConsumableFeature created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * ISO_TIMESTAMP
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO_TIMESTAMP")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public ConsumableFeature modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * ISO_TIMESTAMP
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO_TIMESTAMP")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public ConsumableFeature limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ConsumableFeature isTierDefault(Boolean isTierDefault) {
    
    this.isTierDefault = isTierDefault;
    return this;
  }

   /**
   * Get isTierDefault
   * @return isTierDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTierDefault() {
    return isTierDefault;
  }


  public void setIsTierDefault(Boolean isTierDefault) {
    this.isTierDefault = isTierDefault;
  }


  public ConsumableFeature id(String id) {
    
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
    ConsumableFeature consumableFeature = (ConsumableFeature) o;
    return Objects.equals(this.name, consumableFeature.name) &&
        Objects.equals(this.created, consumableFeature.created) &&
        Objects.equals(this.modified, consumableFeature.modified) &&
        Objects.equals(this.limit, consumableFeature.limit) &&
        Objects.equals(this.isTierDefault, consumableFeature.isTierDefault) &&
        Objects.equals(this.id, consumableFeature.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, created, modified, limit, isTierDefault, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumableFeature {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    isTierDefault: ").append(toIndentedString(isTierDefault)).append("\n");
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

