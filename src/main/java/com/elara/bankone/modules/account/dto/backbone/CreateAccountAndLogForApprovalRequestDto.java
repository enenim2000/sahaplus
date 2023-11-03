package com.elara.bankone.modules.account.dto.backbone;

import com.elara.bankone.enums.AccountInformationSource;
import com.elara.bankone.enums.Gender;
import lombok.Data;

@Data
public class CreateAccountAndLogForApprovalRequestDto {

  private String authtoken;
  private String TransactionTrackingRef;
  private String CustomerID;
  private String ProductCode;
  private String AccountOfficerCode;

  //optional
  private String AccountOpeningTrackingRef;
  private String LastName;
  private String OtherNames;
  private String BVN;
  private String FullName;
  private String PhoneNo;
  private Gender Gender;
  private String PlaceOfBirth;
  private String DateOfBirth;
  private String Address;
  private String NationalIdentityNo;
  private String NextOfKinPhoneNo;
  private String NextOfKinName;
  private String ReferralPhoneNo;
  private String ReferralName;
  private boolean HasSufficientInfoOnAccountInfo;
  private AccountInformationSource AccountInformationSource;
  private String OtherAccountInformationSource;
  private String BranchCode;
  private String CBNCode;
  private String AccountNumber;
  private String Email;
  private String CustomerImage;
  private String CustomerSignature;
}
