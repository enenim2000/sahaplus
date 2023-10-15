package com.elara.sahaplus.customer.controller;

import com.elara.sahaplus.customer.dto.request.CreateCustomerRequest;
import com.elara.sahaplus.customer.dto.request.SaveCustomerPassportRequest;
import com.elara.sahaplus.customer.dto.request.UpdateCustomerRequest;
import com.elara.sahaplus.customer.dto.response.CreateCustomerResponse;
import com.elara.sahaplus.customer.dto.response.UpdateCustomerResponse;
import com.elara.sahaplus.customer.service.CustomerService;
import com.elara.sahaplus.util.BaseResponse;
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
@Tag(name = "Customer Module", description = "Customer Module")
@RequestMapping("/Customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Operation(summary = "Create Customer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Create Customer",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreateCustomerResponse.class))})})
    @PostMapping("/createCustomer")
    public CreateCustomerResponse createCustomer(@Valid @RequestBody CreateCustomerRequest request) throws InvocationTargetException, IllegalAccessException {
        return customerService.createCustomer(request);
    }

    @Operation(summary = "Update Customer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Update Customer Details",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UpdateCustomerResponse.class))})})
    @PostMapping("/updateCustomer")
    public UpdateCustomerResponse updateCustomerAccount(@Valid @RequestBody UpdateCustomerRequest request) throws InvocationTargetException, IllegalAccessException {
        return customerService.updateCustomer(request);
    }

    @Operation(summary = "Save Customer Passport")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Saves Customer Passport",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = BaseResponse.class))})})
    @PostMapping("/saveCustomerPassport")
    public BaseResponse saveCustomerPassport (@Valid @RequestBody SaveCustomerPassportRequest request) throws InvocationTargetException, IllegalAccessException {
        return customerService.saveCustomerPassport(request);
    }
}
