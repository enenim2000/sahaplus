package com.elara.sahaplus.standing_order.service;

import com.elara.sahaplus.standing_order.dto.backbone.*;
import com.elara.sahaplus.standing_order.dto.request.*;
import com.elara.sahaplus.standing_order.dto.response.CancelStandingOrderResponse;
import com.elara.sahaplus.standing_order.dto.response.StandingOrderCreationApplicationResponse;
import com.elara.sahaplus.standing_order.dto.response.StandingOrderDetailsResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class StandingOrderService {

    private final HttpClient httpClient;

    public StandingOrderService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public StandingOrderCreationApplicationResponse createStandingOrderApplication (
            StandingOrderCreationApplicationRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new StandingOrderCreationApplicationRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("STANDING_ORDER_CREATION_APPLICATION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, StandingOrderCreationApplicationResponseDto.class, HttpMethod.POST,
                "/StandingOrder/StandingOrderCreationApplication");

        var response = new StandingOrderCreationApplicationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("STANDING_ORDER_CREATION_APPLICATION_RESPONSE: {}", response);

        return response;
    }

    public StandingOrderCreationApplicationResponse createStandingOrderApplication (
            StandingOrderCreationApplicationRequest2 request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new StandingOrderCreationApplicationRequest2Dto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("STANDING_ORDER_CREATION_APPLICATION_2_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, StandingOrderCreationApplicationResponseDto.class, HttpMethod.POST,
                "/StandingOrder/StandingOrderCreationApplication2");

        var response = new StandingOrderCreationApplicationResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("STANDING_ORDER_CREATION_APPLICATION_2_RESPONSE: {}", response);

        return response;
    }

    public StandingOrderDetailsResponse getStandingOrderDetailsByStandingOrderId (
            StandingOrderDetailsByStandingOrderIdRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new StandingOrderDetailsByStandingOrderIdRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_STANDING_ORDER_DETAILS_BY_STANDING_ORDER_ID_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(null, StandingOrderDetailsResponseDto.class, HttpMethod.GET,
                "/StandingOrder/GetStandingOrderDetailsByStandingOrderId");

        var response = new StandingOrderDetailsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_STANDING_ORDER_DETAILS_BY_STANDING_ORDER_ID_RESPONSE: {}", response);

        return response;
    }

    public StandingOrderDetailsResponse getStandingOrdersByDebitAccountNumber (
            StandingOrdersByDebitAccountNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new StandingOrdersByDebitAccountNumberRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_STANDING_ORDER_DETAILS_BY_DEBIT_ACCOUNT_NUMBER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(null, StandingOrderDetailsResponseDto.class, HttpMethod.GET,
                "/StandingOrder/GetStandingOrdersByDebitAccountNumber");

        var response = new StandingOrderDetailsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_STANDING_ORDER_DETAILS_BY_DEBIT_ACCOUNT_NUMBER_RESPONSE: {}", response);

        return response;
    }

    public StandingOrderDetailsResponse getStandingOrdersByCreditAccountNumber (
            StandingOrdersByCreditAccountNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new StandingOrdersByCreditAccountNumberRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_STANDING_ORDER_DETAILS_BY_CREDIT_ACCOUNT_NUMBER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(null, StandingOrderDetailsResponseDto.class, HttpMethod.GET,
                "/StandingOrder/GetStandingOrdersByCreditAccountNumber");

        var response = new StandingOrderDetailsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_STANDING_ORDER_DETAILS_BY_CREDIT_ACCOUNT_NUMBER_RESPONSE: {}", response);

        return response;
    }

    public CancelStandingOrderResponse cancelStandingOrder (
            CancelStandingOrderRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CancelStandingOrderRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("CANCEL_STANDING_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(null, CancelStandingOrderResponseDto.class, HttpMethod.POST,
                "/StandingOrder/CancelStandingOrder");

        var response = new CancelStandingOrderResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CANCEL_STANDING_RESPONSE: {}", response);

        return response;
    }
}
