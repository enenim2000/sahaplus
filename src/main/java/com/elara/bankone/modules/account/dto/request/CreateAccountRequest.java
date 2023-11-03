package com.elara.bankone.modules.account.dto.request;

import com.elara.bankone.enums.AccountInformationSource;
import com.elara.bankone.enums.Gender;
import lombok.Data;

@Data
public class CreateAccountRequest {

  private String transactionTrackingRef;
  private Gender gender;
  private String bvn;
  private String email;

  //optional
  private String customerID;
  private String accountOpeningTrackingRef;
  private String productCode;
  private String lastName;
  private String otherNames;
  private String fullName;
  private String phoneNo;
  private String placeOfBirth;
  private String dateOfBirth;
  private String address;
  private String nationalIdentityNo;
  private String nextOfKinPhoneNo;
  private String nextOfKinName;
  private String referralPhoneNo;
  private String referralName;
  private boolean hasSufficientInfoOnAccountInfo;
  private AccountInformationSource accountInformationSource;
  private String otherAccountInformationSource;
  private String accountOfficerCode;
  private String branchCode;
  private String cbnCode;
  private String accountNumber;
  private String customerImage;
  private String customerSignature;
  private String mfbCode;
  private String version;
}
