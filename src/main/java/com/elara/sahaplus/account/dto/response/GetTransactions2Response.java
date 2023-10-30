package com.elara.sahaplus.account.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class GetTransactions2Response extends BaseResponse {

  private Data data;

  public GetTransactions2Response() {
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
    private boolean openingBalance;
    private String postingType;
    private String referenceID;
    private String reversalReferenceNo;
    private String transactionDate;
    private String uniqueIdentifier;
    private double withdrawableAmount;
    private String currentDate;
    private String transactionDateString;
    private boolean isCardTransaction;
  }
}
