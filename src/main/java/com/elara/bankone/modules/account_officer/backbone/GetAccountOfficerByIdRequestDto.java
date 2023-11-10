package com.elara.bankone.modules.account_officer.backbone;

import lombok.Data;

@Data
public class GetAccountOfficerByIdRequestDto {

  private String authtoken;
  private long accountOfficerID;

  private String version;
}
