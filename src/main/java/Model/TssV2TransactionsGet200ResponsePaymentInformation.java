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
import Model.Riskv1authenticationsetupsPaymentInformationCustomer;
import Model.TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures;
import Model.TssV2TransactionsGet200ResponsePaymentInformationBank;
import Model.TssV2TransactionsGet200ResponsePaymentInformationCard;
import Model.TssV2TransactionsGet200ResponsePaymentInformationInvoice;
import Model.TssV2TransactionsGet200ResponsePaymentInformationPaymentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformation {
  @SerializedName("paymentType")
  private TssV2TransactionsGet200ResponsePaymentInformationPaymentType paymentType = null;

  @SerializedName("customer")
  private Riskv1authenticationsetupsPaymentInformationCustomer customer = null;

  @SerializedName("card")
  private TssV2TransactionsGet200ResponsePaymentInformationCard card = null;

  @SerializedName("invoice")
  private TssV2TransactionsGet200ResponsePaymentInformationInvoice invoice = null;

  @SerializedName("bank")
  private TssV2TransactionsGet200ResponsePaymentInformationBank bank = null;

  @SerializedName("accountFeatures")
  private TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures accountFeatures = null;

  public TssV2TransactionsGet200ResponsePaymentInformation paymentType(TssV2TransactionsGet200ResponsePaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(TssV2TransactionsGet200ResponsePaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public TssV2TransactionsGet200ResponsePaymentInformation customer(Riskv1authenticationsetupsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Riskv1authenticationsetupsPaymentInformationCustomer customer) {
    this.customer = customer;
  }

  public TssV2TransactionsGet200ResponsePaymentInformation card(TssV2TransactionsGet200ResponsePaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationCard getCard() {
    return card;
  }

  public void setCard(TssV2TransactionsGet200ResponsePaymentInformationCard card) {
    this.card = card;
  }

  public TssV2TransactionsGet200ResponsePaymentInformation invoice(TssV2TransactionsGet200ResponsePaymentInformationInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(TssV2TransactionsGet200ResponsePaymentInformationInvoice invoice) {
    this.invoice = invoice;
  }

  public TssV2TransactionsGet200ResponsePaymentInformation bank(TssV2TransactionsGet200ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(TssV2TransactionsGet200ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }

  public TssV2TransactionsGet200ResponsePaymentInformation accountFeatures(TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
    return this;
  }

   /**
   * Get accountFeatures
   * @return accountFeatures
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures getAccountFeatures() {
    return accountFeatures;
  }

  public void setAccountFeatures(TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures accountFeatures) {
    this.accountFeatures = accountFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformation tssV2TransactionsGet200ResponsePaymentInformation = (TssV2TransactionsGet200ResponsePaymentInformation) o;
    return Objects.equals(this.paymentType, tssV2TransactionsGet200ResponsePaymentInformation.paymentType) &&
        Objects.equals(this.customer, tssV2TransactionsGet200ResponsePaymentInformation.customer) &&
        Objects.equals(this.card, tssV2TransactionsGet200ResponsePaymentInformation.card) &&
        Objects.equals(this.invoice, tssV2TransactionsGet200ResponsePaymentInformation.invoice) &&
        Objects.equals(this.bank, tssV2TransactionsGet200ResponsePaymentInformation.bank) &&
        Objects.equals(this.accountFeatures, tssV2TransactionsGet200ResponsePaymentInformation.accountFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, customer, card, invoice, bank, accountFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformation {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    accountFeatures: ").append(toIndentedString(accountFeatures)).append("\n");
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

