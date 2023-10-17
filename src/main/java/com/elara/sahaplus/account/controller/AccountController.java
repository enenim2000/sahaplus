package com.elara.sahaplus.account.controller;

import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountT3Request;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountT3Response;
import com.elara.sahaplus.account.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Account Module", description = "Account Module")
@RequestMapping("/Account")
public class AccountController {

  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @Operation(summary = "Create Customer And Account")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Create Customer And Account",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = CreateCustomerAndAccountResponse.class))})})
  @PostMapping("/CreateCustomerAndAccount")
  public CreateCustomerAndAccountResponse createCustomerAndAccount(@Valid @RequestBody CreateCustomerAndAccountRequest request) {
    return accountService.createCustomerAndAccount(request);
  }

  @Operation(summary = "Create Customer And Account as Tier 3")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Create Customer And Account as Tier 3",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = CreateCustomerAndAccountT3Response.class))})})
  @PostMapping("/CreateCustomerAndAccountT3")
  public CreateCustomerAndAccountT3Response CreateCustomerAndAccountT3(@Valid @RequestBody CreateCustomerAndAccountT3Request request) {
    return accountService.createCustomerAndAccountT3(request);
  }
}

