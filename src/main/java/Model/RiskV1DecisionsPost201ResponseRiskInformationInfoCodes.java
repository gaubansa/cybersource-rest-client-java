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
import java.util.ArrayList;
import java.util.List;

/**
 * RiskV1DecisionsPost201ResponseRiskInformationInfoCodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationInfoCodes {
  @SerializedName("velocity")
  private List<String> velocity = null;

  @SerializedName("address")
  private List<String> address = null;

  @SerializedName("customerList")
  private List<String> customerList = null;

  @SerializedName("identityChange")
  private List<String> identityChange = null;

  @SerializedName("internet")
  private List<String> internet = null;

  @SerializedName("phone")
  private List<String> phone = null;

  @SerializedName("suspicious")
  private List<String> suspicious = null;

  @SerializedName("globalVelocity")
  private List<String> globalVelocity = null;

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes velocity(List<String> velocity) {
    this.velocity = velocity;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addVelocityItem(String velocityItem) {
    if (this.velocity == null) {
      this.velocity = new ArrayList<String>();
    }
    this.velocity.add(velocityItem);
    return this;
  }

   /**
   * List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  For all possible values, see the &#x60;decision_velocity_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return velocity
  **/
  @ApiModelProperty(value = "List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  For all possible values, see the `decision_velocity_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getVelocity() {
    return velocity;
  }

  public void setVelocity(List<String> velocity) {
    this.velocity = velocity;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes address(List<String> address) {
    this.address = address;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Indicates a mismatch between the customer’s billing and shipping addresses.  For all possible values, see the &#x60;score_address_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return address
  **/
  @ApiModelProperty(value = "Indicates a mismatch between the customer’s billing and shipping addresses.  For all possible values, see the `score_address_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes customerList(List<String> customerList) {
    this.customerList = customerList;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addCustomerListItem(String customerListItem) {
    if (this.customerList == null) {
      this.customerList = new ArrayList<String>();
    }
    this.customerList.add(customerListItem);
    return this;
  }

   /**
   * Indicates that customer information is associated with transactions that are either on the negative or the positive list.  For all possible values, see the &#x60;score_hotlist_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return customerList
  **/
  @ApiModelProperty(value = "Indicates that customer information is associated with transactions that are either on the negative or the positive list.  For all possible values, see the `score_hotlist_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getCustomerList() {
    return customerList;
  }

  public void setCustomerList(List<String> customerList) {
    this.customerList = customerList;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes identityChange(List<String> identityChange) {
    this.identityChange = identityChange;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addIdentityChangeItem(String identityChangeItem) {
    if (this.identityChange == null) {
      this.identityChange = new ArrayList<String>();
    }
    this.identityChange.add(identityChangeItem);
    return this;
  }

   /**
   * Indicates excessive identity changes. The threshold is variable depending on the identity elements being compared. This field can contain one or more information codes, separated by carets (^).  For all possible values, see the &#x60;score_identity_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return identityChange
  **/
  @ApiModelProperty(value = "Indicates excessive identity changes. The threshold is variable depending on the identity elements being compared. This field can contain one or more information codes, separated by carets (^).  For all possible values, see the `score_identity_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getIdentityChange() {
    return identityChange;
  }

  public void setIdentityChange(List<String> identityChange) {
    this.identityChange = identityChange;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes internet(List<String> internet) {
    this.internet = internet;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addInternetItem(String internetItem) {
    if (this.internet == null) {
      this.internet = new ArrayList<String>();
    }
    this.internet.add(internetItem);
    return this;
  }

   /**
   * Indicates a problem with the customer’s email address, IP address, or billing address.  For all possible values, see the &#x60;score_internet_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return internet
  **/
  @ApiModelProperty(value = "Indicates a problem with the customer’s email address, IP address, or billing address.  For all possible values, see the `score_internet_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getInternet() {
    return internet;
  }

  public void setInternet(List<String> internet) {
    this.internet = internet;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes phone(List<String> phone) {
    this.phone = phone;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addPhoneItem(String phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<String>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * Indicates a problem with the customer’s phone number.  For all possible values, see the &#x60;score_phone_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return phone
  **/
  @ApiModelProperty(value = "Indicates a problem with the customer’s phone number.  For all possible values, see the `score_phone_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getPhone() {
    return phone;
  }

  public void setPhone(List<String> phone) {
    this.phone = phone;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes suspicious(List<String> suspicious) {
    this.suspicious = suspicious;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addSuspiciousItem(String suspiciousItem) {
    if (this.suspicious == null) {
      this.suspicious = new ArrayList<String>();
    }
    this.suspicious.add(suspiciousItem);
    return this;
  }

   /**
   * Indicates that the customer provided potentially suspicious information.  For all possible values, see the &#x60;score_suspicious_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return suspicious
  **/
  @ApiModelProperty(value = "Indicates that the customer provided potentially suspicious information.  For all possible values, see the `score_suspicious_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getSuspicious() {
    return suspicious;
  }

  public void setSuspicious(List<String> suspicious) {
    this.suspicious = suspicious;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes globalVelocity(List<String> globalVelocity) {
    this.globalVelocity = globalVelocity;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationInfoCodes addGlobalVelocityItem(String globalVelocityItem) {
    if (this.globalVelocity == null) {
      this.globalVelocity = new ArrayList<String>();
    }
    this.globalVelocity.add(globalVelocityItem);
    return this;
  }

   /**
   * Indicates that the customer has a high purchase frequency.  For all possible values, see the &#x60;score_velocity_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return globalVelocity
  **/
  @ApiModelProperty(value = "Indicates that the customer has a high purchase frequency.  For all possible values, see the `score_velocity_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<String> getGlobalVelocity() {
    return globalVelocity;
  }

  public void setGlobalVelocity(List<String> globalVelocity) {
    this.globalVelocity = globalVelocity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationInfoCodes riskV1DecisionsPost201ResponseRiskInformationInfoCodes = (RiskV1DecisionsPost201ResponseRiskInformationInfoCodes) o;
    return Objects.equals(this.velocity, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.velocity) &&
        Objects.equals(this.address, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.address) &&
        Objects.equals(this.customerList, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.customerList) &&
        Objects.equals(this.identityChange, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.identityChange) &&
        Objects.equals(this.internet, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.internet) &&
        Objects.equals(this.phone, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.phone) &&
        Objects.equals(this.suspicious, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.suspicious) &&
        Objects.equals(this.globalVelocity, riskV1DecisionsPost201ResponseRiskInformationInfoCodes.globalVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(velocity, address, customerList, identityChange, internet, phone, suspicious, globalVelocity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationInfoCodes {\n");
    
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customerList: ").append(toIndentedString(customerList)).append("\n");
    sb.append("    identityChange: ").append(toIndentedString(identityChange)).append("\n");
    sb.append("    internet: ").append(toIndentedString(internet)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    suspicious: ").append(toIndentedString(suspicious)).append("\n");
    sb.append("    globalVelocity: ").append(toIndentedString(globalVelocity)).append("\n");
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

