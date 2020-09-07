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
import com.bitly.model.V4.ConsumableFeature;
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
 * ConsumableFeatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class ConsumableFeatures {
  public static final String SERIALIZED_NAME_CONSUMABLE_FEATURES = "consumable_features";
  @SerializedName(SERIALIZED_NAME_CONSUMABLE_FEATURES)
  private List<ConsumableFeature> consumableFeatures = null;


  public ConsumableFeatures consumableFeatures(List<ConsumableFeature> consumableFeatures) {
    
    this.consumableFeatures = consumableFeatures;
    return this;
  }

  public ConsumableFeatures addConsumableFeaturesItem(ConsumableFeature consumableFeaturesItem) {
    if (this.consumableFeatures == null) {
      this.consumableFeatures = new ArrayList<ConsumableFeature>();
    }
    this.consumableFeatures.add(consumableFeaturesItem);
    return this;
  }

   /**
   * Get consumableFeatures
   * @return consumableFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConsumableFeature> getConsumableFeatures() {
    return consumableFeatures;
  }


  public void setConsumableFeatures(List<ConsumableFeature> consumableFeatures) {
    this.consumableFeatures = consumableFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumableFeatures consumableFeatures = (ConsumableFeatures) o;
    return Objects.equals(this.consumableFeatures, consumableFeatures.consumableFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumableFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumableFeatures {\n");
    sb.append("    consumableFeatures: ").append(toIndentedString(consumableFeatures)).append("\n");
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

