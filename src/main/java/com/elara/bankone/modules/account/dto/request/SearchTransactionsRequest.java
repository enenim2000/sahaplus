package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class SearchTransactionsRequest {

  private String accountNumber;
  private double amount;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int numberOfItems;
}

