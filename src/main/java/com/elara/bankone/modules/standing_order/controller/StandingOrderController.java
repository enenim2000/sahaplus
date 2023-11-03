package com.elara.bankone.modules.standing_order.controller;

import com.elara.bankone.modules.standing_order.dto.request.*;
import com.elara.bankone.modules.standing_order.dto.response.CancelStandingOrderResponse;
import com.elara.bankone.modules.standing_order.dto.response.StandingOrderCreationApplicationResponse;
import com.elara.bankone.modules.standing_order.dto.response.StandingOrderDetailsResponse;
import com.elara.bankone.modules.standing_order.service.StandingOrderService;
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
@Tag(name = "Standing Order Module", description = "Standing Order Module")
@RequestMapping("/standing-order")
public class StandingOrderController {

    private final StandingOrderService standingOrderService;

    public StandingOrderController(StandingOrderService standingOrderService)
    {
        this.standingOrderService = standingOrderService;
    }

    @Operation(summary = "Create Standing Order Application")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Standing Order Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = StandingOrderCreationApplicationResponse.class))})})
    @PostMapping("/createStandingOrderApplication")
    public StandingOrderCreationApplicationResponse createStandingOrderApplication (
            StandingOrderCreationApplicationRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.createStandingOrderApplication(request);
    }

    @Operation(summary = "Create Standing Order Application")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create Standing Order Application",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = StandingOrderCreationApplicationResponse.class))})})
    @PostMapping("/createStandingOrderApplication2")
    public StandingOrderCreationApplicationResponse createStandingOrderApplication (
            StandingOrderCreationApplicationRequest2 request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.createStandingOrderApplication(request);
    }

    @Operation(summary = "Get Standing Order Details By Standing Order Id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Standing Order Details By Standing Order Id",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = StandingOrderDetailsResponse.class))})})
    @PostMapping("/getStandingOrderDetailsByStandingOrderId")
    public StandingOrderDetailsResponse getStandingOrderDetailsByStandingOrderId (
            StandingOrderDetailsByStandingOrderIdRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.getStandingOrderDetailsByStandingOrderId(request);
    }

    @Operation(summary = "Get Standing Orders By Debit Account Number")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Standing Orders By Debit Account Number",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = StandingOrderDetailsResponse.class))})})
    @PostMapping("/getStandingOrdersByDebitAccountNumber")
    public StandingOrderDetailsResponse getStandingOrdersByDebitAccountNumber (
            StandingOrdersByDebitAccountNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.getStandingOrdersByDebitAccountNumber(request);
    }

    @Operation(summary = "Get Standing Orders By Credit Account Number")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Standing Orders By Credit Account Number",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = StandingOrderDetailsResponse.class))})})
    @PostMapping("/getStandingOrdersByCreditAccountNumber")
    public StandingOrderDetailsResponse getStandingOrdersByCreditAccountNumber (
            StandingOrdersByCreditAccountNumberRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.getStandingOrdersByCreditAccountNumber(request);
    }

    @Operation(summary = "Cancel Standing Order")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Cancel Standing Order",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CancelStandingOrderResponse.class))})})
    @PostMapping("/cancelStandingOrder")
    public CancelStandingOrderResponse cancelStandingOrder (
            CancelStandingOrderRequest request
    )
            throws InvocationTargetException, IllegalAccessException
    {
        return standingOrderService.cancelStandingOrder(request);
    }
}
