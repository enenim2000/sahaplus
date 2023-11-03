package com.elara.bankone.modules.account.dto.backbone;

import com.elara.bankone.enums.AccountStatus;
import com.elara.bankone.enums.Delivery;
import com.elara.bankone.enums.MaturationStatus;
import com.elara.bankone.enums.Period;
import lombok.Data;

@Data
public class UpdateInterestRolloverOptionRequestDto {

  private String authtoken;
  private String IsDiscountDeposit;
  private String AccountNo;

  //optional
  private String ID;
  private String AccountName;
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
  private long AccountOfficerID;
  private AccountStatus AccountStatus;
  private double AnnualPercentageYielding;
  private long BranchID;
  private long CustomerID;
  private MaturationStatus MaturationStatus;
  private String Referee1CustomerID;
  private String Referee2CustomerID;
  private long ProductID;
  private String LiquidationAccount;
  private boolean ApplyInterestMonthly;
  private Period StatementPreference_Period;
  private Delivery StatementPreference_Delivery;
  private String InterestAccrualCommenceDate;
}
