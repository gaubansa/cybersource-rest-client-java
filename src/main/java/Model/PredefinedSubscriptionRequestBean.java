/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PredefinedSubscriptionRequestBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class PredefinedSubscriptionRequestBean {
  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("subscriptionType")
  private String subscriptionType = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("reportInterval")
  private String reportInterval = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("subscriptionStatus")
  private String subscriptionStatus = null;

  public PredefinedSubscriptionRequestBean reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Valid Report Definition Name
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionDetailReportClass", required = true, value = "Valid Report Definition Name")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public PredefinedSubscriptionRequestBean subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * The subscription type for which report definition is required. Valid values are CLASSIC and STANDARD. Valid Values:   - CLASSIC   - STANDARD 
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "The subscription type for which report definition is required. Valid values are CLASSIC and STANDARD. Valid Values:   - CLASSIC   - STANDARD ")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public PredefinedSubscriptionRequestBean reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "TransactionDetailReport_Daily_Classic", value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public PredefinedSubscriptionRequestBean reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Report Format             Valid Values:   - application/xml   - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Report Format             Valid Values:   - application/xml   - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public PredefinedSubscriptionRequestBean reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * &#39;The frequency for which subscription is created. For Standard we can have DAILY, WEEKLY and MONTHLY. But for Classic we will have only DAILY.&#39; **NOTE: Do not document USER_DEFINED Frequency field in developer center** Valid Values: - &#39;DAILY&#39; - &#39;WEEKLY&#39; - &#39;MONTHLY&#39; - &#39;USER_DEFINED&#39; 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "'The frequency for which subscription is created. For Standard we can have DAILY, WEEKLY and MONTHLY. But for Classic we will have only DAILY.' **NOTE: Do not document USER_DEFINED Frequency field in developer center** Valid Values: - 'DAILY' - 'WEEKLY' - 'MONTHLY' - 'USER_DEFINED' ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public PredefinedSubscriptionRequestBean reportInterval(String reportInterval) {
    this.reportInterval = reportInterval;
    return this;
  }

   /**
   * If the reportFrequency is User-defined, reportInterval should be in **ISO 8601 time format** Please refer the following link to know more about ISO 8601 format.[Rfc Time Format](https://en.wikipedia.org/wiki/ISO_8601#Durations)  **Example time format for 2 hours and 30 Mins:**   - PT2H30M **NOTE: Do not document reportInterval field in developer center** 
   * @return reportInterval
  **/
  @ApiModelProperty(value = "If the reportFrequency is User-defined, reportInterval should be in **ISO 8601 time format** Please refer the following link to know more about ISO 8601 format.[Rfc Time Format](https://en.wikipedia.org/wiki/ISO_8601#Durations)  **Example time format for 2 hours and 30 Mins:**   - PT2H30M **NOTE: Do not document reportInterval field in developer center** ")
  public String getReportInterval() {
    return reportInterval;
  }

  public void setReportInterval(String reportInterval) {
    this.reportInterval = reportInterval;
  }

  public PredefinedSubscriptionRequestBean timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * By Default the timezone for Standard subscription is PST. And for Classic subscription it will be GMT. If user provides any other time zone apart from PST for Standard subscription api should error out.
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Los_Angeles", value = "By Default the timezone for Standard subscription is PST. And for Classic subscription it will be GMT. If user provides any other time zone apart from PST for Standard subscription api should error out.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public PredefinedSubscriptionRequestBean startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The hour at which the report generation should start. It should be in hhmm format. By Default it will be 0000. The format is 24 hours format.
   * @return startTime
  **/
  @ApiModelProperty(example = "0900", value = "The hour at which the report generation should start. It should be in hhmm format. By Default it will be 0000. The format is 24 hours format.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PredefinedSubscriptionRequestBean startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.
   * minimum: 1
   * maximum: 31
   * @return startDay
  **/
  @ApiModelProperty(value = "This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public PredefinedSubscriptionRequestBean subscriptionStatus(String subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * The status for subscription which is either created or updated. By default it is ACTIVE. Valid Values:   - ACTIVE   - INACTIVE 
   * @return subscriptionStatus
  **/
  @ApiModelProperty(example = "ACTIVE", value = "The status for subscription which is either created or updated. By default it is ACTIVE. Valid Values:   - ACTIVE   - INACTIVE ")
  public String getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(String subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredefinedSubscriptionRequestBean predefinedSubscriptionRequestBean = (PredefinedSubscriptionRequestBean) o;
    return Objects.equals(this.reportDefinitionName, predefinedSubscriptionRequestBean.reportDefinitionName) &&
        Objects.equals(this.subscriptionType, predefinedSubscriptionRequestBean.subscriptionType) &&
        Objects.equals(this.reportName, predefinedSubscriptionRequestBean.reportName) &&
        Objects.equals(this.reportMimeType, predefinedSubscriptionRequestBean.reportMimeType) &&
        Objects.equals(this.reportFrequency, predefinedSubscriptionRequestBean.reportFrequency) &&
        Objects.equals(this.reportInterval, predefinedSubscriptionRequestBean.reportInterval) &&
        Objects.equals(this.timezone, predefinedSubscriptionRequestBean.timezone) &&
        Objects.equals(this.startTime, predefinedSubscriptionRequestBean.startTime) &&
        Objects.equals(this.startDay, predefinedSubscriptionRequestBean.startDay) &&
        Objects.equals(this.subscriptionStatus, predefinedSubscriptionRequestBean.subscriptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDefinitionName, subscriptionType, reportName, reportMimeType, reportFrequency, reportInterval, timezone, startTime, startDay, subscriptionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredefinedSubscriptionRequestBean {\n");
    
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportInterval: ").append(toIndentedString(reportInterval)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
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

