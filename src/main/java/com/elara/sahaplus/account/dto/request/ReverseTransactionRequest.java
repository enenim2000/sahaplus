package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class ReverseTransactionRequest {

  private String institutionCode;
  private String transactionReference;
  private String transactionSuccessRef;
}

