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
 * Ptsv2paymentsPaymentInformationTokenizedCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class Ptsv2paymentsPaymentInformationTokenizedCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("cryptogram")
  private String cryptogram = null;

  @SerializedName("requestorId")
  private String requestorId = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("assuranceLevel")
  private String assuranceLevel = null;

  @SerializedName("storageMethod")
  private String storageMethod = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  public Ptsv2paymentsPaymentInformationTokenizedCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Customer’s payment network token value. 
   * @return number
  **/
  @ApiModelProperty(value = "Customer’s payment network token value. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * One of two possible meanings: - The two-digit month in which a token expires. - The two-digit month in which a card expires. Format: &#x60;MM&#x60; Possible values: &#x60;01&#x60; through &#x60;12&#x60;  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (&#x60;card_type&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;12&#x60;.\\ **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Samsung Pay and Apple Pay Month in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  For processor-specific information, see the &#x60;customer_cc_expmo&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "One of two possible meanings: - The two-digit month in which a token expires. - The two-digit month in which a card expires. Format: `MM` Possible values: `01` through `12`  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (`card_type=039`), if there is no expiration date on the card, use `12`.\\ **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Samsung Pay and Apple Pay Month in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  For processor-specific information, see the `customer_cc_expmo` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * One of two possible meanings: - The four-digit year in which a token expires. - The four-digit year in which a card expires. Format: &#x60;YYYY&#x60; Possible values: &#x60;1900&#x60; through &#x60;3000&#x60; Data type: Non-negative integer  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (&#x60;card_ type&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  #### Samsung Pay and Apple Pay Year in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_cc_expyr&#x60; or &#x60;token_expiration_year&#x60; field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "One of two possible meanings: - The four-digit year in which a token expires. - The four-digit year in which a card expires. Format: `YYYY` Possible values: `1900` through `3000` Data type: Non-negative integer  **NOTE** The meaning of this field is dependent on the payment processor that is returning the value in an authorization reply. Please see the processor-specific details below.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (1900 through 3000) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (`card_ type=039`), if there is no expiration date on the card, use `2021`.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  #### Samsung Pay and Apple Pay Year in which the token expires. CyberSource includes this field in the reply message when it decrypts the payment blob for the tokenized transaction.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_cc_expyr` or `token_expiration_year` field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value &#x60;001&#x60; for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche[^1] - &#x60;007&#x60;: JCB[^1] - &#x60;014&#x60;: Enroute[^1] - &#x60;021&#x60;: JAL[^1] - &#x60;024&#x60;: Maestro (UK Domestic)[^1] - &#x60;031&#x60;: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;033&#x60;: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;034&#x60;: Dankort[^1] - &#x60;036&#x60;: Cartes Bancaires[^1,4] - &#x60;037&#x60;: Carta Si[^1] - &#x60;039&#x60;: Encoded account number[^1] - &#x60;040&#x60;: UATP[^1] - &#x60;042&#x60;: Maestro (International)[^1] - &#x60;050&#x60;: Hipercard[^2,3] - &#x60;051&#x60;: Aura - &#x60;054&#x60;: Elo[^3] - &#x60;062&#x60;: China UnionPay  [^1]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value `001` for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche[^1] - `007`: JCB[^1] - `014`: Enroute[^1] - `021`: JAL[^1] - `024`: Maestro (UK Domestic)[^1] - `031`: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use `001` for all Visa card types. - `033`: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use `001` for all Visa card types. - `034`: Dankort[^1] - `036`: Cartes Bancaires[^1,4] - `037`: Carta Si[^1] - `039`: Encoded account number[^1] - `040`: UATP[^1] - `042`: Maestro (International)[^1] - `050`: Hipercard[^2,3] - `051`: Aura - `054`: Elo[^3] - `062`: China UnionPay  [^1]: For this card type, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the `paymentInformation.card.type` in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard cryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * This field is used internally.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "This field is used internally.")
  public String getCryptogram() {
    return cryptogram;
  }

  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

   /**
   * Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**.  #### PIN debit Optional field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used. 
   * @return requestorId
  **/
  @ApiModelProperty(value = "Value that identifies your business and indicates that the cardholder’s account number is tokenized. This value is assigned by the token service provider and is unique within the token service provider’s database.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**.  #### PIN debit Optional field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used. ")
  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Possible value: - &#x60;2&#x60;: Near-field communication (NFC) transaction. The customer’s mobile device provided the token data for a contactless EMV transaction. For recurring transactions, use this value if the original transaction was a contactless EMV transaction.  **NOTE** No CyberSource through VisaNet acquirers support EMV at this time.  Required field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used. 
   * @return transactionType
  **/
  @ApiModelProperty(value = "Type of transaction that provided the token data. This value does not specify the token service provider; it specifies the entity that provided you with information about the token.  Possible value: - `2`: Near-field communication (NFC) transaction. The customer’s mobile device provided the token data for a contactless EMV transaction. For recurring transactions, use this value if the original transaction was a contactless EMV transaction.  **NOTE** No CyberSource through VisaNet acquirers support EMV at this time.  Required field for PIN debit credit or PIN debit purchase transactions that use payment network tokens; otherwise, not used. ")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard assuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
    return this;
  }

   /**
   * Confidence level of the tokenization. This value is assigned by the token service provider.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**.  Returned by PIN debit credit or PIN debit purchase. 
   * @return assuranceLevel
  **/
  @ApiModelProperty(value = "Confidence level of the tokenization. This value is assigned by the token service provider.  **Note** This field is supported only for **CyberSource through VisaNet** and **FDC Nashville Global**.  Returned by PIN debit credit or PIN debit purchase. ")
  public String getAssuranceLevel() {
    return assuranceLevel;
  }

  public void setAssuranceLevel(String assuranceLevel) {
    this.assuranceLevel = assuranceLevel;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard storageMethod(String storageMethod) {
    this.storageMethod = storageMethod;
    return this;
  }

   /**
   * Type of technology used in the device to store token data. Possible values:  - &#x60;001&#x60;: Secure Element (SE). Smart card or memory with restricted access and encryption to prevent data tampering. For storing payment    credentials, a SE is tested against a set of requirements defined by the payment networks.     **Note** This field is supported only for _FDC Compass_.  - 002: Host Card Emulation (HCE). Emulation of a smart card by using software to create a virtual and exact representation of the card. Sensitive data is stored in a database that is hosted in the cloud. For storing payment credentials, a database must meet very stringent security requirements that exceed PCI DSS.  **Note** This field is supported only for _FDC Compass_. 
   * @return storageMethod
  **/
  @ApiModelProperty(value = "Type of technology used in the device to store token data. Possible values:  - `001`: Secure Element (SE). Smart card or memory with restricted access and encryption to prevent data tampering. For storing payment    credentials, a SE is tested against a set of requirements defined by the payment networks.     **Note** This field is supported only for _FDC Compass_.  - 002: Host Card Emulation (HCE). Emulation of a smart card by using software to create a virtual and exact representation of the card. Sensitive data is stored in a database that is hosted in the cloud. For storing payment credentials, a database must meet very stringent security requirements that exceed PCI DSS.  **Note** This field is supported only for _FDC Compass_. ")
  public String getStorageMethod() {
    return storageMethod;
  }

  public void setStorageMethod(String storageMethod) {
    this.storageMethod = storageMethod;
  }

  public Ptsv2paymentsPaymentInformationTokenizedCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card Verification Number (CVN).  #### Ingenico ePayments Do not include this field when **commerceIndicator&#x3D;recurring**. **Note** Ingenico ePayments was previously called _Global Collect_.  For details, see &#x60;customer_cc_cv_number&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return securityCode
  **/
  @ApiModelProperty(value = "Card Verification Number (CVN).  #### Ingenico ePayments Do not include this field when **commerceIndicator=recurring**. **Note** Ingenico ePayments was previously called _Global Collect_.  For details, see `customer_cc_cv_number` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationTokenizedCard ptsv2paymentsPaymentInformationTokenizedCard = (Ptsv2paymentsPaymentInformationTokenizedCard) o;
    return Objects.equals(this.number, ptsv2paymentsPaymentInformationTokenizedCard.number) &&
        Objects.equals(this.expirationMonth, ptsv2paymentsPaymentInformationTokenizedCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv2paymentsPaymentInformationTokenizedCard.expirationYear) &&
        Objects.equals(this.type, ptsv2paymentsPaymentInformationTokenizedCard.type) &&
        Objects.equals(this.cryptogram, ptsv2paymentsPaymentInformationTokenizedCard.cryptogram) &&
        Objects.equals(this.requestorId, ptsv2paymentsPaymentInformationTokenizedCard.requestorId) &&
        Objects.equals(this.transactionType, ptsv2paymentsPaymentInformationTokenizedCard.transactionType) &&
        Objects.equals(this.assuranceLevel, ptsv2paymentsPaymentInformationTokenizedCard.assuranceLevel) &&
        Objects.equals(this.storageMethod, ptsv2paymentsPaymentInformationTokenizedCard.storageMethod) &&
        Objects.equals(this.securityCode, ptsv2paymentsPaymentInformationTokenizedCard.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, type, cryptogram, requestorId, transactionType, assuranceLevel, storageMethod, securityCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationTokenizedCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    assuranceLevel: ").append(toIndentedString(assuranceLevel)).append("\n");
    sb.append("    storageMethod: ").append(toIndentedString(storageMethod)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

