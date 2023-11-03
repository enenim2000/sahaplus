package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GenerateAccountStatementRequestDto {

  private String authtoken;
  private String accountNumber;
  private String institutionCode;

  //optional
  private String fromDate;
  private String toDate;
  private boolean isPdf;
  private boolean arrangeAsc;
  private boolean showSerialNumber;
  private boolean showTransactionDate;
  private boolean showReversedTransactions;
  private boolean showInstrumentNumber;
}
