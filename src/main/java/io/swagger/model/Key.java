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
 * Key
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")


public class Key   {
  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("crv")
  private String crv = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  @JsonProperty("alg")
  private String alg = null;

  public Key kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * 
   * @return kty
  **/
  @ApiModelProperty(example = "EC", value = "")


  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public Key use(String use) {
    this.use = use;
    return this;
  }

  /**
   * 
   * @return use
  **/
  @ApiModelProperty(example = "sig", value = "")


  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public Key crv(String crv) {
    this.crv = crv;
    return this;
  }

  /**
   * 
   * @return crv
  **/
  @ApiModelProperty(example = "P-256", value = "")


  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public Key kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * 
   * @return kid
  **/
  @ApiModelProperty(example = "entity-manager-1", value = "")


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public Key x(String x) {
    this.x = x;
    return this;
  }

  /**
   * 
   * @return x
  **/
  @ApiModelProperty(example = "66ciVsALILhJfNvroUffP_H5p7fELXyAz_RETe_IzfA", value = "")


  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public Key y(String y) {
    this.y = y;
    return this;
  }

  /**
   * 
   * @return y
  **/
  @ApiModelProperty(example = "dOipgii43rW-qrKGzYp5kENxzViFp_nlTilkWXbCTLM", value = "")


  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }

  public Key alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * 
   * @return alg
  **/
  @ApiModelProperty(example = "ES256", value = "")


  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Key key = (Key) o;
    return Objects.equals(this.kty, key.kty) &&
        Objects.equals(this.use, key.use) &&
        Objects.equals(this.crv, key.crv) &&
        Objects.equals(this.kid, key.kid) &&
        Objects.equals(this.x, key.x) &&
        Objects.equals(this.y, key.y) &&
        Objects.equals(this.alg, key.alg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kty, use, crv, kid, x, y, alg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Key {\n");
    
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
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

