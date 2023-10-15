package com.elara.sahaplus.customer.controller;

import com.elara.sahaplus.customer.dto.request.CreateCustomerRequest;
import com.elara.sahaplus.customer.dto.request.UpdateCustomerRequest;
import com.elara.sahaplus.customer.dto.response.CreateCustomerResponse;
import com.elara.sahaplus.customer.dto.response.UpdateCustomerResponse;
import com.elara.sahaplus.customer.service.CustomerService;
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
    @PostMapping("/CreateCustomer")
    public CreateCustomerResponse createCustomerAndAccount(@Valid @RequestBody CreateCustomerRequest request) throws InvocationTargetException, IllegalAccessException {
        return customerService.createCustomer(request);
    }

    @Operation(summary = "Update Customer")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Update Customer Details",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UpdateCustomerResponse.class))})})
    @PostMapping("/UpdateCustomer")
    public UpdateCustomerResponse createCustomerAndAccount(@Valid @RequestBody UpdateCustomerRequest request) throws InvocationTargetException, IllegalAccessException {
        return customerService.updateCustomer(request);
    }
}
