package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class CreateAccountAndLogForApprovalResponseDto {

  private String AccountNumber;
  private String CustomerID;
  private String FullName;
  private String CreationMessage;
}
