package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetAccountSummaryRequest {

  private String accountNumber;

  //optional
  private String institutionCode;
}
