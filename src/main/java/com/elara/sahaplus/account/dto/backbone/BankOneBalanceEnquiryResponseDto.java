package com.elara.sahaplus.account.dto.backbone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class BankOneBalanceEnquiryResponseDto {

  private boolean IsSuccessful;
  private String TransactionTrackingRef;
  private String CustomerIDInString;
  private Data Message;

  @Getter
  @Setter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private String MFBCode;
    private String AccountNumber;
    private String LedgerBalance;
    private String AvailableBalance;
    private String WithdrawableAmount;
    private String FinancialDate;
  }
}
