package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class AddAccountToCustomerRequest {

  private String transactionTrackingRef;
  private String accountOpeningTrackingRef;
  private String customerID;
  private String productCode;
  private String email;
  private String bvn;

  //optional
  private String accountName;
  private String accountOfficerCode;
  private String mfbCode;
  private String version;
}
