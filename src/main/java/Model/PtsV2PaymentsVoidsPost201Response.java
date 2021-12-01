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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsVoidsPost201ResponseProcessorInformation;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-22T16:37:43.981+05:30")
public class PtsV2PaymentsVoidsPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("voidAmountDetails")
  private PtsV2PaymentsVoidsPost201ResponseVoidAmountDetails voidAmountDetails = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsVoidsPost201ResponseProcessorInformation processorInformation = null;

  public PtsV2PaymentsVoidsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsVoidsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
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
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2PaymentsVoidsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - VOIDED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - VOIDED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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

  public PtsV2PaymentsVoidsPost201Response processorInformation(PtsV2PaymentsVoidsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsVoidsPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsVoidsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
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
        Objects.equals(this.voidAmountDetails, ptsV2PaymentsVoidsPost201Response.voidAmountDetails) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsVoidsPost201Response.processorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, clientReferenceInformation, voidAmountDetails, processorInformation);
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
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
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

