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
import Model.Ptsv2creditsProcessingInformationBankTransferOptions;
import Model.Ptsv2creditsProcessingInformationElectronicBenefitsTransfer;
import Model.Ptsv2creditsProcessingInformationJapanPaymentOptions;
import Model.Ptsv2creditsProcessingInformationPurchaseOptions;
import Model.Ptsv2paymentsProcessingInformationLoanOptions;
import Model.Ptsv2paymentsidrefundsProcessingInformationRecurringOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2creditsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class Ptsv2creditsProcessingInformation {
  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("processorId")
  private String processorId = null;

  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("reportGroup")
  private String reportGroup = null;

  @SerializedName("visaCheckoutId")
  private String visaCheckoutId = null;

  @SerializedName("purchaseLevel")
  private String purchaseLevel = null;

  @SerializedName("industryDataType")
  private String industryDataType = null;

  @SerializedName("walletType")
  private String walletType = null;

  @SerializedName("nationalNetDomesticData")
  private String nationalNetDomesticData = null;

  @SerializedName("networkRoutingOrder")
  private String networkRoutingOrder = null;

  @SerializedName("recurringOptions")
  private Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions = null;

  @SerializedName("bankTransferOptions")
  private Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions = null;

  @SerializedName("purchaseOptions")
  private Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions = null;

  @SerializedName("electronicBenefitsTransfer")
  private Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer = null;

  @SerializedName("loanOptions")
  private Ptsv2paymentsProcessingInformationLoanOptions loanOptions = null;

  @SerializedName("japanPaymentOptions")
  private Ptsv2creditsProcessingInformationJapanPaymentOptions japanPaymentOptions = null;

  public Ptsv2creditsProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \&quot;Commerce Indicators,\&quot; on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \&quot;Commerce Indicators,\&quot; on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \&quot;Payer Authentication,\&quot; page 195.  #### Card Present You must set this field to &#x60;retail&#x60;. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as “moto\&quot; 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \"Commerce Indicators,\" on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \"Commerce Indicators,\" on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \"Payer Authentication,\" page 195.  #### Card Present You must set this field to `retail`. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as “moto\" ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv2creditsProcessingInformation processorId(String processorId) {
    this.processorId = processorId;
    return this;
  }

   /**
   * Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**.  Contact CyberSource Customer Support to get the value for this field. 
   * @return processorId
  **/
  @ApiModelProperty(value = "Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**.  Contact CyberSource Customer Support to get the value for this field. ")
  public String getProcessorId() {
    return processorId;
  }

  public void setProcessorId(String processorId) {
    this.processorId = processorId;
  }

  public Ptsv2creditsProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution for the transaction. Possible Values:   - &#x60;visacheckout&#x60;: Visa Checkout. This value is required for Visa Checkout transactions. For details, see &#x60;payment_solution&#x60; field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/)  - &#x60;001&#x60;: Apple Pay.  - &#x60;004&#x60;: Cybersource In-App Solution.  - &#x60;005&#x60;: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \&quot;Masterpass\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  - &#x60;006&#x60;: Android Pay.  - &#x60;007&#x60;: Chase Pay.  - &#x60;008&#x60;: Samsung Pay.  - &#x60;012&#x60;: Google Pay.  - &#x60;013&#x60;: Cybersource P2PE Decryption  - &#x60;014&#x60;: Mastercard credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - &#x60;015&#x60;: Visa credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - &#x60;027&#x60;: Click to Pay. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution for the transaction. Possible Values:   - `visacheckout`: Visa Checkout. This value is required for Visa Checkout transactions. For details, see `payment_solution` field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/)  - `001`: Apple Pay.  - `004`: Cybersource In-App Solution.  - `005`: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \"Masterpass\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  - `006`: Android Pay.  - `007`: Chase Pay.  - `008`: Samsung Pay.  - `012`: Google Pay.  - `013`: Cybersource P2PE Decryption  - `014`: Mastercard credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - `015`: Visa credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - `027`: Click to Pay. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public Ptsv2creditsProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv2creditsProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see &#x60;link_to_request&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see `link_to_request` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public Ptsv2creditsProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see &#x60;report_group&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see `report_group` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public Ptsv2creditsProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public Ptsv2creditsProcessingInformation purchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
    return this;
  }

   /**
   * Set this field to 3 to indicate that the request includes Level III data.
   * @return purchaseLevel
  **/
  @ApiModelProperty(value = "Set this field to 3 to indicate that the request includes Level III data.")
  public String getPurchaseLevel() {
    return purchaseLevel;
  }

  public void setPurchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
  }

  public Ptsv2creditsProcessingInformation industryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
    return this;
  }

   /**
   * Indicates that the transaction includes industry-specific data.  Possible Values: - &#x60;airline&#x60; - &#x60;restaurant&#x60; - &#x60;lodging&#x60; - &#x60;auto_rental&#x60; - &#x60;transit&#x60; - &#x60;healthcare_medical&#x60; - &#x60;healthcare_transit&#x60; - &#x60;transit&#x60;  #### Card Present, Airlines and Auto Rental You must set this field to &#x60;airline&#x60; in order for airline data to be sent to the processor. For example, if this field is not set to &#x60;airline&#x60; or is not included in the request, no airline data is sent to the processor.  You must set this field to &#x60;restaurant&#x60; in order for restaurant data to be sent to the processor. When this field is not set to &#x60;restaurant&#x60; or is not included in the request, no restaurant data is sent to the processor.  You must set this field to &#x60;auto_rental&#x60; in order for auto rental data to be sent to the processor. For example, if this field is not set to &#x60;auto_rental&#x60; or is not included in the request, no auto rental data is sent to the processor.  Restaurant data is supported only on CyberSource through VisaNet. 
   * @return industryDataType
  **/
  @ApiModelProperty(value = "Indicates that the transaction includes industry-specific data.  Possible Values: - `airline` - `restaurant` - `lodging` - `auto_rental` - `transit` - `healthcare_medical` - `healthcare_transit` - `transit`  #### Card Present, Airlines and Auto Rental You must set this field to `airline` in order for airline data to be sent to the processor. For example, if this field is not set to `airline` or is not included in the request, no airline data is sent to the processor.  You must set this field to `restaurant` in order for restaurant data to be sent to the processor. When this field is not set to `restaurant` or is not included in the request, no restaurant data is sent to the processor.  You must set this field to `auto_rental` in order for auto rental data to be sent to the processor. For example, if this field is not set to `auto_rental` or is not included in the request, no auto rental data is sent to the processor.  Restaurant data is supported only on CyberSource through VisaNet. ")
  public String getIndustryDataType() {
    return industryDataType;
  }

  public void setIndustryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
  }

  public Ptsv2creditsProcessingInformation walletType(String walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * This field carries the wallet type in authorization requests and credit requests. Possible value are: - &#x60;101&#x60;: Masterpass remote payment. The customer created the wallet by manually interacting with a customer-controlled device such as a computer, tablet, or phone. This value is supported only for Masterpass transactions on Chase Paymentech Solutions and CyberSource through VisaNet. - &#x60;102&#x60;: Masterpass remote near field communication (NFC) payment. The customer created the wallet by tapping a PayPass card or customer-controlled device at a contactless card reader. This value is supported only for card-present Masterpass transactions on CyberSource through VisaNet. - &#x60;103&#x60;: Masterpass Apple Pay payment. The payment was made with a combination of Masterpass and Apple Pay. This value is supported only for Masterpass Apple Pay transactions on CyberSource through VisaNet. - &#x60;216&#x60;: Masterpass Google Pay payment. The payment was made with a combination of Masterpass and Google Pay. This value is supported only for Masterpass Google Pay transactions on CyberSource through VisaNet. - &#x60;217&#x60;: Masterpass Samsung Pay payment. The payment was made with a combination of Masterpass and Samsung Pay. This value is supported only for Masterpass Samsung Pay transactions on CyberSource through VisaNet. - &#x60;SDW&#x60;: Staged digital wallet. An issuer or operator created the wallet. This value is supported only for Masterpass transactions on Chase Paymentech Solutions. - &#x60;VCIND&#x60;: Visa Checkout payment. This value is supported only on CyberSource through VisaNet, FDC Compass, FDC Nashville Global, FDI Australia, and TSYS Acquiring Solutions. See Getting Started with Visa Checkout. For Visa Checkout transactions, the way CyberSource processes the value for this field depends on the processor. See the Visa Checkout section below. For all other values, this field is a passthrough; therefore, CyberSource does not verify the value or modify it in any way before sending it to the processor. Masterpass (101, 102, 103, 216, and 217): The Masterpass platform generates the wallet type value and passes it to you along with the customer’s checkout information.  Visa Checkout: This field is optional for Visa Checkout authorizations on FDI Australia. For all other processors, this field is required for Visa Checkout authorizations. For Visa Checkout transactions on the following processors, CyberSource sends the value that the processor expects for this field:FDC Compass,FDC Nashville Global,FDI Australia,TSYS Acquiring Solutions For all other processors, this field is a passthrough; therefore, CyberSource does not verify the value or modify it in any way before sending it to the processor. For incremental authorizations, this field is supported only for Mastercard and the supported values are 101 and 102. Payment card companies can introduce new values without notice. Your order management system should be able to process new values without problems.  CyberSource through VisaNet When the value for this field is 101, 102, 103, 216, or 217, it corresponds to the following data in the TC 33 capture file5: Record: CP01 TCR6, Position: 88-90,  Field: Mastercard Wallet Identifier. When the value for this field is VCIND, it corresponds to the following data in the TC 33 capture file5: Record: CP01 TCR8, Position: 72-76, Field: Agent Unique ID. 
   * @return walletType
  **/
  @ApiModelProperty(value = "This field carries the wallet type in authorization requests and credit requests. Possible value are: - `101`: Masterpass remote payment. The customer created the wallet by manually interacting with a customer-controlled device such as a computer, tablet, or phone. This value is supported only for Masterpass transactions on Chase Paymentech Solutions and CyberSource through VisaNet. - `102`: Masterpass remote near field communication (NFC) payment. The customer created the wallet by tapping a PayPass card or customer-controlled device at a contactless card reader. This value is supported only for card-present Masterpass transactions on CyberSource through VisaNet. - `103`: Masterpass Apple Pay payment. The payment was made with a combination of Masterpass and Apple Pay. This value is supported only for Masterpass Apple Pay transactions on CyberSource through VisaNet. - `216`: Masterpass Google Pay payment. The payment was made with a combination of Masterpass and Google Pay. This value is supported only for Masterpass Google Pay transactions on CyberSource through VisaNet. - `217`: Masterpass Samsung Pay payment. The payment was made with a combination of Masterpass and Samsung Pay. This value is supported only for Masterpass Samsung Pay transactions on CyberSource through VisaNet. - `SDW`: Staged digital wallet. An issuer or operator created the wallet. This value is supported only for Masterpass transactions on Chase Paymentech Solutions. - `VCIND`: Visa Checkout payment. This value is supported only on CyberSource through VisaNet, FDC Compass, FDC Nashville Global, FDI Australia, and TSYS Acquiring Solutions. See Getting Started with Visa Checkout. For Visa Checkout transactions, the way CyberSource processes the value for this field depends on the processor. See the Visa Checkout section below. For all other values, this field is a passthrough; therefore, CyberSource does not verify the value or modify it in any way before sending it to the processor. Masterpass (101, 102, 103, 216, and 217): The Masterpass platform generates the wallet type value and passes it to you along with the customer’s checkout information.  Visa Checkout: This field is optional for Visa Checkout authorizations on FDI Australia. For all other processors, this field is required for Visa Checkout authorizations. For Visa Checkout transactions on the following processors, CyberSource sends the value that the processor expects for this field:FDC Compass,FDC Nashville Global,FDI Australia,TSYS Acquiring Solutions For all other processors, this field is a passthrough; therefore, CyberSource does not verify the value or modify it in any way before sending it to the processor. For incremental authorizations, this field is supported only for Mastercard and the supported values are 101 and 102. Payment card companies can introduce new values without notice. Your order management system should be able to process new values without problems.  CyberSource through VisaNet When the value for this field is 101, 102, 103, 216, or 217, it corresponds to the following data in the TC 33 capture file5: Record: CP01 TCR6, Position: 88-90,  Field: Mastercard Wallet Identifier. When the value for this field is VCIND, it corresponds to the following data in the TC 33 capture file5: Record: CP01 TCR8, Position: 72-76, Field: Agent Unique ID. ")
  public String getWalletType() {
    return walletType;
  }

  public void setWalletType(String walletType) {
    this.walletType = walletType;
  }

  public Ptsv2creditsProcessingInformation nationalNetDomesticData(String nationalNetDomesticData) {
    this.nationalNetDomesticData = nationalNetDomesticData;
    return this;
  }

   /**
   * Supplementary domestic transaction information provided by the acquirer for National Net Settlement Service (NNSS) transactions. NNSS is a settlement service that Visa provides. For transactions on CyberSource through VisaNet in countries that subscribe to NNSS: VisaNet clears transactions; VisaNet transfers funds to the acquirer after deducting processing fees and interchange fees. VisaNet settles transactions in the local pricing currency through a local financial institution. This field is supported only on CyberSource through VisaNet for domestic data in Colombia 
   * @return nationalNetDomesticData
  **/
  @ApiModelProperty(value = "Supplementary domestic transaction information provided by the acquirer for National Net Settlement Service (NNSS) transactions. NNSS is a settlement service that Visa provides. For transactions on CyberSource through VisaNet in countries that subscribe to NNSS: VisaNet clears transactions; VisaNet transfers funds to the acquirer after deducting processing fees and interchange fees. VisaNet settles transactions in the local pricing currency through a local financial institution. This field is supported only on CyberSource through VisaNet for domestic data in Colombia ")
  public String getNationalNetDomesticData() {
    return nationalNetDomesticData;
  }

  public void setNationalNetDomesticData(String nationalNetDomesticData) {
    this.nationalNetDomesticData = nationalNetDomesticData;
  }

  public Ptsv2creditsProcessingInformation networkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
    return this;
  }

   /**
   * On PIN Debit Gateways: This U.S.-only field is optionally used by  participants (merchants and acquirers) to specify the network access priority. VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the sharing group code. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer’s preference. If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer’s routing priorities.  #### PIN debit Priority order of the networks through which he transaction will be routed. Set this value to a series of one-character network codes in your preferred order. This is a list of the network codes:  | Network | Code | | --- | --- | | Accel | E | | AFFN | U | | Alaska Option | 3 | | CU24 | C | | Interlink | G | | Maestro | 8 | | NETS | P | | NYCE | F | | Pulse | H | | Shazam | 7 | | Star | M | | Visa | V |  For example, if the Star network is your first preference and Pulse is your second preference, set this field to a value of &#x60;MH&#x60;.  When you do not include this value in your PIN debit request, the list of network codes from your account is used. **Note** This field is supported only for businesses located in the U.S.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return networkRoutingOrder
  **/
  @ApiModelProperty(value = "On PIN Debit Gateways: This U.S.-only field is optionally used by  participants (merchants and acquirers) to specify the network access priority. VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the sharing group code. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer’s preference. If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer’s routing priorities.  #### PIN debit Priority order of the networks through which he transaction will be routed. Set this value to a series of one-character network codes in your preferred order. This is a list of the network codes:  | Network | Code | | --- | --- | | Accel | E | | AFFN | U | | Alaska Option | 3 | | CU24 | C | | Interlink | G | | Maestro | 8 | | NETS | P | | NYCE | F | | Pulse | H | | Shazam | 7 | | Star | M | | Visa | V |  For example, if the Star network is your first preference and Pulse is your second preference, set this field to a value of `MH`.  When you do not include this value in your PIN debit request, the list of network codes from your account is used. **Note** This field is supported only for businesses located in the U.S.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getNetworkRoutingOrder() {
    return networkRoutingOrder;
  }

  public void setNetworkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
  }

  public Ptsv2creditsProcessingInformation recurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
    return this;
  }

   /**
   * Get recurringOptions
   * @return recurringOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsProcessingInformationRecurringOptions getRecurringOptions() {
    return recurringOptions;
  }

  public void setRecurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
  }

  public Ptsv2creditsProcessingInformation bankTransferOptions(Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }

  public Ptsv2creditsProcessingInformation purchaseOptions(Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions) {
    this.purchaseOptions = purchaseOptions;
    return this;
  }

   /**
   * Get purchaseOptions
   * @return purchaseOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationPurchaseOptions getPurchaseOptions() {
    return purchaseOptions;
  }

  public void setPurchaseOptions(Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions) {
    this.purchaseOptions = purchaseOptions;
  }

  public Ptsv2creditsProcessingInformation electronicBenefitsTransfer(Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer) {
    this.electronicBenefitsTransfer = electronicBenefitsTransfer;
    return this;
  }

   /**
   * Get electronicBenefitsTransfer
   * @return electronicBenefitsTransfer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationElectronicBenefitsTransfer getElectronicBenefitsTransfer() {
    return electronicBenefitsTransfer;
  }

  public void setElectronicBenefitsTransfer(Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer) {
    this.electronicBenefitsTransfer = electronicBenefitsTransfer;
  }

  public Ptsv2creditsProcessingInformation loanOptions(Ptsv2paymentsProcessingInformationLoanOptions loanOptions) {
    this.loanOptions = loanOptions;
    return this;
  }

   /**
   * Get loanOptions
   * @return loanOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessingInformationLoanOptions getLoanOptions() {
    return loanOptions;
  }

  public void setLoanOptions(Ptsv2paymentsProcessingInformationLoanOptions loanOptions) {
    this.loanOptions = loanOptions;
  }

  public Ptsv2creditsProcessingInformation japanPaymentOptions(Ptsv2creditsProcessingInformationJapanPaymentOptions japanPaymentOptions) {
    this.japanPaymentOptions = japanPaymentOptions;
    return this;
  }

   /**
   * Get japanPaymentOptions
   * @return japanPaymentOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationJapanPaymentOptions getJapanPaymentOptions() {
    return japanPaymentOptions;
  }

  public void setJapanPaymentOptions(Ptsv2creditsProcessingInformationJapanPaymentOptions japanPaymentOptions) {
    this.japanPaymentOptions = japanPaymentOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsProcessingInformation ptsv2creditsProcessingInformation = (Ptsv2creditsProcessingInformation) o;
    return Objects.equals(this.commerceIndicator, ptsv2creditsProcessingInformation.commerceIndicator) &&
        Objects.equals(this.processorId, ptsv2creditsProcessingInformation.processorId) &&
        Objects.equals(this.paymentSolution, ptsv2creditsProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, ptsv2creditsProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, ptsv2creditsProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, ptsv2creditsProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, ptsv2creditsProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.purchaseLevel, ptsv2creditsProcessingInformation.purchaseLevel) &&
        Objects.equals(this.industryDataType, ptsv2creditsProcessingInformation.industryDataType) &&
        Objects.equals(this.walletType, ptsv2creditsProcessingInformation.walletType) &&
        Objects.equals(this.nationalNetDomesticData, ptsv2creditsProcessingInformation.nationalNetDomesticData) &&
        Objects.equals(this.networkRoutingOrder, ptsv2creditsProcessingInformation.networkRoutingOrder) &&
        Objects.equals(this.recurringOptions, ptsv2creditsProcessingInformation.recurringOptions) &&
        Objects.equals(this.bankTransferOptions, ptsv2creditsProcessingInformation.bankTransferOptions) &&
        Objects.equals(this.purchaseOptions, ptsv2creditsProcessingInformation.purchaseOptions) &&
        Objects.equals(this.electronicBenefitsTransfer, ptsv2creditsProcessingInformation.electronicBenefitsTransfer) &&
        Objects.equals(this.loanOptions, ptsv2creditsProcessingInformation.loanOptions) &&
        Objects.equals(this.japanPaymentOptions, ptsv2creditsProcessingInformation.japanPaymentOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceIndicator, processorId, paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, purchaseLevel, industryDataType, walletType, nationalNetDomesticData, networkRoutingOrder, recurringOptions, bankTransferOptions, purchaseOptions, electronicBenefitsTransfer, loanOptions, japanPaymentOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsProcessingInformation {\n");
    
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    purchaseLevel: ").append(toIndentedString(purchaseLevel)).append("\n");
    sb.append("    industryDataType: ").append(toIndentedString(industryDataType)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    nationalNetDomesticData: ").append(toIndentedString(nationalNetDomesticData)).append("\n");
    sb.append("    networkRoutingOrder: ").append(toIndentedString(networkRoutingOrder)).append("\n");
    sb.append("    recurringOptions: ").append(toIndentedString(recurringOptions)).append("\n");
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
    sb.append("    purchaseOptions: ").append(toIndentedString(purchaseOptions)).append("\n");
    sb.append("    electronicBenefitsTransfer: ").append(toIndentedString(electronicBenefitsTransfer)).append("\n");
    sb.append("    loanOptions: ").append(toIndentedString(loanOptions)).append("\n");
    sb.append("    japanPaymentOptions: ").append(toIndentedString(japanPaymentOptions)).append("\n");
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

