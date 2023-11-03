package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetAccountByTransactionTrackingRefRequest {
  private String transactionTrackingRef;
  private boolean computewithdrawableBalance;
  private String version;
  private String mfbCode;
}