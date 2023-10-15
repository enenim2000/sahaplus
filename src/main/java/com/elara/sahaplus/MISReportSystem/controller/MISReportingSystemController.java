package com.elara.sahaplus.MISReportSystem.controller;

import com.elara.sahaplus.MISReportSystem.dto.request.CustomerSizeReportRequest;
import com.elara.sahaplus.MISReportSystem.service.MISReportingSystemService;
import com.elara.sahaplus.customer.dto.response.CustomerSizeReportResponse;
import com.elara.sahaplus.util.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "MISReportSystem Module", description = "MISReportSystem Module")
@RequestMapping("/MISReportSystem")
public class MISReportingSystemController {

    private final MISReportingSystemService misReportingSystemService;

    public MISReportingSystemController(MISReportingSystemService misReportingSystemService) {
        this.misReportingSystemService = misReportingSystemService;
    }

    @Operation(summary = "Get Customer Size Report")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Gets Customer Size Report",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CustomerSizeReportResponse.class))})})
    @GetMapping("/getCustomerSizeReport")
    public BaseResponse getCustomerSizeReport (@Valid @RequestBody CustomerSizeReportRequest request) throws InvocationTargetException, IllegalAccessException {
        return misReportingSystemService.getCustomerSizeReport(request);
    }

}
