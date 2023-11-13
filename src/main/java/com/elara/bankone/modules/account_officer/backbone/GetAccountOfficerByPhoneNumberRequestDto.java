package com.elara.bankone.modules.account_officer.backbone;

import lombok.Data;

@Data
public class GetAccountOfficerByPhoneNumberRequestDto {

  private String authtoken;
  private String phoneNumber;

  private String version;
}
