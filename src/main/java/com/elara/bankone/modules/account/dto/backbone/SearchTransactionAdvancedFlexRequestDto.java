package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class SearchTransactionAdvancedFlexRequestDto {

  private String authtoken;
  private String customerId;
  private String accountNumber;
  private String fromDate;
  private String toDate;
  private String beneficiaryname;
  private double amount;
  private String institutionCode;
  private int pageIndex;
  private int pageSize;
}