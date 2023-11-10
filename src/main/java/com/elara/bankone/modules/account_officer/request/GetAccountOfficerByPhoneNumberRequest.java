package com.elara.bankone.modules.account_officer.request;

import lombok.Data;

@Data
public class GetAccountOfficerByPhoneNumberRequest {

  private String phoneNumber;
  
  private String version;
}
