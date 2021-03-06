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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HasReferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class HasReferences {
  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private Map<String, String> references = null;


  public HasReferences references(Map<String, String> references) {
    
    this.references = references;
    return this;
  }

  public HasReferences putReferencesItem(String key, String referencesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasReferences hasReferences = (HasReferences) o;
    return Objects.equals(this.references, hasReferences.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasReferences {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

