package com.elara.sahaplus.customer_and_account_creation.dto.request;

import com.elara.sahaplus.enums.Gender;
import lombok.Data;

@Data
public class CreateCustomerAccountRequest {

  private String firstName;

  //optional
  private String middleName;
  private String lastName;
  private String email;
  private String otherNames;
  private String maidenName;
  private String dateOfBirth;
  private Gender gender;
  private String address;
  private String phoneNumber;
  private String productCode;
  private String productCode2;
  private String stateOfOrigin;
  private String lga;
  private byte[] customerImage;
  private String biometricDetails;
  private boolean consent;
  private String cbnCode;
}


