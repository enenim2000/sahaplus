package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class RetrieveAccountNumberRequestDto {
  private String authtoken;
  private String acctOpeningTrackingRef;
  private String mfbCode;

  //optional
  private String version;
}
