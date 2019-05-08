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
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsReversalsPost201ResponseLinks;
import Model.PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsVoidsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class PtsV2PaymentsVoidsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsReversalsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  /**
   * The status of the submitted transaction.  Possible values:  - VOIDED 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("voidAmountDetails")
  private PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails voidAmountDetails = null;

  public PtsV2PaymentsVoidsPost201Response links(PtsV2PaymentsReversalsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsReversalsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsReversalsPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsVoidsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsVoidsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` Example `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2PaymentsVoidsPost201Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - VOIDED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - VOIDED ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PtsV2PaymentsVoidsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PaymentsVoidsPost201Response voidAmountDetails(PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails voidAmountDetails) {
    this.voidAmountDetails = voidAmountDetails;
    return this;
  }

   /**
   * Get voidAmountDetails
   * @return voidAmountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails getVoidAmountDetails() {
    return voidAmountDetails;
  }

  public void setVoidAmountDetails(PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails voidAmountDetails) {
    this.voidAmountDetails = voidAmountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsVoidsPost201Response ptsV2PaymentsVoidsPost201Response = (PtsV2PaymentsVoidsPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsVoidsPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsVoidsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsVoidsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsVoidsPost201Response.status) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsVoidsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.voidAmountDetails, ptsV2PaymentsVoidsPost201Response.voidAmountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, clientReferenceInformation, voidAmountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsVoidsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    voidAmountDetails: ").append(toIndentedString(voidAmountDetails)).append("\n");
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

