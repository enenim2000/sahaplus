package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class ReverseTransactionRequestDto {

  private String authtoken;
  private String InstitutionCode;
  private String TransactionReference;
  private String TransactionSuccessRef;
}


