package com.elara.sahaplus.log.service;

import com.elara.sahaplus.log.dto.backbone.LogTransactionRequestDto;
import com.elara.sahaplus.log.dto.backbone.LogTransactionResponseDto;
import com.elara.sahaplus.log.dto.request.LogTransactionRequest;
import com.elara.sahaplus.log.dto.response.LogTransactionResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class LogService {

    private final HttpClient httpClient;

    public LogService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public LogTransactionResponse logTransaction (
            LogTransactionRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new LogTransactionRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("LOG_TRANSACTION_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, LogTransactionResponseDto.class, HttpMethod.POST,
                "/TradePortInt/LogTransaction");

        var response = new LogTransactionResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("LOG_TRANSACTION_RESPONSE: {}", response);

        return response;
    }
}
