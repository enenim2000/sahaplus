package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountByTransactionTrackingRef2RequestDto {
  private String authtoken;
  private String transactionTrackingRef;
  private boolean computewithdrawableBalance;
  private String version;
}
