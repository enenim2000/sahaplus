package com.elara.bankone.modules.customer_and_account_creation.dto.backbone;

import lombok.Data;

@Data
public class CreateCustomerAndAccountResponseDto {

  private String CustomerID;
  private String AccountNumber;
  private String FullName;

}

