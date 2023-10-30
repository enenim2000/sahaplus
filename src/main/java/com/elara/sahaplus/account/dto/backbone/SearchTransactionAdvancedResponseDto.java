package com.elara.sahaplus.account.dto.backbone;

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
public class SearchTransactionAdvancedResponseDto {

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
    private String TransactionDate;
    private String UniqueIdentifier;
    private double WithdrawableAmount;
    private String AccountNumber;
    private int Size;
    private int PageIndex;
    private long TotalElements;
    private long TotalPages;
  }
}

