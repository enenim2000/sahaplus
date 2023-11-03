package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetCumIntAccrualOnFixedDepositAccountRequest {

  private String accountNumber;
  private String financialDate;
}