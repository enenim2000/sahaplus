package com.elara.bankone.modules.mobile_teller.controller;

import com.elara.bankone.modules.mobile_teller.dto.request.MobileTellerDetailsRequest;
import com.elara.bankone.modules.mobile_teller.dto.response.MobileTellerDetailsResponse;
import com.elara.bankone.modules.mobile_teller.service.MobileTellerService;
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
@Tag(name = "Mobile Teller Module", description = "Mobile Teller Module")
@RequestMapping("/mobile-teller")
public class MobileTellerController {

    private final MobileTellerService mobileTellerService;

    public MobileTellerController(MobileTellerService mobileTellerService)
    {
        this.mobileTellerService = mobileTellerService;
    }

    @Operation(summary = "Get Mobile Teller Details")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Mobile Teller Details",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MobileTellerDetailsResponse.class))})})
    @PostMapping("/getMobileTellerDetails")
    public MobileTellerDetailsResponse getMobileTellerDetails (
            @Valid
            @RequestBody MobileTellerDetailsRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return mobileTellerService.getMobileTellerDetails(request);
    }
}
