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
 * Identity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class Identity   {
  @JsonProperty("context")
  private String context = null;

  @JsonProperty("controlledBy")
  private String controlledBy = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("issuedAt")
  private String issuedAt = null;

  @JsonProperty("publicKeyJwk")
  private Object publicKeyJwk = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("subjectInfo")
  private Object subjectInfo = null;

  @JsonProperty("validTo")
  private String validTo = null;

  public Identity context(String context) {
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

  public Identity controlledBy(String controlledBy) {
    this.controlledBy = controlledBy;
    return this;
  }

  /**
   * Identificador da Identidade Controladora 
   * @return controlledBy
  **/
  @ApiModelProperty(example = "lsdi:ufma:br/entity-manager/1", value = "Identificador da Identidade Controladora ")


  public String getControlledBy() {
    return controlledBy;
  }

  public void setControlledBy(String controlledBy) {
    this.controlledBy = controlledBy;
  }

  public Identity identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * identificador da Identidade
   * @return identifier
  **/
  @ApiModelProperty(example = "lsdi:ufma:br/entity-manager/1", value = "identificador da Identidade")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Identity issuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Data de emissão da identidade
   * @return issuedAt
  **/
  @ApiModelProperty(example = "Thu Mar 03 08:55:18 GMT 2022", value = "Data de emissão da identidade")


  public String getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(String issuedAt) {
    this.issuedAt = issuedAt;
  }

  public Identity publicKeyJwk(Object publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
    return this;
  }

  /**
   * Componente pública da chave criptográfica da identidade
   * @return publicKeyJwk
  **/
  @ApiModelProperty(example = "{\"kty\":\"EC\",\"crv\":\"P-256\",\"use\":\"sig\",\"kid\":\"key-identifier-entity-manager-1\",\"x\":\"AY9f6_8Tx14jYhtVBt6VmADB7YlmjOm5jY3m6tvIu4f-YOYeUWtZu_stolu29dN-oDatqrK3pU3gNjib6Lsxn514\",\"y\":\"ATuUadBovnei3CQXC7Km5JOP0sykV91qcIXxn8d0P_-3-TGEGTj85e4TbNBjTfn3gULU6VlEvQ-SyS6dvn6JVk6d\",\"alg\":\"ES256\"}", value = "Componente pública da chave criptográfica da identidade")


  public Object getPublicKeyJwk() {
    return publicKeyJwk;
  }

  public void setPublicKeyJwk(Object publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
  }

  public Identity status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status atual da Identidade
   * @return status
  **/
  @ApiModelProperty(example = "active", value = "status atual da Identidade")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Identity subjectInfo(Object subjectInfo) {
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

  public Identity validTo(String validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Data de validade da identidade
   * @return validTo
  **/
  @ApiModelProperty(example = "Thu Mar 03 08:55:18 GMT 2023", value = "Data de validade da identidade")


  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.context, identity.context) &&
        Objects.equals(this.controlledBy, identity.controlledBy) &&
        Objects.equals(this.identifier, identity.identifier) &&
        Objects.equals(this.issuedAt, identity.issuedAt) &&
        Objects.equals(this.publicKeyJwk, identity.publicKeyJwk) &&
        Objects.equals(this.status, identity.status) &&
        Objects.equals(this.subjectInfo, identity.subjectInfo) &&
        Objects.equals(this.validTo, identity.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, controlledBy, identifier, issuedAt, publicKeyJwk, status, subjectInfo, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    controlledBy: ").append(toIndentedString(controlledBy)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    publicKeyJwk: ").append(toIndentedString(publicKeyJwk)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectInfo: ").append(toIndentedString(subjectInfo)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

