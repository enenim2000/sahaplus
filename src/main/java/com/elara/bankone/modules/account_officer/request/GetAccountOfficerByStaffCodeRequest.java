package com.elara.bankone.modules.account_officer.request;

import lombok.Data;

@Data
public class GetAccountOfficerByStaffCodeRequest {
  private String staffCode;

  private String version;
}
