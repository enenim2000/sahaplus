package com.elara.sahaplus.account.dto.backbone;

import com.elara.sahaplus.enums.Gender;
import lombok.Data;

@Data
public class CreateAccountQuickRequestDto {
  private String authtoken;
  private String TransactionTrackingRef;
  private String Email;
  private String ProductCode;
  private String AccountOfficerCode;
  private Gender Gender;

  private String CustomerID;
  private String AccountOpeningTrackingRef;
  private String LastName;
  private String OtherNames;
  private String BVN;
  private String FullName;
  private String PhoneNo;
  private String PlaceOfBirth;
  private String DateOfBirth;
  private String Address;
  private String NationalIdentityNo;
  private String NextOfKinPhoneNo;
  private String NextOfKinName;
  private String ReferralPhoneNo;
  private String ReferralName;
  private boolean HasSufficientInfoOnAccountInfo;
  private com.elara.sahaplus.enums.AccountInformationSource AccountInformationSource;
  private String OtherAccountInformationSource;
  private String BranchCode;
  private String CBNCode;
  private String AccountNumber;
  private String CustomerImage;
  private String CustomerSignature;
  private String version;
}
