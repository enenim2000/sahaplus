package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class DoNameEnquiryRequestDto {

  //Required
  private String authtoken;
  private String accountNumber;
  private String institutionCode;
}
