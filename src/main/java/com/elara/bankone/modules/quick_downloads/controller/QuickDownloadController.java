package com.elara.bankone.modules.quick_downloads.controller;

import com.elara.bankone.modules.quick_downloads.dto.request.GetFinanceReportLast12MonthsRequest;
import com.elara.bankone.modules.quick_downloads.dto.request.GetFinanceReportRequest;
import com.elara.bankone.modules.quick_downloads.dto.response.FinanceReportResponse;
import com.elara.bankone.modules.quick_downloads.service.QuickDownloadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "Quick Download Module", description = "Quick Download Module")
@RequestMapping("/quick-download")
public class QuickDownloadController {

    private final QuickDownloadService quickDownloadService;

    public QuickDownloadController(QuickDownloadService quickDownloadService)
    {
        this.quickDownloadService = quickDownloadService;
    }

    @Operation(summary = "Get Finance Report")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Finance Report",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FinanceReportResponse.class))})})
    @PostMapping("/getFinanceReport")
    public FinanceReportResponse getFinanceReport (
            @Valid
            @RequestBody GetFinanceReportRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return quickDownloadService.getFinanceReport(request);
    }

    @Operation(summary = "Get Finance Report For Last 12 Months")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Finance Report For Last 12 Months",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FinanceReportResponse.class))})})
    @PostMapping("/getFinanceReportForLast12Months")
    public FinanceReportResponse getFinanceReportForLast12Months (
            @Valid
            @RequestBody GetFinanceReportLast12MonthsRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return quickDownloadService.getFinanceReportForLast12Months(request);
    }
}
