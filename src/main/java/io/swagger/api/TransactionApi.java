/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ChildIdentityRequest;
import io.swagger.model.Identity;
import io.swagger.model.IdentityExample;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-23T17:05:44.642Z")

@Validated
@Api(value = "transaction", description = "the transaction API")
@RequestMapping(value = "")
public interface TransactionApi {

    @ApiOperation(value = "Retorna todas as identidades cadastradas na blockchain (get all)", nickname = "transactionQueryIdentitiesGet", notes = "", response = Identity.class, responseContainer = "List", tags={ "transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Uma lista contendo as identidades raízes mantidas pelo Entity Manager", response = Identity.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Erro ao ler identidades na blockchain") })
    @RequestMapping(value = "/transaction/query/identities",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Identity>> transactionQueryIdentitiesGet();


    @ApiOperation(value = "Retorna uma identidade cadastrada na blockchain (get by identifier)", nickname = "transactionQueryIdentityGet", notes = "", response = Identity.class, tags={ "transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Identidade que possui o identificador informado", response = Identity.class),
        @ApiResponse(code = 400, message = "Erro ao ler identidade na blockchain") })
    @RequestMapping(value = "/transaction/query/identity",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Identity> transactionQueryIdentityGet(@ApiParam(value = "identificador para o qual deseja-se consultar a identidade" ,required=true )  @Valid @RequestBody Object body);


    @ApiOperation(value = "Registra uma identidade controlada pelo entity manager (child identity)", nickname = "transactionRegisterChildEcIdentityPost", notes = "", response = IdentityExample.class, tags={ "transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Identidade registrada", response = IdentityExample.class),
        @ApiResponse(code = 400, message = "Identity não registrada") })
    @RequestMapping(value = "/transaction/register/child-ec-identity",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<IdentityExample> transactionRegisterChildEcIdentityPost(@ApiParam(value = "variáveis para obter criar uma nova identidade child" ,required=true )  @Valid @RequestBody ChildIdentityRequest body);

}
