package com.elara.bankone.modules.account.dto.backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SearchTransactionsResponseDto {

  private boolean IsSuccessful;
  private Data Message;

  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private double Amount;
    private double Balance;
    private String Debit;
    private String Credit;
    private String InstrumentNo;
    private boolean IsReversed;
    private String Narration;
    private double OpeningBalance;
    private String PostingType;
    private String ReferenceID;
    private String ReversalReferenceNo;
    private String DateTime;
    private String UniqueIdentifier;
    private double WithdrawableAmount;
  }
}
