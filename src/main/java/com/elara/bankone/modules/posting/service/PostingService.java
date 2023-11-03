package com.elara.bankone.modules.posting.service;

import com.elara.bankone.modules.posting.dto.response.BatchDepositUploadResponse;
import com.elara.bankone.modules.posting.dto.backbone.BatchDepositUploadRequestDto;
import com.elara.bankone.modules.posting.dto.backbone.BatchDepositUploadResponseDto;
import com.elara.bankone.modules.posting.dto.request.BatchDepositUploadRequest;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class PostingService {

    private final HttpClient httpClient;

    public PostingService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public BatchDepositUploadResponse batchDepositUpload (
            BatchDepositUploadRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new BatchDepositUploadRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("BATCH_DEPOSIT_UPLOAD_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, BatchDepositUploadResponseDto.class, HttpMethod.POST,
                "/Postings/BatchDepositUpload");

        var response = new BatchDepositUploadResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("BATCH_DEPOSIT_UPLOAD_RESPONSE: {}", response);

        return response;
    }


}
