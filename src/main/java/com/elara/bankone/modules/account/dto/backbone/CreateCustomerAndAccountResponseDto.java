package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class CreateCustomerAndAccountResponseDto {

  private boolean IsSuccessful;
  private String Message;
  private String TransactionTrackingRef;
  private String CustomerIDInString;
}
