package com.elara.sahaplus.loan.controller;

import com.elara.sahaplus.loan.dto.request.LoanRepaymentScheduleRequest;
import com.elara.sahaplus.loan.dto.request.LoansByAccountOfficerRequest;
import com.elara.sahaplus.loan.dto.request.SearchLoansRequest;
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
}
