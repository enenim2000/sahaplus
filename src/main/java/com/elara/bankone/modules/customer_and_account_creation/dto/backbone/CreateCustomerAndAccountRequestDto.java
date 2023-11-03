package com.elara.bankone.modules.customer_and_account_creation.dto.backbone;

import com.elara.bankone.enums.Gender;
import lombok.Data;

@Data
public class CreateCustomerAndAccountRequestDto {

  private String authtoken;
  private String institutionCode;
  private String FirstName;

  //optional
  private String MiddleName;
  private String LastName;
  private String Email;
  private String OtherNames;
  private String MaidenName;
  private String DateOfBirth;
  private Gender Gender;
  private String Address;
  private String PhoneNumber;
  private String ProductCode;
  private String ProductCode2;
  private String StateOfOrigin;
  private String LGA;
  private byte[] CustomerImage;
  private String BiometricDetails;
  private boolean Consent;
  private String CBNCode;
}



