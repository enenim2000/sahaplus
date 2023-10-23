package com.elara.sahaplus.account.dto.backbone;

import com.elara.sahaplus.enums.AccountInformationSource;
import com.elara.sahaplus.enums.Gender;
import lombok.Data;

@Data
public class CreateAccountRequestDto {

  private String authtoken;
  private String TransactionTrackingRef;
  private Gender Gender;
  private String BVN;
  private String Email;

  //optional
  private String CustomerID;
  private String AccountOpeningTrackingRef;
  private String ProductCode;
  private String LastName;
  private String OtherNames;
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
  private AccountInformationSource AccountInformationSource;
  private String OtherAccountInformationSource;
  private String AccountOfficerCode;
  private String BranchCode;
  private String CBNCode;
  private String AccountNumber;
  private String CustomerImage;
  private String CustomerSignature;
  private String mfbCode;
  private String version;
}
