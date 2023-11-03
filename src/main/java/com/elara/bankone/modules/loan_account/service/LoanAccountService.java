package com.elara.bankone.modules.loan_account.service;

import com.elara.bankone.modules.loan_account.dto.backbone.*;
import com.elara.bankone.modules.loan_account.dto.request.LoanAccountBalanceRequest;
import com.elara.bankone.modules.loan_account.dto.request.LoanAccountBalanceRequest2;
import com.elara.bankone.modules.loan_account.dto.request.LoanAccountStatementRequest;
import com.elara.bankone.modules.loan_account.dto.response.LoanAccountBalanceResponse;
import com.elara.bankone.modules.loan_account.dto.response.LoanAccountStatementResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class LoanAccountService {

    private final HttpClient httpClient;

    public LoanAccountService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public LoanAccountBalanceResponse getLoanAccountBalance (
            LoanAccountBalanceRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanAccountBalanceRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_ACCOUNT_BALANCE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanAccountBalanceResponseDto.class, HttpMethod.GET,
                "/LoanAccount/LoanAccountBalance");

        var response = new LoanAccountBalanceResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_ACCOUNT_BALANCE_RESPONSE: {}", response);

        return response;
    }

    public LoanAccountBalanceResponse getLoanAccountBalance (
            LoanAccountBalanceRequest2 request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanAccountBalanceRequestDto2();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_ACCOUNT_BALANCE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanAccountBalanceResponseDto.class, HttpMethod.GET,
                "/LoanAccount/LoanAccountBalance2");

        var response = new LoanAccountBalanceResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_ACCOUNT_BALANCE_RESPONSE: {}", response);

        return response;
    }

    public LoanAccountStatementResponse getLoanAccountStatement (
            LoanAccountStatementRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanAccountStatementRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_ACCOUNT_STATEMENT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanAccountStatementResponseDto.class, HttpMethod.GET,
                "/LoanAccount/LoanAccountStatement");

        var response = new LoanAccountStatementResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_ACCOUNT_STATEMENT_RESPONSE: {}", response);

        return response;
    }

}
