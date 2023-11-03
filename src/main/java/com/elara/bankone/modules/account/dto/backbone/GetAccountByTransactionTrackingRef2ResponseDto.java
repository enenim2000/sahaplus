package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountByTransactionTrackingRef2ResponseDto {
  private String AvailableBalance;
  private String WithdrawableBalance;
  private String CustomerID;
  private String NUBAN;
  private String AccountTier;
}
