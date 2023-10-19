package com.elara.sahaplus.loan_application.service;

import com.elara.sahaplus.loan_application.CompletedDisbursedLoansResponseData;
import com.elara.sahaplus.loan_application.dto.backbone.*;
import com.elara.sahaplus.loan_application.dto.request.GeepDisbursedLoansInfoRequest;
import com.elara.sahaplus.loan_application.dto.request.LoanCreationApplicationRequest;
import com.elara.sahaplus.loan_application.dto.response.*;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class LoanApplicationService {

    private final HttpClient httpClient;

    public LoanApplicationService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public LoanCreationApplicationResponse createLoanApplication (
            LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanCreationApplicationRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_CREATION_APPLICATION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanCreationApplicationResponseDto.class, HttpMethod.POST,
                "/LoanApplication/LoanCreationApplication");

        var response = new LoanCreationApplicationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_CREATION_APPLICATION_RESPONSE: {}", response);

        return response;
    }

    public LoanCreationApplicationResponse2 createLoanApplication2 (
            LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LoanCreationApplicationRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOAN_CREATION_APPLICATION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LoanCreationApplicationResponseDto.class, HttpMethod.POST,
                "/LoanApplication/LoanCreationApplication2");

        var response = new LoanCreationApplicationResponse2();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_CREATION_APPLICATION_RESPONSE: {}", response);

        return response;
    }

    public CompletedLoanRepaymentResponse getCompletedLoanRepayment ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, CompletedLoanRepaymentResponseDto.class, HttpMethod.GET,
                "/LoanApplication/CompletedLoanRepayments");

        var response = new CompletedLoanRepaymentResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_REPAYMENT_COMPLETION_RESPONSE: {}", response);

        return response;
    }

    public CompletedLoanApplicationResponse getCompletedLoanApplication ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, CompletedLoanApplicationResponseDto.class, HttpMethod.GET,
                "/LoanApplication/CompletedLoanApplication");

        var response = new CompletedLoanApplicationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOAN_APPLICATION_COMPLETION_RESPONSE: {}", response);

        return response;
    }

    public ApprovedLoansResponse getApprovedLoans ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, ApprovedLoansResponseDto.class, HttpMethod.GET,
                "/LoanApplication/ApprovedLoans");

        var response = new ApprovedLoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("APPROVED_LOANS_RESPONSE: {}", response);

        return response;
    }

    public CompletedDisbursedLoansResponse getCompletedDisbursedLoans ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, CompletedDisbursedLoansResponseDto.class, HttpMethod.GET,
                "/LoanApplication/CompletedDisbursedLoans");

        var response = new CompletedDisbursedLoansResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("APPROVED_LOANS_RESPONSE: {}", response);

        return response;
    }

    public GeepDisbursedLoansInfoResponse getGeepDisbursedLoansInfo (
            GeepDisbursedLoansInfoRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GeepDisbursedLoansInfoRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GEEP_DISBURSED_LOANS_INFO_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GeepDisbursedLoansInfoRequestDto.class, HttpMethod.GET,
                "/LoanApplication/GeepDisbursedLoansInfo");

        var response = new GeepDisbursedLoansInfoResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GEEP_DISBURSED_LOANS_INFO_RESPONSE: {}", response);

        return response;
    }
}
