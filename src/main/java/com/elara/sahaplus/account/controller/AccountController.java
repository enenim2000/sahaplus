package com.elara.sahaplus.account.controller;

import com.elara.sahaplus.account.dto.request.ChangeAccountLevelRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountT3Request;
import com.elara.sahaplus.account.dto.request.GetSupportingDocumentRequest;
import com.elara.sahaplus.account.dto.request.UpdateAccountTier2Request;
import com.elara.sahaplus.account.dto.request.UpdateAccountTierRequest;
import com.elara.sahaplus.account.dto.request.UploadSupportingDocumentRequest;
import com.elara.sahaplus.account.dto.response.ChangeAccountLevelResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountT3Response;
import com.elara.sahaplus.account.dto.response.GetSupportingDocumentResponse;
import com.elara.sahaplus.account.dto.response.UpdateAccountTier2Response;
import com.elara.sahaplus.account.dto.response.UpdateAccountTierResponse;
import com.elara.sahaplus.account.dto.response.UploadSupportingDocumentResponse;
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
  public CreateCustomerAndAccountT3Response createCustomerAndAccountT3(@Valid @RequestBody CreateCustomerAndAccountT3Request request) {
    return accountService.createCustomerAndAccountT3(request);
  }

  @Operation(summary = "Change Account Level")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Change Account Level",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = ChangeAccountLevelResponse.class))})})
  @PostMapping("/ChangeAccountLevel")
  public ChangeAccountLevelResponse changeAccountLevel(@Valid @RequestBody ChangeAccountLevelRequest request) {
    return accountService.changeAccountLevel(request);
  }

  @Operation(summary = "Update Account Tier")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Update Account Tier",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = UpdateAccountTierResponse.class))})})
  @PostMapping("/UpdateAccountTier")
  public UpdateAccountTierResponse updateAccountTier(@Valid @RequestBody UpdateAccountTierRequest request) {
    return accountService.updateAccountTier(request);
  }

  @Operation(summary = "Update Account Tier2")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Update Account Tier2",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = UpdateAccountTier2Response.class))})})
  @PostMapping("/UpdateAccountTier2")
  public UpdateAccountTier2Response updateAccountTier2(@Valid @RequestBody UpdateAccountTier2Request request) {
    return accountService.updateAccountTier2(request);
  }

  @Operation(summary = "Upload Supporting Document")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Upload Supporting Document",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = UploadSupportingDocumentResponse.class))})})
  @PostMapping("/UploadSupportingDocument")
  public UploadSupportingDocumentResponse uploadSupportingDocument(@Valid @RequestBody UploadSupportingDocumentRequest request) {
    return accountService.uploadSupportingDocument(request);
  }

  @Operation(summary = "Get Supporting Document")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Get Supporting Document",
          content = {@Content(mediaType = "application/json",
              schema = @Schema(implementation = GetSupportingDocumentResponse.class))})})
  @PostMapping("/GetSupportingDocument")
  public GetSupportingDocumentResponse getSupportingDocument(@Valid @RequestBody GetSupportingDocumentRequest request) {
    return accountService.getSupportingDocument(request);
  }
}

