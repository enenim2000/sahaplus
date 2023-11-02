package com.elara.sahaplus.recover.controller;

import com.elara.sahaplus.posting.dto.response.BatchDepositUploadResponse;
import com.elara.sahaplus.recover.dto.request.CreditLoanAccountRequest;
import com.elara.sahaplus.recover.dto.request.GetOutstandingLoanBalancesRequest;
import com.elara.sahaplus.recover.dto.response.GetCurrentFinancialDateResponse;
import com.elara.sahaplus.recover.dto.response.GetOutstandingLoanBalancesResponse;
import com.elara.sahaplus.recover.service.RecoverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "Recover Module", description = "Recover Module")
@RequestMapping("/recover")
public class RecoverController {

    private final RecoverService recoverService;

    public RecoverController(RecoverService recoverService)
    {
        this.recoverService = recoverService;
    }

    @Operation(summary = "Get Current Financial Date")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Current Financial Date",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetCurrentFinancialDateResponse.class))})})
    @PostMapping("/getCurrentFinancialDateResponse")
    public GetCurrentFinancialDateResponse getCurrentFinancialDateResponse ()
            throws InvocationTargetException, IllegalAccessException {
        return recoverService.getCurrentFinancialDateResponse();
    }

    @Operation(summary = "Get Outstanding Loan Balances")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Outstanding Loan Balances",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetOutstandingLoanBalancesResponse.class))})})
    @PostMapping("/getOutstandingLoanBalancesResponse")
    public GetOutstandingLoanBalancesResponse getOutstandingLoanBalancesResponse (
            @Valid
            @RequestBody GetOutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return recoverService.getOutstandingLoanBalancesResponse(request);
    }

    @Operation(summary = "Credit Loan Account")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Credit Loan Account",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = BatchDepositUploadResponse.class))})})
    @PostMapping("/creditLoanAccount")
    public BatchDepositUploadResponse creditLoanAccount (
            @Valid
            @RequestBody CreditLoanAccountRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return recoverService.creditLoanAccount(request);
    }
}
