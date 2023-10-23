package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class GetCumIntAccrualOnFixedDepositAccountResponseDto {

  private boolean IsDiscountDeposit;
  private String AccountName;
  private String AccountNo;
  private String Amount;
  private int Tenure;
  private String ProductName;
  private double InterestRate;
  private String MaturationDate;
  private String TotalFixedInterestPayable;
  private String TotalInterestPayable;
  private String TotalInterestAccrued;
  private String AccountOfficerName;
  private boolean ShouldRollover;
  private boolean ShouldRolloverWithInterest;
  private boolean DropInterestMonthly;
  private String AccountOfficerID;
}

