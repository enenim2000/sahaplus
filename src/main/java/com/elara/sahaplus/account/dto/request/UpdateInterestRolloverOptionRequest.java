package com.elara.sahaplus.account.dto.request;

import com.elara.sahaplus.enums.AccountStatus;
import com.elara.sahaplus.enums.Delivery;
import com.elara.sahaplus.enums.MaturationStatus;
import com.elara.sahaplus.enums.Period;
import lombok.Data;

@Data
public class UpdateInterestRolloverOptionRequest {

  private String isDiscountDeposit;
  private String accountNo;

  //optional
  private String id;
  private String accountName;
  private String amount;
  private int tenure;
  private String productName;
  private double interestRate;
  private String maturationDate;
  private String totalFixedInterestPayable;
  private String totalInterestPayable;
  private String totalInterestAccrued;
  private String accountOfficerName;
  private boolean shouldRollover;
  private boolean shouldRolloverWithInterest;
  private boolean dropInterestMonthly;
  private long accountOfficerID;
  private AccountStatus accountStatus;
  private double annualPercentageYielding;
  private long branchID;
  private long customerID;
  private MaturationStatus maturationStatus;
  private String referee1CustomerID;
  private String referee2CustomerID;
  private long ProductID;
  private String liquidationAccount;
  private boolean applyInterestMonthly;
  private Period statementPreference_Period;
  private Delivery statementPreference_Delivery;
  private String interestAccrualCommenceDate;
}
