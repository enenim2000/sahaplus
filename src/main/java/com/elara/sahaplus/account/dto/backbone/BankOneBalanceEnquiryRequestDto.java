package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class BankOneBalanceEnquiryRequestDto {

  private String authtoken;
  private String accountNumber;
  private String financialDate;

  private String version;
}
