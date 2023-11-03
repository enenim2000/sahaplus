package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetOutstandingBalanceRequest {
  private String mfbCode;
  private String accountNumber;
  private String version;
}
