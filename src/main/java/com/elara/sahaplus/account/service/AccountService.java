package com.elara.sahaplus.account.service;

import com.elara.sahaplus.account.dto.backbone.ChangeAccountLevelResponseDto;
import com.elara.sahaplus.account.dto.backbone.CloseAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CloseAccountResponseDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountResponseDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountT3RequestDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountT3ResponseDto;
import com.elara.sahaplus.account.dto.backbone.GetSupportingDocumentRequestDto;
import com.elara.sahaplus.account.dto.backbone.GetSupportingDocumentResponseDto;
import com.elara.sahaplus.account.dto.backbone.UpdateAccountTier2RequestDto;
import com.elara.sahaplus.account.dto.backbone.UpdateAccountTier2ResponseDto;
import com.elara.sahaplus.account.dto.backbone.UpdateAccountTierRequestDto;
import com.elara.sahaplus.account.dto.backbone.UpdateAccountTierResponseDto;
import com.elara.sahaplus.account.dto.backbone.UploadSupportingDocumentRequestDto;
import com.elara.sahaplus.account.dto.backbone.UploadSupportingDocumentResponseDto;
import com.elara.sahaplus.account.dto.request.ChangeAccountLevelRequest;
import com.elara.sahaplus.account.dto.request.CloseAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountT3Request;
import com.elara.sahaplus.account.dto.request.GetSupportingDocumentRequest;
import com.elara.sahaplus.account.dto.request.UpdateAccountTier2Request;
import com.elara.sahaplus.account.dto.request.UpdateAccountTierRequest;
import com.elara.sahaplus.account.dto.request.UploadSupportingDocumentRequest;
import com.elara.sahaplus.account.dto.response.ChangeAccountLevelResponse;
import com.elara.sahaplus.account.dto.response.CloseAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountT3Response;
import com.elara.sahaplus.account.dto.response.GetSupportingDocumentResponse;
import com.elara.sahaplus.account.dto.response.UpdateAccountTier2Response;
import com.elara.sahaplus.account.dto.response.UpdateAccountTierResponse;
import com.elara.sahaplus.account.dto.response.UploadSupportingDocumentResponse;
import com.elara.sahaplus.util.HttpClient;
import java.lang.reflect.InvocationTargetException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService {

  private final HttpClient httpClient;

  public AccountService(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  @SneakyThrows
  public CreateCustomerAndAccountResponse createCustomerAndAccount(CreateCustomerAndAccountRequest request) {

    var requestDto = new CreateCustomerAndAccountRequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("CreateCustomerAndAccountRequest: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, CreateCustomerAndAccountResponseDto.class, HttpMethod.POST,
        "/Account/CreateCustomerAndAccount");

    var response = new CreateCustomerAndAccountResponse();
    BeanUtils.copyProperties(response.getData(), apiResponse);
    log.info("CreateCustomerAndAccountResponse: {}", response);

    return response;
  }

  @SneakyThrows
  public CreateCustomerAndAccountT3Response createCustomerAndAccountT3(
      CreateCustomerAndAccountT3Request request) {
    var requestDto = new CreateCustomerAndAccountT3RequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("CreateCustomerAndAccountT3Request: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, CreateCustomerAndAccountT3ResponseDto.class, HttpMethod.POST,
        "/Account/CreateCustomerAndAccountT3");

    var response = new CreateCustomerAndAccountT3Response();
    BeanUtils.copyProperties(response.getData(), apiResponse);
    log.info("CreateCustomerAndAccountT3Response: {}", response);

    return response;

  }

  @SneakyThrows
  public ChangeAccountLevelResponse changeAccountLevel(ChangeAccountLevelRequest request) {
    var requestDto = new CreateCustomerAndAccountT3RequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("ChangeAccountLevelRequest: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, ChangeAccountLevelResponseDto.class, HttpMethod.POST,
        "/Account/ChangeAccountLevel");

    var response = new ChangeAccountLevelResponse();
    response.setResponseMessage(apiResponse.getResponseMessage());
    log.info("ChangeAccountLevelResponse: {}", response);

    return response;
  }

  @SneakyThrows
  public UpdateAccountTierResponse updateAccountTier(UpdateAccountTierRequest request) {
    var requestDto = new UpdateAccountTierRequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("UpdateAccountTierRequest: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, UpdateAccountTierResponseDto.class, HttpMethod.POST,
        "/Account/UpdateAccountTier");

    var response = new UpdateAccountTierResponse();
    response.setResponseMessage(apiResponse.getMessage());
    log.info("UpdateAccountTierResponse: {}", response);

    return response;
  }

  @SneakyThrows
  public UpdateAccountTier2Response updateAccountTier2(UpdateAccountTier2Request request) {
    var requestDto = new UpdateAccountTier2RequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("UpdateAccountTier2Request: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, UpdateAccountTier2ResponseDto.class, HttpMethod.POST,
        "/Account/UpdateAccountTier2");

    var response = new UpdateAccountTier2Response();
    response.setResponseMessage(apiResponse.getMessage());
    log.info("UpdateAccountTier2Response: {}", response);

    return response;
  }

  @SneakyThrows
  public UploadSupportingDocumentResponse uploadSupportingDocument(UploadSupportingDocumentRequest request) {
    var requestDto = new UploadSupportingDocumentRequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("UploadSupportingDocumentRequest: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, UploadSupportingDocumentResponseDto.class, HttpMethod.POST,
        "/Account/UploadSupportingDocument");

    var response = new UploadSupportingDocumentResponse();
    response.setResponseMessage(apiResponse.getMessage());
    log.info("UploadSupportingDocumentResponse: {}", response);

    return response;
  }

  @SneakyThrows
  public GetSupportingDocumentResponse getSupportingDocument(GetSupportingDocumentRequest request) {

    var requestDto = new GetSupportingDocumentRequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("GetSupportingDocumentRequest: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, GetSupportingDocumentResponseDto.class, HttpMethod.POST,
        "/Account/GetSupportingDocument");

    var response = new GetSupportingDocumentResponse();
    BeanUtils.copyProperties(response.getData(), apiResponse);
    log.info("GetSupportingDocumentResponse: {}", response);

    return response;
  }

  public CloseAccountResponse closeAccount (
          CloseAccountRequest request
  )
          throws InvocationTargetException, IllegalAccessException
  {
      var requestDto = new CloseAccountRequestDto();
      BeanUtils.copyProperties(requestDto, request);
      log.info("CLOSE_ACCOUNT_REQUEST: {}", requestDto);

      var apiResponse = httpClient.callApi(request, CloseAccountResponseDto.class, HttpMethod.POST,
              "/Account/CloseAccount");

      var response = new CloseAccountResponse();
      BeanUtils.copyProperties(response.getData(), apiResponse);
      log.info("CLOSE_ACCOUNT_RESPONSE: {}", response);

      return response;
    }
}
