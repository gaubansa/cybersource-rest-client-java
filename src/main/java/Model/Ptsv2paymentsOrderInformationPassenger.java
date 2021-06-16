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

/**
 * Contains travel-related passenger details used by DM service only.
 */
@ApiModel(description = "Contains travel-related passenger details used by DM service only.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-16T13:03:35.933+05:30")
public class Ptsv2paymentsOrderInformationPassenger {
  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("nationality")
  private String nationality = null;

  public Ptsv2paymentsOrderInformationPassenger type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Passenger classification associated with the price of the ticket. You can use one of the following values: - &#x60;ADT&#x60;: Adult - &#x60;CNN&#x60;: Child - &#x60;INF&#x60;: Infant - &#x60;YTH&#x60;: Youth - &#x60;STU&#x60;: Student - &#x60;SCR&#x60;: Senior Citizen - &#x60;MIL&#x60;: Military 
   * @return type
  **/
  @ApiModelProperty(value = "Passenger classification associated with the price of the ticket. You can use one of the following values: - `ADT`: Adult - `CNN`: Child - `INF`: Infant - `YTH`: Youth - `STU`: Student - `SCR`: Senior Citizen - `MIL`: Military ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsOrderInformationPassenger status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Your company&#39;s passenger classification, such as with a frequent flyer program. In this case, you might use values such as &#x60;standard&#x60;, &#x60;gold&#x60;, or &#x60;platinum&#x60;. 
   * @return status
  **/
  @ApiModelProperty(value = "Your company's passenger classification, such as with a frequent flyer program. In this case, you might use values such as `standard`, `gold`, or `platinum`. ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Ptsv2paymentsOrderInformationPassenger phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Passenger&#39;s phone number. If the order is from outside the U.S., CyberSource recommends that you include the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). 
   * @return phone
  **/
  @ApiModelProperty(value = "Passenger's phone number. If the order is from outside the U.S., CyberSource recommends that you include the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf). ")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Ptsv2paymentsOrderInformationPassenger firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Passenger&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(value = "Passenger's first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Ptsv2paymentsOrderInformationPassenger lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Passenger&#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(value = "Passenger's last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Ptsv2paymentsOrderInformationPassenger id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the passenger to whom the ticket was issued. For example, you can use this field for the frequent flyer number. 
   * @return id
  **/
  @ApiModelProperty(value = "ID of the passenger to whom the ticket was issued. For example, you can use this field for the frequent flyer number. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ptsv2paymentsOrderInformationPassenger email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Passenger&#39;s email address, including the full domain name, such as jdoe@example.com.
   * @return email
  **/
  @ApiModelProperty(value = "Passenger's email address, including the full domain name, such as jdoe@example.com.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Ptsv2paymentsOrderInformationPassenger nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Passenger&#39;s nationality country. Use the two character [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).
   * @return nationality
  **/
  @ApiModelProperty(value = "Passenger's nationality country. Use the two character [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationPassenger ptsv2paymentsOrderInformationPassenger = (Ptsv2paymentsOrderInformationPassenger) o;
    return Objects.equals(this.type, ptsv2paymentsOrderInformationPassenger.type) &&
        Objects.equals(this.status, ptsv2paymentsOrderInformationPassenger.status) &&
        Objects.equals(this.phone, ptsv2paymentsOrderInformationPassenger.phone) &&
        Objects.equals(this.firstName, ptsv2paymentsOrderInformationPassenger.firstName) &&
        Objects.equals(this.lastName, ptsv2paymentsOrderInformationPassenger.lastName) &&
        Objects.equals(this.id, ptsv2paymentsOrderInformationPassenger.id) &&
        Objects.equals(this.email, ptsv2paymentsOrderInformationPassenger.email) &&
        Objects.equals(this.nationality, ptsv2paymentsOrderInformationPassenger.nationality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, phone, firstName, lastName, id, email, nationality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationPassenger {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
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

