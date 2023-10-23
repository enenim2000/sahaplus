package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetAccountLedgerReportRequest {

  private String accountNumber;
  private String fromDate;
  private String toDate;
  private int page;
  private int pageSize;
  private String version;
}

