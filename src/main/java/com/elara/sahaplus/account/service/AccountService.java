package com.elara.sahaplus.account.service;

import com.elara.sahaplus.account.dto.backbone.CloseAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CloseAccountResponseDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountRequestDto;
import com.elara.sahaplus.account.dto.backbone.CreateCustomerAndAccountResponseDto;
import com.elara.sahaplus.account.dto.request.CloseAccountRequest;
import com.elara.sahaplus.account.dto.request.CreateCustomerAndAccountRequest;
import com.elara.sahaplus.account.dto.response.CloseAccountResponse;
import com.elara.sahaplus.account.dto.response.CreateCustomerAndAccountResponse;
import com.elara.sahaplus.transaction.dto.backbone.CustomerTransactionsByReferenceNumberRequestDto;
import com.elara.sahaplus.transaction.dto.backbone.CustomerTransactionsByReferenceNumberResponseDto;
import com.elara.sahaplus.transaction.dto.response.CustomerTransactionsByReferenceNumberResponse;
import com.elara.sahaplus.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

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
