package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetOutstandingBalanceRequest {
  private String mfbCode;
  private String accountNumber;
  private String version;
}
