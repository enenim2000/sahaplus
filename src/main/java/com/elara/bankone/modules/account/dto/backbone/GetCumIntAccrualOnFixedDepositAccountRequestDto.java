package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetCumIntAccrualOnFixedDepositAccountRequestDto {

  private String authtoken;
  private String accountNumber;
  private String financialDate;
}