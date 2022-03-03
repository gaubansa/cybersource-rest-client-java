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
import Model.Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory;
import Model.Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsRiskInformationBuyerHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Ptsv2paymentsRiskInformationBuyerHistory {
  @SerializedName("customerAccount")
  private Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount customerAccount = null;

  @SerializedName("accountHistory")
  private Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory accountHistory = null;

  @SerializedName("accountPurchases")
  private Integer accountPurchases = null;

  @SerializedName("addCardAttempts")
  private Integer addCardAttempts = null;

  @SerializedName("priorSuspiciousActivity")
  private Boolean priorSuspiciousActivity = null;

  @SerializedName("paymentAccountHistory")
  private String paymentAccountHistory = null;

  @SerializedName("paymentAccountDate")
  private Integer paymentAccountDate = null;

  @SerializedName("transactionCountDay")
  private Integer transactionCountDay = null;

  @SerializedName("transactionCountYear")
  private Integer transactionCountYear = null;

  public Ptsv2paymentsRiskInformationBuyerHistory customerAccount(Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount customerAccount) {
    this.customerAccount = customerAccount;
    return this;
  }

   /**
   * Get customerAccount
   * @return customerAccount
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(Ptsv2paymentsRiskInformationBuyerHistoryCustomerAccount customerAccount) {
    this.customerAccount = customerAccount;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory accountHistory(Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory accountHistory) {
    this.accountHistory = accountHistory;
    return this;
  }

   /**
   * Get accountHistory
   * @return accountHistory
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory getAccountHistory() {
    return accountHistory;
  }

  public void setAccountHistory(Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory accountHistory) {
    this.accountHistory = accountHistory;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory accountPurchases(Integer accountPurchases) {
    this.accountPurchases = accountPurchases;
    return this;
  }

   /**
   * Number of purchases with this cardholder account during the previous six months. Recommended for Discover ProtectBuy. 
   * @return accountPurchases
  **/
  @ApiModelProperty(value = "Number of purchases with this cardholder account during the previous six months. Recommended for Discover ProtectBuy. ")
  public Integer getAccountPurchases() {
    return accountPurchases;
  }

  public void setAccountPurchases(Integer accountPurchases) {
    this.accountPurchases = accountPurchases;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory addCardAttempts(Integer addCardAttempts) {
    this.addCardAttempts = addCardAttempts;
    return this;
  }

   /**
   * Number of add card attempts in the last 24 hours. Recommended for Discover ProtectBuy. 
   * @return addCardAttempts
  **/
  @ApiModelProperty(value = "Number of add card attempts in the last 24 hours. Recommended for Discover ProtectBuy. ")
  public Integer getAddCardAttempts() {
    return addCardAttempts;
  }

  public void setAddCardAttempts(Integer addCardAttempts) {
    this.addCardAttempts = addCardAttempts;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory priorSuspiciousActivity(Boolean priorSuspiciousActivity) {
    this.priorSuspiciousActivity = priorSuspiciousActivity;
    return this;
  }

   /**
   * Indicates whether the merchant experienced suspicious activity (including previous fraud) on the account. Recommended for Discover ProtectBuy. 
   * @return priorSuspiciousActivity
  **/
  @ApiModelProperty(value = "Indicates whether the merchant experienced suspicious activity (including previous fraud) on the account. Recommended for Discover ProtectBuy. ")
  public Boolean getPriorSuspiciousActivity() {
    return priorSuspiciousActivity;
  }

  public void setPriorSuspiciousActivity(Boolean priorSuspiciousActivity) {
    this.priorSuspiciousActivity = priorSuspiciousActivity;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory paymentAccountHistory(String paymentAccountHistory) {
    this.paymentAccountHistory = paymentAccountHistory;
    return this;
  }

   /**
   * This only applies for NEW_ACCOUNT and EXISTING_ACCOUNT in creationHistory. Possible values are: - PAYMENT_ACCOUNT_EXISTS - PAYMENT_ACCOUNT_ADDED_NOW 
   * @return paymentAccountHistory
  **/
  @ApiModelProperty(value = "This only applies for NEW_ACCOUNT and EXISTING_ACCOUNT in creationHistory. Possible values are: - PAYMENT_ACCOUNT_EXISTS - PAYMENT_ACCOUNT_ADDED_NOW ")
  public String getPaymentAccountHistory() {
    return paymentAccountHistory;
  }

  public void setPaymentAccountHistory(String paymentAccountHistory) {
    this.paymentAccountHistory = paymentAccountHistory;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory paymentAccountDate(Integer paymentAccountDate) {
    this.paymentAccountDate = paymentAccountDate;
    return this;
  }

   /**
   * Date applicable only for PAYMENT_ACCOUNT_EXISTS in paymentAccountHistory 
   * @return paymentAccountDate
  **/
  @ApiModelProperty(value = "Date applicable only for PAYMENT_ACCOUNT_EXISTS in paymentAccountHistory ")
  public Integer getPaymentAccountDate() {
    return paymentAccountDate;
  }

  public void setPaymentAccountDate(Integer paymentAccountDate) {
    this.paymentAccountDate = paymentAccountDate;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory transactionCountDay(Integer transactionCountDay) {
    this.transactionCountDay = transactionCountDay;
    return this;
  }

   /**
   * Number of transaction (successful or abandoned) for this cardholder account within the last 24 hours. Recommended for Discover ProtectBuy. 
   * @return transactionCountDay
  **/
  @ApiModelProperty(value = "Number of transaction (successful or abandoned) for this cardholder account within the last 24 hours. Recommended for Discover ProtectBuy. ")
  public Integer getTransactionCountDay() {
    return transactionCountDay;
  }

  public void setTransactionCountDay(Integer transactionCountDay) {
    this.transactionCountDay = transactionCountDay;
  }

  public Ptsv2paymentsRiskInformationBuyerHistory transactionCountYear(Integer transactionCountYear) {
    this.transactionCountYear = transactionCountYear;
    return this;
  }

   /**
   * Number of transaction (successful or abandoned) for this cardholder account within the last year. Recommended for Discover ProtectBuy. 
   * @return transactionCountYear
  **/
  @ApiModelProperty(value = "Number of transaction (successful or abandoned) for this cardholder account within the last year. Recommended for Discover ProtectBuy. ")
  public Integer getTransactionCountYear() {
    return transactionCountYear;
  }

  public void setTransactionCountYear(Integer transactionCountYear) {
    this.transactionCountYear = transactionCountYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsRiskInformationBuyerHistory ptsv2paymentsRiskInformationBuyerHistory = (Ptsv2paymentsRiskInformationBuyerHistory) o;
    return Objects.equals(this.customerAccount, ptsv2paymentsRiskInformationBuyerHistory.customerAccount) &&
        Objects.equals(this.accountHistory, ptsv2paymentsRiskInformationBuyerHistory.accountHistory) &&
        Objects.equals(this.accountPurchases, ptsv2paymentsRiskInformationBuyerHistory.accountPurchases) &&
        Objects.equals(this.addCardAttempts, ptsv2paymentsRiskInformationBuyerHistory.addCardAttempts) &&
        Objects.equals(this.priorSuspiciousActivity, ptsv2paymentsRiskInformationBuyerHistory.priorSuspiciousActivity) &&
        Objects.equals(this.paymentAccountHistory, ptsv2paymentsRiskInformationBuyerHistory.paymentAccountHistory) &&
        Objects.equals(this.paymentAccountDate, ptsv2paymentsRiskInformationBuyerHistory.paymentAccountDate) &&
        Objects.equals(this.transactionCountDay, ptsv2paymentsRiskInformationBuyerHistory.transactionCountDay) &&
        Objects.equals(this.transactionCountYear, ptsv2paymentsRiskInformationBuyerHistory.transactionCountYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAccount, accountHistory, accountPurchases, addCardAttempts, priorSuspiciousActivity, paymentAccountHistory, paymentAccountDate, transactionCountDay, transactionCountYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsRiskInformationBuyerHistory {\n");
    
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
    sb.append("    accountHistory: ").append(toIndentedString(accountHistory)).append("\n");
    sb.append("    accountPurchases: ").append(toIndentedString(accountPurchases)).append("\n");
    sb.append("    addCardAttempts: ").append(toIndentedString(addCardAttempts)).append("\n");
    sb.append("    priorSuspiciousActivity: ").append(toIndentedString(priorSuspiciousActivity)).append("\n");
    sb.append("    paymentAccountHistory: ").append(toIndentedString(paymentAccountHistory)).append("\n");
    sb.append("    paymentAccountDate: ").append(toIndentedString(paymentAccountDate)).append("\n");
    sb.append("    transactionCountDay: ").append(toIndentedString(transactionCountDay)).append("\n");
    sb.append("    transactionCountYear: ").append(toIndentedString(transactionCountYear)).append("\n");
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

