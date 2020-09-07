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
import com.bitly.model.V4.HasReferences;
import com.bitly.model.V4.PlanLimit;
import com.bitly.model.V4.PlanLimitsAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PlanLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class PlanLimits {
  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private Map<String, String> references = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_GUID = "organization_guid";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_GUID)
  private String organizationGuid;

  public static final String SERIALIZED_NAME_PLAN_LIMITS = "plan_limits";
  @SerializedName(SERIALIZED_NAME_PLAN_LIMITS)
  private List<PlanLimit> planLimits = null;


  public PlanLimits references(Map<String, String> references) {
    
    this.references = references;
    return this;
  }

  public PlanLimits putReferencesItem(String key, String referencesItem) {
    if (this.references == null) {
      this.references = new HashMap<String, String>();
    }
    this.references.put(key, referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getReferences() {
    return references;
  }


  public void setReferences(Map<String, String> references) {
    this.references = references;
  }


  public PlanLimits organizationGuid(String organizationGuid) {
    
    this.organizationGuid = organizationGuid;
    return this;
  }

   /**
   * Get organizationGuid
   * @return organizationGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationGuid() {
    return organizationGuid;
  }


  public void setOrganizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
  }


  public PlanLimits planLimits(List<PlanLimit> planLimits) {
    
    this.planLimits = planLimits;
    return this;
  }

  public PlanLimits addPlanLimitsItem(PlanLimit planLimitsItem) {
    if (this.planLimits == null) {
      this.planLimits = new ArrayList<PlanLimit>();
    }
    this.planLimits.add(planLimitsItem);
    return this;
  }

   /**
   * Get planLimits
   * @return planLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PlanLimit> getPlanLimits() {
    return planLimits;
  }


  public void setPlanLimits(List<PlanLimit> planLimits) {
    this.planLimits = planLimits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanLimits planLimits = (PlanLimits) o;
    return Objects.equals(this.references, planLimits.references) &&
        Objects.equals(this.organizationGuid, planLimits.organizationGuid) &&
        Objects.equals(this.planLimits, planLimits.planLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, organizationGuid, planLimits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanLimits {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    organizationGuid: ").append(toIndentedString(organizationGuid)).append("\n");
    sb.append("    planLimits: ").append(toIndentedString(planLimits)).append("\n");
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

