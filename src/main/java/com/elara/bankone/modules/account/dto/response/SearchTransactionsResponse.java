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
public class SearchTransactionsResponse extends BaseResponse {

  private Data data;

  public SearchTransactionsResponse() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
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
    private String dateTime;
    private String uniqueIdentifier;
    private double withdrawableAmount;
  }
}
