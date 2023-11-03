package com.elara.bankone.modules.institution.service;

import com.elara.bankone.modules.institution.dto.backbone.GetCrmsResponseDto;
import com.elara.bankone.modules.institution.dto.backbone.RetrieveByCodeRequestDto;
import com.elara.bankone.modules.institution.dto.backbone.RetrieveByCodeResponseDto;
import com.elara.bankone.modules.institution.dto.backbone.RetrieveByInstitutionCodeRequestDto;
import com.elara.bankone.modules.institution.dto.request.RetrieveByCodeRequest;
import com.elara.bankone.modules.institution.dto.response.GetCrmsResponse;
import com.elara.bankone.modules.institution.dto.response.RetrieveByCodeResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class InstitutionService {

    private final HttpClient httpClient;

    public InstitutionService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public GetCrmsResponse getCrms ()
            throws InvocationTargetException, IllegalAccessException
    {
        var apiResponse = httpClient.callApi(null, GetCrmsResponseDto.class, HttpMethod.GET,
                "/Institution/GetCrms");

        var response = new GetCrmsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_CRMS_RESPONSE: {}", response);

        return response;
    }

    public RetrieveByCodeResponse retrieveByCode (
            RetrieveByCodeRequest retrieveByCodeRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new RetrieveByCodeRequestDto();
        BeanUtils.copyProperties(requestDto, retrieveByCodeRequest);
        log.info("RETRIEVE_BY_CODE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, RetrieveByCodeResponseDto.class, HttpMethod.GET,
                "/Institution/RetrieveByCode");

        var response = new RetrieveByCodeResponse();
        BeanUtils.copyProperties(response.getData().getMfbs(), apiResponse);
        log.info("RETRIEVE_BY_CODE_RESPONSE: {}", response);

        return response;
    }

    public RetrieveByCodeResponse retrieveByInstitutionCode (
            RetrieveByCodeRequest retrieveByInstitutionCodeRequest)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new RetrieveByInstitutionCodeRequestDto();
        BeanUtils.copyProperties(requestDto, retrieveByInstitutionCodeRequest);
        log.info("RETRIEVE_BY_INSTITUTION_CODE_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, RetrieveByCodeResponseDto.class, HttpMethod.GET,
                "/Institution/RetrieveByInstitutionCode");

        var response = new RetrieveByCodeResponse();
        BeanUtils.copyProperties(response.getData().getMfbs(), apiResponse);
        log.info("RETRIEVE_BY_CODE_RESPONSE: {}", response);

        return response;
    }

}
