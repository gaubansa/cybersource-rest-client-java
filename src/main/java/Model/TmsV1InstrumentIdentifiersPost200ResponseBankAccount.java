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
 * TmsV1InstrumentIdentifiersPost200ResponseBankAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class TmsV1InstrumentIdentifiersPost200ResponseBankAccount {
  @SerializedName("number")
  private String number = null;

  @SerializedName("routingNumber")
  private String routingNumber = null;

  public TmsV1InstrumentIdentifiersPost200ResponseBankAccount number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Checking account number.
   * @return number
  **/
  @ApiModelProperty(example = "1234567890123456800", value = "Checking account number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public TmsV1InstrumentIdentifiersPost200ResponseBankAccount routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Routing number.
   * @return routingNumber
  **/
  @ApiModelProperty(example = "123456789", value = "Routing number.")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPost200ResponseBankAccount tmsV1InstrumentIdentifiersPost200ResponseBankAccount = (TmsV1InstrumentIdentifiersPost200ResponseBankAccount) o;
    return Objects.equals(this.number, tmsV1InstrumentIdentifiersPost200ResponseBankAccount.number) &&
        Objects.equals(this.routingNumber, tmsV1InstrumentIdentifiersPost200ResponseBankAccount.routingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, routingNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200ResponseBankAccount {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
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

