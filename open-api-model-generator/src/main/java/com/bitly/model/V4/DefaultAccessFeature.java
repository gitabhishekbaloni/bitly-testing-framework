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
 * the tier default values for a single access feature
 */
@ApiModel(description = "the tier default values for a single access feature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class DefaultAccessFeature {
  public static final String SERIALIZED_NAME_HAS_ACCESS = "has_access";
  @SerializedName(SERIALIZED_NAME_HAS_ACCESS)
  private Boolean hasAccess;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DefaultAccessFeature hasAccess(Boolean hasAccess) {
    
    this.hasAccess = hasAccess;
    return this;
  }

   /**
   * Get hasAccess
   * @return hasAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasAccess() {
    return hasAccess;
  }


  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }


  public DefaultAccessFeature name(String name) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultAccessFeature defaultAccessFeature = (DefaultAccessFeature) o;
    return Objects.equals(this.hasAccess, defaultAccessFeature.hasAccess) &&
        Objects.equals(this.name, defaultAccessFeature.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAccess, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultAccessFeature {\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

