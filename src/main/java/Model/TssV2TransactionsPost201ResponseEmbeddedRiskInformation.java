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
import Model.TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedRiskInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedRiskInformation {
  @SerializedName("providers")
  private TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders providers = null;

  public TssV2TransactionsPost201ResponseEmbeddedRiskInformation providers(TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders getProviders() {
    return providers;
  }

  public void setProviders(TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedRiskInformation tssV2TransactionsPost201ResponseEmbeddedRiskInformation = (TssV2TransactionsPost201ResponseEmbeddedRiskInformation) o;
    return Objects.equals(this.providers, tssV2TransactionsPost201ResponseEmbeddedRiskInformation.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedRiskInformation {\n");
    
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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

