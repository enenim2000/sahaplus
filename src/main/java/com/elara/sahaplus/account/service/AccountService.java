package com.elara.sahaplus.account.service;

import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountResponseDto;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
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
    CreateCustomerAndAccountResponseDto apiResponse = httpClient.callApi(request, CreateCustomerAndAccountResponseDto.class, HttpMethod.POST, "/Account/CreateCustomerAndAccount");

    CreateCustomerAndAccountResponse response = new CreateCustomerAndAccountResponse();
    response.getData().setTransactionTrackingRef(apiResponse.getTransactionTrackingRef());
    response.getData().setCustomerIDInString(apiResponse.getCustomerIDInString());
    return response;
  }
}
