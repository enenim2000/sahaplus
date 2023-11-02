package com.elara.sahaplus.transaction.controller;

import com.elara.sahaplus.posting.dto.response.BatchDepositUploadResponse;
import com.elara.sahaplus.transaction.dto.request.CustomerTransactionsByReferenceNumberRequest;
import com.elara.sahaplus.transaction.dto.response.CustomerTransactionsByReferenceNumberResponse;
import com.elara.sahaplus.transaction.service.TransactionService;
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
@Tag(name = "Transaction Module", description = "Transaction Module")
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService)
    {
        this.transactionService = transactionService;
    }

    @Operation(summary = "Get Customer Transactions By Reference Number")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Customer Transactions By Reference Number",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CustomerTransactionsByReferenceNumberResponse.class))})})
    @PostMapping("/getCustomerTransactionsByReferenceNumber")
    public CustomerTransactionsByReferenceNumberResponse getCustomerTransactionsByReferenceNumber (
            CustomerTransactionsByReferenceNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException {
        return transactionService.getCustomerTransactionsByReferenceNumber(request);
    }
}
