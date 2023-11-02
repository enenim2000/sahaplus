package com.elara.sahaplus.outstanding_loan.service;

import com.elara.sahaplus.outstanding_loan.dto.backbone.*;
import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanBalancesByLinkedAccountNoRequest;
import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanBalancesRequest;
import com.elara.sahaplus.outstanding_loan.dto.request.OutstandingLoanRequest;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanBalancesByLinkedAccountNoResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanBalancesResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.OutstandingLoanResponse;
import com.elara.sahaplus.outstanding_loan.dto.response.PaymentsThatReducesOutsLoanBalancesResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class OutstandingLoanService {

    private final HttpClient httpClient;

    public OutstandingLoanService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public OutstandingLoanResponse getTotalRepaymentAmount (
            OutstandingLoanRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new OutstandingLoanRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("TOTAL_REPAYMENT_AMOUNT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, OutstandingLoanResponseDto.class, HttpMethod.GET,
                "/OutstandingLoan/GetTotalRepaymentAmount");

        var response = new OutstandingLoanResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("TOTAL_REPAYMENT_AMOUNT_RESPONSE: {}", response);

        return response;
    }

    public OutstandingLoanResponse getLoanSchedules (
            OutstandingLoanRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new OutstandingLoanRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_SCHEDULES_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, OutstandingLoanResponseDto.class, HttpMethod.GET,
                "/OutstandingLoan/GetLoanSchedules");

        var response = new OutstandingLoanResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_SCHEDULES_RESPONSE: {}", response);

        return response;
    }

    public OutstandingLoanBalancesResponse getOutstandingLoanBalance (
            OutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new OutstandingLoanBalancesRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("OUTSTANDING_LOAN_BALANCE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, OutstandingLoanBalancesResponseDto.class, HttpMethod.GET,
                "/OutstandingLoan/GetOutstandingLoanBalances");

        var response = new OutstandingLoanBalancesResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("OUTSTANDING_LOAN_BALANCE_RESPONSE: {}", response);

        return response;
    }

    public OutstandingLoanBalancesByLinkedAccountNoResponse getOutstandingLoanBalanceByLinkedAccountNoResponse (
            OutstandingLoanBalancesByLinkedAccountNoRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new OutstandingLoanBalancesByLinkedAccountNoRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("OUTSTANDING_LOAN_BALANCE_BY_LINKED_ACCOUNT_NO_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, OutstandingLoanBalancesByLinkedAccountNoResponseDto.class, HttpMethod.GET,
                "/OutstandingLoan/GetOutstandingLoanBalances");

        var response = new OutstandingLoanBalancesByLinkedAccountNoResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("OUTSTANDING_LOAN_BALANCE_BY_LINKED_ACCOUNT_NO_RESPONSE: {}", response);

        return response;
    }

    public PaymentsThatReducesOutsLoanBalancesResponse getPaymentsThatReducesOutsLoanBalances (
            OutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new OutstandingLoanBalancesRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("PAYMENTS_THAT_REDUCE_OUTSTANDING_LOAN_BALANCES_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, PaymentsThatReducesOutsLoanBalancesResponseDto.class, HttpMethod.GET,
                "/OutstandingLoan/GetPaymentsThatReducesOutsLoanBalances");

        var response = new PaymentsThatReducesOutsLoanBalancesResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("PAYMENTS_THAT_REDUCE_OUTSTANDING_LOAN_BALANCES_RESPONSE: {}", response);

        return response;
    }
}
