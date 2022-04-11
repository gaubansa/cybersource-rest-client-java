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
import Model.Ptsv2paymentsTravelInformationTransitAirline;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTravelInformationTransit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class Ptsv2paymentsTravelInformationTransit {
  @SerializedName("airline")
  private Ptsv2paymentsTravelInformationTransitAirline airline = null;

  public Ptsv2paymentsTravelInformationTransit airline(Ptsv2paymentsTravelInformationTransitAirline airline) {
    this.airline = airline;
    return this;
  }

   /**
   * Get airline
   * @return airline
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformationTransitAirline getAirline() {
    return airline;
  }

  public void setAirline(Ptsv2paymentsTravelInformationTransitAirline airline) {
    this.airline = airline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationTransit ptsv2paymentsTravelInformationTransit = (Ptsv2paymentsTravelInformationTransit) o;
    return Objects.equals(this.airline, ptsv2paymentsTravelInformationTransit.airline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationTransit {\n");
    
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
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

