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
import Model.PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances;
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
 * PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures {
  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("accountStatus")
  private String accountStatus = null;

  @SerializedName("balances")
  private List<PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances> balances = null;

  @SerializedName("balanceAmount")
  private String balanceAmount = null;

  @SerializedName("balanceAmountType")
  private String balanceAmountType = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("balanceSign")
  private String balanceSign = null;

  @SerializedName("affluenceIndicator")
  private String affluenceIndicator = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("commercial")
  private String commercial = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("healthCare")
  private String healthCare = null;

  @SerializedName("payroll")
  private String payroll = null;

  @SerializedName("level3Eligible")
  private String level3Eligible = null;

  @SerializedName("pinlessDebit")
  private String pinlessDebit = null;

  @SerializedName("signatureDebit")
  private String signatureDebit = null;

  @SerializedName("prepaid")
  private String prepaid = null;

  @SerializedName("regulated")
  private String regulated = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account. This value is returned only if you requested a balance inquiry. Possible values:   - &#x60;00&#x60;: Not applicable or not specified  - &#x60;10&#x60;: Savings account  - &#x60;20&#x60;: Checking account  - &#x60;30&#x60;: Credit card account  - &#x60;40&#x60;: Universal account  #### PIN debit Type of account. This value is returned only if you requested a balance inquiry.  Possible values: - &#x60;00&#x60;: Not applicable or not specified - &#x60;10&#x60;: Savings account - &#x60;20&#x60;: Checking account - &#x60;40&#x60;: Universal account - &#x60;96&#x60;: Cash benefits account - &#x60;98&#x60;: Food stamp account  Returned by PIN debit purchase. 
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of account. This value is returned only if you requested a balance inquiry. Possible values:   - `00`: Not applicable or not specified  - `10`: Savings account  - `20`: Checking account  - `30`: Credit card account  - `40`: Universal account  #### PIN debit Type of account. This value is returned only if you requested a balance inquiry.  Possible values: - `00`: Not applicable or not specified - `10`: Savings account - `20`: Checking account - `40`: Universal account - `96`: Cash benefits account - `98`: Food stamp account  Returned by PIN debit purchase. ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Possible values: - &#x60;N&#x60;: Nonregulated - &#x60;R&#x60;: Regulated  Returned by PIN debit credit or PIN debit purchase.  **Note** This field is returned only for CyberSource through VisaNet. 
   * @return accountStatus
  **/
  @ApiModelProperty(value = "Possible values: - `N`: Nonregulated - `R`: Regulated  Returned by PIN debit credit or PIN debit purchase.  **Note** This field is returned only for CyberSource through VisaNet. ")
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures balances(List<PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances> balances) {
    this.balances = balances;
    return this;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures addBalancesItem(PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * This is an array of multiple balances information an issuer can return for a given card.
   * @return balances
  **/
  @ApiModelProperty(value = "This is an array of multiple balances information an issuer can return for a given card.")
  public List<PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances> getBalances() {
    return balances;
  }

  public void setBalances(List<PtsV2PaymentsPost201ResponsePaymentInformationAccountFeaturesBalances> balances) {
    this.balances = balances;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures balanceAmountType(String balanceAmountType) {
    this.balanceAmountType = balanceAmountType;
    return this;
  }

   /**
   * Type of amount. This value is returned only if you requested a balance inquiry. The issuer determines the value that is returned. Possible values for deposit accounts:   - &#x60;01&#x60;: Current ledger (posted) balance.  - &#x60;02&#x60;: Current available balance, which is typically the ledger balance less outstanding authorizations.  Some depository institutions also include pending deposits and the credit or overdraft line associated with the account. Possible values for credit card accounts:   - &#x60;01&#x60;: Credit amount remaining for customer (open to buy).  - &#x60;02&#x60;: Credit limit. 
   * @return balanceAmountType
  **/
  @ApiModelProperty(value = "Type of amount. This value is returned only if you requested a balance inquiry. The issuer determines the value that is returned. Possible values for deposit accounts:   - `01`: Current ledger (posted) balance.  - `02`: Current available balance, which is typically the ledger balance less outstanding authorizations.  Some depository institutions also include pending deposits and the credit or overdraft line associated with the account. Possible values for credit card accounts:   - `01`: Credit amount remaining for customer (open to buy).  - `02`: Credit limit. ")
  public String getBalanceAmountType() {
    return balanceAmountType;
  }

  public void setBalanceAmountType(String balanceAmountType) {
    this.balanceAmountType = balanceAmountType;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the remaining balance on the account. For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  Returned by authorization service.  #### PIN debit Currency of the remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of the remaining balance on the account. For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  Returned by authorization service.  #### PIN debit Currency of the remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures balanceSign(String balanceSign) {
    this.balanceSign = balanceSign;
    return this;
  }

   /**
   * Sign for the remaining balance on the account. Returned only when the processor returns this value. Possible values:  Possible values: - &#x60;Positive&#x60; - &#x60;Negative&#x60;  #### PIN debit Sign for the remaining balance on the prepaid card. Returned only when the processor returns this value.  Returned by PIN debit purchase. 
   * @return balanceSign
  **/
  @ApiModelProperty(value = "Sign for the remaining balance on the account. Returned only when the processor returns this value. Possible values:  Possible values: - `Positive` - `Negative`  #### PIN debit Sign for the remaining balance on the prepaid card. Returned only when the processor returns this value.  Returned by PIN debit purchase. ")
  public String getBalanceSign() {
    return balanceSign;
  }

  public void setBalanceSign(String balanceSign) {
    this.balanceSign = balanceSign;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures affluenceIndicator(String affluenceIndicator) {
    this.affluenceIndicator = affluenceIndicator;
    return this;
  }

   /**
   * **Chase Paymentech Solutions**  Indicates whether a customer has high credit limits. This information enables you to market high cost items to these customers and to understand the kinds of cards that high income customers are using.  This field is supported for Visa, Mastercard, Discover, and Diners Club. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown  #### Litle  Flag that indicates that a Visa cardholder or Mastercard cardholder is in one of the affluent categories. Possible values:   - &#x60;AFFLUENT&#x60;: High income customer with high spending pattern (&gt;100k USD annual income and &gt;40k USD annual    card usage).  - &#x60;MASS AFFLUENT&#x60;: High income customer (&gt;100k USD annual income).   Maximum length is 13.  #### Chase Paymentech Solutions  Maximum length is 1. 
   * @return affluenceIndicator
  **/
  @ApiModelProperty(value = "**Chase Paymentech Solutions**  Indicates whether a customer has high credit limits. This information enables you to market high cost items to these customers and to understand the kinds of cards that high income customers are using.  This field is supported for Visa, Mastercard, Discover, and Diners Club. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown  #### Litle  Flag that indicates that a Visa cardholder or Mastercard cardholder is in one of the affluent categories. Possible values:   - `AFFLUENT`: High income customer with high spending pattern (>100k USD annual income and >40k USD annual    card usage).  - `MASS AFFLUENT`: High income customer (>100k USD annual income).   Maximum length is 13.  #### Chase Paymentech Solutions  Maximum length is 1. ")
  public String getAffluenceIndicator() {
    return affluenceIndicator;
  }

  public void setAffluenceIndicator(String affluenceIndicator) {
    this.affluenceIndicator = affluenceIndicator;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures category(String category) {
    this.category = category;
    return this;
  }

   /**
   * #### GPX Mastercard product ID associated with the primary account number (PAN). Returned by authorization service.  #### CyberSource through VisaNet Visa or Mastercard product ID that is associated with the primary account number (PAN). For descriptions of the Visa product IDs, see the Product ID table on the [Visa Request &amp; Response Codes web page.](https://developer.visa.com/guides/request_response_codes)  Data Length: String (3)  #### GPN Visa or Mastercard product ID that is associated with the primary account number (PAN). For descriptions of the Visa product IDs, see the Product ID table on the [Visa Request &amp; Response Codes web page.](https://developer.visa.com/guides/request_response_codes)  Data Length: String (3)  #### Worldpay VAP **Important** Before using this field on Worldpay VAP, you must contact CyberSource Customer Support to have your account configured for this feature.  Type of card used in the transaction. The only possible value is: - &#x60;PREPAID&#x60;: Prepaid Card  Data Length: String (7)  #### RBS WorldPay Atlanta Type of card used in the transaction. Possible values: - &#x60;B&#x60;: Business Card - &#x60;O&#x60;: Noncommercial Card - &#x60;R&#x60;: Corporate Card - &#x60;S&#x60;: Purchase Card - &#x60;Blank&#x60;: Purchase card not supported  Data Length: String (1) 
   * @return category
  **/
  @ApiModelProperty(value = "#### GPX Mastercard product ID associated with the primary account number (PAN). Returned by authorization service.  #### CyberSource through VisaNet Visa or Mastercard product ID that is associated with the primary account number (PAN). For descriptions of the Visa product IDs, see the Product ID table on the [Visa Request & Response Codes web page.](https://developer.visa.com/guides/request_response_codes)  Data Length: String (3)  #### GPN Visa or Mastercard product ID that is associated with the primary account number (PAN). For descriptions of the Visa product IDs, see the Product ID table on the [Visa Request & Response Codes web page.](https://developer.visa.com/guides/request_response_codes)  Data Length: String (3)  #### Worldpay VAP **Important** Before using this field on Worldpay VAP, you must contact CyberSource Customer Support to have your account configured for this feature.  Type of card used in the transaction. The only possible value is: - `PREPAID`: Prepaid Card  Data Length: String (7)  #### RBS WorldPay Atlanta Type of card used in the transaction. Possible values: - `B`: Business Card - `O`: Noncommercial Card - `R`: Corporate Card - `S`: Purchase Card - `Blank`: Purchase card not supported  Data Length: String (1) ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures commercial(String commercial) {
    this.commercial = commercial;
    return this;
  }

   /**
   * Indicates whether the card is a commercial card, which enables you to include Level II data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return commercial
  **/
  @ApiModelProperty(value = "Indicates whether the card is a commercial card, which enables you to include Level II data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getCommercial() {
    return commercial;
  }

  public void setCommercial(String commercial) {
    this.commercial = commercial;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Type of commercial card. This field is supported only for CyberSource through VisaNet. Possible values:   - &#x60;B&#x60;: Business card  - &#x60;R&#x60;: Corporate card  - &#x60;S&#x60;: Purchasing card  - &#x60;0&#x60;: Noncommercial card  Returned by authorization service. 
   * @return group
  **/
  @ApiModelProperty(value = "Type of commercial card. This field is supported only for CyberSource through VisaNet. Possible values:   - `B`: Business card  - `R`: Corporate card  - `S`: Purchasing card  - `0`: Noncommercial card  Returned by authorization service. ")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures healthCare(String healthCare) {
    this.healthCare = healthCare;
    return this;
  }

   /**
   * Indicates whether the card is a healthcare card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return healthCare
  **/
  @ApiModelProperty(value = "Indicates whether the card is a healthcare card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getHealthCare() {
    return healthCare;
  }

  public void setHealthCare(String healthCare) {
    this.healthCare = healthCare;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures payroll(String payroll) {
    this.payroll = payroll;
    return this;
  }

   /**
   * Indicates whether the card is a payroll card. This field is supported for Visa, Discover, Diners Club, and JCB on **Chase Paymentech Solutions**. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return payroll
  **/
  @ApiModelProperty(value = "Indicates whether the card is a payroll card. This field is supported for Visa, Discover, Diners Club, and JCB on **Chase Paymentech Solutions**. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getPayroll() {
    return payroll;
  }

  public void setPayroll(String payroll) {
    this.payroll = payroll;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures level3Eligible(String level3Eligible) {
    this.level3Eligible = level3Eligible;
    return this;
  }

   /**
   * Indicates whether the card is eligible for Level III interchange fees, which enables you to include Level III data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return level3Eligible
  **/
  @ApiModelProperty(value = "Indicates whether the card is eligible for Level III interchange fees, which enables you to include Level III data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getLevel3Eligible() {
    return level3Eligible;
  }

  public void setLevel3Eligible(String level3Eligible) {
    this.level3Eligible = level3Eligible;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures pinlessDebit(String pinlessDebit) {
    this.pinlessDebit = pinlessDebit;
    return this;
  }

   /**
   * Indicates whether the card is a PINless debit card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return pinlessDebit
  **/
  @ApiModelProperty(value = "Indicates whether the card is a PINless debit card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getPinlessDebit() {
    return pinlessDebit;
  }

  public void setPinlessDebit(String pinlessDebit) {
    this.pinlessDebit = pinlessDebit;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures signatureDebit(String signatureDebit) {
    this.signatureDebit = signatureDebit;
    return this;
  }

   /**
   * Indicates whether the card is a signature debit card.  This information enables you to alter the way an order is processed. For example, you might not want to reauthorize a transaction for a signature debit card, or you might want to perform reversals promptly for a signature debit card. This field is supported for Visa, Mastercard, and Maestro (International) on Chase Paymentech Solutions. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return signatureDebit
  **/
  @ApiModelProperty(value = "Indicates whether the card is a signature debit card.  This information enables you to alter the way an order is processed. For example, you might not want to reauthorize a transaction for a signature debit card, or you might want to perform reversals promptly for a signature debit card. This field is supported for Visa, Mastercard, and Maestro (International) on Chase Paymentech Solutions. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getSignatureDebit() {
    return signatureDebit;
  }

  public void setSignatureDebit(String signatureDebit) {
    this.signatureDebit = signatureDebit;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures prepaid(String prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Indicates whether the card is a prepaid card. This information enables you to determine when a gift card or prepaid card is presented for use when establishing a new recurring, installment, or deferred billing relationship.  This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return prepaid
  **/
  @ApiModelProperty(value = "Indicates whether the card is a prepaid card. This information enables you to determine when a gift card or prepaid card is presented for use when establishing a new recurring, installment, or deferred billing relationship.  This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(String prepaid) {
    this.prepaid = prepaid;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures regulated(String regulated) {
    this.regulated = regulated;
    return this;
  }

   /**
   * Indicates whether the card is regulated according to the Durbin Amendment. If the card is regulated, the card issuer is subject to price caps and interchange rules. This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - &#x60;Y&#x60;: Yes  - &#x60;N&#x60;: No  - &#x60;X&#x60;: Not applicable / Unknown 
   * @return regulated
  **/
  @ApiModelProperty(value = "Indicates whether the card is regulated according to the Durbin Amendment. If the card is regulated, the card issuer is subject to price caps and interchange rules. This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - `Y`: Yes  - `N`: No  - `X`: Not applicable / Unknown ")
  public String getRegulated() {
    return regulated;
  }

  public void setRegulated(String regulated) {
    this.regulated = regulated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures = (PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures) o;
    return Objects.equals(this.accountType, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.accountType) &&
        Objects.equals(this.accountStatus, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.accountStatus) &&
        Objects.equals(this.balances, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.balances) &&
        Objects.equals(this.balanceAmount, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.balanceAmount) &&
        Objects.equals(this.balanceAmountType, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.balanceAmountType) &&
        Objects.equals(this.currency, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.currency) &&
        Objects.equals(this.balanceSign, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.balanceSign) &&
        Objects.equals(this.affluenceIndicator, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.affluenceIndicator) &&
        Objects.equals(this.category, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.category) &&
        Objects.equals(this.commercial, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.commercial) &&
        Objects.equals(this.group, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.group) &&
        Objects.equals(this.healthCare, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.healthCare) &&
        Objects.equals(this.payroll, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.payroll) &&
        Objects.equals(this.level3Eligible, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.level3Eligible) &&
        Objects.equals(this.pinlessDebit, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.pinlessDebit) &&
        Objects.equals(this.signatureDebit, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.signatureDebit) &&
        Objects.equals(this.prepaid, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.prepaid) &&
        Objects.equals(this.regulated, ptsV2PaymentsPost201ResponsePaymentInformationAccountFeatures.regulated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountStatus, balances, balanceAmount, balanceAmountType, currency, balanceSign, affluenceIndicator, category, commercial, group, healthCare, payroll, level3Eligible, pinlessDebit, signatureDebit, prepaid, regulated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationAccountFeatures {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceAmountType: ").append(toIndentedString(balanceAmountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balanceSign: ").append(toIndentedString(balanceSign)).append("\n");
    sb.append("    affluenceIndicator: ").append(toIndentedString(affluenceIndicator)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    commercial: ").append(toIndentedString(commercial)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    healthCare: ").append(toIndentedString(healthCare)).append("\n");
    sb.append("    payroll: ").append(toIndentedString(payroll)).append("\n");
    sb.append("    level3Eligible: ").append(toIndentedString(level3Eligible)).append("\n");
    sb.append("    pinlessDebit: ").append(toIndentedString(pinlessDebit)).append("\n");
    sb.append("    signatureDebit: ").append(toIndentedString(signatureDebit)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    regulated: ").append(toIndentedString(regulated)).append("\n");
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

