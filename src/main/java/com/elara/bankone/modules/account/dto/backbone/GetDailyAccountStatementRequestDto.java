package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetDailyAccountStatementRequestDto {

  private String authtoken;
  private String accountNumber;
  private String financialDate;
  private String institutionCode;

  //optional
  private int page;
  private int pageSize;
}