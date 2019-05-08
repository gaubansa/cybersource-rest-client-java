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
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsPost201ResponseErrorInformation;
import Model.PtsV2PaymentsPost201ResponseInstallmentInformation;
import Model.PtsV2PaymentsPost201ResponseIssuerInformation;
import Model.PtsV2PaymentsPost201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseOrderInformation;
import Model.PtsV2PaymentsPost201ResponsePaymentInformation;
import Model.PtsV2PaymentsPost201ResponsePointOfSaleInformation;
import Model.PtsV2PaymentsPost201ResponseProcessingInformation;
import Model.PtsV2PaymentsPost201ResponseProcessorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class PtsV2PaymentsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  /**
   * The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED  - INVALID_REQUEST 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORIZED("AUTHORIZED"),
    
    PARTIAL_AUTHORIZED("PARTIAL_AUTHORIZED"),
    
    AUTHORIZED_PENDING_REVIEW("AUTHORIZED_PENDING_REVIEW"),
    
    DECLINED("DECLINED"),
    
    INVALID_REQUEST("INVALID_REQUEST"),
    
    PENDING("PENDING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201ResponseErrorInformation errorInformation = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private PtsV2PaymentsPost201ResponseProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("issuerInformation")
  private PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation = null;

  @SerializedName("paymentInformation")
  private PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("pointOfSaleInformation")
  private PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("installmentInformation")
  private PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation = null;

  public PtsV2PaymentsPost201Response links(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsPost201Response id(String id) {
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

  public PtsV2PaymentsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public PtsV2PaymentsPost201Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - DECLINED  - INVALID_REQUEST ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PtsV2PaymentsPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * The reconciliation id for the submitted transaction. This value is not returned for all processors. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "The reconciliation id for the submitted transaction. This value is not returned for all processors. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2PaymentsPost201Response errorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public PtsV2PaymentsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PaymentsPost201Response processingInformation(PtsV2PaymentsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(PtsV2PaymentsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PtsV2PaymentsPost201Response processorInformation(PtsV2PaymentsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsPost201Response issuerInformation(PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseIssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }

  public PtsV2PaymentsPost201Response paymentInformation(PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2PaymentsPost201Response orderInformation(PtsV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2PaymentsPost201Response pointOfSaleInformation(PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public PtsV2PaymentsPost201Response installmentInformation(PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201Response ptsV2PaymentsPost201Response = (PtsV2PaymentsPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsPost201Response.reconciliationId) &&
        Objects.equals(this.errorInformation, ptsV2PaymentsPost201Response.errorInformation) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, ptsV2PaymentsPost201Response.processingInformation) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsPost201Response.processorInformation) &&
        Objects.equals(this.issuerInformation, ptsV2PaymentsPost201Response.issuerInformation) &&
        Objects.equals(this.paymentInformation, ptsV2PaymentsPost201Response.paymentInformation) &&
        Objects.equals(this.orderInformation, ptsV2PaymentsPost201Response.orderInformation) &&
        Objects.equals(this.pointOfSaleInformation, ptsV2PaymentsPost201Response.pointOfSaleInformation) &&
        Objects.equals(this.installmentInformation, ptsV2PaymentsPost201Response.installmentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, errorInformation, clientReferenceInformation, processingInformation, processorInformation, issuerInformation, paymentInformation, orderInformation, pointOfSaleInformation, installmentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
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

