package com.elara.bankone.modules.quick_downloads.service;

import com.elara.bankone.modules.quick_downloads.dto.backbone.FinanceReportResponseDto;
import com.elara.bankone.modules.quick_downloads.dto.backbone.GetFinanceReportLast12MonthsRequestDto;
import com.elara.bankone.modules.quick_downloads.dto.backbone.GetFinanceReportRequestDto;
import com.elara.bankone.modules.quick_downloads.dto.request.GetFinanceReportLast12MonthsRequest;
import com.elara.bankone.modules.quick_downloads.dto.request.GetFinanceReportRequest;
import com.elara.bankone.modules.quick_downloads.dto.response.FinanceReportResponse;
import com.elara.bankone.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Service
public class QuickDownloadService {

    private final HttpClient httpClient;

    public QuickDownloadService(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public FinanceReportResponse getFinanceReport (
            GetFinanceReportRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetFinanceReportRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_FINANCE_REPORT_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, FinanceReportResponseDto.class, HttpMethod.GET,
                "/QuickDownloads/GetFinanceReport");

        var response = new FinanceReportResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_FINANCE_REPORT_RESPONSE: {}", response);

        return response;
    }

    public FinanceReportResponse getFinanceReportForLast12Months (
            GetFinanceReportLast12MonthsRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        var requestDto = new GetFinanceReportLast12MonthsRequestDto();
        BeanUtils.copyProperties(requestDto, request);
        log.info("GET_FINANCE_REPORT_LAST_12_MONTHS_REQUEST: {}", requestDto);

        var apiResponse = httpClient.callApi(requestDto, FinanceReportResponseDto.class, HttpMethod.GET,
                "/QuickDownloads/GetFinanceReportLast12Months");

        var response = new FinanceReportResponse();
        BeanUtils.copyProperties(response.getData(), apiResponse);
        log.info("GET_FINANCE_REPORT_LAST_12_MONTHS_RESPONSE: {}", response);

        return response;
    }
}
