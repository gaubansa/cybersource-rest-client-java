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
import Model.RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing;
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
 * RiskV1DecisionsPost201ResponseRiskInformationVelocity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T13:25:59.510+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationVelocity {
  @SerializedName("morphing")
  private List<RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing> morphing = null;

  @SerializedName("address")
  private List<String> address = null;

  public RiskV1DecisionsPost201ResponseRiskInformationVelocity morphing(List<RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing> morphing) {
    this.morphing = morphing;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationVelocity addMorphingItem(RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing morphingItem) {
    if (this.morphing == null) {
      this.morphing = new ArrayList<RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing>();
    }
    this.morphing.add(morphingItem);
    return this;
  }

   /**
   * List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  For all possible values, see the &#x60;decision_velocity_info&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return morphing
  **/
  @ApiModelProperty(value = "List of information codes triggered by the order. These information codes were generated when you created the order and product velocity rules and are returned so that you can associate them with the rules.  For all possible values, see the `decision_velocity_info` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public List<RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing> getMorphing() {
    return morphing;
  }

  public void setMorphing(List<RiskV1DecisionsPost201ResponseRiskInformationVelocityMorphing> morphing) {
    this.morphing = morphing;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationVelocity address(List<String> address) {
    this.address = address;
    return this;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationVelocity addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationVelocity riskV1DecisionsPost201ResponseRiskInformationVelocity = (RiskV1DecisionsPost201ResponseRiskInformationVelocity) o;
    return Objects.equals(this.morphing, riskV1DecisionsPost201ResponseRiskInformationVelocity.morphing) &&
        Objects.equals(this.address, riskV1DecisionsPost201ResponseRiskInformationVelocity.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(morphing, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationVelocity {\n");
    
    sb.append("    morphing: ").append(toIndentedString(morphing)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

