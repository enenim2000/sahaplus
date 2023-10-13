package com.elara.sahaplus.customer.service;

import com.elara.sahaplus.customer.dto.backbone.CreateCustomerRequestDto;
import com.elara.sahaplus.customer.dto.backbone.CreateCustomerResponseDto;
import com.elara.sahaplus.customer.dto.request.CreateCustomerRequest;
import com.elara.sahaplus.customer.dto.response.CreateCustomerResponse;
import com.elara.sahaplus.util.HttpClient;
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

    public CreateCustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) throws InvocationTargetException, IllegalAccessException {
        var requestDto = new CreateCustomerRequestDto();
        BeanUtils.copyProperties(requestDto, createCustomerRequest);
        log.info("CREATE_CUSTOMER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, CreateCustomerResponseDto.class, HttpMethod.POST, "/Customer/CreateCustomer");

        var response = new CreateCustomerResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CREATE_CUSTOMER_RESPONSE: {}", response);

        return response;
    }

}
