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
import Model.Ptsv2paymentsOrderInformationPassenger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1decisionsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-01T22:27:14.566+05:30")
public class Riskv1decisionsOrderInformationLineItems {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("giftCardCurrency")
  private Integer giftCardCurrency = null;

  @SerializedName("productSKU")
  private String productSKU = null;

  @SerializedName("productRisk")
  private String productRisk = null;

  @SerializedName("productDescription")
  private String productDescription = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("gift")
  private Boolean gift = null;

  @SerializedName("distributorProductSku")
  private String distributorProductSku = null;

  @SerializedName("passenger")
  private Ptsv2paymentsOrderInformationPassenger passenger = null;

  @SerializedName("shippingDestinationTypes")
  private String shippingDestinationTypes = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  public Riskv1decisionsOrderInformationLineItems totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount for the item. Normally calculated as the unit price times quantity.  When &#x60;orderInformation.lineItems[].productCode&#x60; is \&quot;gift_card\&quot;, this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD &#x3D; 123 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total amount for the item. Normally calculated as the unit price times quantity.  When `orderInformation.lineItems[].productCode` is \"gift_card\", this is the purchase amount total for prepaid gift cards in major units.  Example: 123.45 USD = 123 ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Riskv1decisionsOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Riskv1decisionsOrderInformationLineItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of units for this order. Must be a non-negative integer.  The default is &#x60;1&#x60;. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * minimum: 1
   * maximum: 999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of units for this order. Must be a non-negative integer.  The default is `1`. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Riskv1decisionsOrderInformationLineItems giftCardCurrency(Integer giftCardCurrency) {
    this.giftCardCurrency = giftCardCurrency;
    return this;
  }

   /**
   * When &#x60;orderInformation.lineItems[].productCode&#x60; is \&quot;gift_card\&quot;, this is the currency used for the gift card purchase.  For details, see &#x60;pa_gift_card_currency&#x60; field description in [CyberSource Payer Authentication Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/Payer_Authentication_SCMP_API.pdf)  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) 
   * @return giftCardCurrency
  **/
  @ApiModelProperty(value = "When `orderInformation.lineItems[].productCode` is \"gift_card\", this is the currency used for the gift card purchase.  For details, see `pa_gift_card_currency` field description in [CyberSource Payer Authentication Using the SCMP API.] (https://apps.cybersource.com/library/documentation/dev_guides/Payer_Authentication_SCMP_API/Payer_Authentication_SCMP_API.pdf)  For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf) ")
  public Integer getGiftCardCurrency() {
    return giftCardCurrency;
  }

  public void setGiftCardCurrency(Integer giftCardCurrency) {
    this.giftCardCurrency = giftCardCurrency;
  }

  public Riskv1decisionsOrderInformationLineItems productSKU(String productSKU) {
    this.productSKU = productSKU;
    return this;
  }

   /**
   * Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the values related to shipping and/or handling. 
   * @return productSKU
  **/
  @ApiModelProperty(value = "Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the values related to shipping and/or handling. ")
  public String getProductSKU() {
    return productSKU;
  }

  public void setProductSKU(String productSKU) {
    this.productSKU = productSKU;
  }

  public Riskv1decisionsOrderInformationLineItems productRisk(String productRisk) {
    this.productRisk = productRisk;
    return this;
  }

   /**
   * Indicates the level of risk for the product. This field can contain one of the following values: - &#x60;low&#x60;: The product is associated with few chargebacks. - &#x60;normal&#x60;: The product is associated with a normal number of chargebacks. - &#x60;high&#x60;: The product is associated with many chargebacks. 
   * @return productRisk
  **/
  @ApiModelProperty(value = "Indicates the level of risk for the product. This field can contain one of the following values: - `low`: The product is associated with few chargebacks. - `normal`: The product is associated with a normal number of chargebacks. - `high`: The product is associated with many chargebacks. ")
  public String getProductRisk() {
    return productRisk;
  }

  public void setProductRisk(String productRisk) {
    this.productRisk = productRisk;
  }

  public Riskv1decisionsOrderInformationLineItems productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

   /**
   * Brief description of item.
   * @return productDescription
  **/
  @ApiModelProperty(value = "Brief description of item.")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public Riskv1decisionsOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * @return productName
  **/
  @ApiModelProperty(value = "For an authorization or capture transaction (`processingOptions.capture` is `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Riskv1decisionsOrderInformationLineItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Type of product. The value for this field is used to identify the product category (electronic, handling, physical, service, or shipping). The default value is &#x60;default&#x60;.  If you are performing an authorization transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;false&#x60;), and you set this field to a value other than &#x60;default&#x60; or one of the values related to shipping and/or handling, then &#x60;orderInformation.lineItems[].quantity&#x60;, &#x60;orderInformation.lineItems[].productName&#x60;, and &#x60;orderInformation.lineItems[].productSku&#x60; fields are required.  Optional field.  For details, see the &#x60;product_code&#x60; field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  To use the tax calculation service, use values listed in the Tax Product Code Guide. For information about this document, contact customer support. See \&quot;Product Codes,\&quot; page 14, for more information. 
   * @return productCode
  **/
  @ApiModelProperty(value = "Type of product. The value for this field is used to identify the product category (electronic, handling, physical, service, or shipping). The default value is `default`.  If you are performing an authorization transaction (`processingOptions.capture` is set to `false`), and you set this field to a value other than `default` or one of the values related to shipping and/or handling, then `orderInformation.lineItems[].quantity`, `orderInformation.lineItems[].productName`, and `orderInformation.lineItems[].productSku` fields are required.  Optional field.  For details, see the `product_code` field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  To use the tax calculation service, use values listed in the Tax Product Code Guide. For information about this document, contact customer support. See \"Product Codes,\" page 14, for more information. ")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Riskv1decisionsOrderInformationLineItems gift(Boolean gift) {
    this.gift = gift;
    return this;
  }

   /**
   * This field is only used in DM service.  Determines whether to assign risk to the order if the billing and shipping addresses specify different cities, states, or countries. This field can contain one of the following values: - true: Orders are assigned only slight additional risk if billing and shipping addresses are different. - false: Orders are assigned higher additional risk if billing and shipping addresses are different. 
   * @return gift
  **/
  @ApiModelProperty(value = "This field is only used in DM service.  Determines whether to assign risk to the order if the billing and shipping addresses specify different cities, states, or countries. This field can contain one of the following values: - true: Orders are assigned only slight additional risk if billing and shipping addresses are different. - false: Orders are assigned higher additional risk if billing and shipping addresses are different. ")
  public Boolean getGift() {
    return gift;
  }

  public void setGift(Boolean gift) {
    this.gift = gift;
  }

  public Riskv1decisionsOrderInformationLineItems distributorProductSku(String distributorProductSku) {
    this.distributorProductSku = distributorProductSku;
    return this;
  }

   /**
   * Product’s identifier code. This field is inserted into the outgoing message without being parsed or formatted. This field is included as Distributor product SKU (Offer) in the list of API fields with which you can create custom rules. 
   * @return distributorProductSku
  **/
  @ApiModelProperty(value = "Product’s identifier code. This field is inserted into the outgoing message without being parsed or formatted. This field is included as Distributor product SKU (Offer) in the list of API fields with which you can create custom rules. ")
  public String getDistributorProductSku() {
    return distributorProductSku;
  }

  public void setDistributorProductSku(String distributorProductSku) {
    this.distributorProductSku = distributorProductSku;
  }

  public Riskv1decisionsOrderInformationLineItems passenger(Ptsv2paymentsOrderInformationPassenger passenger) {
    this.passenger = passenger;
    return this;
  }

   /**
   * Get passenger
   * @return passenger
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsOrderInformationPassenger getPassenger() {
    return passenger;
  }

  public void setPassenger(Ptsv2paymentsOrderInformationPassenger passenger) {
    this.passenger = passenger;
  }

  public Riskv1decisionsOrderInformationLineItems shippingDestinationTypes(String shippingDestinationTypes) {
    this.shippingDestinationTypes = shippingDestinationTypes;
    return this;
  }

   /**
   * Destination to where the item will be shipped. Example: Commercial, Residential, Store 
   * @return shippingDestinationTypes
  **/
  @ApiModelProperty(value = "Destination to where the item will be shipped. Example: Commercial, Residential, Store ")
  public String getShippingDestinationTypes() {
    return shippingDestinationTypes;
  }

  public void setShippingDestinationTypes(String shippingDestinationTypes) {
    this.shippingDestinationTypes = shippingDestinationTypes;
  }

  public Riskv1decisionsOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount=10.00, quantity=1, and taxAmount=0.80  ..- 2nd line item has amount=20.00, quantity=1, and taxAmount=1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsOrderInformationLineItems riskv1decisionsOrderInformationLineItems = (Riskv1decisionsOrderInformationLineItems) o;
    return Objects.equals(this.totalAmount, riskv1decisionsOrderInformationLineItems.totalAmount) &&
        Objects.equals(this.unitPrice, riskv1decisionsOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.quantity, riskv1decisionsOrderInformationLineItems.quantity) &&
        Objects.equals(this.giftCardCurrency, riskv1decisionsOrderInformationLineItems.giftCardCurrency) &&
        Objects.equals(this.productSKU, riskv1decisionsOrderInformationLineItems.productSKU) &&
        Objects.equals(this.productRisk, riskv1decisionsOrderInformationLineItems.productRisk) &&
        Objects.equals(this.productDescription, riskv1decisionsOrderInformationLineItems.productDescription) &&
        Objects.equals(this.productName, riskv1decisionsOrderInformationLineItems.productName) &&
        Objects.equals(this.productCode, riskv1decisionsOrderInformationLineItems.productCode) &&
        Objects.equals(this.gift, riskv1decisionsOrderInformationLineItems.gift) &&
        Objects.equals(this.distributorProductSku, riskv1decisionsOrderInformationLineItems.distributorProductSku) &&
        Objects.equals(this.passenger, riskv1decisionsOrderInformationLineItems.passenger) &&
        Objects.equals(this.shippingDestinationTypes, riskv1decisionsOrderInformationLineItems.shippingDestinationTypes) &&
        Objects.equals(this.taxAmount, riskv1decisionsOrderInformationLineItems.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, unitPrice, quantity, giftCardCurrency, productSKU, productRisk, productDescription, productName, productCode, gift, distributorProductSku, passenger, shippingDestinationTypes, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsOrderInformationLineItems {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    giftCardCurrency: ").append(toIndentedString(giftCardCurrency)).append("\n");
    sb.append("    productSKU: ").append(toIndentedString(productSKU)).append("\n");
    sb.append("    productRisk: ").append(toIndentedString(productRisk)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    distributorProductSku: ").append(toIndentedString(distributorProductSku)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    shippingDestinationTypes: ").append(toIndentedString(shippingDestinationTypes)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

