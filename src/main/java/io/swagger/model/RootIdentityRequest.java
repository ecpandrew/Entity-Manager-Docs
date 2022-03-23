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
 * RootIdentityRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class RootIdentityRequest   {
  @JsonProperty("context")
  private String context = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("curve")
  private String curve = null;

  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("subjectInfo")
  private Object subjectInfo = null;

  public RootIdentityRequest context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Uma string qualquer para identificar o contexto da identidade
   * @return context
  **/
  @ApiModelProperty(example = "http://lsdi.ufma.br", value = "Uma string qualquer para identificar o contexto da identidade")


  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public RootIdentityRequest kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * o identificador (KeyIdentifier) atribuído ao par de chaves que será gerado
   * @return kid
  **/
  @ApiModelProperty(example = "key-identifier-entity-manager-1", value = "o identificador (KeyIdentifier) atribuído ao par de chaves que será gerado")


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public RootIdentityRequest curve(String curve) {
    this.curve = curve;
    return this;
  }

  /**
   * curva eliptica utilizada para gerar as chaves criptográficas
   * @return curve
  **/
  @ApiModelProperty(example = "P-256", value = "curva eliptica utilizada para gerar as chaves criptográficas")


  public String getCurve() {
    return curve;
  }

  public void setCurve(String curve) {
    this.curve = curve;
  }

  public RootIdentityRequest alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * algoritmo utilizado para gerar as chaves criptográficas
   * @return alg
  **/
  @ApiModelProperty(example = "ES256", value = "algoritmo utilizado para gerar as chaves criptográficas")


  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public RootIdentityRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * identificador da identidade raiz que será armazenada na blockchain
   * @return identifier
  **/
  @ApiModelProperty(example = "lsdi:ufma:br/entity-manager/1", value = "identificador da identidade raiz que será armazenada na blockchain")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public RootIdentityRequest subjectInfo(Object subjectInfo) {
    this.subjectInfo = subjectInfo;
    return this;
  }

  /**
   * Informações que descrevem o sujeito possuidor da identidade
   * @return subjectInfo
  **/
  @ApiModelProperty(example = "{\"nome\":\"Identidade do Entity Manager 1\",\"administrador\":\"André Cardoso\",\"qualquer_outra_propriedade\":\"Valor desejado\"}", value = "Informações que descrevem o sujeito possuidor da identidade")


  public Object getSubjectInfo() {
    return subjectInfo;
  }

  public void setSubjectInfo(Object subjectInfo) {
    this.subjectInfo = subjectInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootIdentityRequest rootIdentityRequest = (RootIdentityRequest) o;
    return Objects.equals(this.context, rootIdentityRequest.context) &&
        Objects.equals(this.kid, rootIdentityRequest.kid) &&
        Objects.equals(this.curve, rootIdentityRequest.curve) &&
        Objects.equals(this.alg, rootIdentityRequest.alg) &&
        Objects.equals(this.identifier, rootIdentityRequest.identifier) &&
        Objects.equals(this.subjectInfo, rootIdentityRequest.subjectInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, kid, curve, alg, identifier, subjectInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootIdentityRequest {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    subjectInfo: ").append(toIndentedString(subjectInfo)).append("\n");
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

