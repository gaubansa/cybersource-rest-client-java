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
 * PtsV2PayoutsPost201ResponseProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class PtsV2PayoutsPost201ResponseProcessorInformation {
  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("responseCodeSource")
  private String responseCodeSource = null;

  public PtsV2PayoutsPost201ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Issuer-generated approval code for the transaction.
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Issuer-generated approval code for the transaction.")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PtsV2PayoutsPost201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Transaction status from the processor.
   * @return responseCode
  **/
  @ApiModelProperty(value = "Transaction status from the processor.")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PtsV2PayoutsPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). This value can be used to identify a specific transaction when you are discussing the transaction with your processor. ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PayoutsPost201ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public PtsV2PayoutsPost201ResponseProcessorInformation responseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
    return this;
  }

   /**
   * Used by Visa only and contains the response source/reason code that identifies the source of the response decision. 
   * @return responseCodeSource
  **/
  @ApiModelProperty(value = "Used by Visa only and contains the response source/reason code that identifies the source of the response decision. ")
  public String getResponseCodeSource() {
    return responseCodeSource;
  }

  public void setResponseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201ResponseProcessorInformation ptsV2PayoutsPost201ResponseProcessorInformation = (PtsV2PayoutsPost201ResponseProcessorInformation) o;
    return Objects.equals(this.approvalCode, ptsV2PayoutsPost201ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.responseCode, ptsV2PayoutsPost201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.transactionId, ptsV2PayoutsPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.systemTraceAuditNumber, ptsV2PayoutsPost201ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.responseCodeSource, ptsV2PayoutsPost201ResponseProcessorInformation.responseCodeSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, responseCode, transactionId, systemTraceAuditNumber, responseCodeSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseProcessorInformation {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    sb.append("    responseCodeSource: ").append(toIndentedString(responseCodeSource)).append("\n");
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

