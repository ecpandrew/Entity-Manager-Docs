package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnrollmentRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class EnrollmentRequest   {
  @JsonProperty("caUrl")
  private String caUrl = null;

  @JsonProperty("caName")
  private String caName = null;

  @JsonProperty("pemTLSCert")
  private String pemTLSCert = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userAffiliation")
  private String userAffiliation = null;

  @JsonProperty("mspId")
  private String mspId = null;

  @JsonProperty("enrollmentUsername")
  private String enrollmentUsername = null;

  @JsonProperty("enrollmentSecret")
  private String enrollmentSecret = null;

  public EnrollmentRequest caUrl(String caUrl) {
    this.caUrl = caUrl;
    return this;
  }

  /**
   * url da autoridade certificadora (fabric-ca)
   * @return caUrl
  **/
  @ApiModelProperty(example = "https://localhost:9081", value = "url da autoridade certificadora (fabric-ca)")


  public String getCaUrl() {
    return caUrl;
  }

  public void setCaUrl(String caUrl) {
    this.caUrl = caUrl;
  }

  public EnrollmentRequest caName(String caName) {
    this.caName = caName;
    return this;
  }

  /**
   * nome da autoridade certificadora (fabric-ca)
   * @return caName
  **/
  @ApiModelProperty(example = "org1CA", value = "nome da autoridade certificadora (fabric-ca)")


  public String getCaName() {
    return caName;
  }

  public void setCaName(String caName) {
    this.caName = caName;
  }

  public EnrollmentRequest pemTLSCert(String pemTLSCert) {
    this.pemTLSCert = pemTLSCert;
    return this;
  }

  /**
   * certificado digital (TLS) da autoridade certificadora no formato PEM
   * @return pemTLSCert
  **/
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE-----  <enter certificade here>  -----END CERTIFICATE-----", value = "certificado digital (TLS) da autoridade certificadora no formato PEM")


  public String getPemTLSCert() {
    return pemTLSCert;
  }

  public void setPemTLSCert(String pemTLSCert) {
    this.pemTLSCert = pemTLSCert;
  }

  public EnrollmentRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * nome do usuario administrador do entity manager
   * @return userName
  **/
  @ApiModelProperty(example = "André Cardoso", value = "nome do usuario administrador do entity manager")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public EnrollmentRequest userAffiliation(String userAffiliation) {
    this.userAffiliation = userAffiliation;
    return this;
  }

  /**
   * nome da organização (hyperledger) a qual o Entity Manager pertence
   * @return userAffiliation
  **/
  @ApiModelProperty(example = "Org1", value = "nome da organização (hyperledger) a qual o Entity Manager pertence")


  public String getUserAffiliation() {
    return userAffiliation;
  }

  public void setUserAffiliation(String userAffiliation) {
    this.userAffiliation = userAffiliation;
  }

  public EnrollmentRequest mspId(String mspId) {
    this.mspId = mspId;
    return this;
  }

  /**
   * identificador do MSP (membership service providedr) da organização a qual o Entity Manager pertence
   * @return mspId
  **/
  @ApiModelProperty(example = "Org1MSP", value = "identificador do MSP (membership service providedr) da organização a qual o Entity Manager pertence")


  public String getMspId() {
    return mspId;
  }

  public void setMspId(String mspId) {
    this.mspId = mspId;
  }

  public EnrollmentRequest enrollmentUsername(String enrollmentUsername) {
    this.enrollmentUsername = enrollmentUsername;
    return this;
  }

  /**
   * nome de usuário atribuído ao Entity Manager pelo administrador da blockchain
   * @return enrollmentUsername
  **/
  @ApiModelProperty(example = "manager", value = "nome de usuário atribuído ao Entity Manager pelo administrador da blockchain")


  public String getEnrollmentUsername() {
    return enrollmentUsername;
  }

  public void setEnrollmentUsername(String enrollmentUsername) {
    this.enrollmentUsername = enrollmentUsername;
  }

  public EnrollmentRequest enrollmentSecret(String enrollmentSecret) {
    this.enrollmentSecret = enrollmentSecret;
    return this;
  }

  /**
   * senha atribuída ao Entity Manager pelo administrador da blockchain
   * @return enrollmentSecret
  **/
  @ApiModelProperty(example = "password", value = "senha atribuída ao Entity Manager pelo administrador da blockchain")


  public String getEnrollmentSecret() {
    return enrollmentSecret;
  }

  public void setEnrollmentSecret(String enrollmentSecret) {
    this.enrollmentSecret = enrollmentSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentRequest enrollmentRequest = (EnrollmentRequest) o;
    return Objects.equals(this.caUrl, enrollmentRequest.caUrl) &&
        Objects.equals(this.caName, enrollmentRequest.caName) &&
        Objects.equals(this.pemTLSCert, enrollmentRequest.pemTLSCert) &&
        Objects.equals(this.userName, enrollmentRequest.userName) &&
        Objects.equals(this.userAffiliation, enrollmentRequest.userAffiliation) &&
        Objects.equals(this.mspId, enrollmentRequest.mspId) &&
        Objects.equals(this.enrollmentUsername, enrollmentRequest.enrollmentUsername) &&
        Objects.equals(this.enrollmentSecret, enrollmentRequest.enrollmentSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caUrl, caName, pemTLSCert, userName, userAffiliation, mspId, enrollmentUsername, enrollmentSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentRequest {\n");
    
    sb.append("    caUrl: ").append(toIndentedString(caUrl)).append("\n");
    sb.append("    caName: ").append(toIndentedString(caName)).append("\n");
    sb.append("    pemTLSCert: ").append(toIndentedString(pemTLSCert)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userAffiliation: ").append(toIndentedString(userAffiliation)).append("\n");
    sb.append("    mspId: ").append(toIndentedString(mspId)).append("\n");
    sb.append("    enrollmentUsername: ").append(toIndentedString(enrollmentUsername)).append("\n");
    sb.append("    enrollmentSecret: ").append(toIndentedString(enrollmentSecret)).append("\n");
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

