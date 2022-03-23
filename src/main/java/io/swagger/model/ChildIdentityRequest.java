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
 * ChildIdentityRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class ChildIdentityRequest   {
  @JsonProperty("context")
  private String context = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("controlledBy")
  private String controlledBy = null;

  @JsonProperty("controllerKid")
  private String controllerKid = null;

  @JsonProperty("subjectInfo")
  private Object subjectInfo = null;

  @JsonProperty("publicKeyJwk")
  private Object publicKeyJwk = null;

  public ChildIdentityRequest context(String context) {
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

  public ChildIdentityRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * identificador da identidade que será armazenada na blockchain
   * @return identifier
  **/
  @ApiModelProperty(example = "lsdi:ufma:br/dispositivo/1", value = "identificador da identidade que será armazenada na blockchain")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ChildIdentityRequest controlledBy(String controlledBy) {
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

  public ChildIdentityRequest controllerKid(String controllerKid) {
    this.controllerKid = controllerKid;
    return this;
  }

  /**
   * Identificador da chave controladora do Entity Manager (localmente armazenada)
   * @return controllerKid
  **/
  @ApiModelProperty(example = "key-identifier-entity-manager-1", value = "Identificador da chave controladora do Entity Manager (localmente armazenada)")


  public String getControllerKid() {
    return controllerKid;
  }

  public void setControllerKid(String controllerKid) {
    this.controllerKid = controllerKid;
  }

  public ChildIdentityRequest subjectInfo(Object subjectInfo) {
    this.subjectInfo = subjectInfo;
    return this;
  }

  /**
   * Informações que descrevem o sujeito possuidor da identidade
   * @return subjectInfo
  **/
  @ApiModelProperty(example = "{\"nome\":\"Identidade do Dispositivo de IoT\",\"administrador\":\"André Cardoso\",\"localizacao\":\"LSDi\",\"tipo_de_sensor\":\"Temperatura\"}", value = "Informações que descrevem o sujeito possuidor da identidade")


  public Object getSubjectInfo() {
    return subjectInfo;
  }

  public void setSubjectInfo(Object subjectInfo) {
    this.subjectInfo = subjectInfo;
  }

  public ChildIdentityRequest publicKeyJwk(Object publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
    return this;
  }

  /**
   * Componente pública da chave criptográfica da identidade
   * @return publicKeyJwk
  **/
  @ApiModelProperty(example = "{\"kty\":\"EC\",\"crv\":\"P-256\",\"use\":\"sig\",\"kid\":\"key-identifier-dispositivo-1\",\"x\":\"AY9f6_8Tx14jYhtVBt6VmADB7YlmjOm5jY3m6tvIu4f-YOYeUWtZu_stolu29dN-oDatqrK3pU3gNjib6Lsxn514\",\"y\":\"ATuUadBovnei3CQXC7Km5JOP0sykV91qcIXxn8d0P_-3-TGEGTj85e4TbNBjTfn3gULU6VlEvQ-SyS6dvn6JVk6d\",\"alg\":\"ES256\"}", value = "Componente pública da chave criptográfica da identidade")


  public Object getPublicKeyJwk() {
    return publicKeyJwk;
  }

  public void setPublicKeyJwk(Object publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildIdentityRequest childIdentityRequest = (ChildIdentityRequest) o;
    return Objects.equals(this.context, childIdentityRequest.context) &&
        Objects.equals(this.identifier, childIdentityRequest.identifier) &&
        Objects.equals(this.controlledBy, childIdentityRequest.controlledBy) &&
        Objects.equals(this.controllerKid, childIdentityRequest.controllerKid) &&
        Objects.equals(this.subjectInfo, childIdentityRequest.subjectInfo) &&
        Objects.equals(this.publicKeyJwk, childIdentityRequest.publicKeyJwk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, identifier, controlledBy, controllerKid, subjectInfo, publicKeyJwk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildIdentityRequest {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    controlledBy: ").append(toIndentedString(controlledBy)).append("\n");
    sb.append("    controllerKid: ").append(toIndentedString(controllerKid)).append("\n");
    sb.append("    subjectInfo: ").append(toIndentedString(subjectInfo)).append("\n");
    sb.append("    publicKeyJwk: ").append(toIndentedString(publicKeyJwk)).append("\n");
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

