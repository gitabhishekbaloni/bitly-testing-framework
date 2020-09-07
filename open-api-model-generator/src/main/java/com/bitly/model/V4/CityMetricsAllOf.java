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
import com.bitly.model.V4.CityMetric;
import com.bitly.model.V4.OtherMetrics;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CityMetricsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class CityMetricsAllOf {
  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<CityMetric> metrics = null;

  public static final String SERIALIZED_NAME_OTHER_METRICS = "other_metrics";
  @SerializedName(SERIALIZED_NAME_OTHER_METRICS)
  private OtherMetrics otherMetrics;


  public CityMetricsAllOf metrics(List<CityMetric> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public CityMetricsAllOf addMetricsItem(CityMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<CityMetric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CityMetric> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<CityMetric> metrics) {
    this.metrics = metrics;
  }


  public CityMetricsAllOf otherMetrics(OtherMetrics otherMetrics) {
    
    this.otherMetrics = otherMetrics;
    return this;
  }

   /**
   * Get otherMetrics
   * @return otherMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherMetrics getOtherMetrics() {
    return otherMetrics;
  }


  public void setOtherMetrics(OtherMetrics otherMetrics) {
    this.otherMetrics = otherMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityMetricsAllOf cityMetricsAllOf = (CityMetricsAllOf) o;
    return Objects.equals(this.metrics, cityMetricsAllOf.metrics) &&
        Objects.equals(this.otherMetrics, cityMetricsAllOf.otherMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, otherMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityMetricsAllOf {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    otherMetrics: ").append(toIndentedString(otherMetrics)).append("\n");
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

