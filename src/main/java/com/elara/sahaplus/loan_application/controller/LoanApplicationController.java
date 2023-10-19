package com.elara.sahaplus.loan_application.controller;

import com.elara.sahaplus.loan_application.dto.request.LoanCreationApplicationRequest;
import com.elara.sahaplus.loan_application.dto.response.LoanCreationApplicationResponse;
import com.elara.sahaplus.loan_application.dto.response.LoanCreationApplicationResponse2;
import com.elara.sahaplus.loan_application.service.LoanApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
@Tag(name = "Loan Creation Application Module", description = "Loan Creation Application Module")
@RequestMapping("/loanCreationApplication")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }


    @Operation(summary = "Loan Creation Application")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Loan Creation Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanCreationApplicationResponse.class))})})
    @GetMapping("/createLoanApplication")
    public LoanCreationApplicationResponse createLoanApplication (LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.createLoanApplication(request);
    }

    @Operation(summary = "Loan Creation Application")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Loan Creation Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoanCreationApplicationResponse2.class))})})
    @GetMapping("/createLoanApplication2")
    public LoanCreationApplicationResponse2 createLoanApplication2 (LoanCreationApplicationRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return loanApplicationService.createLoanApplication2(request);
    }
}
