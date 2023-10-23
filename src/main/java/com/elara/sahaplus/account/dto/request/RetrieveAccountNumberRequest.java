package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class RetrieveAccountNumberRequest {
  private String acctOpeningTrackingRef;
  private String mfbCode;

  //optional
  private String version;
}
