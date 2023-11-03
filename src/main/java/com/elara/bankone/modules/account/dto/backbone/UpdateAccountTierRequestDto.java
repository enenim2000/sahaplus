package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class UpdateAccountTierRequestDto {
  private String authtoken;
  private String AccountNumber;
  private long AccountTier;

  //Optional
  boolean SkipAddressVerification;
  private String version;
}
