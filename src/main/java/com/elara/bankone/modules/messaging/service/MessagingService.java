package com.elara.bankone.modules.messaging.service;

import com.elara.bankone.modules.messaging.dto.backbone.*;
import com.elara.bankone.modules.messaging.dto.request.InfoBipRequest;
import com.elara.bankone.modules.messaging.dto.request.SaveBulkSMSRequest;
import com.elara.bankone.modules.messaging.dto.request.SaveEmailRequest;
import com.elara.bankone.modules.messaging.dto.response.InfoBipResponse;
import com.elara.bankone.modules.messaging.dto.response.SaveBulkSMSResponse;
import com.elara.bankone.modules.messaging.dto.response.SaveEmailResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class MessagingService {

    private final HttpClient httpClient;

    public MessagingService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public SaveBulkSMSResponse saveBulkSms (
            SaveBulkSMSRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new SaveBulkSMSRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("SAVE_BULK_SMS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, SaveBulkSMSResponseDto.class, HttpMethod.POST,
                "/Messaging/SaveBulkSms");

        var response = new SaveBulkSMSResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("SAVE_BULK_SMS_RESPONSE: {}", response);

        return response;
    }

    public SaveEmailResponse sendEmail (
            SaveEmailRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new SaveEmailRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("SAVE_EMAIL_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, SaveEmailResponseDto.class, HttpMethod.GET,
                "/Messaging/SaveEmail");

        var response = new SaveEmailResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("SAVE_EMAIL_RESPONSE: {}", response);

        return response;
    }

    public InfoBipResponse getSmsConfirmationInfoBip (
            InfoBipRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new InfoBipRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("INFO_BIP_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, InfoBipResponseDto.class, HttpMethod.POST,
                "/SmsConfirmation/InfoBip");

        var response = new InfoBipResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("INFO_BIP_RESPONSE: {}", response);

        return response;
    }
}
