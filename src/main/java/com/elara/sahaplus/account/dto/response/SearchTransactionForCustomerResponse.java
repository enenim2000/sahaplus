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
public class SearchTransactionForCustomerResponse extends BaseResponse {

  public SearchTransactionForCustomerResponse() {
    super();
  }

  private Data data;
  private int Size;
  private int PageIndex;
  private long TotalElements;
  private long TotalPages;

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
    private String openingBalance;
    private String postingType;
    private String refernceID;
    private String reversalReferenceNo;
    private String transactionDate;
    private String uniqueIdentifier;
    private double withdrawableAmount;
    private String accountNumber;
  }
}
