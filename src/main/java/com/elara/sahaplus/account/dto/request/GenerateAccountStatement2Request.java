package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GenerateAccountStatement2Request {

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
  private String version;
}