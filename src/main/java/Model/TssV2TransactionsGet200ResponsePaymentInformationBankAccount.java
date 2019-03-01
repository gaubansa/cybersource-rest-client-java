/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * TssV2TransactionsGet200ResponsePaymentInformationBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class TssV2TransactionsGet200ResponsePaymentInformationBankAccount {
  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("checkNumber")
  private String checkNumber = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("checkDigit")
  private String checkDigit = null;

  @SerializedName("encoderId")
  private String encoderId = null;

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return suffix
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return prefix
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return checkNumber
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return type
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return name
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount checkDigit(String checkDigit) {
    this.checkDigit = checkDigit;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return checkDigit
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(String checkDigit) {
    this.checkDigit = checkDigit;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationBankAccount encoderId(String encoderId) {
    this.encoderId = encoderId;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return encoderId
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getEncoderId() {
    return encoderId;
  }

  public void setEncoderId(String encoderId) {
    this.encoderId = encoderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationBankAccount tssV2TransactionsGet200ResponsePaymentInformationBankAccount = (TssV2TransactionsGet200ResponsePaymentInformationBankAccount) o;
    return Objects.equals(this.suffix, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.suffix) &&
        Objects.equals(this.prefix, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.prefix) &&
        Objects.equals(this.checkNumber, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.checkNumber) &&
        Objects.equals(this.type, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.type) &&
        Objects.equals(this.name, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.name) &&
        Objects.equals(this.checkDigit, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.checkDigit) &&
        Objects.equals(this.encoderId, tssV2TransactionsGet200ResponsePaymentInformationBankAccount.encoderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, prefix, checkNumber, type, name, checkDigit, encoderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationBankAccount {\n");
    
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
    sb.append("    encoderId: ").append(toIndentedString(encoderId)).append("\n");
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

