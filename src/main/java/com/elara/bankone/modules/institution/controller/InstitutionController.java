package com.elara.bankone.modules.institution.controller;

import com.elara.bankone.modules.institution.dto.request.RetrieveByCodeRequest;
import com.elara.bankone.modules.institution.dto.response.GetCrmsResponse;
import com.elara.bankone.modules.institution.dto.response.RetrieveByCodeResponse;
import com.elara.bankone.modules.institution.service.InstitutionService;
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
@Tag(name = "Institution Module", description = "Institution Module")
@RequestMapping("/institution")
public class InstitutionController {

    private final InstitutionService institutionService;

    public InstitutionController(InstitutionService institutionService)
    {
        this.institutionService = institutionService;
    }

    @Operation(summary = "Get CRMS")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get CRMS",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetCrmsResponse.class))})})
    @GetMapping("/getCrms")
    public GetCrmsResponse getCrms ()
            throws InvocationTargetException, IllegalAccessException
    {
        return institutionService.getCrms();
    }

    @Operation(summary = "Retrieve By Code")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retrieve By Code",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = RetrieveByCodeResponse.class))})})
    @GetMapping("/retrieveByCode")
    public RetrieveByCodeResponse retrieveByCode (RetrieveByCodeRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return institutionService.retrieveByCode(request);
    }

    @Operation(summary = "Retrieve By Institution Code")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retrieve By Institution Code",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = RetrieveByCodeResponse.class))})})
    @GetMapping("/retrieveByInstitutionCode")
    public RetrieveByCodeResponse retrieveByInstitutionCode (RetrieveByCodeRequest request)
            throws InvocationTargetException, IllegalAccessException
    {
        return institutionService.retrieveByInstitutionCode(request);
    }
}
