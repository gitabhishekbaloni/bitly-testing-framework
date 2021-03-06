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
import com.bitly.model.V4.CampaignClickData;
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
 * ChannelBitlink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T02:24:01.569+01:00[Europe/London]")
public class ChannelBitlink {
  public static final String SERIALIZED_NAME_KEYWORD_LINK = "keyword_link";
  @SerializedName(SERIALIZED_NAME_KEYWORD_LINK)
  private String keywordLink;

  public static final String SERIALIZED_NAME_CREATED_TS = "created_ts";
  @SerializedName(SERIALIZED_NAME_CREATED_TS)
  private Integer createdTs;

  public static final String SERIALIZED_NAME_BITLINK_ID = "bitlink_id";
  @SerializedName(SERIALIZED_NAME_BITLINK_ID)
  private String bitlinkId;

  public static final String SERIALIZED_NAME_CHANNEL_GUID = "channel_guid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_GUID)
  private String channelGuid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<String> campaignIds = null;

  public static final String SERIALIZED_NAME_TOTAL_CLICKS = "total_clicks";
  @SerializedName(SERIALIZED_NAME_TOTAL_CLICKS)
  private Integer totalClicks;

  public static final String SERIALIZED_NAME_AGGREGATE_LINK = "aggregate_link";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_LINK)
  private String aggregateLink;

  public static final String SERIALIZED_NAME_CAMPAIGN_GUID = "campaign_guid";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_GUID)
  private String campaignGuid;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_LONG_URL = "long_url";
  @SerializedName(SERIALIZED_NAME_LONG_URL)
  private String longUrl;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private List<CampaignClickData> clicks = null;


  public ChannelBitlink keywordLink(String keywordLink) {
    
    this.keywordLink = keywordLink;
    return this;
  }

   /**
   * Get keywordLink
   * @return keywordLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeywordLink() {
    return keywordLink;
  }


  public void setKeywordLink(String keywordLink) {
    this.keywordLink = keywordLink;
  }


  public ChannelBitlink createdTs(Integer createdTs) {
    
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Get createdTs
   * @return createdTs
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getCreatedTs() {
    return createdTs;
  }


  public void setCreatedTs(Integer createdTs) {
    this.createdTs = createdTs;
  }


  public ChannelBitlink bitlinkId(String bitlinkId) {
    
    this.bitlinkId = bitlinkId;
    return this;
  }

   /**
   * Get bitlinkId
   * @return bitlinkId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getBitlinkId() {
    return bitlinkId;
  }


  public void setBitlinkId(String bitlinkId) {
    this.bitlinkId = bitlinkId;
  }


  public ChannelBitlink channelGuid(String channelGuid) {
    
    this.channelGuid = channelGuid;
    return this;
  }

   /**
   * Get channelGuid
   * @return channelGuid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getChannelGuid() {
    return channelGuid;
  }


  public void setChannelGuid(String channelGuid) {
    this.channelGuid = channelGuid;
  }


  public ChannelBitlink title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ChannelBitlink campaignIds(List<String> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ChannelBitlink addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ChannelBitlink totalClicks(Integer totalClicks) {
    
    this.totalClicks = totalClicks;
    return this;
  }

   /**
   * Get totalClicks
   * @return totalClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalClicks() {
    return totalClicks;
  }


  public void setTotalClicks(Integer totalClicks) {
    this.totalClicks = totalClicks;
  }


  public ChannelBitlink aggregateLink(String aggregateLink) {
    
    this.aggregateLink = aggregateLink;
    return this;
  }

   /**
   * Get aggregateLink
   * @return aggregateLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAggregateLink() {
    return aggregateLink;
  }


  public void setAggregateLink(String aggregateLink) {
    this.aggregateLink = aggregateLink;
  }


  public ChannelBitlink campaignGuid(String campaignGuid) {
    
    this.campaignGuid = campaignGuid;
    return this;
  }

   /**
   * Get campaignGuid
   * @return campaignGuid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCampaignGuid() {
    return campaignGuid;
  }


  public void setCampaignGuid(String campaignGuid) {
    this.campaignGuid = campaignGuid;
  }


  public ChannelBitlink link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ChannelBitlink clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ChannelBitlink longUrl(String longUrl) {
    
    this.longUrl = longUrl;
    return this;
  }

   /**
   * Get longUrl
   * @return longUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLongUrl() {
    return longUrl;
  }


  public void setLongUrl(String longUrl) {
    this.longUrl = longUrl;
  }


  public ChannelBitlink clicks(List<CampaignClickData> clicks) {
    
    this.clicks = clicks;
    return this;
  }

  public ChannelBitlink addClicksItem(CampaignClickData clicksItem) {
    if (this.clicks == null) {
      this.clicks = new ArrayList<CampaignClickData>();
    }
    this.clicks.add(clicksItem);
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CampaignClickData> getClicks() {
    return clicks;
  }


  public void setClicks(List<CampaignClickData> clicks) {
    this.clicks = clicks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelBitlink channelBitlink = (ChannelBitlink) o;
    return Objects.equals(this.keywordLink, channelBitlink.keywordLink) &&
        Objects.equals(this.createdTs, channelBitlink.createdTs) &&
        Objects.equals(this.bitlinkId, channelBitlink.bitlinkId) &&
        Objects.equals(this.channelGuid, channelBitlink.channelGuid) &&
        Objects.equals(this.title, channelBitlink.title) &&
        Objects.equals(this.campaignIds, channelBitlink.campaignIds) &&
        Objects.equals(this.totalClicks, channelBitlink.totalClicks) &&
        Objects.equals(this.aggregateLink, channelBitlink.aggregateLink) &&
        Objects.equals(this.campaignGuid, channelBitlink.campaignGuid) &&
        Objects.equals(this.link, channelBitlink.link) &&
        Objects.equals(this.clientId, channelBitlink.clientId) &&
        Objects.equals(this.longUrl, channelBitlink.longUrl) &&
        Objects.equals(this.clicks, channelBitlink.clicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordLink, createdTs, bitlinkId, channelGuid, title, campaignIds, totalClicks, aggregateLink, campaignGuid, link, clientId, longUrl, clicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelBitlink {\n");
    sb.append("    keywordLink: ").append(toIndentedString(keywordLink)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    bitlinkId: ").append(toIndentedString(bitlinkId)).append("\n");
    sb.append("    channelGuid: ").append(toIndentedString(channelGuid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    totalClicks: ").append(toIndentedString(totalClicks)).append("\n");
    sb.append("    aggregateLink: ").append(toIndentedString(aggregateLink)).append("\n");
    sb.append("    campaignGuid: ").append(toIndentedString(campaignGuid)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    longUrl: ").append(toIndentedString(longUrl)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
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

