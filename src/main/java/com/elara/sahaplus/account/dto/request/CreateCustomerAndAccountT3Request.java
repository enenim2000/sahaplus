package com.elara.sahaplus.account.dto.request;

import com.elara.sahaplus.enums.AccountInformationSource;
import com.elara.sahaplus.enums.Gender;
import lombok.Data;

@Data
public class CreateCustomerAndAccountT3Request {
  private String email;
  private String transactionTrackingRef;
  private Gender gender;
  private String dateOfBirth;
  private String bvn;
  private String customerID;
  private String accountOpeningTrackingRef;
  private String productCode;
  private String lastName;
  private String otherNames;
  private String fullName;
  private String phoneNo;
  private String placeOfBirth;
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
  private String version;
}
