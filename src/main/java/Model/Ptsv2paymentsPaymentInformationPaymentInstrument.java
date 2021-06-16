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
 * Ptsv2paymentsPaymentInformationPaymentInstrument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class Ptsv2paymentsPaymentInformationPaymentInstrument {
  @SerializedName("id")
  private String id = null;

  public Ptsv2paymentsPaymentInformationPaymentInstrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Payment Instrument token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. 
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the Payment Instrument token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. ")
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
    Ptsv2paymentsPaymentInformationPaymentInstrument ptsv2paymentsPaymentInformationPaymentInstrument = (Ptsv2paymentsPaymentInformationPaymentInstrument) o;
    return Objects.equals(this.id, ptsv2paymentsPaymentInformationPaymentInstrument.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationPaymentInstrument {\n");
    
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

