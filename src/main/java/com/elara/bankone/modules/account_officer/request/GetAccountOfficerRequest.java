package com.elara.bankone.modules.account_officer.request;

import lombok.Data;

@Data
public class GetAccountOfficerRequest {
  private String version;
  private String mfbCode;
}
