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


package bitly.api.model.bitly.V4;

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
 * GroupPreferences
 */
@JsonPropertyOrder({
  GroupPreferences.JSON_PROPERTY_GROUP_GUID,
  GroupPreferences.JSON_PROPERTY_DOMAIN_PREFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class GroupPreferences {
  public static final String JSON_PROPERTY_GROUP_GUID = "group_guid";
  private String groupGuid;

  public static final String JSON_PROPERTY_DOMAIN_PREFERENCE = "domain_preference";
  private String domainPreference;


  public GroupPreferences groupGuid(String groupGuid) {
    
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


  public GroupPreferences domainPreference(String domainPreference) {
    
    this.domainPreference = domainPreference;
    return this;
  }

   /**
   * Get domainPreference
   * @return domainPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainPreference() {
    return domainPreference;
  }


  public void setDomainPreference(String domainPreference) {
    this.domainPreference = domainPreference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPreferences groupPreferences = (GroupPreferences) o;
    return Objects.equals(this.groupGuid, groupPreferences.groupGuid) &&
        Objects.equals(this.domainPreference, groupPreferences.domainPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupGuid, domainPreference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupPreferences {\n");
    sb.append("    groupGuid: ").append(toIndentedString(groupGuid)).append("\n");
    sb.append("    domainPreference: ").append(toIndentedString(domainPreference)).append("\n");
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

