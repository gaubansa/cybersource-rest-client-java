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
 * Reportingv3reportsReportFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-19T16:20:04.317+05:30")
public class Reportingv3reportsReportFilters {
  @SerializedName("Application.Name")
  private List<String> applicationName = null;

  @SerializedName("firstName")
  private List<String> firstName = null;

  @SerializedName("lastName")
  private List<String> lastName = null;

  @SerializedName("email")
  private List<String> email = null;

  public Reportingv3reportsReportFilters applicationName(List<String> applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  public Reportingv3reportsReportFilters addApplicationNameItem(String applicationNameItem) {
    if (this.applicationName == null) {
      this.applicationName = new ArrayList<String>();
    }
    this.applicationName.add(applicationNameItem);
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @ApiModelProperty(value = "")
  public List<String> getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(List<String> applicationName) {
    this.applicationName = applicationName;
  }

  public Reportingv3reportsReportFilters firstName(List<String> firstName) {
    this.firstName = firstName;
    return this;
  }

  public Reportingv3reportsReportFilters addFirstNameItem(String firstNameItem) {
    if (this.firstName == null) {
      this.firstName = new ArrayList<String>();
    }
    this.firstName.add(firstNameItem);
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public List<String> getFirstName() {
    return firstName;
  }

  public void setFirstName(List<String> firstName) {
    this.firstName = firstName;
  }

  public Reportingv3reportsReportFilters lastName(List<String> lastName) {
    this.lastName = lastName;
    return this;
  }

  public Reportingv3reportsReportFilters addLastNameItem(String lastNameItem) {
    if (this.lastName == null) {
      this.lastName = new ArrayList<String>();
    }
    this.lastName.add(lastNameItem);
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public List<String> getLastName() {
    return lastName;
  }

  public void setLastName(List<String> lastName) {
    this.lastName = lastName;
  }

  public Reportingv3reportsReportFilters email(List<String> email) {
    this.email = email;
    return this;
  }

  public Reportingv3reportsReportFilters addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<String>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(List<String> email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportingv3reportsReportFilters reportingv3reportsReportFilters = (Reportingv3reportsReportFilters) o;
    return Objects.equals(this.applicationName, reportingv3reportsReportFilters.applicationName) &&
        Objects.equals(this.firstName, reportingv3reportsReportFilters.firstName) &&
        Objects.equals(this.lastName, reportingv3reportsReportFilters.lastName) &&
        Objects.equals(this.email, reportingv3reportsReportFilters.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, firstName, lastName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportingv3reportsReportFilters {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

