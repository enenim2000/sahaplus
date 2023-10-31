package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class SearchTransactionForCustomerRequestDto {

  private String authtoken;
  private String customerId;

  //optional
  private String fromDate;
  private String toDate;
  private String beneficiaryname;
  private double amount;
  private String institutionCode;
  private int pageIndex;
  private int pageSize;
}
