package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class UpdateAccountTier2Request {

  private String accountNumber;
  private long accountTier;

  //Optional
  boolean skipAddressVerification;
  private String version;
}
