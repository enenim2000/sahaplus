package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetTransactionsPaginatedRequest {

  private String accountNumber;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int pageNo;
  private int pageSize;
  private String version;
}
