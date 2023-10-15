package com.elara.sahaplus.MISReportSystem.service;

import com.elara.sahaplus.MISReportSystem.dto.backbone.*;
import com.elara.sahaplus.MISReportSystem.dto.request.CustomerSizeReportRequest;
import com.elara.sahaplus.MISReportSystem.dto.response.MfbsResponse;
import com.elara.sahaplus.customer.dto.response.CustomerSizeReportResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class MISReportingSystemService {

    private final HttpClient httpClient;

    public MISReportingSystemService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CustomerSizeReportResponse getCustomerSizeReport (
            CustomerSizeReportRequest customerSizeReportRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CustomerSizeReportRequestDto();
        BeanUtils.copyProperties(requestDto, customerSizeReportRequest);
        log.info("GET_CUSTOMER_SIZE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CustomerSizeReportResponseDto.class, HttpMethod.GET, "/MISReportSystem/GetCustomerSizeReport");

        var response = new CustomerSizeReportResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_CUSTOMER_SIZE_RESPONSE: {}", response);

        return response;
    }

    public MfbsResponse getAllMfbs ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, MfbsResponseDto.class, HttpMethod.GET, "/MISReportSystem/GetAllMfbs");

        var response = new MfbsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_ALL_MFBS_RESPONSE: {}", response);

        return response;
    }

    public MfbsResponse getAllMfbsNameAndIdentityCode ()
            throws InvocationTargetException, IllegalAccessException
    {

        var apiResponse = httpClient.callApi(null, MfbsResponseDto.class, HttpMethod.GET, "/MISReportSystem/GetAllMfbsNameAndIdentityCode");

        var response = new MfbsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_ALL_MFBS_NAME_AND_IDENTITY_CODE_RESPONSE: {}", response);

        return response;
    }
}
