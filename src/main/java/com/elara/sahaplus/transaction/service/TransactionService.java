package com.elara.sahaplus.transaction.service;

import com.elara.sahaplus.posting.dto.backbone.BatchDepositUploadRequestDto;
import com.elara.sahaplus.posting.dto.backbone.BatchDepositUploadResponseDto;
import com.elara.sahaplus.posting.dto.response.BatchDepositUploadResponse;
import com.elara.sahaplus.transaction.dto.backbone.CustomerTransactionsByReferenceNumberRequestDto;
import com.elara.sahaplus.transaction.dto.backbone.CustomerTransactionsByReferenceNumberResponseDto;
import com.elara.sahaplus.transaction.dto.request.CustomerTransactionsByReferenceNumberRequest;
import com.elara.sahaplus.transaction.dto.response.CustomerTransactionsByReferenceNumberResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class TransactionService {

    private final HttpClient httpClient;

    public TransactionService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public CustomerTransactionsByReferenceNumberResponse getCustomerTransactionsByReferenceNumber(
            CustomerTransactionsByReferenceNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new CustomerTransactionsByReferenceNumberRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("CUSTOMER_TRANSACTIONS_BY_REFERENCE_NUMBER_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(null, CustomerTransactionsByReferenceNumberResponseDto.class, HttpMethod.GET,
                "/Transaction/GetCustomerTransationsByReferenceNumber");

        var response = new CustomerTransactionsByReferenceNumberResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("CUSTOMER_TRANSACTIONS_BY_REFERENCE_NUMBER_RESPONSE: {}", response);

        return response;
    }
}
