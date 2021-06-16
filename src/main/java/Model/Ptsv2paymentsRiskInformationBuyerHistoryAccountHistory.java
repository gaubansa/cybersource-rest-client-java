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
 * Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory {
  @SerializedName("firstUseOfShippingAddress")
  private Boolean firstUseOfShippingAddress = null;

  @SerializedName("shippingAddressUsageDate")
  private String shippingAddressUsageDate = null;

  public Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory firstUseOfShippingAddress(Boolean firstUseOfShippingAddress) {
    this.firstUseOfShippingAddress = firstUseOfShippingAddress;
    return this;
  }

   /**
   * Applicable when this is not a guest account. 
   * @return firstUseOfShippingAddress
  **/
  @ApiModelProperty(value = "Applicable when this is not a guest account. ")
  public Boolean getFirstUseOfShippingAddress() {
    return firstUseOfShippingAddress;
  }

  public void setFirstUseOfShippingAddress(Boolean firstUseOfShippingAddress) {
    this.firstUseOfShippingAddress = firstUseOfShippingAddress;
  }

  public Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory shippingAddressUsageDate(String shippingAddressUsageDate) {
    this.shippingAddressUsageDate = shippingAddressUsageDate;
    return this;
  }

   /**
   * Date when the shipping address for this transaction was first used. Recommended for Discover ProtectBuy. If &#x60;firstUseOfShippingAddress&#x60; is false and not a guest account, then this date is entered. 
   * @return shippingAddressUsageDate
  **/
  @ApiModelProperty(value = "Date when the shipping address for this transaction was first used. Recommended for Discover ProtectBuy. If `firstUseOfShippingAddress` is false and not a guest account, then this date is entered. ")
  public String getShippingAddressUsageDate() {
    return shippingAddressUsageDate;
  }

  public void setShippingAddressUsageDate(String shippingAddressUsageDate) {
    this.shippingAddressUsageDate = shippingAddressUsageDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory ptsv2paymentsRiskInformationBuyerHistoryAccountHistory = (Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory) o;
    return Objects.equals(this.firstUseOfShippingAddress, ptsv2paymentsRiskInformationBuyerHistoryAccountHistory.firstUseOfShippingAddress) &&
        Objects.equals(this.shippingAddressUsageDate, ptsv2paymentsRiskInformationBuyerHistoryAccountHistory.shippingAddressUsageDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstUseOfShippingAddress, shippingAddressUsageDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsRiskInformationBuyerHistoryAccountHistory {\n");
    
    sb.append("    firstUseOfShippingAddress: ").append(toIndentedString(firstUseOfShippingAddress)).append("\n");
    sb.append("    shippingAddressUsageDate: ").append(toIndentedString(shippingAddressUsageDate)).append("\n");
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

