package com.elara.bankone.modules.account.dto.backbone;

import com.elara.bankone.enums.AccountInformationSource;
import com.elara.bankone.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateCustomerAndAccountRequestDto {

  private String Email;
  private String authtoken;
  private String TransactionTrackingRef;

  @JsonProperty("Gender")
  private Gender Gender;

  private String DateOfBirth; //DateTime
  private String BVN;
  private String CustomerID;
  private String AccountOpeningTrackingRef;
  private String ProductCode;
  private String LastName;
  private String OtherNames;
  private String FullName;
  private String PhoneNo;
  private String PlaceOfBirth;
  private String Address;
  private String NationalIdentityNo;
  private String NextOfKinPhoneNo;
  private String NextOfKinName;
  private String ReferralPhoneNo;
  private String ReferralName;
  private boolean HasSufficientInfoOnAccountInfo;

  @JsonProperty("AccountInformationSource")
  private AccountInformationSource AccountInformationSource;

  private String OtherAccountInformationSource;
  private String AccountOfficerCode;
  private String BranchCode;
  private String CBNCode;
  private String AccountNumber;
  private String CustomerImage;
  private String CustomerSignature;
  private String version;

}
