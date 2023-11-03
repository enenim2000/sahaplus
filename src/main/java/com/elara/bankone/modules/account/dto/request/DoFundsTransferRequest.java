package com.elara.bankone.modules.account.dto.request;

import com.elara.bankone.enums.TransactionType;
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
