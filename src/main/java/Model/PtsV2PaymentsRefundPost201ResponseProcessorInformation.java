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
import Model.PtsV2PaymentsPost201ResponseProcessorInformationAchVerification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsRefundPost201ResponseProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class PtsV2PaymentsRefundPost201ResponseProcessorInformation {
  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("forwardedAcquirerCode")
  private String forwardedAcquirerCode = null;

  @SerializedName("merchantNumber")
  private String merchantNumber = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("achVerification")
  private PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification = null;

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID &#x3D; 66012345  - Shift number &#x3D; 001  - Batch number &#x3D; 069  - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID = 66012345  - Shift number = 001  - Batch number = 069  - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation forwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
    return this;
  }

   /**
   * Name of the Japanese acquirer that processed the transaction. Returned only for JCN Gateway. Please contact the CyberSource Japan Support Group for more information. 
   * @return forwardedAcquirerCode
  **/
  @ApiModelProperty(value = "Name of the Japanese acquirer that processed the transaction. Returned only for JCN Gateway. Please contact the CyberSource Japan Support Group for more information. ")
  public String getForwardedAcquirerCode() {
    return forwardedAcquirerCode;
  }

  public void setForwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
  }

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation merchantNumber(String merchantNumber) {
    this.merchantNumber = merchantNumber;
    return this;
  }

   /**
   * Identifier that was assigned to you by your acquirer. This value must be printed on the receipt.  #### Returned by Authorizations and Credits.  This reply field is only supported by merchants who have installed client software on their POS terminals and use these processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX 
   * @return merchantNumber
  **/
  @ApiModelProperty(value = "Identifier that was assigned to you by your acquirer. This value must be printed on the receipt.  #### Returned by Authorizations and Credits.  This reply field is only supported by merchants who have installed client software on their POS terminals and use these processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX ")
  public String getMerchantNumber() {
    return merchantNumber;
  }

  public void setMerchantNumber(String merchantNumber) {
    this.merchantNumber = merchantNumber;
  }

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;processorInformation.responseCategoryCode&#x60; field. String (3) 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `processorInformation.responseCategoryCode` field. String (3) ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PtsV2PaymentsRefundPost201ResponseProcessorInformation achVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
    return this;
  }

   /**
   * Get achVerification
   * @return achVerification
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationAchVerification getAchVerification() {
    return achVerification;
  }

  public void setAchVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsRefundPost201ResponseProcessorInformation ptsV2PaymentsRefundPost201ResponseProcessorInformation = (PtsV2PaymentsRefundPost201ResponseProcessorInformation) o;
    return Objects.equals(this.approvalCode, ptsV2PaymentsRefundPost201ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.transactionId, ptsV2PaymentsRefundPost201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.forwardedAcquirerCode, ptsV2PaymentsRefundPost201ResponseProcessorInformation.forwardedAcquirerCode) &&
        Objects.equals(this.merchantNumber, ptsV2PaymentsRefundPost201ResponseProcessorInformation.merchantNumber) &&
        Objects.equals(this.responseCode, ptsV2PaymentsRefundPost201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.achVerification, ptsV2PaymentsRefundPost201ResponseProcessorInformation.achVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, transactionId, forwardedAcquirerCode, merchantNumber, responseCode, achVerification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsRefundPost201ResponseProcessorInformation {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    forwardedAcquirerCode: ").append(toIndentedString(forwardedAcquirerCode)).append("\n");
    sb.append("    merchantNumber: ").append(toIndentedString(merchantNumber)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    achVerification: ").append(toIndentedString(achVerification)).append("\n");
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

