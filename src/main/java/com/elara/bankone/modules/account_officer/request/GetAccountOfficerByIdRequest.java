package com.elara.bankone.modules.account_officer.request;

import lombok.Data;

@Data
public class GetAccountOfficerByIdRequest {

  private String authtoken;
  private long accountOfficerID;

  private String version;
}
