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
 * DeeplinkMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class DeeplinkMetric {
  public static final String SERIALIZED_NAME_APP_INSTALLS = "app_installs";
  @SerializedName(SERIALIZED_NAME_APP_INSTALLS)
  private Integer appInstalls;

  public static final String SERIALIZED_NAME_STORE_VISITS = "store_visits";
  @SerializedName(SERIALIZED_NAME_STORE_VISITS)
  private Integer storeVisits;

  public static final String SERIALIZED_NAME_INTERSTITAL_VIEWS = "interstital_views";
  @SerializedName(SERIALIZED_NAME_INTERSTITAL_VIEWS)
  private Integer interstitalViews;

  public static final String SERIALIZED_NAME_APP_OPENS = "app_opens";
  @SerializedName(SERIALIZED_NAME_APP_OPENS)
  private Integer appOpens;

  public static final String SERIALIZED_NAME_WEB_OPENS = "web_opens";
  @SerializedName(SERIALIZED_NAME_WEB_OPENS)
  private Integer webOpens;


  public DeeplinkMetric appInstalls(Integer appInstalls) {
    
    this.appInstalls = appInstalls;
    return this;
  }

   /**
   * Get appInstalls
   * @return appInstalls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAppInstalls() {
    return appInstalls;
  }


  public void setAppInstalls(Integer appInstalls) {
    this.appInstalls = appInstalls;
  }


  public DeeplinkMetric storeVisits(Integer storeVisits) {
    
    this.storeVisits = storeVisits;
    return this;
  }

   /**
   * Get storeVisits
   * @return storeVisits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoreVisits() {
    return storeVisits;
  }


  public void setStoreVisits(Integer storeVisits) {
    this.storeVisits = storeVisits;
  }


  public DeeplinkMetric interstitalViews(Integer interstitalViews) {
    
    this.interstitalViews = interstitalViews;
    return this;
  }

   /**
   * Get interstitalViews
   * @return interstitalViews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInterstitalViews() {
    return interstitalViews;
  }


  public void setInterstitalViews(Integer interstitalViews) {
    this.interstitalViews = interstitalViews;
  }


  public DeeplinkMetric appOpens(Integer appOpens) {
    
    this.appOpens = appOpens;
    return this;
  }

   /**
   * Get appOpens
   * @return appOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAppOpens() {
    return appOpens;
  }


  public void setAppOpens(Integer appOpens) {
    this.appOpens = appOpens;
  }


  public DeeplinkMetric webOpens(Integer webOpens) {
    
    this.webOpens = webOpens;
    return this;
  }

   /**
   * Get webOpens
   * @return webOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWebOpens() {
    return webOpens;
  }


  public void setWebOpens(Integer webOpens) {
    this.webOpens = webOpens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeeplinkMetric deeplinkMetric = (DeeplinkMetric) o;
    return Objects.equals(this.appInstalls, deeplinkMetric.appInstalls) &&
        Objects.equals(this.storeVisits, deeplinkMetric.storeVisits) &&
        Objects.equals(this.interstitalViews, deeplinkMetric.interstitalViews) &&
        Objects.equals(this.appOpens, deeplinkMetric.appOpens) &&
        Objects.equals(this.webOpens, deeplinkMetric.webOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstalls, storeVisits, interstitalViews, appOpens, webOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeeplinkMetric {\n");
    sb.append("    appInstalls: ").append(toIndentedString(appInstalls)).append("\n");
    sb.append("    storeVisits: ").append(toIndentedString(storeVisits)).append("\n");
    sb.append("    interstitalViews: ").append(toIndentedString(interstitalViews)).append("\n");
    sb.append("    appOpens: ").append(toIndentedString(appOpens)).append("\n");
    sb.append("    webOpens: ").append(toIndentedString(webOpens)).append("\n");
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

