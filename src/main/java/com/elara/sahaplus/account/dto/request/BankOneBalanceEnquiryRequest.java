package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class BankOneBalanceEnquiryRequest {

  private String authtoken;
  private String accountNumber;
  private String financialDate;

  private String version;
}

