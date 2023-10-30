package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetTransactionsPaginatedRequestDto {

  private String authtoken;
  private String accountNumber;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int pageNo;
  private int pageSize;
  private String version;
}
