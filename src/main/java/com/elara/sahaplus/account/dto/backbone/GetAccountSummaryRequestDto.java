package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountSummaryRequestDto {

  private String authtoken;
  private String accountNumber;

  //optional
  private String institutionCode;
}
