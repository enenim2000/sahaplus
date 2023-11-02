package com.elara.sahaplus.outstanding_loan.controller;

import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanBalancesByLinkedAccountNoRequest;
import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanBalancesRequest;
import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanRequest;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanBalancesByLinkedAccountNoResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanBalancesResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.PaymentsThatReducesOutsLoanBalancesResponse;
import com.elara.sahaplus.outstanding_loan.service.OutstandingLoanService;
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
@Tag(name = "Outstanding Loan Module", description = "Outstanding Loan Module")
@RequestMapping("/outstanding-loan")
public class OutstandingLoanController {

    private final OutstandingLoanService outstandingLoanService;

    public OutstandingLoanController(OutstandingLoanService outstandingLoanService)
    {
        this.outstandingLoanService = outstandingLoanService;
    }

    @Operation(summary = "Get Total Repayment Amount")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Total Repayment Amount",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = OutstandingLoanResponse.class))})})
    @PostMapping("/getTotalRepaymentAmount")
    public OutstandingLoanResponse getTotalRepaymentAmount (
            @Valid
            @RequestBody OutstandingLoanRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return outstandingLoanService.getTotalRepaymentAmount(request);
    }

    @Operation(summary = "Get Loan Schedules")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Loan Schedules",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = OutstandingLoanResponse.class))})})
    @PostMapping("/getLoanSchedules")
    public OutstandingLoanResponse getLoanSchedules (
            @Valid
            @RequestBody OutstandingLoanRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return outstandingLoanService.getLoanSchedules(request);
    }

    @Operation(summary = "Get Outstanding Loan Balance")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Outstanding Loan Balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = OutstandingLoanBalancesResponse.class))})})
    @PostMapping("/getOutstandingLoanBalance")
    public OutstandingLoanBalancesResponse getOutstandingLoanBalance (
            @Valid
            @RequestBody OutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return outstandingLoanService.getOutstandingLoanBalance(request);
    }

    @Operation(summary = "Get Outstanding Loan Balance By Linked Account Number")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Outstanding Loan Balance",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = OutstandingLoanBalancesByLinkedAccountNoResponse.class))})})
    @PostMapping("/getOutstandingLoanBalanceByLinkedAccountNoResponse")
    public OutstandingLoanBalancesByLinkedAccountNoResponse getOutstandingLoanBalanceByLinkedAccountNoResponse (
            @Valid
            @RequestBody OutstandingLoanBalancesByLinkedAccountNoRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return outstandingLoanService.getOutstandingLoanBalanceByLinkedAccountNoResponse(request);
    }

    @Operation(summary = "Get Payments That Reduces Outs Loan Balances")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Payments That Reduces Outs Loan Balances",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = PaymentsThatReducesOutsLoanBalancesResponse.class))})})
    @PostMapping("/getPaymentsThatReducesOutsLoanBalances")
    public PaymentsThatReducesOutsLoanBalancesResponse getPaymentsThatReducesOutsLoanBalances (
            @Valid
            @RequestBody OutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return outstandingLoanService.getPaymentsThatReducesOutsLoanBalances(request);
    }
}
