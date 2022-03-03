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
 * Ptsv2paymentsProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Ptsv2paymentsProcessingInformationBankTransferOptions {
  @SerializedName("declineAvsFlags")
  private String declineAvsFlags = null;

  @SerializedName("secCode")
  private String secCode = null;

  @SerializedName("terminalCity")
  private String terminalCity = null;

  @SerializedName("terminalState")
  private String terminalState = null;

  @SerializedName("effectiveDate")
  private String effectiveDate = null;

  @SerializedName("partialPaymentId")
  private String partialPaymentId = null;

  @SerializedName("customerMemo")
  private String customerMemo = null;

  @SerializedName("paymentCategoryCode")
  private String paymentCategoryCode = null;

  @SerializedName("settlementMethod")
  private String settlementMethod = null;

  @SerializedName("fraudScreeningLevel")
  private String fraudScreeningLevel = null;

  @SerializedName("customerPresent")
  private String customerPresent = null;

  public Ptsv2paymentsProcessingInformationBankTransferOptions declineAvsFlags(String declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
    return this;
  }

   /**
   * Space-separated list of AVS flags that cause the request to be declined for AVS reasons.  **Important** To receive declines for the AVS code &#x60;N&#x60;, you must include the value &#x60;N&#x60; in the space-separated list.  ### AVS Codes for Cielo 3.0 and CyberSource Latin American Processing  **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this section is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  |AVS Code|Description| |--- |--- | |D|Partial match: postal code and address match.| |E|Not supported: AVS is not supported for this card type. _or_ Invalid: the acquirer returned an unrecognized value for the AVS response.| |F|Partial match: postal code matches, but CPF and address do not match.*| |G|Not supported: AVS not supported or not verified.| |I|No match: AVS information is not available.| |K|Partial match: CPF matches, but postal code and address do not match.*| |L|Partial match: postal code and CPF match, but address does not match.*| |N|No match: postal code, CPF, and address do not match.*| |O|Partial match: CPF and address match, but postal code does not match.*| |R|Not supported: your implementation does not support AVS _or_ System unavailable.| |T|Partial match: address matches, but postal code and CPF do not match.*| |V|Match: postal code, CPF, and address match.*| |* CPF (Cadastro de Pessoas Fisicas) is required only for Redecard in Brazil.||  ### AVS Codes for All Other Processors  **Note** The list of AVS codes for all other processors follows these descriptions of the processor-specific information for these codes.  #### American Express Cards For American Express cards only, you can receive Visa and CyberSource AVS codes in addition to the American Express AVS codes.  **Note** For CyberSource through VisaNet, the American Express AVS codes are converted to Visa AVS codes before they are returned to you. As a result, you will not receive American Express AVS codes for the American Express card type.  _American Express Card codes_: &#x60;F&#x60;, &#x60;H&#x60;, &#x60;K&#x60;, &#x60;L&#x60;, &#x60;O&#x60;, &#x60;T&#x60;, &#x60;V&#x60;  #### Domestic and International Visa Cards The international and domestic alphabetic AVS codes are the Visa standard AVS codes. CyberSource maps the standard AVS return codes for other types of payment cards, including American Express cards, to the Visa standard AVS codes.  AVS is considered either domestic or international, depending on the location of the bank that issued the customer’s payment card: - When the bank is in the U.S., the AVS is domestic. - When the bank is outside the U.S., the AVS is international.  You should be prepared to handle both domestic and international AVS result codes: - For international cards, you can receive domestic AVS codes in addition to the international AVS codes. - For domestic cards, you can receive international AVS codes in addition to the domestic AVS codes.  _International Visa Codes_: &#x60;B&#x60;, &#x60;C&#x60;, &#x60;D&#x60;, &#x60;G&#x60;, &#x60;I&#x60;, &#x60;M&#x60;, &#x60;P&#x60;  _Domestic Visa Codes_: &#x60;A&#x60;, &#x60;E&#x60;,&#x60;N&#x60;, &#x60;R&#x60;, &#x60;S&#x60;, &#x60;U&#x60;, &#x60;W&#x60;, &#x60;X&#x60;, &#x60;Y&#x60;, &#x60;Z&#x60;  #### CyberSource Codes The numeric AVS codes are created by CyberSource and are not standard Visa codes. These AVS codes can be returned for any card type.  _CyberSource Codes_: &#x60;1&#x60;, &#x60;2&#x60;, &#x60;3&#x60;, &#x60;4&#x60;  ### Table of AVS Codes for All Other Processors  |AVS Code|Description| |--- |--- | |A|Partial match: street address matches, but 5-digit and 9-digit postal codes do not match.| |B|Partial match: street address matches, but postal code is not verified. Returned only for Visa cards not issued in the U.S.| |C|No match: street address and postal code do not match. Returned only for Visa cards not issued in the U.S.| |D &amp; M|Match: street address and postal code match. Returned only for Visa cards not issued in the U.S.| |E|Invalid: AVS data is invalid or AVS is not allowed for this card type.| |F|Partial match: card member’s name does not match, but billing postal code matches.| |G|Not supported: issuing bank outside the U.S. does not support AVS.| |H|Partial match: card member’s name does not match, but street address and postal code match. Returned only for the American Express card type.| |I|No match: address not verified. Returned only for Visa cards not issued in the U.S.| |K|Partial match: card member’s name matches, but billing address and billing postal code do not match. Returned only for the American Express card type.| |L|Partial match: card member’s name and billing postal code match, but billing address does not match. Returned only for the American Express card type.| |M|See the entry for D &amp; M.| |N|No match: one of the following: street address and postal code do not match _or_ (American Express card type only) card member’s name, street address, and postal code do not match.| |O|Partial match: card member’s name and billing address match, but billing postal code does not match. Returned only for the American Express card type.| |P|Partial match: postal code matches, but street address not verified. Returned only for Visa cards not issued in the U.S.| |R|System unavailable.| |S|Not supported: issuing bank in the U.S. does not support AVS.| |T|Partial match: card member’s name does not match, but street address matches. Returned only for the American Express card type.| |U|System unavailable: address information unavailable for one of these reasons: The U.S. bank does not support AVS outside the U.S. _or_ The AVS in a U.S. bank is not functioning properly.| |V|Match: card member’s name, billing address, and billing postal code match. Returned only for the American Express card type.| |W|Partial match: street address does not match, but 9-digit postal code matches.| |X|Match: street address and 9-digit postal code match.| |Y|Match: street address and 5-digit postal code match.| |Z|Partial match: street address does not match, but 5-digit postal code matches.| |1|Not supported: one of the following: AVS is not supported for this processor or card type _or_ AVS is disabled for your CyberSource account. To enable AVS, contact CyberSource Customer Support.| |2|Unrecognized: the processor returned an unrecognized value for the AVS response.| |3|Match: address is confirmed. Returned only for PayPal Express Checkout.| |4|No match: address is not confirmed. Returned only for PayPal Express Checkout.| |5|No match: no AVS code was returned by the processor.| 
   * @return declineAvsFlags
  **/
  @ApiModelProperty(value = "Space-separated list of AVS flags that cause the request to be declined for AVS reasons.  **Important** To receive declines for the AVS code `N`, you must include the value `N` in the space-separated list.  ### AVS Codes for Cielo 3.0 and CyberSource Latin American Processing  **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America. The information in this section is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports.  |AVS Code|Description| |--- |--- | |D|Partial match: postal code and address match.| |E|Not supported: AVS is not supported for this card type. _or_ Invalid: the acquirer returned an unrecognized value for the AVS response.| |F|Partial match: postal code matches, but CPF and address do not match.*| |G|Not supported: AVS not supported or not verified.| |I|No match: AVS information is not available.| |K|Partial match: CPF matches, but postal code and address do not match.*| |L|Partial match: postal code and CPF match, but address does not match.*| |N|No match: postal code, CPF, and address do not match.*| |O|Partial match: CPF and address match, but postal code does not match.*| |R|Not supported: your implementation does not support AVS _or_ System unavailable.| |T|Partial match: address matches, but postal code and CPF do not match.*| |V|Match: postal code, CPF, and address match.*| |* CPF (Cadastro de Pessoas Fisicas) is required only for Redecard in Brazil.||  ### AVS Codes for All Other Processors  **Note** The list of AVS codes for all other processors follows these descriptions of the processor-specific information for these codes.  #### American Express Cards For American Express cards only, you can receive Visa and CyberSource AVS codes in addition to the American Express AVS codes.  **Note** For CyberSource through VisaNet, the American Express AVS codes are converted to Visa AVS codes before they are returned to you. As a result, you will not receive American Express AVS codes for the American Express card type.  _American Express Card codes_: `F`, `H`, `K`, `L`, `O`, `T`, `V`  #### Domestic and International Visa Cards The international and domestic alphabetic AVS codes are the Visa standard AVS codes. CyberSource maps the standard AVS return codes for other types of payment cards, including American Express cards, to the Visa standard AVS codes.  AVS is considered either domestic or international, depending on the location of the bank that issued the customer’s payment card: - When the bank is in the U.S., the AVS is domestic. - When the bank is outside the U.S., the AVS is international.  You should be prepared to handle both domestic and international AVS result codes: - For international cards, you can receive domestic AVS codes in addition to the international AVS codes. - For domestic cards, you can receive international AVS codes in addition to the domestic AVS codes.  _International Visa Codes_: `B`, `C`, `D`, `G`, `I`, `M`, `P`  _Domestic Visa Codes_: `A`, `E`,`N`, `R`, `S`, `U`, `W`, `X`, `Y`, `Z`  #### CyberSource Codes The numeric AVS codes are created by CyberSource and are not standard Visa codes. These AVS codes can be returned for any card type.  _CyberSource Codes_: `1`, `2`, `3`, `4`  ### Table of AVS Codes for All Other Processors  |AVS Code|Description| |--- |--- | |A|Partial match: street address matches, but 5-digit and 9-digit postal codes do not match.| |B|Partial match: street address matches, but postal code is not verified. Returned only for Visa cards not issued in the U.S.| |C|No match: street address and postal code do not match. Returned only for Visa cards not issued in the U.S.| |D & M|Match: street address and postal code match. Returned only for Visa cards not issued in the U.S.| |E|Invalid: AVS data is invalid or AVS is not allowed for this card type.| |F|Partial match: card member’s name does not match, but billing postal code matches.| |G|Not supported: issuing bank outside the U.S. does not support AVS.| |H|Partial match: card member’s name does not match, but street address and postal code match. Returned only for the American Express card type.| |I|No match: address not verified. Returned only for Visa cards not issued in the U.S.| |K|Partial match: card member’s name matches, but billing address and billing postal code do not match. Returned only for the American Express card type.| |L|Partial match: card member’s name and billing postal code match, but billing address does not match. Returned only for the American Express card type.| |M|See the entry for D & M.| |N|No match: one of the following: street address and postal code do not match _or_ (American Express card type only) card member’s name, street address, and postal code do not match.| |O|Partial match: card member’s name and billing address match, but billing postal code does not match. Returned only for the American Express card type.| |P|Partial match: postal code matches, but street address not verified. Returned only for Visa cards not issued in the U.S.| |R|System unavailable.| |S|Not supported: issuing bank in the U.S. does not support AVS.| |T|Partial match: card member’s name does not match, but street address matches. Returned only for the American Express card type.| |U|System unavailable: address information unavailable for one of these reasons: The U.S. bank does not support AVS outside the U.S. _or_ The AVS in a U.S. bank is not functioning properly.| |V|Match: card member’s name, billing address, and billing postal code match. Returned only for the American Express card type.| |W|Partial match: street address does not match, but 9-digit postal code matches.| |X|Match: street address and 9-digit postal code match.| |Y|Match: street address and 5-digit postal code match.| |Z|Partial match: street address does not match, but 5-digit postal code matches.| |1|Not supported: one of the following: AVS is not supported for this processor or card type _or_ AVS is disabled for your CyberSource account. To enable AVS, contact CyberSource Customer Support.| |2|Unrecognized: the processor returned an unrecognized value for the AVS response.| |3|Match: address is confirmed. Returned only for PayPal Express Checkout.| |4|No match: address is not confirmed. Returned only for PayPal Express Checkout.| |5|No match: no AVS code was returned by the processor.| ")
  public String getDeclineAvsFlags() {
    return declineAvsFlags;
  }

  public void setDeclineAvsFlags(String declineAvsFlags) {
    this.declineAvsFlags = declineAvsFlags;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Specifies the authorization method for the transaction.  #### TeleCheck Accepts only the following values: - &#x60;ARC&#x60;: account receivable conversion - &#x60;CCD&#x60;: corporate cash disbursement - &#x60;POP&#x60;: point of purchase conversion - &#x60;PPD&#x60;: prearranged payment and deposit entry - &#x60;TEL&#x60;: telephone-initiated entry - &#x60;WEB&#x60;: internet-initiated entry  For details, see &#x60;ecp_sec_code&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return secCode
  **/
  @ApiModelProperty(value = "Specifies the authorization method for the transaction.  #### TeleCheck Accepts only the following values: - `ARC`: account receivable conversion - `CCD`: corporate cash disbursement - `POP`: point of purchase conversion - `PPD`: prearranged payment and deposit entry - `TEL`: telephone-initiated entry - `WEB`: internet-initiated entry  For details, see `ecp_sec_code` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions terminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
    return this;
  }

   /**
   * City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalCity
  **/
  @ApiModelProperty(value = "City in which the terminal is located. If more than four alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalCity() {
    return terminalCity;
  }

  public void setTerminalCity(String terminalCity) {
    this.terminalCity = terminalCity;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions terminalState(String terminalState) {
    this.terminalState = terminalState;
    return this;
  }

   /**
   * State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. 
   * @return terminalState
  **/
  @ApiModelProperty(value = "State in which the terminal is located. If more than two alphanumeric characters are submitted, the transaction will be declined.  You cannot include any special characters. ")
  public String getTerminalState() {
    return terminalState;
  }

  public void setTerminalState(String terminalState) {
    this.terminalState = terminalState;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: &#x60;MMDDYYYY&#x60;  Supported only for the CyberSource ACH Service. 
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "Effective date for the transaction. The effective date must be within 45 days of the current day. If you do not include this value, CyberSource sets the effective date to the next business day.  Format: `MMDDYYYY`  Supported only for the CyberSource ACH Service. ")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions partialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
    return this;
  }

   /**
   * Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. For details, see &#x60;partial_payment_id&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return partialPaymentId
  **/
  @ApiModelProperty(value = "Identifier for a partial payment or partial credit.  The value for each debit request or credit request must be unique within the scope of the order. For details, see `partial_payment_id` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getPartialPaymentId() {
    return partialPaymentId;
  }

  public void setPartialPaymentId(String partialPaymentId) {
    this.partialPaymentId = partialPaymentId;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions customerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
    return this;
  }

   /**
   * Payment related information.  This information is included on the customer’s statement. 
   * @return customerMemo
  **/
  @ApiModelProperty(value = "Payment related information.  This information is included on the customer’s statement. ")
  public String getCustomerMemo() {
    return customerMemo;
  }

  public void setCustomerMemo(String customerMemo) {
    this.customerMemo = customerMemo;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions paymentCategoryCode(String paymentCategoryCode) {
    this.paymentCategoryCode = paymentCategoryCode;
    return this;
  }

   /**
   * Flag that indicates whether to process the payment.  Use with deferred payments. For details, see &#x60;ecp_payment_mode&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/)  Possible values: - &#x60;0&#x60;: Standard debit with immediate payment (default). - &#x60;1&#x60;: For deferred payments, indicates that this is a deferred payment and that you will send a debit request with &#x60;paymentCategoryCode &#x3D; 2&#x60; in the future. - &#x60;2&#x60;: For deferred payments, indicates notification to initiate payment.  #### Chase Paymentech Solutions and TeleCheck Use for deferred and partial payments.  #### CyberSource ACH Service Not used.  #### RBS WorldPay Atlanta Not used. 
   * @return paymentCategoryCode
  **/
  @ApiModelProperty(value = "Flag that indicates whether to process the payment.  Use with deferred payments. For details, see `ecp_payment_mode` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/)  Possible values: - `0`: Standard debit with immediate payment (default). - `1`: For deferred payments, indicates that this is a deferred payment and that you will send a debit request with `paymentCategoryCode = 2` in the future. - `2`: For deferred payments, indicates notification to initiate payment.  #### Chase Paymentech Solutions and TeleCheck Use for deferred and partial payments.  #### CyberSource ACH Service Not used.  #### RBS WorldPay Atlanta Not used. ")
  public String getPaymentCategoryCode() {
    return paymentCategoryCode;
  }

  public void setPaymentCategoryCode(String paymentCategoryCode) {
    this.paymentCategoryCode = paymentCategoryCode;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions settlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
    return this;
  }

   /**
   * Method used for settlement.  Possible values: - &#x60;A&#x60;: Automated Clearing House (default for credits and for transactions using Canadian dollars) - &#x60;F&#x60;: Facsimile draft (U.S. dollars only) - &#x60;B&#x60;: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see &#x60;ecp_settlement_method&#x60; field description for credit cars and &#x60;ecp_debit_settlement_method&#x60; for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return settlementMethod
  **/
  @ApiModelProperty(value = "Method used for settlement.  Possible values: - `A`: Automated Clearing House (default for credits and for transactions using Canadian dollars) - `F`: Facsimile draft (U.S. dollars only) - `B`: Best possible (U.S. dollars only) (default if the field has not already been configured for your merchant ID)  For details, see `ecp_settlement_method` field description for credit cars and `ecp_debit_settlement_method` for debit cards in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getSettlementMethod() {
    return settlementMethod;
  }

  public void setSettlementMethod(String settlementMethod) {
    this.settlementMethod = settlementMethod;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions fraudScreeningLevel(String fraudScreeningLevel) {
    this.fraudScreeningLevel = fraudScreeningLevel;
    return this;
  }

   /**
   * Level of fraud screening.  Possible values: - &#x60;1&#x60;: Validation — default if the field has not already been configured for your merchant ID - &#x60;2&#x60;: Verification  For a description of this feature and a list of supported processors, see \&quot;Verification and Validation\&quot; in the [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/). 
   * @return fraudScreeningLevel
  **/
  @ApiModelProperty(value = "Level of fraud screening.  Possible values: - `1`: Validation — default if the field has not already been configured for your merchant ID - `2`: Verification  For a description of this feature and a list of supported processors, see \"Verification and Validation\" in the [Electronic Check Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/). ")
  public String getFraudScreeningLevel() {
    return fraudScreeningLevel;
  }

  public void setFraudScreeningLevel(String fraudScreeningLevel) {
    this.fraudScreeningLevel = fraudScreeningLevel;
  }

  public Ptsv2paymentsProcessingInformationBankTransferOptions customerPresent(String customerPresent) {
    this.customerPresent = customerPresent;
    return this;
  }

   /**
   * Indicates whether a customer is physically present and whether the customer is enrolling in CyberSource Recurring Billing.  Possible values: - &#x60;1&#x60;: Customer is present and not enrolling. - &#x60;2&#x60;: Customer is not present and not enrolling. - &#x60;3&#x60;: Customer is present and enrolling. - &#x60;4&#x60;: Customer is not present and enrolling. 
   * @return customerPresent
  **/
  @ApiModelProperty(value = "Indicates whether a customer is physically present and whether the customer is enrolling in CyberSource Recurring Billing.  Possible values: - `1`: Customer is present and not enrolling. - `2`: Customer is not present and not enrolling. - `3`: Customer is present and enrolling. - `4`: Customer is not present and enrolling. ")
  public String getCustomerPresent() {
    return customerPresent;
  }

  public void setCustomerPresent(String customerPresent) {
    this.customerPresent = customerPresent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationBankTransferOptions ptsv2paymentsProcessingInformationBankTransferOptions = (Ptsv2paymentsProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.declineAvsFlags, ptsv2paymentsProcessingInformationBankTransferOptions.declineAvsFlags) &&
        Objects.equals(this.secCode, ptsv2paymentsProcessingInformationBankTransferOptions.secCode) &&
        Objects.equals(this.terminalCity, ptsv2paymentsProcessingInformationBankTransferOptions.terminalCity) &&
        Objects.equals(this.terminalState, ptsv2paymentsProcessingInformationBankTransferOptions.terminalState) &&
        Objects.equals(this.effectiveDate, ptsv2paymentsProcessingInformationBankTransferOptions.effectiveDate) &&
        Objects.equals(this.partialPaymentId, ptsv2paymentsProcessingInformationBankTransferOptions.partialPaymentId) &&
        Objects.equals(this.customerMemo, ptsv2paymentsProcessingInformationBankTransferOptions.customerMemo) &&
        Objects.equals(this.paymentCategoryCode, ptsv2paymentsProcessingInformationBankTransferOptions.paymentCategoryCode) &&
        Objects.equals(this.settlementMethod, ptsv2paymentsProcessingInformationBankTransferOptions.settlementMethod) &&
        Objects.equals(this.fraudScreeningLevel, ptsv2paymentsProcessingInformationBankTransferOptions.fraudScreeningLevel) &&
        Objects.equals(this.customerPresent, ptsv2paymentsProcessingInformationBankTransferOptions.customerPresent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declineAvsFlags, secCode, terminalCity, terminalState, effectiveDate, partialPaymentId, customerMemo, paymentCategoryCode, settlementMethod, fraudScreeningLevel, customerPresent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationBankTransferOptions {\n");
    
    sb.append("    declineAvsFlags: ").append(toIndentedString(declineAvsFlags)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    terminalCity: ").append(toIndentedString(terminalCity)).append("\n");
    sb.append("    terminalState: ").append(toIndentedString(terminalState)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    partialPaymentId: ").append(toIndentedString(partialPaymentId)).append("\n");
    sb.append("    customerMemo: ").append(toIndentedString(customerMemo)).append("\n");
    sb.append("    paymentCategoryCode: ").append(toIndentedString(paymentCategoryCode)).append("\n");
    sb.append("    settlementMethod: ").append(toIndentedString(settlementMethod)).append("\n");
    sb.append("    fraudScreeningLevel: ").append(toIndentedString(fraudScreeningLevel)).append("\n");
    sb.append("    customerPresent: ").append(toIndentedString(customerPresent)).append("\n");
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

