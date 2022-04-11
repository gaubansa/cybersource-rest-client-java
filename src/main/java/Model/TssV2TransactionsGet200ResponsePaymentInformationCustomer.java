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
 * TssV2TransactionsGet200ResponsePaymentInformationCustomer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationCustomer {
  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("id")
  private String id = null;

  public TssV2TransactionsGet200ResponsePaymentInformationCustomer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique identifier for the legacy Secure Storage token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. 
   * @return customerId
  **/
  @ApiModelProperty(value = "Unique identifier for the legacy Secure Storage token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationCustomer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Customer token that was created as part of a bundled TOKEN_CREATE action. 
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the Customer token that was created as part of a bundled TOKEN_CREATE action. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationCustomer tssV2TransactionsGet200ResponsePaymentInformationCustomer = (TssV2TransactionsGet200ResponsePaymentInformationCustomer) o;
    return Objects.equals(this.customerId, tssV2TransactionsGet200ResponsePaymentInformationCustomer.customerId) &&
        Objects.equals(this.id, tssV2TransactionsGet200ResponsePaymentInformationCustomer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationCustomer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

