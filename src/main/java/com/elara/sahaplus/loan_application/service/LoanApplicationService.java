package com.elara.sahaplus.loan_application.service;

import com.elara.sahaplus.loan_application.dto.backbone.LoanCreationApplicationRequestDto;
import com.elara.sahaplus.loan_application.dto.backbone.LoanCreationApplicationResponseDto;
import com.elara.sahaplus.loan_application.dto.request.LoanCreationApplicationRequest;
import com.elara.sahaplus.loan_application.dto.response.LoanCreationApplicationResponse;
import com.elara.sahaplus.loan_application.dto.response.LoanCreationApplicationResponse2;
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
}
