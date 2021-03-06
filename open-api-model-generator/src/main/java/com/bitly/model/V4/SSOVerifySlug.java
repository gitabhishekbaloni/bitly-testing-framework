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
 * SSOVerifySlug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class SSOVerifySlug {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_URL_SLUG = "url_slug";
  @SerializedName(SERIALIZED_NAME_URL_SLUG)
  private String urlSlug;


  public SSOVerifySlug available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAvailable() {
    return available;
  }


  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public SSOVerifySlug urlSlug(String urlSlug) {
    
    this.urlSlug = urlSlug;
    return this;
  }

   /**
   * Get urlSlug
   * @return urlSlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrlSlug() {
    return urlSlug;
  }


  public void setUrlSlug(String urlSlug) {
    this.urlSlug = urlSlug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOVerifySlug ssOVerifySlug = (SSOVerifySlug) o;
    return Objects.equals(this.available, ssOVerifySlug.available) &&
        Objects.equals(this.urlSlug, ssOVerifySlug.urlSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, urlSlug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOVerifySlug {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    urlSlug: ").append(toIndentedString(urlSlug)).append("\n");
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

