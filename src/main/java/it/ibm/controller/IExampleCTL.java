/**
 * 
 */
package it.ibm.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping(path = "/v1/api")
@Tag(name = "Servizio di prova")
public interface IExampleCTL {

	@GetMapping("/echo")
	@Operation(summary = "Restituisce eco", description = "Servizio che restituisce il messaggio in input.")
	@ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = String.class)))
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Echo eseguita"),
							@ApiResponse(responseCode = "400", description = "Bad Request"),
							@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	String echo(String word);

}
