package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetTransactions2RequestDto {

  private String authtoken;
  private String accountNumber;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int numberOfItems;
  private String version;
}
