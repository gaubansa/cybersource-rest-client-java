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
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T17:29:15.150+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard {
  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  /**
   * Type of credit card. Possible values:   * Visa (001)   * Mastercard (002) - Eurocard—European regional brand of Mastercard   * American Express (003)   * Discover (004)   * Diners Club (005)   * Carte Blanche (006)   * JCB (007)   * Optima (008)   * Twinpay Credit (011)   * Twinpay Debit (012)   * Walmart (013)   * EnRoute (014)   * Lowes consumer (015)   * Home Depot consumer (016)   * MBNA (017)   * Dicks Sportswear (018)   * Casual Corner (019)   * Sears (020)   * JAL (021)   * Disney (023)   * Maestro (024) - UK Domestic   * Sams Club consumer (025)   * Sams Club business (026)   * Nicos (027)   * Bill me later (028)   * Bebe (029)   * Restoration Hardware (030)   * Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * Solo (032)   * Visa Electron (033)   * Dankort (034)   * Laser (035)   * Carte Bleue (036) — formerly Cartes Bancaires   * Cartes Bancaires (036)   * Carta Si (037)   * pinless debit (038)   * encoded account (039)   * UATP (040)   * Household (041)   * Maestro (042) - International   * GE Money UK (043)   * Korean cards (044)   * Style (045)   * JCrew (046)   * PayEase China processing eWallet (047)   * PayEase China processing bank transfer (048)   * Meijer Private Label (049)   * Hipercard (050) — supported only by the Comercio Latino processor.   * Aura (051) — supported only by the Comercio Latino processor.   * Redecard (052)   * ORICO (053)   * Elo (054) — supported only by the Comercio Latino processor.   * Capital One Private Label (055)   * Synchrony Private Label (056)   * Costco Private Label (057)   * mada (060)   * China Union Pay (062)   * Falabella private label (063) 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VISA("visa"),
    
    MASTERCARD("mastercard"),
    
    AMERICAN_EXPRESS("american express"),
    
    DISCOVER("discover"),
    
    DINERS_CLUB("diners club"),
    
    CARTE_BLANCHE("carte blanche"),
    
    JCB("jcb"),
    
    OPTIMA("optima"),
    
    TWINPAY_CREDIT("twinpay credit"),
    
    TWINPAY_DEBIT("twinpay debit"),
    
    WALMART("walmart"),
    
    ENROUTE("enroute"),
    
    LOWES_CONSUMER("lowes consumer"),
    
    HOME_DEPOT_CONSUMER("home depot consumer"),
    
    MBNA("mbna"),
    
    DICKS_SPORTSWEAR("dicks sportswear"),
    
    CASUAL_CORNER("casual corner"),
    
    SEARS("sears"),
    
    JAL("jal"),
    
    DISNEY("disney"),
    
    MAESTRO_UK_DOMESTIC("maestro uk domestic"),
    
    SAMS_CLUB_CONSUMER("sams club consumer"),
    
    SAMS_CLUB_BUSINESS("sams club business"),
    
    NICOS("nicos"),
    
    BILL_ME_LATER("bill me later"),
    
    BEBE("bebe"),
    
    RESTORATION_HARDWARE("restoration hardware"),
    
    DELTA_ONLINE("delta online"),
    
    SOLO("solo"),
    
    VISA_ELECTRON("visa electron"),
    
    DANKORT("dankort"),
    
    LASER("laser"),
    
    CARTE_BLEUE("carte bleue"),
    
    CARTA_SI("carta si"),
    
    PINLESS_DEBIT("pinless debit"),
    
    ENCODED_ACCOUNT("encoded account"),
    
    UATP("uatp"),
    
    HOUSEHOLD("household"),
    
    MAESTRO_INTERNATIONAL("maestro international"),
    
    GE_MONEY_UK("ge money uk"),
    
    KOREAN_CARDS("korean cards"),
    
    STYLE("style"),
    
    JCREW("jcrew"),
    
    PAYEASE_CHINA_PROCESSING_EWALLET("payease china processing ewallet"),
    
    PAYEASE_CHINA_PROCESSING_BANK_TRANSFER("payease china processing bank transfer"),
    
    MEIJER_PRIVATE_LABEL("meijer private label"),
    
    HIPERCARD("hipercard"),
    
    AURA("aura"),
    
    REDECARD("redecard"),
    
    ORICO("orico"),
    
    ELO("elo"),
    
    CAPITAL_ONE_PRIVATE_LABEL("capital one private label"),
    
    SYNCHRONY_PRIVATE_LABEL("synchrony private label"),
    
    CHINA_UNION_PAY("china union pay"),
    
    COSTCO_PRIVATE_LABEL("costco private label"),
    
    MADA("mada"),
    
    FALABELLA_PRIVATE_LABEL("falabella private label");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("useAs")
  private String useAs = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the credit card expires. Format: &#x60;MM&#x60; Possible values: &#x60;01&#x60; through &#x60;12&#x60;  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For more information about relaxed requirements, see the TMS REST API Developer Guide.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "Two-digit month in which the credit card expires. Format: `MM` Possible values: `01` through `12`  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For more information about relaxed requirements, see the TMS REST API Developer Guide.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires. Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;.  **FDC Nashville Global and FDMS South** You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See Relaxed Requirements for Address Data and Expiration Date page.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting.&#39; 
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2022", value = "Four-digit year in which the credit card expires. Format: `YYYY`. Possible values: `1900` through `2099`.  **FDC Nashville Global and FDMS South** You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. See Relaxed Requirements for Address Data and Expiration Date page.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting.' ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of credit card. Possible values:   * Visa (001)   * Mastercard (002) - Eurocard—European regional brand of Mastercard   * American Express (003)   * Discover (004)   * Diners Club (005)   * Carte Blanche (006)   * JCB (007)   * Optima (008)   * Twinpay Credit (011)   * Twinpay Debit (012)   * Walmart (013)   * EnRoute (014)   * Lowes consumer (015)   * Home Depot consumer (016)   * MBNA (017)   * Dicks Sportswear (018)   * Casual Corner (019)   * Sears (020)   * JAL (021)   * Disney (023)   * Maestro (024) - UK Domestic   * Sams Club consumer (025)   * Sams Club business (026)   * Nicos (027)   * Bill me later (028)   * Bebe (029)   * Restoration Hardware (030)   * Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * Solo (032)   * Visa Electron (033)   * Dankort (034)   * Laser (035)   * Carte Bleue (036) — formerly Cartes Bancaires   * Cartes Bancaires (036)   * Carta Si (037)   * pinless debit (038)   * encoded account (039)   * UATP (040)   * Household (041)   * Maestro (042) - International   * GE Money UK (043)   * Korean cards (044)   * Style (045)   * JCrew (046)   * PayEase China processing eWallet (047)   * PayEase China processing bank transfer (048)   * Meijer Private Label (049)   * Hipercard (050) — supported only by the Comercio Latino processor.   * Aura (051) — supported only by the Comercio Latino processor.   * Redecard (052)   * ORICO (053)   * Elo (054) — supported only by the Comercio Latino processor.   * Capital One Private Label (055)   * Synchrony Private Label (056)   * Costco Private Label (057)   * mada (060)   * China Union Pay (062)   * Falabella private label (063) 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of credit card. Possible values:   * Visa (001)   * Mastercard (002) - Eurocard—European regional brand of Mastercard   * American Express (003)   * Discover (004)   * Diners Club (005)   * Carte Blanche (006)   * JCB (007)   * Optima (008)   * Twinpay Credit (011)   * Twinpay Debit (012)   * Walmart (013)   * EnRoute (014)   * Lowes consumer (015)   * Home Depot consumer (016)   * MBNA (017)   * Dicks Sportswear (018)   * Casual Corner (019)   * Sears (020)   * JAL (021)   * Disney (023)   * Maestro (024) - UK Domestic   * Sams Club consumer (025)   * Sams Club business (026)   * Nicos (027)   * Bill me later (028)   * Bebe (029)   * Restoration Hardware (030)   * Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * Solo (032)   * Visa Electron (033)   * Dankort (034)   * Laser (035)   * Carte Bleue (036) — formerly Cartes Bancaires   * Cartes Bancaires (036)   * Carta Si (037)   * pinless debit (038)   * encoded account (039)   * UATP (040)   * Household (041)   * Maestro (042) - International   * GE Money UK (043)   * Korean cards (044)   * Style (045)   * JCrew (046)   * PayEase China processing eWallet (047)   * PayEase China processing bank transfer (048)   * Meijer Private Label (049)   * Hipercard (050) — supported only by the Comercio Latino processor.   * Aura (051) — supported only by the Comercio Latino processor.   * Redecard (052)   * ORICO (053)   * Elo (054) — supported only by the Comercio Latino processor.   * Capital One Private Label (055)   * Synchrony Private Label (056)   * Costco Private Label (057)   * mada (060)   * China Union Pay (062)   * Falabella private label (063) ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard issueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Number of times a Maestro (UK Domestic) card has been issued to the account holder.
   * @return issueNumber
  **/
  @ApiModelProperty(example = "01", value = "Number of times a Maestro (UK Domestic) card has been issued to the account holder.")
  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Month of the start of the Maestro (UK Domestic) card validity period.  Format: &#x60;MM&#x60;. Possible values: &#x60;01&#x60; through &#x60;12&#x60;. 
   * @return startMonth
  **/
  @ApiModelProperty(example = "12", value = "Month of the start of the Maestro (UK Domestic) card validity period.  Format: `MM`. Possible values: `01` through `12`. ")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Year of the start of the Maestro (UK Domestic) card validity period.  Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;. 
   * @return startYear
  **/
  @ApiModelProperty(example = "2022", value = "Year of the start of the Maestro (UK Domestic) card validity period.  Format: `YYYY`. Possible values: `1900` through `2099`. ")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * Card Use As Field. Supported value of &#x60;pinless debit&#x60; only. Only for use with Pinless Debit tokens.
   * @return useAs
  **/
  @ApiModelProperty(example = "pinless debit", value = "Card Use As Field. Supported value of `pinless debit` only. Only for use with Pinless Debit tokens.")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard) o;
    return Objects.equals(this.expirationMonth, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.expirationYear) &&
        Objects.equals(this.type, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.type) &&
        Objects.equals(this.issueNumber, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.issueNumber) &&
        Objects.equals(this.startMonth, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.startMonth) &&
        Objects.equals(this.startYear, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.startYear) &&
        Objects.equals(this.useAs, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard.useAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationMonth, expirationYear, type, issueNumber, startMonth, startYear, useAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseCard {\n");
    
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
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

