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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * WebhookAllOf
 */
@JsonPropertyOrder({
  WebhookAllOf.JSON_PROPERTY_STATUS,
  WebhookAllOf.JSON_PROPERTY_MODIFIED_BY,
  WebhookAllOf.JSON_PROPERTY_NAME,
  WebhookAllOf.JSON_PROPERTY_CREATED,
  WebhookAllOf.JSON_PROPERTY_URL,
  WebhookAllOf.JSON_PROPERTY_DEACTIVATED,
  WebhookAllOf.JSON_PROPERTY_IS_ACTIVE,
  WebhookAllOf.JSON_PROPERTY_MODIFIED,
  WebhookAllOf.JSON_PROPERTY_ORGANIZATION_GUID,
  WebhookAllOf.JSON_PROPERTY_GROUP_GUID,
  WebhookAllOf.JSON_PROPERTY_GUID,
  WebhookAllOf.JSON_PROPERTY_EVENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class WebhookAllOf {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DEACTIVATED = "deactivated";
  private String deactivated;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_ORGANIZATION_GUID = "organization_guid";
  private String organizationGuid;

  public static final String JSON_PROPERTY_GROUP_GUID = "group_guid";
  private String groupGuid;

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_EVENT = "event";
  private String event;


  public WebhookAllOf status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WebhookAllOf modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public WebhookAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookAllOf created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public WebhookAllOf url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookAllOf deactivated(String deactivated) {
    
    this.deactivated = deactivated;
    return this;
  }

   /**
   * Get deactivated
   * @return deactivated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeactivated() {
    return deactivated;
  }


  public void setDeactivated(String deactivated) {
    this.deactivated = deactivated;
  }


  public WebhookAllOf isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public WebhookAllOf modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public WebhookAllOf organizationGuid(String organizationGuid) {
    
    this.organizationGuid = organizationGuid;
    return this;
  }

   /**
   * Get organizationGuid
   * @return organizationGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationGuid() {
    return organizationGuid;
  }


  public void setOrganizationGuid(String organizationGuid) {
    this.organizationGuid = organizationGuid;
  }


  public WebhookAllOf groupGuid(String groupGuid) {
    
    this.groupGuid = groupGuid;
    return this;
  }

   /**
   * Get groupGuid
   * @return groupGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupGuid() {
    return groupGuid;
  }


  public void setGroupGuid(String groupGuid) {
    this.groupGuid = groupGuid;
  }


  public WebhookAllOf guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public WebhookAllOf event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    WebhookAllOf webhookAllOf = (WebhookAllOf) o;
    return Objects.equals(this.status, webhookAllOf.status) &&
        Objects.equals(this.modifiedBy, webhookAllOf.modifiedBy) &&
        Objects.equals(this.name, webhookAllOf.name) &&
        Objects.equals(this.created, webhookAllOf.created) &&
        Objects.equals(this.url, webhookAllOf.url) &&
        Objects.equals(this.deactivated, webhookAllOf.deactivated) &&
        Objects.equals(this.isActive, webhookAllOf.isActive) &&
        Objects.equals(this.modified, webhookAllOf.modified) &&
        Objects.equals(this.organizationGuid, webhookAllOf.organizationGuid) &&
        Objects.equals(this.groupGuid, webhookAllOf.groupGuid) &&
        Objects.equals(this.guid, webhookAllOf.guid) &&
        Objects.equals(this.event, webhookAllOf.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, modifiedBy, name, created, url, deactivated, isActive, modified, organizationGuid, groupGuid, guid, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookAllOf {\n");
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
