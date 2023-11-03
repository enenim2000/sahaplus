package com.elara.bankone.modules.recover.service;

import com.elara.bankone.modules.posting.dto.backbone.BatchDepositUploadResponseDto;
import com.elara.bankone.modules.posting.dto.response.BatchDepositUploadResponse;
import com.elara.bankone.modules.recover.dto.backbone.CreditLoanAccountRequestDto;
import com.elara.bankone.modules.recover.dto.backbone.GetCurrentFinancialDateResponseDto;
import com.elara.bankone.modules.recover.dto.backbone.GetOutstandingLoanBalancesRequestDto;
import com.elara.bankone.modules.recover.dto.backbone.GetOutstandingLoanBalancesResponseDto;
import com.elara.bankone.modules.recover.dto.request.CreditLoanAccountRequest;
import com.elara.bankone.modules.recover.dto.request.GetOutstandingLoanBalancesRequest;
import com.elara.bankone.modules.recover.dto.response.GetCurrentFinancialDateResponse;
import com.elara.bankone.modules.recover.dto.response.GetOutstandingLoanBalancesResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class RecoverService {

    private final HttpClient httpClient;

    public RecoverService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public GetCurrentFinancialDateResponse getCurrentFinancialDateResponse ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, GetCurrentFinancialDateResponseDto.class, HttpMethod.GET,
                "/Recover/GetCurrentFinancialDate");

        var response = new GetCurrentFinancialDateResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_CURRENT_FINANCIAL_DATE_RESPONSE: {}", response);

        return response;
    }

    public GetOutstandingLoanBalancesResponse getOutstandingLoanBalancesResponse (
            GetOutstandingLoanBalancesRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetOutstandingLoanBalancesRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_OUTSTANDING_LOAN_BALANCES_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GetOutstandingLoanBalancesResponseDto.class, HttpMethod.POST,
                "/Recover/GetOutstandingLoanBalances");

        var response = new GetOutstandingLoanBalancesResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_OUTSTANDING_LOAN_BALANCES_RESPONSE: {}", response);

        return response;
    }

        public BatchDepositUploadResponse creditLoanAccount (
                CreditLoanAccountRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreditLoanAccountRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("CREDIT_LOAN_ACCOUNT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, BatchDepositUploadResponseDto.class, HttpMethod.POST,
                "/Recover/CreditLoanAccount");

        var response = new BatchDepositUploadResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREDIT_LOAN_ACCOUNT_RESPONSE: {}", response);

        return response;
    }
}
