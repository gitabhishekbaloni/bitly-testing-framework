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
import com.bitly.model.V4.User;
import com.bitly.model.V4.UserInternalAllOf;
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
 * UserInternal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-06T23:21:35.150+01:00[Europe/London]")
public class UserInternal {
  public static final String SERIALIZED_NAME_DEFAULT_GROUP_GUID = "default_group_guid";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GROUP_GUID)
  private String defaultGroupGuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_IS_SSO_USER = "is_sso_user";
  @SerializedName(SERIALIZED_NAME_IS_SSO_USER)
  private Boolean isSsoUser;

  public static final String SERIALIZED_NAME_IS2FA_ENABLED = "is_2fa_enabled";
  @SerializedName(SERIALIZED_NAME_IS2FA_ENABLED)
  private Boolean is2faEnabled;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<Email> emails = null;

  public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;


  public UserInternal defaultGroupGuid(String defaultGroupGuid) {
    
    this.defaultGroupGuid = defaultGroupGuid;
    return this;
  }

   /**
   * Get defaultGroupGuid
   * @return defaultGroupGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultGroupGuid() {
    return defaultGroupGuid;
  }


  public void setDefaultGroupGuid(String defaultGroupGuid) {
    this.defaultGroupGuid = defaultGroupGuid;
  }


  public UserInternal name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserInternal created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public UserInternal isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public UserInternal modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public UserInternal isSsoUser(Boolean isSsoUser) {
    
    this.isSsoUser = isSsoUser;
    return this;
  }

   /**
   * Get isSsoUser
   * @return isSsoUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSsoUser() {
    return isSsoUser;
  }


  public void setIsSsoUser(Boolean isSsoUser) {
    this.isSsoUser = isSsoUser;
  }


  public UserInternal is2faEnabled(Boolean is2faEnabled) {
    
    this.is2faEnabled = is2faEnabled;
    return this;
  }

   /**
   * Get is2faEnabled
   * @return is2faEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIs2faEnabled() {
    return is2faEnabled;
  }


  public void setIs2faEnabled(Boolean is2faEnabled) {
    this.is2faEnabled = is2faEnabled;
  }


  public UserInternal login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public UserInternal emails(List<Email> emails) {
    
    this.emails = emails;
    return this;
  }

  public UserInternal addEmailsItem(Email emailsItem) {
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

  public List<Email> getEmails() {
    return emails;
  }


  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }


  public UserInternal roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInternal userInternal = (UserInternal) o;
    return Objects.equals(this.defaultGroupGuid, userInternal.defaultGroupGuid) &&
        Objects.equals(this.name, userInternal.name) &&
        Objects.equals(this.created, userInternal.created) &&
        Objects.equals(this.isActive, userInternal.isActive) &&
        Objects.equals(this.modified, userInternal.modified) &&
        Objects.equals(this.isSsoUser, userInternal.isSsoUser) &&
        Objects.equals(this.is2faEnabled, userInternal.is2faEnabled) &&
        Objects.equals(this.login, userInternal.login) &&
        Objects.equals(this.emails, userInternal.emails) &&
        Objects.equals(this.roleName, userInternal.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGroupGuid, name, created, isActive, modified, isSsoUser, is2faEnabled, login, emails, roleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInternal {\n");
    sb.append("    defaultGroupGuid: ").append(toIndentedString(defaultGroupGuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    isSsoUser: ").append(toIndentedString(isSsoUser)).append("\n");
    sb.append("    is2faEnabled: ").append(toIndentedString(is2faEnabled)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

