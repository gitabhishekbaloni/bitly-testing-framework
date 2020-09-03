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
import com.bitly.model.V4.AccessFeature;
import com.bitly.model.V4.ConsumableFeatureFull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FeatureUsage
 */
@JsonPropertyOrder({
  FeatureUsage.JSON_PROPERTY_CONSUMABLE_FEATURES,
  FeatureUsage.JSON_PROPERTY_ACCESS_FEATURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class FeatureUsage {
  public static final String JSON_PROPERTY_CONSUMABLE_FEATURES = "consumable_features";
  private List<ConsumableFeatureFull> consumableFeatures = null;

  public static final String JSON_PROPERTY_ACCESS_FEATURES = "access_features";
  private List<AccessFeature> accessFeatures = null;


  public FeatureUsage consumableFeatures(List<ConsumableFeatureFull> consumableFeatures) {
    
    this.consumableFeatures = consumableFeatures;
    return this;
  }

  public FeatureUsage addConsumableFeaturesItem(ConsumableFeatureFull consumableFeaturesItem) {
    if (this.consumableFeatures == null) {
      this.consumableFeatures = new ArrayList<ConsumableFeatureFull>();
    }
    this.consumableFeatures.add(consumableFeaturesItem);
    return this;
  }

   /**
   * an array of all of the organizations consumable features
   * @return consumableFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an array of all of the organizations consumable features")
  @JsonProperty(JSON_PROPERTY_CONSUMABLE_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConsumableFeatureFull> getConsumableFeatures() {
    return consumableFeatures;
  }


  public void setConsumableFeatures(List<ConsumableFeatureFull> consumableFeatures) {
    this.consumableFeatures = consumableFeatures;
  }


  public FeatureUsage accessFeatures(List<AccessFeature> accessFeatures) {
    
    this.accessFeatures = accessFeatures;
    return this;
  }

  public FeatureUsage addAccessFeaturesItem(AccessFeature accessFeaturesItem) {
    if (this.accessFeatures == null) {
      this.accessFeatures = new ArrayList<AccessFeature>();
    }
    this.accessFeatures.add(accessFeaturesItem);
    return this;
  }

   /**
   * an array of all of the organizations access features
   * @return accessFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an array of all of the organizations access features")
  @JsonProperty(JSON_PROPERTY_ACCESS_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccessFeature> getAccessFeatures() {
    return accessFeatures;
  }


  public void setAccessFeatures(List<AccessFeature> accessFeatures) {
    this.accessFeatures = accessFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureUsage featureUsage = (FeatureUsage) o;
    return Objects.equals(this.consumableFeatures, featureUsage.consumableFeatures) &&
        Objects.equals(this.accessFeatures, featureUsage.accessFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumableFeatures, accessFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureUsage {\n");
    sb.append("    consumableFeatures: ").append(toIndentedString(consumableFeatures)).append("\n");
    sb.append("    accessFeatures: ").append(toIndentedString(accessFeatures)).append("\n");
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
