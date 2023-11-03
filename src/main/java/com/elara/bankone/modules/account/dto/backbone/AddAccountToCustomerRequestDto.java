package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class AddAccountToCustomerRequestDto {

  private String authtoken;
  private String TransactionTrackingRef;
  private String AccountOpeningTrackingRef;
  private String CustomerID;
  private String ProductCode;
  private String Email;
  private String BVN;

  //optional
  private String AccountName;
  private String AccountOfficerCode;
  private String mfbCode;
  private String version;
}
