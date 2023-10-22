package com.elara.sahaplus.loan.service;

import com.elara.sahaplus.loan.dto.backbone.*;
import com.elara.sahaplus.loan.dto.request.*;
import com.elara.sahaplus.loan.dto.response.*;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class LoanService {

    private final HttpClient httpClient;

    public LoanService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public LoanRepaymentScheduleResponse getLoanRepaymentSchedule (
            LoanRepaymentScheduleRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanRepaymentScheduleRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_REPAYMENT_SCHEDULE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanRepaymentScheduleResponseDto.class, HttpMethod.GET,
                "/Loan/GetLoanRepaymentSchedule");

        var response = new LoanRepaymentScheduleResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_REPAYMENT_SCHEDULE_RESPONSE: {}", response);

        return response;
    }

    public LoansResponse searchLoans (
            SearchLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new SearchLoansRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("SEARCH_LOANS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansResponseDto.class, HttpMethod.GET,
                "/Loan/SearchLoans");

        var response = new LoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("SEARCH_LOANS_RESPONSE: {}", response);

        return response;
    }

    public LoansResponse searchLoansByAccountOfficer (
            LoansByAccountOfficerRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoansByAccountOfficerRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("SEARCH_LOANS_BY_ACCOUNT_OFFICER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansResponseDto.class, HttpMethod.GET,
                "/Loan/GetLoansByAccountOfficer");

        var response = new LoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("SEARCH_LOANS_BY_ACCOUNT_OFFICER_RESPONSE: {}", response);

        return response;
    }

    public LoansByCustomerIdResponse getLoansByCustomerId (
            LoansByCustomerIdRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoansByCustomerIdRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("SEARCH_LOANS_BY_CUSTOMER_ID_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansByCustomerIdResponseDto.class, HttpMethod.GET,
                "/Loan/GetLoansByCustomerId");

        var response = new LoansByCustomerIdResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("SEARCH_LOANS_BY_CUSTOMER_ID_RESPONSE: {}", response);

        return response;
    }

    public LoanByAccountNumberResponse getLoansByAccountNumber (
            LoanByAccountNumberRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanByAccountNumberRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_LOANS_BY_ACCOUNT_NUMBER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanByAccountNumberResponseDto.class, HttpMethod.GET,
                "/Loan/GetLoanByAccountNumber");

        var response = new LoanByAccountNumberResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_LOANS_BY_ACCOUNT_NUMBER_RESPONSE: {}", response);

        return response;
    }

    public LoansResponse getLoanByLoanId (
            LoansByIdRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoansByIdRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_LOANS_BY_LOAN_ID_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansResponseDto.class, HttpMethod.GET,
                "/Loan/GetLoanByID");

        var response = new LoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_LOANS_BY_LOAN_ID_RESPONSE: {}", response);

        return response;
    }

    public ParInformationResponse getParInformation (
            ParInformationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new ParInformationRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_PAR_INFORMATION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, ParInformationResponseDto.class, HttpMethod.GET,
                "/Loan/GetParInformation");

        var response = new ParInformationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_PAR_INFORMATION_RESPONSE: {}", response);

        return response;
    }

    public ProfitabilityParInformationResponse getProfitabilityParInformation (
            ParInformationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new ParInformationRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_PROFITABILITY_PAR_INFORMATION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, ProfitabilityParInformationResponseDto.class, HttpMethod.GET,
                "/Loan/GetProfitabilityParInformation");

        var response = new ProfitabilityParInformationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_PROFITABILITY_PAR_INFORMATION_RESPONSE: {}", response);

        return response;
    }

    public LoansResponse getDelinquentLoans (
            DelinquentLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new DelinquentLoansRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_DELINQUENT_LOANS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansResponseDto.class, HttpMethod.GET,
                "/Loan/GetDeliquentLoans");

        var response = new LoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_DELINQUENT_LOANS_RESPONSE: {}", response);

        return response;
    }

    public DueLoansResponse getDueLoans (
            DueLoansRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new DueLoansRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_DUE_LOANS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoansResponseDto.class, HttpMethod.GET,
                "/Loan/GetDueLoans");

        var response = new DueLoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_DUE_LOANS_RESPONSE: {}", response);

        return response;
    }
}
