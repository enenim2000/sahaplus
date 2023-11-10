package com.elara.bankone.modules.account_officer.backbone;

import lombok.Data;

@Data
public class GetAccountOfficerByStaffCodeRequestDto {

  private String authtoken;
  private String staffCode;

  private String version;
}
