package com.elara.sahaplus.fixed_deposit.service;

import com.elara.sahaplus.fixed_deposit.dto.backbone.*;
import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountRequest;
import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountRequest3;
import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountWithCustomerIdRequest;
import com.elara.sahaplus.fixed_deposit.dto.request.GetFixedDepositAccountRequest;
import com.elara.sahaplus.fixed_deposit.dto.response.CreateFixedDepositAccountResponse;
import com.elara.sahaplus.fixed_deposit.dto.response.GetFixedDepositAccountResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class FixedDepositService {

    private final HttpClient httpClient;

    public FixedDepositService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CreateFixedDepositAccountResponse createFixedDepositAccount(
            CreateFixedDepositAccountRequest createFixedDepositAccountV1Request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreateFixedDepositAccountRequestDto();
        BeanUtils.copyProperties(requestDto, createFixedDepositAccountV1Request);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateFixedDepositAccountResponseDto.class, HttpMethod.POST,
                "/FixedDeposit/CreateFixedDepositAccount");

        var response = new CreateFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_RESPONSE: {}", response);

        return response;
    }

    public CreateFixedDepositAccountResponse createFixedDepositAccount2 (
            CreateFixedDepositAccountRequest createFixedDepositAccountV2Request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreateFixedDepositAccountRequestDto();
        BeanUtils.copyProperties(requestDto, createFixedDepositAccountV2Request);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_REQUEST 2: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateFixedDepositAccountResponseDto.class, HttpMethod.POST,
                "/FixedDeposit/CreateFixedDepositAccount2");

        var response = new CreateFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_RESPONSE 2: {}", response);

        return response;
    }

    public CreateFixedDepositAccountResponse createFixedDepositAccountWithCustomerId (
            CreateFixedDepositAccountWithCustomerIdRequest createFixedDepositAccountWithCustomerIdRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreateFixedDepositAccountWithCustomerIdRequestDto();
        BeanUtils.copyProperties(requestDto, createFixedDepositAccountWithCustomerIdRequest);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_WITH_CUSTOMER_ID_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateFixedDepositAccountResponseDto.class,
                HttpMethod.POST, "/FixedDeposit/CreateFixedDepositAcct");

        var response = new CreateFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_WITH_CUSTOMER_ID_RESPONSE: {}", response);

        return response;
    }

    public CreateFixedDepositAccountResponse createFixedDepositAccount3 (
            CreateFixedDepositAccountRequest3 createFixedDepositAccount)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreateFixedDepositAccountRequest3Dto();
        BeanUtils.copyProperties(requestDto, createFixedDepositAccount);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_3_REQUEST {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateFixedDepositAccountResponseDto.class,
                HttpMethod.POST, "/FixedDeposit/CreateFixedDepositAcct2");

        var response = new CreateFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_FIXED_DEPOSIT_ACCOUNT_3_RESPONSE: {}", response);

        return response;
    }

    public GetFixedDepositAccountResponse getFixedDepositAccountByAccountNumber (
            GetFixedDepositAccountRequest getFixedDepositAccountRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetFixedDepositAccountRequestDto();
        BeanUtils.copyProperties(requestDto, getFixedDepositAccountRequest);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_ACCOUNT_NUMBER_REQUEST {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GetFixedDepositAccountResponseDto.class,
                HttpMethod.GET, "/FixedDeposit/GetFixedDepositAccountByAccountNumber");

        var response = new GetFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_ACCOUNT_NUMBER_RESPONSE: {}", response);

        return response;
    }

    public GetFixedDepositAccountResponse getFixedDepositAccountByLiquidationAccount (
            GetFixedDepositAccountRequest getFixedDepositAccountRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetFixedDepositAccountRequestDto();
        BeanUtils.copyProperties(requestDto, getFixedDepositAccountRequest);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_LIQUIDATION_ACCOUNT_REQUEST {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GetFixedDepositAccountResponseDto.class,
                HttpMethod.GET, "/FixedDeposit/GetFixedDepositAccountByLiquidationAccount");

        var response = new GetFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_LIQUIDATION_ACCOUNT_RESPONSE: {}", response);

        return response;
    }

    public GetFixedDepositAccountResponse getFixedDepositAccountByPhoneNumber (
            GetFixedDepositAccountRequest getFixedDepositAccountRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetFixedDepositAccountRequestDto();
        BeanUtils.copyProperties(requestDto, getFixedDepositAccountRequest);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_PHONE_NUMBER_REQUEST {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GetFixedDepositAccountResponseDto.class,
                HttpMethod.GET, "/FixedDeposit/GetFixedDepositAccountByPhoneNumber");

        var response = new GetFixedDepositAccountResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_FIXED_DEPOSIT_ACCOUNT_BY_PHONE_NUMBER_RESPONSE: {}", response);

        return response;
    }

}
