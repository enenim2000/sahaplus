package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class SearchTransactionsRequestDto {

  private String authtoken;
  private String accountNumber;
  private double amount;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int numberOfItems;
}

