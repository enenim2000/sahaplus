package com.elara.sahaplus.loan.service;

import com.elara.sahaplus.loan.dto.backbone.*;
import com.elara.sahaplus.loan.dto.request.LoanRepaymentScheduleRequest;
import com.elara.sahaplus.loan.dto.request.LoansByAccountOfficerRequest;
import com.elara.sahaplus.loan.dto.request.SearchLoansRequest;
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


}
