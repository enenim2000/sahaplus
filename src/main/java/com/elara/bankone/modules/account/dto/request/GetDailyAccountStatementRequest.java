package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetDailyAccountStatementRequest {

  private String accountNumber;
  private String financialDate;
  private String institutionCode;

  //optional
  private int page;
  private int pageSize;
}
