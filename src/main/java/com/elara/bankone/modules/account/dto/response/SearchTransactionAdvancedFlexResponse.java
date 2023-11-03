package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SearchTransactionAdvancedFlexResponse extends BaseResponse {

  private Data data;

  public SearchTransactionAdvancedFlexResponse() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private double amount;
    private double balance;
    private String debit;
    private String credit;
    private String instrumentNo;
    private boolean isReversed;
    private String narration;
    private double openingBalance;
    private String postingType;
    private String referenceID;
    private String reversalReferenceNo;
    private String transactionDate;
    private String uniqueIdentifier;
    private double withdrawableAmount;
    private String accountNumber;
    private int size;
    private int pageIndex;
    private long totalElements;
    private long totalPages;
  }
}
