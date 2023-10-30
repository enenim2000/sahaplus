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
public class GetTransactionsPaginatedResponseDto {

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
    private boolean OpeningBalance;
    private String PostingType;
    private String ReferenceID;
    private String ReversalReferenceNo;
    private String TransactionDate;
    private String UniqueIdentifier;
    private double WithdrawableAmount;
    private String CurrentDate;
    private String TransactionDateString;
    private boolean IsCardTransaction;
    private int size;
    private long totalCount;
    private long totalPages;
  }
}
