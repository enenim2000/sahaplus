package com.elara.sahaplus.product.service;

import com.elara.sahaplus.product.dto.backbone.GetProductRequestDto;
import com.elara.sahaplus.product.dto.backbone.GetProductResponseDto;
import com.elara.sahaplus.product.dto.request.GetProductRequest;
import com.elara.sahaplus.product.dto.response.GetProductResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class ProductService {

    private final HttpClient httpClient;

    public ProductService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public GetProductResponse getProduct (
            GetProductRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetProductRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_PRODUCT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, GetProductResponseDto.class, HttpMethod.POST,
                "/Product/Get");

        var response = new GetProductResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_PRODUCT_RESPONSE: {}", response);

        return response;
    }
}
