package com.elara.sahaplus.account.dto.request;

import com.elara.sahaplus.enums.TransactionType;
import lombok.Data;

@Data
public class DoFundsTransferRequest {

  private String institutionCode;
  private String accountNumber;
  private String transactionReference;

  //Optional
  private long amount;
  private long fee;
  private String instrumentNo;
  private TransactionType transactionType;
}
