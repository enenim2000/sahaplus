package com.elara.sahaplus.fixed_deposit.controller;

import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountRequest;
import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountRequest3;
import com.elara.sahaplus.fixed_deposit.dto.request.CreateFixedDepositAccountWithCustomerIdRequest;
import com.elara.sahaplus.fixed_deposit.dto.response.CreateFixedDepositAccountResponse;
import com.elara.sahaplus.fixed_deposit.service.FixedDepositService;
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
@Tag(name = "Fixed Deposit Module", description = "Fixed Deposit Module")
@RequestMapping("/fixed_deposit")
public class FixedDepositController {

    private final FixedDepositService fixedDepositService;

    public FixedDepositController(FixedDepositService fixedDepositService) {
        this.fixedDepositService = fixedDepositService;
    }

    @Operation(summary = "Create Fixed deposit Account")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Fixed deposit Account",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreateFixedDepositAccountResponse.class))})})
    @PostMapping("/createFixedDepositAccount")
    public CreateFixedDepositAccountResponse createFixedDepositAccount(
            @Valid
            @RequestBody CreateFixedDepositAccountRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return fixedDepositService.createFixedDepositAccount(request);
    }

    @Operation(summary = "Create Fixed deposit Account 2")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Fixed deposit Account 2",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreateFixedDepositAccountResponse.class))})})
    @PostMapping("/createFixedDepositAccount2")
    public CreateFixedDepositAccountResponse createFixedDepositAccount2 (
            @Valid
            @RequestBody CreateFixedDepositAccountRequest request
    ) throws InvocationTargetException, IllegalAccessException
    {
        return fixedDepositService.createFixedDepositAccount2(request);
    }

    @Operation(summary = "Create Fixed deposit Account")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Fixed deposit Account With Customer Id As Required Field",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreateFixedDepositAccountResponse.class))})})
    @PostMapping("/createFixedDepositAccountWithCustomerId")
    public CreateFixedDepositAccountResponse createFixedDepositAccountWithCustomerId (
            @Valid
            @RequestBody CreateFixedDepositAccountWithCustomerIdRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return fixedDepositService.createFixedDepositAccountWithCustomerId(request);
    }

    @Operation(summary = "Create Fixed deposit Account")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Fixed deposit Account 3",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreateFixedDepositAccountResponse.class))})})
    @PostMapping("/createFixedDeposit3")
    public CreateFixedDepositAccountResponse createFixedDepositAccount3 (
            @Valid
            @RequestBody CreateFixedDepositAccountRequest3 request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return fixedDepositService.createFixedDepositAccount3(request);
    }
}
