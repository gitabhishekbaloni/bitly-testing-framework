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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserOnboardingSurvey
 */
@JsonPropertyOrder({
  UserOnboardingSurvey.JSON_PROPERTY_FIRST_NAME,
  UserOnboardingSurvey.JSON_PROPERTY_LAST_NAME,
  UserOnboardingSurvey.JSON_PROPERTY_CREATED,
  UserOnboardingSurvey.JSON_PROPERTY_MODIFIED,
  UserOnboardingSurvey.JSON_PROPERTY_COMPANY_SIZE,
  UserOnboardingSurvey.JSON_PROPERTY_ORGANIZATION_NAME,
  UserOnboardingSurvey.JSON_PROPERTY_USE_CASES,
  UserOnboardingSurvey.JSON_PROPERTY_VERSION,
  UserOnboardingSurvey.JSON_PROPERTY_USE_CASES_OTHER,
  UserOnboardingSurvey.JSON_PROPERTY_DEPARTMENT,
  UserOnboardingSurvey.JSON_PROPERTY_LOGIN,
  UserOnboardingSurvey.JSON_PROPERTY_JOB_TITLE,
  UserOnboardingSurvey.JSON_PROPERTY_DEPARTMENT_OTHER,
  UserOnboardingSurvey.JSON_PROPERTY_TEAM_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class UserOnboardingSurvey {
  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_COMPANY_SIZE = "company_size";
  private String companySize;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organization_name";
  private String organizationName;

  public static final String JSON_PROPERTY_USE_CASES = "use_cases";
  private List<String> useCases = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private BigDecimal version;

  public static final String JSON_PROPERTY_USE_CASES_OTHER = "use_cases_other";
  private List<String> useCasesOther = null;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_JOB_TITLE = "job_title";
  private String jobTitle;

  public static final String JSON_PROPERTY_DEPARTMENT_OTHER = "department_other";
  private String departmentOther;

  public static final String JSON_PROPERTY_TEAM_TYPE = "team_type";
  private String teamType;


  public UserOnboardingSurvey firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserOnboardingSurvey lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserOnboardingSurvey created(String created) {
    
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


  public UserOnboardingSurvey modified(String modified) {
    
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


  public UserOnboardingSurvey companySize(String companySize) {
    
    this.companySize = companySize;
    return this;
  }

   /**
   * Get companySize
   * @return companySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanySize() {
    return companySize;
  }


  public void setCompanySize(String companySize) {
    this.companySize = companySize;
  }


  public UserOnboardingSurvey organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public UserOnboardingSurvey useCases(List<String> useCases) {
    
    this.useCases = useCases;
    return this;
  }

  public UserOnboardingSurvey addUseCasesItem(String useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<String>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUseCases() {
    return useCases;
  }


  public void setUseCases(List<String> useCases) {
    this.useCases = useCases;
  }


  public UserOnboardingSurvey version(BigDecimal version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVersion() {
    return version;
  }


  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  public UserOnboardingSurvey useCasesOther(List<String> useCasesOther) {
    
    this.useCasesOther = useCasesOther;
    return this;
  }

  public UserOnboardingSurvey addUseCasesOtherItem(String useCasesOtherItem) {
    if (this.useCasesOther == null) {
      this.useCasesOther = new ArrayList<String>();
    }
    this.useCasesOther.add(useCasesOtherItem);
    return this;
  }

   /**
   * Get useCasesOther
   * @return useCasesOther
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASES_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUseCasesOther() {
    return useCasesOther;
  }


  public void setUseCasesOther(List<String> useCasesOther) {
    this.useCasesOther = useCasesOther;
  }


  public UserOnboardingSurvey department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  public void setDepartment(String department) {
    this.department = department;
  }


  public UserOnboardingSurvey login(String login) {
    
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


  public UserOnboardingSurvey jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public UserOnboardingSurvey departmentOther(String departmentOther) {
    
    this.departmentOther = departmentOther;
    return this;
  }

   /**
   * Get departmentOther
   * @return departmentOther
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT_OTHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartmentOther() {
    return departmentOther;
  }


  public void setDepartmentOther(String departmentOther) {
    this.departmentOther = departmentOther;
  }


  public UserOnboardingSurvey teamType(String teamType) {
    
    this.teamType = teamType;
    return this;
  }

   /**
   * Get teamType
   * @return teamType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamType() {
    return teamType;
  }


  public void setTeamType(String teamType) {
    this.teamType = teamType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOnboardingSurvey userOnboardingSurvey = (UserOnboardingSurvey) o;
    return Objects.equals(this.firstName, userOnboardingSurvey.firstName) &&
        Objects.equals(this.lastName, userOnboardingSurvey.lastName) &&
        Objects.equals(this.created, userOnboardingSurvey.created) &&
        Objects.equals(this.modified, userOnboardingSurvey.modified) &&
        Objects.equals(this.companySize, userOnboardingSurvey.companySize) &&
        Objects.equals(this.organizationName, userOnboardingSurvey.organizationName) &&
        Objects.equals(this.useCases, userOnboardingSurvey.useCases) &&
        Objects.equals(this.version, userOnboardingSurvey.version) &&
        Objects.equals(this.useCasesOther, userOnboardingSurvey.useCasesOther) &&
        Objects.equals(this.department, userOnboardingSurvey.department) &&
        Objects.equals(this.login, userOnboardingSurvey.login) &&
        Objects.equals(this.jobTitle, userOnboardingSurvey.jobTitle) &&
        Objects.equals(this.departmentOther, userOnboardingSurvey.departmentOther) &&
        Objects.equals(this.teamType, userOnboardingSurvey.teamType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, created, modified, companySize, organizationName, useCases, version, useCasesOther, department, login, jobTitle, departmentOther, teamType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOnboardingSurvey {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    companySize: ").append(toIndentedString(companySize)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    useCasesOther: ").append(toIndentedString(useCasesOther)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    departmentOther: ").append(toIndentedString(departmentOther)).append("\n");
    sb.append("    teamType: ").append(toIndentedString(teamType)).append("\n");
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

