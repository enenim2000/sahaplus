package com.elara.bankone.modules.customer.service;

import com.elara.bankone.modules.customer.dto.backbone.CreateCustomerRequestDto;
import com.elara.bankone.modules.customer.dto.backbone.CreateCustomerResponseDto;
import com.elara.bankone.modules.customer.dto.backbone.UpdateCustomerRequestDto;
import com.elara.bankone.modules.customer.dto.backbone.UpdateCustomerResponseDto;
import com.elara.bankone.modules.customer.dto.request.CreateCustomerRequest;
import com.elara.bankone.modules.customer.dto.request.SaveCustomerPassportRequest;
import com.elara.bankone.modules.customer.dto.request.UpdateCustomerRequest;
import com.elara.bankone.modules.customer.dto.response.CreateCustomerResponse;
import com.elara.bankone.modules.customer.dto.response.UpdateCustomerResponse;
import com.elara.bankone.util.BaseResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class CustomerService {

    private final HttpClient httpClient;

    public CustomerService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CreateCustomerResponse createCustomer(
            CreateCustomerRequest createCustomerRequest
    ) throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CreateCustomerRequestDto();
        BeanUtils.copyProperties(requestDto, createCustomerRequest);
        log.info("CREATE_CUSTOMER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateCustomerResponseDto.class, HttpMethod.POST,
                "/Customer/CreateCustomer");

        var response = new CreateCustomerResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_CUSTOMER_RESPONSE: {}", response);

        return response;
    }

    public UpdateCustomerResponse updateCustomer (
            UpdateCustomerRequest updateCustomerRequest
    ) throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new UpdateCustomerRequestDto();
        BeanUtils.copyProperties(requestDto, updateCustomerRequest);
        log.info("UPDATE_CUSTOMER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, UpdateCustomerResponseDto.class, HttpMethod.POST,
                "/Customer/UpdateCustomer");

        var response = new UpdateCustomerResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("UPDATE_CUSTOMER_RESPONSE: {}", response);

        return response;
    }

    public BaseResponse saveCustomerPassport (
            SaveCustomerPassportRequest saveCustomerPassportRequest
    ) throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new UpdateCustomerRequestDto();
        BeanUtils.copyProperties(requestDto, saveCustomerPassportRequest);
        log.info("SAVE_CUSTOMER_PASSPORT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, null, HttpMethod.POST,
                "/Customer/SaveCustomerPassport");
        log.info("UPDATE_CUSTOMER_RESPONSE: {}", apiResponse);

        return new BaseResponse();
    }
}
