package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class ReverseTransactionRequestDto {

  private String authtoken;
  private String InstitutionCode;
  private String TransactionReference;
  private String TransactionSuccessRef;
}


