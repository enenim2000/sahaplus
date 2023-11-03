package com.elara.bankone.modules.mobile_teller.service;

import com.elara.bankone.modules.mobile_teller.dto.backbone.MobileTellerDetailsRequestDto;
import com.elara.bankone.modules.mobile_teller.dto.backbone.MobileTellerDetailsResponseDto;
import com.elara.bankone.modules.mobile_teller.dto.request.MobileTellerDetailsRequest;
import com.elara.bankone.modules.mobile_teller.dto.response.MobileTellerDetailsResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class MobileTellerService {

    private final HttpClient httpClient;

    public MobileTellerService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public MobileTellerDetailsResponse getMobileTellerDetails (
            MobileTellerDetailsRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new MobileTellerDetailsRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("MOBILE_TELLER_DETAILS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, MobileTellerDetailsResponseDto.class, HttpMethod.GET,
                "/MobileTeller/GetMobileTellerDetails");

        var response = new MobileTellerDetailsResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("MOBILE_TELLER_DETAILS_RESPONSE: {}", response);

        return response;
    }
}
