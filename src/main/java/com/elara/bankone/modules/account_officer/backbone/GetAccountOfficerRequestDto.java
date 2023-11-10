package com.elara.bankone.modules.account_officer.backbone;

import lombok.Data;

@Data
public class GetAccountOfficerRequestDto {

  private String authtoken;

  private String version;
  private String mfbCode;
}
