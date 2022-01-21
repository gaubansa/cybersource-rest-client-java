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
import org.joda.time.DateTime;

/**
 * ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails {
  @SerializedName("processorMerchantId")
  private String processorMerchantId = null;

  @SerializedName("merchantName")
  private String merchantName = null;

  @SerializedName("transactionReferenceNumber")
  private String transactionReferenceNumber = null;

  @SerializedName("merchantReferenceNumber")
  private String merchantReferenceNumber = null;

  @SerializedName("natureOfDispute")
  private String natureOfDispute = null;

  @SerializedName("alertType")
  private String alertType = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("sign")
  private String sign = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("cardType")
  private String cardType = null;

  @SerializedName("originalSettlementTime")
  private DateTime originalSettlementTime = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("responseDueTime")
  private DateTime responseDueTime = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("actionDescription")
  private String actionDescription = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("representmentCPTime")
  private DateTime representmentCPTime = null;

  @SerializedName("applications")
  private String applications = null;

  @SerializedName("eventRequestedTime")
  private DateTime eventRequestedTime = null;

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails processorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
    return this;
  }

   /**
   * Processor Merchant Id
   * @return processorMerchantId
  **/
  @ApiModelProperty(example = "174263416896", value = "Processor Merchant Id")
  public String getProcessorMerchantId() {
    return processorMerchantId;
  }

  public void setProcessorMerchantId(String processorMerchantId) {
    this.processorMerchantId = processorMerchantId;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant Name
   * @return merchantName
  **/
  @ApiModelProperty(example = "ZZZZZZ USA_EUR", value = "Merchant Name")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

   /**
   * Transaction Reference Number
   * @return transactionReferenceNumber
  **/
  @ApiModelProperty(example = "02230413", value = "Transaction Reference Number")
  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails merchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
    return this;
  }

   /**
   * Merchant Reference Number
   * @return merchantReferenceNumber
  **/
  @ApiModelProperty(example = "123", value = "Merchant Reference Number")
  public String getMerchantReferenceNumber() {
    return merchantReferenceNumber;
  }

  public void setMerchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails natureOfDispute(String natureOfDispute) {
    this.natureOfDispute = natureOfDispute;
    return this;
  }

   /**
   * Nature of Dispute
   * @return natureOfDispute
  **/
  @ApiModelProperty(example = "Retrieval", value = "Nature of Dispute")
  public String getNatureOfDispute() {
    return natureOfDispute;
  }

  public void setNatureOfDispute(String natureOfDispute) {
    this.natureOfDispute = natureOfDispute;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails alertType(String alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Retrieval Alert Type
   * @return alertType
  **/
  @ApiModelProperty(example = "2", value = "Retrieval Alert Type")
  public String getAlertType() {
    return alertType;
  }

  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Retrieval Amount
   * @return amount
  **/
  @ApiModelProperty(example = "5", value = "Retrieval Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails sign(String sign) {
    this.sign = sign;
    return this;
  }

   /**
   * Retrieval Sign
   * @return sign
  **/
  @ApiModelProperty(example = "C", value = "Retrieval Sign")
  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Retrieval Action
   * @return action
  **/
  @ApiModelProperty(example = "3", value = "Retrieval Action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  @ApiModelProperty(example = "American Express", value = "Card Type")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails originalSettlementTime(DateTime originalSettlementTime) {
    this.originalSettlementTime = originalSettlementTime;
    return this;
  }

   /**
   * Original Settlement Date
   * @return originalSettlementTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Original Settlement Date")
  public DateTime getOriginalSettlementTime() {
    return originalSettlementTime;
  }

  public void setOriginalSettlementTime(DateTime originalSettlementTime) {
    this.originalSettlementTime = originalSettlementTime;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Tracking Number
   * @return trackingNumber
  **/
  @ApiModelProperty(example = "990175", value = "Tracking Number")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request Id
   * @return requestId
  **/
  @ApiModelProperty(example = "5060113732046412501541", value = "Request Id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails responseDueTime(DateTime responseDueTime) {
    this.responseDueTime = responseDueTime;
    return this;
  }

   /**
   * Response Due Date
   * @return responseDueTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Response Due Date")
  public DateTime getResponseDueTime() {
    return responseDueTime;
  }

  public void setResponseDueTime(DateTime responseDueTime) {
    this.responseDueTime = responseDueTime;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Retrieval Date
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Retrieval Date")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails actionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
    return this;
  }

   /**
   * Retrieval Action Description
   * @return actionDescription
  **/
  @ApiModelProperty(example = "Financial transaction", value = "Retrieval Action Description")
  public String getActionDescription() {
    return actionDescription;
  }

  public void setActionDescription(String actionDescription) {
    this.actionDescription = actionDescription;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer Id
   * @return customerId
  **/
  @ApiModelProperty(example = "Customer Id", value = "Customer Id")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Retrieval Reason Code
   * @return reasonCode
  **/
  @ApiModelProperty(example = "1050", value = "Retrieval Reason Code")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails representmentCPTime(DateTime representmentCPTime) {
    this.representmentCPTime = representmentCPTime;
    return this;
  }

   /**
   * Representment CP Date
   * @return representmentCPTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Representment CP Date")
  public DateTime getRepresentmentCPTime() {
    return representmentCPTime;
  }

  public void setRepresentmentCPTime(DateTime representmentCPTime) {
    this.representmentCPTime = representmentCPTime;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails applications(String applications) {
    this.applications = applications;
    return this;
  }

   /**
   * ICS Request Applications
   * @return applications
  **/
  @ApiModelProperty(example = "ics_auth", value = "ICS Request Applications")
  public String getApplications() {
    return applications;
  }

  public void setApplications(String applications) {
    this.applications = applications;
  }

  public ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails eventRequestedTime(DateTime eventRequestedTime) {
    this.eventRequestedTime = eventRequestedTime;
    return this;
  }

   /**
   * Event Request Date
   * @return eventRequestedTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Event Request Date")
  public DateTime getEventRequestedTime() {
    return eventRequestedTime;
  }

  public void setEventRequestedTime(DateTime eventRequestedTime) {
    this.eventRequestedTime = eventRequestedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails reportingV3RetrievalDetailsGet200ResponseRetrievalDetails = (ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails) o;
    return Objects.equals(this.processorMerchantId, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.processorMerchantId) &&
        Objects.equals(this.merchantName, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.merchantName) &&
        Objects.equals(this.transactionReferenceNumber, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.transactionReferenceNumber) &&
        Objects.equals(this.merchantReferenceNumber, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.merchantReferenceNumber) &&
        Objects.equals(this.natureOfDispute, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.natureOfDispute) &&
        Objects.equals(this.alertType, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.alertType) &&
        Objects.equals(this.amount, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.amount) &&
        Objects.equals(this.sign, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.sign) &&
        Objects.equals(this.action, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.action) &&
        Objects.equals(this.cardType, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.cardType) &&
        Objects.equals(this.originalSettlementTime, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.originalSettlementTime) &&
        Objects.equals(this.trackingNumber, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.trackingNumber) &&
        Objects.equals(this.currencyCode, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.currencyCode) &&
        Objects.equals(this.requestId, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.requestId) &&
        Objects.equals(this.responseDueTime, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.responseDueTime) &&
        Objects.equals(this.time, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.time) &&
        Objects.equals(this.actionDescription, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.actionDescription) &&
        Objects.equals(this.customerId, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.customerId) &&
        Objects.equals(this.reasonCode, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.reasonCode) &&
        Objects.equals(this.representmentCPTime, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.representmentCPTime) &&
        Objects.equals(this.applications, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.applications) &&
        Objects.equals(this.eventRequestedTime, reportingV3RetrievalDetailsGet200ResponseRetrievalDetails.eventRequestedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorMerchantId, merchantName, transactionReferenceNumber, merchantReferenceNumber, natureOfDispute, alertType, amount, sign, action, cardType, originalSettlementTime, trackingNumber, currencyCode, requestId, responseDueTime, time, actionDescription, customerId, reasonCode, representmentCPTime, applications, eventRequestedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails {\n");
    
    sb.append("    processorMerchantId: ").append(toIndentedString(processorMerchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    merchantReferenceNumber: ").append(toIndentedString(merchantReferenceNumber)).append("\n");
    sb.append("    natureOfDispute: ").append(toIndentedString(natureOfDispute)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    originalSettlementTime: ").append(toIndentedString(originalSettlementTime)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseDueTime: ").append(toIndentedString(responseDueTime)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    representmentCPTime: ").append(toIndentedString(representmentCPTime)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    eventRequestedTime: ").append(toIndentedString(eventRequestedTime)).append("\n");
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

