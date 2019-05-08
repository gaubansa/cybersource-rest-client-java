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
 * TssV2TransactionsGet200ResponsePaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("fundingSource")
  private String fundingSource = null;

  @SerializedName("fundingSourceAffiliation")
  private String fundingSourceAffiliation = null;

  @SerializedName("credential")
  private String credential = null;

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a payment method. This is required for non-credit card payment.  Examples: &#x60;SEARS&#x60;, &#x60;JCREW&#x60;, &#x60;PAYPAL&#x60;, &#x60;IDEAL&#x60;, &#x60;EPS&#x60; ...etc.  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. 
   * @return name
  **/
  @ApiModelProperty(value = "The name of a payment method. This is required for non-credit card payment.  Examples: `SEARS`, `JCREW`, `PAYPAL`, `IDEAL`, `EPS` ...etc.  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of payment method. This is required for non-credit card payment.  Possible values:  - BANK_TRANSFER  - CARD (Default)  - EWALLET  - DIGITAL  - DIRECT_DEBIT  - INVOICE  - PUSH_PAYMENT  - CARRIER_BILLING  - CASH  - CHECK  - CRYPTOGRAPHIC  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. 
   * @return type
  **/
  @ApiModelProperty(value = "The type of payment method. This is required for non-credit card payment.  Possible values:  - BANK_TRANSFER  - CARD (Default)  - EWALLET  - DIGITAL  - DIRECT_DEBIT  - INVOICE  - PUSH_PAYMENT  - CARRIER_BILLING  - CASH  - CHECK  - CRYPTOGRAPHIC  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType method(String method) {
    this.method = method;
    return this;
  }

   /**
   * This is an optional field.  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. 
   * @return method
  **/
  @ApiModelProperty(value = "This is an optional field.  Please contact CyberSource Customer Support to enable the payment method of your choice and the value you should send in your payment request for this field. ")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType fundingSourceAffiliation(String fundingSourceAffiliation) {
    this.fundingSourceAffiliation = fundingSourceAffiliation;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return fundingSourceAffiliation
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getFundingSourceAffiliation() {
    return fundingSourceAffiliation;
  }

  public void setFundingSourceAffiliation(String fundingSourceAffiliation) {
    this.fundingSourceAffiliation = fundingSourceAffiliation;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return credential
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationPaymentType tssV2TransactionsGet200ResponsePaymentInformationPaymentType = (TssV2TransactionsGet200ResponsePaymentInformationPaymentType) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.name) &&
        Objects.equals(this.type, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.type) &&
        Objects.equals(this.method, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.method) &&
        Objects.equals(this.fundingSource, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.fundingSource) &&
        Objects.equals(this.fundingSourceAffiliation, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.fundingSourceAffiliation) &&
        Objects.equals(this.credential, tssV2TransactionsGet200ResponsePaymentInformationPaymentType.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, method, fundingSource, fundingSourceAffiliation, credential);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationPaymentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    fundingSourceAffiliation: ").append(toIndentedString(fundingSourceAffiliation)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

