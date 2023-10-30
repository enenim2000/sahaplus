package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetTransactions2Request {

  private String accountNumber;
  private String fromDate;
  private String toDate;
  private String institutionCode;
  private int numberOfItems;
  private String version;
}
