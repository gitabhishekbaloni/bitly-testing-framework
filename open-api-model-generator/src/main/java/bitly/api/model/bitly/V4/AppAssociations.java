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
import bitly.api.model.bitly.V4.AppAssociationDetail;
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
 * AppAssociations
 */
@JsonPropertyOrder({
  AppAssociations.JSON_PROPERTY_ANDROID_INSTALL_PREFERENCE,
  AppAssociations.JSON_PROPERTY_IOS_INSTALL_PREFERENCE,
  AppAssociations.JSON_PROPERTY_ANDROID_APPS,
  AppAssociations.JSON_PROPERTY_CUSTOM_DOMAIN,
  AppAssociations.JSON_PROPERTY_IOS_APPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-02T16:51:48.193+01:00[Europe/London]")
public class AppAssociations {
  /**
   * Gets or Sets androidInstallPreference
   */
  public enum AndroidInstallPreferenceEnum {
    NO_INSTALL("no_install"),
    
    AUTO_INSTALL("auto_install"),
    
    PROMOTE_INSTALL("promote_install");

    private String value;

    AndroidInstallPreferenceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AndroidInstallPreferenceEnum fromValue(String value) {
      for (AndroidInstallPreferenceEnum b : AndroidInstallPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANDROID_INSTALL_PREFERENCE = "android_install_preference";
  private AndroidInstallPreferenceEnum androidInstallPreference;

  /**
   * Gets or Sets iosInstallPreference
   */
  public enum IosInstallPreferenceEnum {
    NO_INSTALL("no_install"),
    
    AUTO_INSTALL("auto_install"),
    
    PROMOTE_INSTALL("promote_install");

    private String value;

    IosInstallPreferenceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IosInstallPreferenceEnum fromValue(String value) {
      for (IosInstallPreferenceEnum b : IosInstallPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IOS_INSTALL_PREFERENCE = "ios_install_preference";
  private IosInstallPreferenceEnum iosInstallPreference;

  public static final String JSON_PROPERTY_ANDROID_APPS = "android_apps";
  private List<AppAssociationDetail> androidApps = null;

  public static final String JSON_PROPERTY_CUSTOM_DOMAIN = "custom_domain";
  private String customDomain;

  public static final String JSON_PROPERTY_IOS_APPS = "ios_apps";
  private List<AppAssociationDetail> iosApps = null;


  public AppAssociations androidInstallPreference(AndroidInstallPreferenceEnum androidInstallPreference) {
    
    this.androidInstallPreference = androidInstallPreference;
    return this;
  }

   /**
   * Get androidInstallPreference
   * @return androidInstallPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANDROID_INSTALL_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AndroidInstallPreferenceEnum getAndroidInstallPreference() {
    return androidInstallPreference;
  }


  public void setAndroidInstallPreference(AndroidInstallPreferenceEnum androidInstallPreference) {
    this.androidInstallPreference = androidInstallPreference;
  }


  public AppAssociations iosInstallPreference(IosInstallPreferenceEnum iosInstallPreference) {
    
    this.iosInstallPreference = iosInstallPreference;
    return this;
  }

   /**
   * Get iosInstallPreference
   * @return iosInstallPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IOS_INSTALL_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IosInstallPreferenceEnum getIosInstallPreference() {
    return iosInstallPreference;
  }


  public void setIosInstallPreference(IosInstallPreferenceEnum iosInstallPreference) {
    this.iosInstallPreference = iosInstallPreference;
  }


  public AppAssociations androidApps(List<AppAssociationDetail> androidApps) {
    
    this.androidApps = androidApps;
    return this;
  }

  public AppAssociations addAndroidAppsItem(AppAssociationDetail androidAppsItem) {
    if (this.androidApps == null) {
      this.androidApps = new ArrayList<AppAssociationDetail>();
    }
    this.androidApps.add(androidAppsItem);
    return this;
  }

   /**
   * Get androidApps
   * @return androidApps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANDROID_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AppAssociationDetail> getAndroidApps() {
    return androidApps;
  }


  public void setAndroidApps(List<AppAssociationDetail> androidApps) {
    this.androidApps = androidApps;
  }


  public AppAssociations customDomain(String customDomain) {
    
    this.customDomain = customDomain;
    return this;
  }

   /**
   * Get customDomain
   * @return customDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomDomain() {
    return customDomain;
  }


  public void setCustomDomain(String customDomain) {
    this.customDomain = customDomain;
  }


  public AppAssociations iosApps(List<AppAssociationDetail> iosApps) {
    
    this.iosApps = iosApps;
    return this;
  }

  public AppAssociations addIosAppsItem(AppAssociationDetail iosAppsItem) {
    if (this.iosApps == null) {
      this.iosApps = new ArrayList<AppAssociationDetail>();
    }
    this.iosApps.add(iosAppsItem);
    return this;
  }

   /**
   * Get iosApps
   * @return iosApps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IOS_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AppAssociationDetail> getIosApps() {
    return iosApps;
  }


  public void setIosApps(List<AppAssociationDetail> iosApps) {
    this.iosApps = iosApps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppAssociations appAssociations = (AppAssociations) o;
    return Objects.equals(this.androidInstallPreference, appAssociations.androidInstallPreference) &&
        Objects.equals(this.iosInstallPreference, appAssociations.iosInstallPreference) &&
        Objects.equals(this.androidApps, appAssociations.androidApps) &&
        Objects.equals(this.customDomain, appAssociations.customDomain) &&
        Objects.equals(this.iosApps, appAssociations.iosApps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidInstallPreference, iosInstallPreference, androidApps, customDomain, iosApps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppAssociations {\n");
    sb.append("    androidInstallPreference: ").append(toIndentedString(androidInstallPreference)).append("\n");
    sb.append("    iosInstallPreference: ").append(toIndentedString(iosInstallPreference)).append("\n");
    sb.append("    androidApps: ").append(toIndentedString(androidApps)).append("\n");
    sb.append("    customDomain: ").append(toIndentedString(customDomain)).append("\n");
    sb.append("    iosApps: ").append(toIndentedString(iosApps)).append("\n");
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

