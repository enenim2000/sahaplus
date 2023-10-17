package com.elara.sahaplus.account.service;

import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountResponseDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountT3RequestDto;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountT3Request;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountT3Response;
import com.elara.sahaplus.customer.dto.backbone.UpdateCustomerResponseDto;
import com.elara.sahaplus.util.HttpClient;
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

  public CreateCustomerAndAccountResponse createCustomerAndAccount(CreateCustomerAndAccountRequest request) {

    CreateCustomerAndAccountRequestDto dto = new CreateCustomerAndAccountRequestDto();
    dto.setEmail(request.getEmail());
    /*
    ........................
    ..Set other parameters..
    ........................
     */
    CreateCustomerAndAccountResponseDto apiResponse = httpClient.callApi(dto, CreateCustomerAndAccountResponseDto.class, HttpMethod.POST, "/Account/CreateCustomerAndAccount");

    CreateCustomerAndAccountResponse response = new CreateCustomerAndAccountResponse();
    response.getData().setTransactionTrackingRef(apiResponse.getTransactionTrackingRef());
    response.getData().setCustomerIDInString(apiResponse.getCustomerIDInString());
    return response;
  }

  @SneakyThrows
  public CreateCustomerAndAccountT3Response createCustomerAndAccountT3(
      CreateCustomerAndAccountT3Request request) {
    var requestDto = new CreateCustomerAndAccountT3RequestDto();
    BeanUtils.copyProperties(requestDto, request);
    log.info("CreateCustomerAndAccountT3Request: {}", requestDto);

    var apiResponse = httpClient.callApi(requestDto, UpdateCustomerResponseDto.class, HttpMethod.POST,
        "/Account/CreateCustomerAndAccountT3");

    var response = new CreateCustomerAndAccountT3Response();
    BeanUtils.copyProperties(response.getData(), apiResponse);
    log.info("CreateCustomerAndAccountT3Response: {}", response);

    return response;

  }
}
