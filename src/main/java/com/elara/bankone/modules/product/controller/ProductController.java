package com.elara.bankone.modules.product.controller;

import com.elara.bankone.modules.product.dto.response.GetProductResponse;
import com.elara.bankone.modules.product.service.ProductService;
import com.elara.bankone.modules.product.dto.request.GetProductRequest;
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
@Tag(name = "Product Module", description = "Product Module")
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @Operation(summary = "Get Product")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Get Product",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetProductResponse.class))})})
    @PostMapping("/getProduct")
    public GetProductResponse getProduct (
            @Valid
            @RequestBody GetProductRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return productService.getProduct(request);
    }
}
