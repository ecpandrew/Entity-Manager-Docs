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
 * TokenRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class TokenRequest   {
  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("kid")
  private String kid = null;

  public TokenRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Identificador da Identidade do Entity Manager
   * @return identifier
  **/
  @ApiModelProperty(example = "lsdi:ufma:br/entity-manager/1", value = "Identificador da Identidade do Entity Manager")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public TokenRequest kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Identificador da chave privada correspondente ao identificador informado
   * @return kid
  **/
  @ApiModelProperty(example = "key-identifier-entity-manager-1", value = "Identificador da chave privada correspondente ao identificador informado")


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequest tokenRequest = (TokenRequest) o;
    return Objects.equals(this.identifier, tokenRequest.identifier) &&
        Objects.equals(this.kid, tokenRequest.kid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, kid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequest {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
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

