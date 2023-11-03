package com.elara.bankone.modules.log.controller;

import com.elara.bankone.modules.log.dto.request.LogTransactionRequest;
import com.elara.bankone.modules.log.dto.response.LogTransactionResponse;
import com.elara.bankone.modules.log.service.LogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "Log Module", description = "Log Module")
@RequestMapping("/log")
public class LogController {

    private final LogService logService;

    public LogController(LogService logService)
    {
        this.logService = logService;
    }

    @Operation(summary = "Log Transaction")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Log Transaction",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LogTransactionResponse.class))})})
    @PostMapping("/logTransaction")
    public LogTransactionResponse logTransaction (
            LogTransactionRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return logService.logTransaction(request);
    }
}
