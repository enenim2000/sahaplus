package com.elara.sahaplus.loan.controller;

import com.elara.sahaplus.loan.dto.request.*;
import com.elara.sahaplus.loan.dto.response.*;
import com.elara.sahaplus.loan.service.LoanService;
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
@Tag(name = "Loan Module", description = "Loan Module")
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }


    @Operation(summary = "Loan Repayment Schedule")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Loan Repayment Schedule",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanRepaymentScheduleResponse.class))})})
    @GetMapping("/getLoanRepaymentSchedule")
    public LoanRepaymentScheduleResponse getLoanRepaymentSchedule (LoanRepaymentScheduleRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getLoanRepaymentSchedule(request);
    }

    @Operation(summary = "Search Loans")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Search Loans",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansResponse.class))})})
    @GetMapping("/searchLoans")
    public LoansResponse searchLoans (SearchLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.searchLoans(request);
    }

    @Operation(summary = "Search Loans By Account Officer")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Search Loans By Account Officer",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansResponse.class))})})
    @GetMapping("/searchLoansByAccountOfficer")
    public LoansResponse searchLoansByAccountOfficer (LoansByAccountOfficerRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.searchLoansByAccountOfficer(request);
    }

    @Operation(summary = "Get Loans By Customer Id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Loans By Customer Id",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansByCustomerIdResponse.class))})})
    @GetMapping("/getLoansByCustomerId")
    public LoansByCustomerIdResponse getLoansByCustomerId (LoansByCustomerIdRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getLoansByCustomerId(request);
    }

    @Operation(summary = "Get Loans By Account Number")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Loans By Account Number",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansResponse.class))})})
    @GetMapping("/getLoansByAccountNumber")
    public LoanByAccountNumberResponse getLoansByAccountNumber (LoanByAccountNumberRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getLoansByAccountNumber(request);
    }

    @Operation(summary = "Get Loans By Loan Id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Loans By Loan Id",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansResponse.class))})})
    @GetMapping("/getLoanByLoanId")
    public LoansResponse getLoanByLoanId(LoansByIdRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getLoanByLoanId(request);
    }

    @Operation(summary = "Get Par Information")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Par Information",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ParInformationResponse.class))})})
    @GetMapping("/getParInformation")
    public ParInformationResponse getParInformation(ParInformationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getParInformation(request);
    }

    @Operation(summary = "Get Profitability Par Information")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Profitability Par Information",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProfitabilityParInformationResponse.class))})})
    @GetMapping("/getProfitabilityParInformation")
    public ProfitabilityParInformationResponse getProfitabilityParInformation(ParInformationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getProfitabilityParInformation(request);
    }

    @Operation(summary = "Get Delinquent Loans")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Delinquent Loans",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoansResponse.class))})})
    @GetMapping("/getProfitabilityParInformation")
    public LoansResponse getProfitabilityParInformation(DelinquentLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getDelinquentLoans(request);
    }

    @Operation(summary = "Get Due Loans")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Due Loans",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = DueLoansResponse.class))})})
    @GetMapping("/getProfitabilityParInformation")
    public DueLoansResponse getDueLoans(DueLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanService.getDueLoans(request);
    }
}
