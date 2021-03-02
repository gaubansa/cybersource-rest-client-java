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
import java.util.ArrayList;
import java.util.List;

/**
 * Riskv1exportcomplianceinquiriesOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-24T13:03:20.341+05:30")
public class Riskv1exportcomplianceinquiriesOrderInformationLineItems {
  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("allowedExportCountries")
  private List<String> allowedExportCountries = null;

  @SerializedName("restrictedExportCountries")
  private List<String> restrictedExportCountries = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("productSKU")
  private String productSKU = null;

  @SerializedName("productRisk")
  private String productRisk = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productCode")
  private String productCode = null;

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) 
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems allowedExportCountries(List<String> allowedExportCountries) {
    this.allowedExportCountries = allowedExportCountries;
    return this;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems addAllowedExportCountriesItem(String allowedExportCountriesItem) {
    if (this.allowedExportCountries == null) {
      this.allowedExportCountries = new ArrayList<String>();
    }
    this.allowedExportCountries.add(allowedExportCountriesItem);
    return this;
  }

   /**
   * Get allowedExportCountries
   * @return allowedExportCountries
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedExportCountries() {
    return allowedExportCountries;
  }

  public void setAllowedExportCountries(List<String> allowedExportCountries) {
    this.allowedExportCountries = allowedExportCountries;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems restrictedExportCountries(List<String> restrictedExportCountries) {
    this.restrictedExportCountries = restrictedExportCountries;
    return this;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems addRestrictedExportCountriesItem(String restrictedExportCountriesItem) {
    if (this.restrictedExportCountries == null) {
      this.restrictedExportCountries = new ArrayList<String>();
    }
    this.restrictedExportCountries.add(restrictedExportCountriesItem);
    return this;
  }

   /**
   * Get restrictedExportCountries
   * @return restrictedExportCountries
  **/
  @ApiModelProperty(value = "")
  public List<String> getRestrictedExportCountries() {
    return restrictedExportCountries;
  }

  public void setRestrictedExportCountries(List<String> restrictedExportCountries) {
    this.restrictedExportCountries = restrictedExportCountries;
  }

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems quantity(Integer quantity) {
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

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems productSKU(String productSKU) {
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

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems productRisk(String productRisk) {
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

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems productName(String productName) {
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

  public Riskv1exportcomplianceinquiriesOrderInformationLineItems productCode(String productCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesOrderInformationLineItems riskv1exportcomplianceinquiriesOrderInformationLineItems = (Riskv1exportcomplianceinquiriesOrderInformationLineItems) o;
    return Objects.equals(this.unitPrice, riskv1exportcomplianceinquiriesOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.allowedExportCountries, riskv1exportcomplianceinquiriesOrderInformationLineItems.allowedExportCountries) &&
        Objects.equals(this.restrictedExportCountries, riskv1exportcomplianceinquiriesOrderInformationLineItems.restrictedExportCountries) &&
        Objects.equals(this.quantity, riskv1exportcomplianceinquiriesOrderInformationLineItems.quantity) &&
        Objects.equals(this.productSKU, riskv1exportcomplianceinquiriesOrderInformationLineItems.productSKU) &&
        Objects.equals(this.productRisk, riskv1exportcomplianceinquiriesOrderInformationLineItems.productRisk) &&
        Objects.equals(this.productName, riskv1exportcomplianceinquiriesOrderInformationLineItems.productName) &&
        Objects.equals(this.productCode, riskv1exportcomplianceinquiriesOrderInformationLineItems.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPrice, allowedExportCountries, restrictedExportCountries, quantity, productSKU, productRisk, productName, productCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesOrderInformationLineItems {\n");
    
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    allowedExportCountries: ").append(toIndentedString(allowedExportCountries)).append("\n");
    sb.append("    restrictedExportCountries: ").append(toIndentedString(restrictedExportCountries)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productSKU: ").append(toIndentedString(productSKU)).append("\n");
    sb.append("    productRisk: ").append(toIndentedString(productRisk)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

