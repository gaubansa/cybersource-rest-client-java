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
import Model.Tmsv2customersBuyerInformation;
import Model.Tmsv2customersClientReferenceInformation;
import Model.Tmsv2customersDefaultPaymentInstrument;
import Model.Tmsv2customersDefaultShippingAddress;
import Model.Tmsv2customersEmbedded;
import Model.Tmsv2customersLinks;
import Model.Tmsv2customersMerchantDefinedInformation;
import Model.Tmsv2customersMetadata;
import Model.Tmsv2customersObjectInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Customer {
  @SerializedName("_links")
  private Tmsv2customersLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("objectInformation")
  private Tmsv2customersObjectInformation objectInformation = null;

  @SerializedName("buyerInformation")
  private Tmsv2customersBuyerInformation buyerInformation = null;

  @SerializedName("clientReferenceInformation")
  private Tmsv2customersClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Tmsv2customersMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("defaultPaymentInstrument")
  private Tmsv2customersDefaultPaymentInstrument defaultPaymentInstrument = null;

  @SerializedName("defaultShippingAddress")
  private Tmsv2customersDefaultShippingAddress defaultShippingAddress = null;

  @SerializedName("metadata")
  private Tmsv2customersMetadata metadata = null;

  @SerializedName("_embedded")
  private Tmsv2customersEmbedded embedded = null;

  public Customer links(Tmsv2customersLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2customersLinks links) {
    this.links = links;
  }

  public Customer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the Customer Token.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the Customer Token.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer objectInformation(Tmsv2customersObjectInformation objectInformation) {
    this.objectInformation = objectInformation;
    return this;
  }

   /**
   * Get objectInformation
   * @return objectInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersObjectInformation getObjectInformation() {
    return objectInformation;
  }

  public void setObjectInformation(Tmsv2customersObjectInformation objectInformation) {
    this.objectInformation = objectInformation;
  }

  public Customer buyerInformation(Tmsv2customersBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Tmsv2customersBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public Customer clientReferenceInformation(Tmsv2customersClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Tmsv2customersClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public Customer merchantDefinedInformation(List<Tmsv2customersMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public Customer addMerchantDefinedInformationItem(Tmsv2customersMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Tmsv2customersMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * Object containing the custom data that the merchant defines. 
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "Object containing the custom data that the merchant defines. ")
  public List<Tmsv2customersMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Tmsv2customersMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public Customer defaultPaymentInstrument(Tmsv2customersDefaultPaymentInstrument defaultPaymentInstrument) {
    this.defaultPaymentInstrument = defaultPaymentInstrument;
    return this;
  }

   /**
   * Get defaultPaymentInstrument
   * @return defaultPaymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersDefaultPaymentInstrument getDefaultPaymentInstrument() {
    return defaultPaymentInstrument;
  }

  public void setDefaultPaymentInstrument(Tmsv2customersDefaultPaymentInstrument defaultPaymentInstrument) {
    this.defaultPaymentInstrument = defaultPaymentInstrument;
  }

  public Customer defaultShippingAddress(Tmsv2customersDefaultShippingAddress defaultShippingAddress) {
    this.defaultShippingAddress = defaultShippingAddress;
    return this;
  }

   /**
   * Get defaultShippingAddress
   * @return defaultShippingAddress
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersDefaultShippingAddress getDefaultShippingAddress() {
    return defaultShippingAddress;
  }

  public void setDefaultShippingAddress(Tmsv2customersDefaultShippingAddress defaultShippingAddress) {
    this.defaultShippingAddress = defaultShippingAddress;
  }

  public Customer metadata(Tmsv2customersMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Tmsv2customersMetadata metadata) {
    this.metadata = metadata;
  }

  public Customer embedded(Tmsv2customersEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(Tmsv2customersEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.links, customer.links) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.objectInformation, customer.objectInformation) &&
        Objects.equals(this.buyerInformation, customer.buyerInformation) &&
        Objects.equals(this.clientReferenceInformation, customer.clientReferenceInformation) &&
        Objects.equals(this.merchantDefinedInformation, customer.merchantDefinedInformation) &&
        Objects.equals(this.defaultPaymentInstrument, customer.defaultPaymentInstrument) &&
        Objects.equals(this.defaultShippingAddress, customer.defaultShippingAddress) &&
        Objects.equals(this.metadata, customer.metadata) &&
        Objects.equals(this.embedded, customer.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, objectInformation, buyerInformation, clientReferenceInformation, merchantDefinedInformation, defaultPaymentInstrument, defaultShippingAddress, metadata, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectInformation: ").append(toIndentedString(objectInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    defaultPaymentInstrument: ").append(toIndentedString(defaultPaymentInstrument)).append("\n");
    sb.append("    defaultShippingAddress: ").append(toIndentedString(defaultShippingAddress)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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
