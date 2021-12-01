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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2IncrementalAuthorizationPatch201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class PtsV2IncrementalAuthorizationPatch201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("errorInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation errorInformation = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processorInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation processorInformation = null;

  @SerializedName("paymentInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation orderInformation = null;

  public PtsV2IncrementalAuthorizationPatch201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2IncrementalAuthorizationPatch201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2IncrementalAuthorizationPatch201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2IncrementalAuthorizationPatch201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2IncrementalAuthorizationPatch201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2IncrementalAuthorizationPatch201Response errorInformation(PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2IncrementalAuthorizationPatch201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public PtsV2IncrementalAuthorizationPatch201Response clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2IncrementalAuthorizationPatch201Response processorInformation(PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2IncrementalAuthorizationPatch201Response paymentInformation(PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2IncrementalAuthorizationPatch201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2IncrementalAuthorizationPatch201Response orderInformation(PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2IncrementalAuthorizationPatch201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2IncrementalAuthorizationPatch201Response ptsV2IncrementalAuthorizationPatch201Response = (PtsV2IncrementalAuthorizationPatch201Response) o;
    return Objects.equals(this.links, ptsV2IncrementalAuthorizationPatch201Response.links) &&
        Objects.equals(this.id, ptsV2IncrementalAuthorizationPatch201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2IncrementalAuthorizationPatch201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2IncrementalAuthorizationPatch201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2IncrementalAuthorizationPatch201Response.reconciliationId) &&
        Objects.equals(this.errorInformation, ptsV2IncrementalAuthorizationPatch201Response.errorInformation) &&
        Objects.equals(this.clientReferenceInformation, ptsV2IncrementalAuthorizationPatch201Response.clientReferenceInformation) &&
        Objects.equals(this.processorInformation, ptsV2IncrementalAuthorizationPatch201Response.processorInformation) &&
        Objects.equals(this.paymentInformation, ptsV2IncrementalAuthorizationPatch201Response.paymentInformation) &&
        Objects.equals(this.orderInformation, ptsV2IncrementalAuthorizationPatch201Response.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, errorInformation, clientReferenceInformation, processorInformation, paymentInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2IncrementalAuthorizationPatch201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

