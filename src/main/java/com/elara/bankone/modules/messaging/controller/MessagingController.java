package com.elara.bankone.modules.messaging.controller;

import com.elara.bankone.modules.messaging.dto.request.InfoBipRequest;
import com.elara.bankone.modules.messaging.dto.request.SaveBulkSMSRequest;
import com.elara.bankone.modules.messaging.dto.request.SaveEmailRequest;
import com.elara.bankone.modules.messaging.dto.response.InfoBipResponse;
import com.elara.bankone.modules.messaging.dto.response.SaveBulkSMSResponse;
import com.elara.bankone.modules.messaging.dto.response.SaveEmailResponse;
import com.elara.bankone.modules.messaging.service.MessagingService;
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
@Tag(name = "Fixed Deposit Module", description = "Fixed Deposit Module")
@RequestMapping("/fixed_deposit")
public class MessagingController {

    private final MessagingService messagingService;

    public MessagingController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Operation(summary = "Save Bulk Sms")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Save Bulk Sms",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = SaveBulkSMSResponse.class))})})
    @PostMapping("/saveBulkSms")
    public SaveBulkSMSResponse saveBulkSms(
            @Valid
            @RequestBody SaveBulkSMSRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return messagingService.saveBulkSms(request);
    }

    @Operation(summary = "Send Email")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Send Email",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = SaveEmailResponse.class))})})
    @PostMapping("/sendEmail")
    public SaveEmailResponse sendEmail (
            @Valid
            @RequestBody SaveEmailRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return messagingService.sendEmail(request);
    }

    @Operation(summary = "Get Sms Confirmation From Info Bip")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Sms Confirmation From Info Bip",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = InfoBipResponse.class))})})
    @PostMapping("/getSmsConfirmationInfoBip")
    public InfoBipResponse getSmsConfirmationInfoBip (
            @Valid
            @RequestBody InfoBipRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return messagingService.getSmsConfirmationInfoBip(request);
    }
}
