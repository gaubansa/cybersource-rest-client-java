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
import Model.Ptsv2paymentsidreversalsPointOfSaleInformationEmv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidreversalsPointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class Ptsv2paymentsidreversalsPointOfSaleInformation {
  @SerializedName("emv")
  private Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv = null;

  public Ptsv2paymentsidreversalsPointOfSaleInformation emv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsPointOfSaleInformation ptsv2paymentsidreversalsPointOfSaleInformation = (Ptsv2paymentsidreversalsPointOfSaleInformation) o;
    return Objects.equals(this.emv, ptsv2paymentsidreversalsPointOfSaleInformation.emv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsPointOfSaleInformation {\n");
    
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
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

