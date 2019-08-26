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
import Model.Ptsv2paymentsMerchantDefinedInformation;
import Model.TssV2TransactionsGet200ResponseApplicationInformation;
import Model.TssV2TransactionsGet200ResponseFraudMarkingInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedBuyerInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedDeviceInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedLinks;
import Model.TssV2TransactionsPost201ResponseEmbeddedMerchantInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedOrderInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedPaymentInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedProcessingInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedProcessorInformation;
import Model.TssV2TransactionsPost201ResponseEmbeddedRiskInformation;
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
 * TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("applicationInformation")
  private TssV2TransactionsGet200ResponseApplicationInformation applicationInformation = null;

  @SerializedName("buyerInformation")
  private TssV2TransactionsPost201ResponseEmbeddedBuyerInformation buyerInformation = null;

  @SerializedName("clientReferenceInformation")
  private TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("deviceInformation")
  private TssV2TransactionsPost201ResponseEmbeddedDeviceInformation deviceInformation = null;

  @SerializedName("fraudMarkingInformation")
  private TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("merchantInformation")
  private TssV2TransactionsPost201ResponseEmbeddedMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private TssV2TransactionsPost201ResponseEmbeddedOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private TssV2TransactionsPost201ResponseEmbeddedPaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private TssV2TransactionsPost201ResponseEmbeddedProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private TssV2TransactionsPost201ResponseEmbeddedProcessorInformation processorInformation = null;

  @SerializedName("pointOfSaleInformation")
  private TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("riskInformation")
  private TssV2TransactionsPost201ResponseEmbeddedRiskInformation riskInformation = null;

  @SerializedName("_links")
  private TssV2TransactionsPost201ResponseEmbeddedLinks links = null;

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` Example `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Your CyberSource merchant ID.
   * @return merchantId
  **/
  @ApiModelProperty(value = "Your CyberSource merchant ID.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries applicationInformation(TssV2TransactionsGet200ResponseApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
    return this;
  }

   /**
   * Get applicationInformation
   * @return applicationInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseApplicationInformation getApplicationInformation() {
    return applicationInformation;
  }

  public void setApplicationInformation(TssV2TransactionsGet200ResponseApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries buyerInformation(TssV2TransactionsPost201ResponseEmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(TssV2TransactionsPost201ResponseEmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries clientReferenceInformation(TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(TssV2TransactionsPost201ResponseEmbeddedClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries consumerAuthenticationInformation(TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(TssV2TransactionsPost201ResponseEmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries deviceInformation(TssV2TransactionsPost201ResponseEmbeddedDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(TssV2TransactionsPost201ResponseEmbeddedDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries fraudMarkingInformation(TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
    return this;
  }

   /**
   * Get fraudMarkingInformation
   * @return fraudMarkingInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseFraudMarkingInformation getFraudMarkingInformation() {
    return fraudMarkingInformation;
  }

  public void setFraudMarkingInformation(TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries merchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries addMerchantDefinedInformationItem(Ptsv2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Ptsv2paymentsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * The object containing the custom data that the merchant defines. 
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "The object containing the custom data that the merchant defines. ")
  public List<Ptsv2paymentsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries merchantInformation(TssV2TransactionsPost201ResponseEmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(TssV2TransactionsPost201ResponseEmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries orderInformation(TssV2TransactionsPost201ResponseEmbeddedOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(TssV2TransactionsPost201ResponseEmbeddedOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries paymentInformation(TssV2TransactionsPost201ResponseEmbeddedPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(TssV2TransactionsPost201ResponseEmbeddedPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries processingInformation(TssV2TransactionsPost201ResponseEmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TssV2TransactionsPost201ResponseEmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries processorInformation(TssV2TransactionsPost201ResponseEmbeddedProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(TssV2TransactionsPost201ResponseEmbeddedProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries pointOfSaleInformation(TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries riskInformation(TssV2TransactionsPost201ResponseEmbeddedRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(TssV2TransactionsPost201ResponseEmbeddedRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries links(TssV2TransactionsPost201ResponseEmbeddedLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedLinks getLinks() {
    return links;
  }

  public void setLinks(TssV2TransactionsPost201ResponseEmbeddedLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries = (TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries) o;
    return Objects.equals(this.id, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.id) &&
        Objects.equals(this.submitTimeUtc, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.submitTimeUtc) &&
        Objects.equals(this.merchantId, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.merchantId) &&
        Objects.equals(this.applicationInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.applicationInformation) &&
        Objects.equals(this.buyerInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.buyerInformation) &&
        Objects.equals(this.clientReferenceInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.clientReferenceInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.consumerAuthenticationInformation) &&
        Objects.equals(this.deviceInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.deviceInformation) &&
        Objects.equals(this.fraudMarkingInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.fraudMarkingInformation) &&
        Objects.equals(this.merchantDefinedInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.merchantDefinedInformation) &&
        Objects.equals(this.merchantInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.merchantInformation) &&
        Objects.equals(this.orderInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.orderInformation) &&
        Objects.equals(this.paymentInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.paymentInformation) &&
        Objects.equals(this.processingInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.processingInformation) &&
        Objects.equals(this.processorInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.processorInformation) &&
        Objects.equals(this.pointOfSaleInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.pointOfSaleInformation) &&
        Objects.equals(this.riskInformation, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.riskInformation) &&
        Objects.equals(this.links, tssV2TransactionsPost201ResponseEmbeddedTransactionSummaries.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, merchantId, applicationInformation, buyerInformation, clientReferenceInformation, consumerAuthenticationInformation, deviceInformation, fraudMarkingInformation, merchantDefinedInformation, merchantInformation, orderInformation, paymentInformation, processingInformation, processorInformation, pointOfSaleInformation, riskInformation, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedTransactionSummaries {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    applicationInformation: ").append(toIndentedString(applicationInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    fraudMarkingInformation: ").append(toIndentedString(fraudMarkingInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

