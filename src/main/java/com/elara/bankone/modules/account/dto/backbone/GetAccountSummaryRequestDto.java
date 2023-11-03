package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountSummaryRequestDto {

  private String authtoken;
  private String accountNumber;

  //optional
  private String institutionCode;
}
