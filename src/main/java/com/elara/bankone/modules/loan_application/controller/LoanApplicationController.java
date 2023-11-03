package com.elara.bankone.modules.loan_application.controller;

import com.elara.bankone.modules.loan_application.dto.request.GeepDisbursedLoansInfoRequest;
import com.elara.bankone.modules.loan_application.dto.request.LoanCreationApplicationRequest;
import com.elara.bankone.modules.loan_application.dto.response.*;
import com.elara.bankone.modules.loan_application.service.LoanApplicationService;
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
@Tag(name = "Loan Creation Application Module", description = "Loan Creation Application Module")
@RequestMapping("/loanCreationApplication")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    public LoanApplicationController(LoanApplicationService loanApplicationService)
    {
        this.loanApplicationService = loanApplicationService;
    }


    @Operation(summary = "Loan Creation Application")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Loan Creation Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanCreationApplicationResponse.class))})})
    @GetMapping("/createLoanApplication")
    public LoanCreationApplicationResponse createLoanApplication (LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.createLoanApplication(request);
    }

    @Operation(summary = "Loan Creation Application")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Loan Creation Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanCreationApplicationResponse2.class))})})
    @GetMapping("/createLoanApplication2")
    public LoanCreationApplicationResponse2 createLoanApplication2 (LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.createLoanApplication2(request);
    }

    @Operation(summary = "View Completed Loan Repayment")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "View Completed Loan Repayment",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CompletedLoanRepaymentResponse.class))})})
    @GetMapping("/getCompletedLoanRepayments")
    public CompletedLoanRepaymentResponse getCompletedLoanRepayments ()
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.getCompletedLoanRepayment();
    }

    @Operation(summary = "View Completed Loan Application")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "View Completed Loan Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CompletedLoanApplicationResponse.class))})})
    @GetMapping("/getCompletedLoanApplication")
    public CompletedLoanApplicationResponse getCompletedLoanApplication()
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.getCompletedLoanApplication();
    }

    @Operation(summary = "Get Approved Loans")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Approved Loans",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ApprovedLoansResponse.class))})})
    @GetMapping("/getApprovedLoans")
    public ApprovedLoansResponse getApprovedLoans()
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.getApprovedLoans();
    }

    @Operation(summary = "Get Completed Disbursed Loans")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Completed Disbursed Loans",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CompletedDisbursedLoansResponse.class))})})
    @GetMapping("/getCompletedDisbursedLoans")
    public CompletedDisbursedLoansResponse getCompletedDisbursedLoans()
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.getCompletedDisbursedLoans();
    }

    @Operation(summary = "Get Geep Disbursed Loans Info")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Geep Disbursed Loans Info",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = GeepDisbursedLoansInfoResponse.class))})})
    @GetMapping("/getGeepDisbursedLoansInfo")
    public GeepDisbursedLoansInfoResponse getGeepDisbursedLoansInfo(GeepDisbursedLoansInfoRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.getGeepDisbursedLoansInfo(request);
    }
}
