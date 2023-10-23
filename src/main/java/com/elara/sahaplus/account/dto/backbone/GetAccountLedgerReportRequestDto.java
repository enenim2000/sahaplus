package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetAccountLedgerReportRequestDto {

  private String authtoken;
  private String accountNumber;
  private String fromDate;
  private String toDate;
  private int page;
  private int pageSize;
  private String version;
}

