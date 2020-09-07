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
import com.bitly.model.V4.WebhookAllOf;
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
 * Webhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class Webhook {
  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private Map<String, String> references = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modified_by";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DEACTIVATED = "deactivated";
  @SerializedName(SERIALIZED_NAME_DEACTIVATED)
  private String deactivated;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_ORGANIZATION_GUID = "organization_guid";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_GUID)
  private String organizationGuid;

  public static final String SERIALIZED_NAME_GROUP_GUID = "group_guid";
  @SerializedName(SERIALIZED_NAME_GROUP_GUID)
  private String groupGuid;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;


  public Webhook references(Map<String, String> references) {
    
    this.references = references;
    return this;
  }

  public Webhook putReferencesItem(String key, String referencesItem) {
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


  public Webhook status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Webhook modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(required = true, value = "")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public Webhook name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Webhook created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public Webhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Webhook deactivated(String deactivated) {
    
    this.deactivated = deactivated;
    return this;
  }

   /**
   * Get deactivated
   * @return deactivated
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDeactivated() {
    return deactivated;
  }


  public void setDeactivated(String deactivated) {
    this.deactivated = deactivated;
  }


  public Webhook isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public Webhook modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public Webhook organizationGuid(String organizationGuid) {
    
    this.organizationGuid = organizationGuid;
    return this;
  }

   /**
   * Get organizationGuid
   * @return organizationGuid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getOrganizationGuid() {
    return organizationGuid;
  }


  public void setOrganizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
  }


  public Webhook groupGuid(String groupGuid) {
    
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


  public Webhook guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public Webhook event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.references, webhook.references) &&
        Objects.equals(this.status, webhook.status) &&
        Objects.equals(this.modifiedBy, webhook.modifiedBy) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.created, webhook.created) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.deactivated, webhook.deactivated) &&
        Objects.equals(this.isActive, webhook.isActive) &&
        Objects.equals(this.modified, webhook.modified) &&
        Objects.equals(this.organizationGuid, webhook.organizationGuid) &&
        Objects.equals(this.groupGuid, webhook.groupGuid) &&
        Objects.equals(this.guid, webhook.guid) &&
        Objects.equals(this.event, webhook.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, status, modifiedBy, name, created, url, deactivated, isActive, modified, organizationGuid, groupGuid, guid, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    organizationGuid: ").append(toIndentedString(organizationGuid)).append("\n");
    sb.append("    groupGuid: ").append(toIndentedString(groupGuid)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

