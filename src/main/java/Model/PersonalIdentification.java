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
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationIssuedBy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersonalIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-26T18:32:32.437+05:30")
public class PersonalIdentification {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("issuedBy")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationIssuedBy issuedBy = null;

  public PersonalIdentification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer&#39;s identification number.  **Important**: Contact your TeleCheck representative to learn whether this field is required or optional. 
   * @return id
  **/
  @ApiModelProperty(example = "1234567890", value = "Customer's identification number.  **Important**: Contact your TeleCheck representative to learn whether this field is required or optional. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalIdentification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of personal identification. **Important**: Contact your TeleCheck representative to learn whether this field is required or optional.  Valid values: - driver license 
   * @return type
  **/
  @ApiModelProperty(example = "driver license", value = "Type of personal identification. **Important**: Contact your TeleCheck representative to learn whether this field is required or optional.  Valid values: - driver license ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PersonalIdentification issuedBy(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Get issuedBy
   * @return issuedBy
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationIssuedBy getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbeddedBuyerInformationIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalIdentification personalIdentification = (PersonalIdentification) o;
    return Objects.equals(this.id, personalIdentification.id) &&
        Objects.equals(this.type, personalIdentification.type) &&
        Objects.equals(this.issuedBy, personalIdentification.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, issuedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalIdentification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
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

