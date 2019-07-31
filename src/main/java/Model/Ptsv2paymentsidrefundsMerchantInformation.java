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
import Model.Ptsv2paymentsMerchantInformationMerchantDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidrefundsMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class Ptsv2paymentsidrefundsMerchantInformation {
  @SerializedName("merchantDescriptor")
  private Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor = null;

  @SerializedName("categoryCode")
  private Integer categoryCode = null;

  @SerializedName("vatRegistrationNumber")
  private String vatRegistrationNumber = null;

  @SerializedName("cardAcceptorReferenceNumber")
  private String cardAcceptorReferenceNumber = null;

  @SerializedName("taxId")
  private String taxId = null;

  public Ptsv2paymentsidrefundsMerchantInformation merchantDescriptor(Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Ptsv2paymentsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public Ptsv2paymentsidrefundsMerchantInformation categoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the &#x60;merchant_category_code&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code 
   * maximum: 9999
   * @return categoryCode
  **/
  @ApiModelProperty(value = "The value for this field is a four-digit number that the payment card industry uses to classify merchants into market segments. A payment card company assigned one or more of these values to your business when you started accepting the payment card company’s cards. When you do not include this field in your request, CyberSource uses the value in your CyberSource account.  For processor-specific information, see the `merchant_category_code` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR4 - Position: 150-153 - Field: Merchant Category Code ")
  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Ptsv2paymentsidrefundsMerchantInformation vatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
    return this;
  }

   /**
   * Your government-assigned tax identification number.  For CtV processors, the maximum length is 20.  For other processor-specific information, see the &#x60;merchant_vat_registration_number&#x60; field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatRegistrationNumber
  **/
  @ApiModelProperty(value = "Your government-assigned tax identification number.  For CtV processors, the maximum length is 20.  For other processor-specific information, see the `merchant_vat_registration_number` field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatRegistrationNumber() {
    return vatRegistrationNumber;
  }

  public void setVatRegistrationNumber(String vatRegistrationNumber) {
    this.vatRegistrationNumber = vatRegistrationNumber;
  }

  public Ptsv2paymentsidrefundsMerchantInformation cardAcceptorReferenceNumber(String cardAcceptorReferenceNumber) {
    this.cardAcceptorReferenceNumber = cardAcceptorReferenceNumber;
    return this;
  }

   /**
   * Reference number that facilitates card acceptor/corporation communication and record keeping.  For processor-specific information, see the &#x60;card_acceptor_ref_number&#x60; field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return cardAcceptorReferenceNumber
  **/
  @ApiModelProperty(value = "Reference number that facilitates card acceptor/corporation communication and record keeping.  For processor-specific information, see the `card_acceptor_ref_number` field description in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getCardAcceptorReferenceNumber() {
    return cardAcceptorReferenceNumber;
  }

  public void setCardAcceptorReferenceNumber(String cardAcceptorReferenceNumber) {
    this.cardAcceptorReferenceNumber = cardAcceptorReferenceNumber;
  }

  public Ptsv2paymentsidrefundsMerchantInformation taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Your Cadastro Nacional da Pessoa Jurídica (CNPJ) number.  This field is supported only for BNDES transactions on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR6 - Position: 40-59 - Field: BNDES Reference Field 1  For details, see &#x60;bill_merchant_tax_id&#x60; field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return taxId
  **/
  @ApiModelProperty(value = "Your Cadastro Nacional da Pessoa Jurídica (CNPJ) number.  This field is supported only for BNDES transactions on CyberSource through VisaNet.  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR6 - Position: 40-59 - Field: BNDES Reference Field 1  For details, see `bill_merchant_tax_id` field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsMerchantInformation ptsv2paymentsidrefundsMerchantInformation = (Ptsv2paymentsidrefundsMerchantInformation) o;
    return Objects.equals(this.merchantDescriptor, ptsv2paymentsidrefundsMerchantInformation.merchantDescriptor) &&
        Objects.equals(this.categoryCode, ptsv2paymentsidrefundsMerchantInformation.categoryCode) &&
        Objects.equals(this.vatRegistrationNumber, ptsv2paymentsidrefundsMerchantInformation.vatRegistrationNumber) &&
        Objects.equals(this.cardAcceptorReferenceNumber, ptsv2paymentsidrefundsMerchantInformation.cardAcceptorReferenceNumber) &&
        Objects.equals(this.taxId, ptsv2paymentsidrefundsMerchantInformation.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDescriptor, categoryCode, vatRegistrationNumber, cardAcceptorReferenceNumber, taxId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsMerchantInformation {\n");
    
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    vatRegistrationNumber: ").append(toIndentedString(vatRegistrationNumber)).append("\n");
    sb.append("    cardAcceptorReferenceNumber: ").append(toIndentedString(cardAcceptorReferenceNumber)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

