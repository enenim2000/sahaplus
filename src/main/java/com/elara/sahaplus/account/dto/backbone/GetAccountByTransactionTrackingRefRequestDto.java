package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountByTransactionTrackingRefRequestDto {
  private String authtoken;
  private String transactionTrackingRef;
  private boolean computewithdrawableBalance;
  private String version;
  private String mfbCode;
}