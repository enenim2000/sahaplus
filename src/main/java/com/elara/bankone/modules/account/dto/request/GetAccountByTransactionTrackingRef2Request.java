package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetAccountByTransactionTrackingRef2Request {
  private String transactionTrackingRef;
  private boolean computewithdrawableBalance;
  private String version;
}