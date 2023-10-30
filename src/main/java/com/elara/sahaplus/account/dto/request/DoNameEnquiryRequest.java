package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class DoNameEnquiryRequest {

  //Required
  private String accountNumber;
  private String institutionCode;
}
