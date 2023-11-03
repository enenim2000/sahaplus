package com.elara.bankone.modules.loan_account.controller;

import com.elara.bankone.modules.loan_account.dto.request.LoanAccountBalanceRequest;
import com.elara.bankone.modules.loan_account.dto.request.LoanAccountBalanceRequest2;
import com.elara.bankone.modules.loan_account.dto.request.LoanAccountStatementRequest;
import com.elara.bankone.modules.loan_account.dto.response.LoanAccountBalanceResponse;
import com.elara.bankone.modules.loan_account.dto.response.LoanAccountStatementResponse;
import com.elara.bankone.modules.loan_account.service.LoanAccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "Loan Account Module", description = "Loan Account Module")
@RequestMapping("/loan-account")
public class LoanAccountController {

    private final LoanAccountService loanAccountService;

    public LoanAccountController(LoanAccountService loanAccountService) {
        this.loanAccountService = loanAccountService;
    }

    @Operation(summary = "Get Loan Account Balance")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get Loan Account Balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanAccountBalanceResponse.class))})})
    @GetMapping("/getLoanAccountBalance")
    public LoanAccountBalanceResponse getLoanAccountBalance (LoanAccountBalanceRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanAccountService.getLoanAccountBalance(request);
    }

    @Operation(summary = "Get Loan Account Balance")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get Loan Account Balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanAccountBalanceResponse.class))})})
    @GetMapping("/getLoanAccountBalance2")
    public LoanAccountBalanceResponse getLoanAccountBalance (LoanAccountBalanceRequest2 request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanAccountService.getLoanAccountBalance(request);
    }

    @Operation(summary = "Get Loan Account Statement")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get Loan Account Statement",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanAccountStatementResponse.class))})})
    @GetMapping("/getLoanAccountStatement")
    public LoanAccountStatementResponse getLoanAccountStatement(LoanAccountStatementRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanAccountService.getLoanAccountStatement(request);
    }
}
