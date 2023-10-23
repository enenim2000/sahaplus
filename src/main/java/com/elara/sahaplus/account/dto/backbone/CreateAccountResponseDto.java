package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class CreateAccountResponseDto {

  private boolean IsSuccessful;
  private String Message;
  private String TransactionTrackingRef;
  private String CustomerIDInString;
}
