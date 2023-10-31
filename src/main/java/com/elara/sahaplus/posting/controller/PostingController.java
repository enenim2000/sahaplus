package com.elara.sahaplus.posting.controller;

import com.elara.sahaplus.posting.dto.request.BatchDepositUploadRequest;
import com.elara.sahaplus.posting.dto.response.BatchDepositUploadResponse;
import com.elara.sahaplus.posting.service.PostingService;
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
@Tag(name = "Posting Module", description = "Posting Module")
@RequestMapping("/posting")
public class PostingController {

    private final PostingService postingService;

    public PostingController(PostingService postingService)
    {
        this.postingService = postingService;
    }

    @Operation(summary = "Batch Deposit Upload")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Batch Deposit Upload",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = BatchDepositUploadResponse.class))})})
    @PostMapping("/batchDepositUpload")
    public BatchDepositUploadResponse batchDepositUpload (
            @Valid
            @RequestBody BatchDepositUploadRequest request)
            throws InvocationTargetException, IllegalAccessException {
        return postingService.batchDepositUpload(request);
    }
}
