package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetOutstandingBalanceRequestDto {
  private String mfbCode;
  private String authtoken;
  private String accountNumber;

  private String version;
}
