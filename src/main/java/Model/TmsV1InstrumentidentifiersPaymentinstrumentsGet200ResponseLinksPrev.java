/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * A link to the previous collection starting at the supplied offset minus the supplied limit.
 */
@ApiModel(description = "A link to the previous collection starting at the supplied offset minus the supplied limit.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class TmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev {
  @SerializedName("href")
  private String href = null;

  public TmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "https://api.cybersource.com/tms/v1/instrumentidentifiers/5B32CE6167B09343E05333B9D30A53E1/paymentinstruments?offset=15&limit=5", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev tmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev = (TmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev) o;
    return Objects.equals(this.href, tmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentidentifiersPaymentinstrumentsGet200ResponseLinksPrev {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

