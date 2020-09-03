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
import com.bitly.model.V4.Email;
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
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_DEFAULT_GROUP_GUID,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_CREATED,
  User.JSON_PROPERTY_IS_ACTIVE,
  User.JSON_PROPERTY_MODIFIED,
  User.JSON_PROPERTY_IS_SSO_USER,
  User.JSON_PROPERTY_IS2FA_ENABLED,
  User.JSON_PROPERTY_LOGIN,
  User.JSON_PROPERTY_EMAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-03T23:35:21.555+01:00[Europe/London]")
public class User {
  public static final String JSON_PROPERTY_DEFAULT_GROUP_GUID = "default_group_guid";
  private String defaultGroupGuid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_IS_SSO_USER = "is_sso_user";
  private Boolean isSsoUser;

  public static final String JSON_PROPERTY_IS2FA_ENABLED = "is_2fa_enabled";
  private Boolean is2faEnabled;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<Email> emails = null;


  public User defaultGroupGuid(String defaultGroupGuid) {
    
    this.defaultGroupGuid = defaultGroupGuid;
    return this;
  }

   /**
   * Get defaultGroupGuid
   * @return defaultGroupGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUP_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultGroupGuid() {
    return defaultGroupGuid;
  }


  public void setDefaultGroupGuid(String defaultGroupGuid) {
    this.defaultGroupGuid = defaultGroupGuid;
  }


  public User name(String name) {
    
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


  public User created(String created) {
    
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


  public User isActive(Boolean isActive) {
    
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


  public User modified(String modified) {
    
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


  public User isSsoUser(Boolean isSsoUser) {
    
    this.isSsoUser = isSsoUser;
    return this;
  }

   /**
   * Get isSsoUser
   * @return isSsoUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SSO_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSsoUser() {
    return isSsoUser;
  }


  public void setIsSsoUser(Boolean isSsoUser) {
    this.isSsoUser = isSsoUser;
  }


  public User is2faEnabled(Boolean is2faEnabled) {
    
    this.is2faEnabled = is2faEnabled;
    return this;
  }

   /**
   * Get is2faEnabled
   * @return is2faEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS2FA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIs2faEnabled() {
    return is2faEnabled;
  }


  public void setIs2faEnabled(Boolean is2faEnabled) {
    this.is2faEnabled = is2faEnabled;
  }


  public User login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public User emails(List<Email> emails) {
    
    this.emails = emails;
    return this;
  }

  public User addEmailsItem(Email emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<Email>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Email> getEmails() {
    return emails;
  }


  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.defaultGroupGuid, user.defaultGroupGuid) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.isActive, user.isActive) &&
        Objects.equals(this.modified, user.modified) &&
        Objects.equals(this.isSsoUser, user.isSsoUser) &&
        Objects.equals(this.is2faEnabled, user.is2faEnabled) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.emails, user.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGroupGuid, name, created, isActive, modified, isSsoUser, is2faEnabled, login, emails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    defaultGroupGuid: ").append(toIndentedString(defaultGroupGuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    isSsoUser: ").append(toIndentedString(isSsoUser)).append("\n");
    sb.append("    is2faEnabled: ").append(toIndentedString(is2faEnabled)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
