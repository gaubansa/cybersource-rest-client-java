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
import Model.RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation;
import Model.RiskV1AddressVerificationsPost201ResponseErrorInformation;
import Model.RiskV1DecisionsPost201ResponseClientReferenceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AddressVerificationsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:42:49.539+05:30")
public class RiskV1AddressVerificationsPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("submitTimeLocal")
  private String submitTimeLocal = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("clientReferenceInformation")
  private RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("addressVerificationInformation")
  private RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation addressVerificationInformation = null;

  @SerializedName("errorInformation")
  private RiskV1AddressVerificationsPost201ResponseErrorInformation errorInformation = null;

  public RiskV1AddressVerificationsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
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

  public RiskV1AddressVerificationsPost201Response id(String id) {
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

  public RiskV1AddressVerificationsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public RiskV1AddressVerificationsPost201Response submitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
    return this;
  }

   /**
   * Time that the transaction was submitted in local time. Generated by Cybersource.
   * @return submitTimeLocal
  **/
  @ApiModelProperty(value = "Time that the transaction was submitted in local time. Generated by Cybersource.")
  public String getSubmitTimeLocal() {
    return submitTimeLocal;
  }

  public void setSubmitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
  }

  public RiskV1AddressVerificationsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for the call can be: - COMPLETED - INVALID_REQUEST - DECLINED 
   * @return status
  **/
  @ApiModelProperty(value = "The status for the call can be: - COMPLETED - INVALID_REQUEST - DECLINED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1AddressVerificationsPost201Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the reason of the status. Value can be   - Apartment number missing or not found.   - Insufficient address information.   - House/Box number not found on street.   - Multiple address matches were found.   - P.O. Box identifier not found or out of range.   - Route service identifier not found or out of range.   - Street name not found in Postal code.   - Postal code not found in database.   - Unable to verify or correct address.   - Multiple addres matches were found (international)   - Address match not found (no reason given)   - Unsupported character set 
   * @return message
  **/
  @ApiModelProperty(value = "The message describing the reason of the status. Value can be   - Apartment number missing or not found.   - Insufficient address information.   - House/Box number not found on street.   - Multiple address matches were found.   - P.O. Box identifier not found or out of range.   - Route service identifier not found or out of range.   - Street name not found in Postal code.   - Postal code not found in database.   - Unable to verify or correct address.   - Multiple addres matches were found (international)   - Address match not found (no reason given)   - Unsupported character set ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1AddressVerificationsPost201Response clientReferenceInformation(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(RiskV1DecisionsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RiskV1AddressVerificationsPost201Response addressVerificationInformation(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation addressVerificationInformation) {
    this.addressVerificationInformation = addressVerificationInformation;
    return this;
  }

   /**
   * Get addressVerificationInformation
   * @return addressVerificationInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation getAddressVerificationInformation() {
    return addressVerificationInformation;
  }

  public void setAddressVerificationInformation(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation addressVerificationInformation) {
    this.addressVerificationInformation = addressVerificationInformation;
  }

  public RiskV1AddressVerificationsPost201Response errorInformation(RiskV1AddressVerificationsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1AddressVerificationsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(RiskV1AddressVerificationsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AddressVerificationsPost201Response riskV1AddressVerificationsPost201Response = (RiskV1AddressVerificationsPost201Response) o;
    return Objects.equals(this.links, riskV1AddressVerificationsPost201Response.links) &&
        Objects.equals(this.id, riskV1AddressVerificationsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, riskV1AddressVerificationsPost201Response.submitTimeUtc) &&
        Objects.equals(this.submitTimeLocal, riskV1AddressVerificationsPost201Response.submitTimeLocal) &&
        Objects.equals(this.status, riskV1AddressVerificationsPost201Response.status) &&
        Objects.equals(this.message, riskV1AddressVerificationsPost201Response.message) &&
        Objects.equals(this.clientReferenceInformation, riskV1AddressVerificationsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.addressVerificationInformation, riskV1AddressVerificationsPost201Response.addressVerificationInformation) &&
        Objects.equals(this.errorInformation, riskV1AddressVerificationsPost201Response.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, submitTimeLocal, status, message, clientReferenceInformation, addressVerificationInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    submitTimeLocal: ").append(toIndentedString(submitTimeLocal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    addressVerificationInformation: ").append(toIndentedString(addressVerificationInformation)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

