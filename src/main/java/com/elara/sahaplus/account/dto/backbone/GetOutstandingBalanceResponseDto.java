package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetOutstandingBalanceResponseDto {
  private String MFBCode;
  private String AccountNumber;
  private String AvailableBalance;
  private String FinancialDate;
}

