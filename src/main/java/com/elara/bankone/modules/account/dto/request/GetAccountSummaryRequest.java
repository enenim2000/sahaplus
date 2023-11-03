package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetAccountSummaryRequest {

  private String accountNumber;

  //optional
  private String institutionCode;
}
