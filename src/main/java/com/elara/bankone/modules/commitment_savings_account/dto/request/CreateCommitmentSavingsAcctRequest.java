package com.elara.bankone.modules.commitment_savings_account.dto.request;

import com.elara.bankone.enums.AccountStatus;
import com.elara.bankone.enums.Delivery;
import com.elara.bankone.enums.MaturationStatus;
import com.elara.bankone.enums.Period;
import lombok.Data;

@Data
public class CreateCommitmentSavingsAcctRequest {

  private boolean isDiscountDeposit;
  private String liquidationAccount;
  private long customerID;

  //optional
  private String accountName;
  private String accountNo;
  private long id;
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
  private MaturationStatus maturationStatus;
  private String referee1CustomerID;
  private String referee2CustomerID;
  private long productID;
  private boolean applyInterestMonthly;
  private Period statementPreference_period;
  private Delivery statementPreference_delivery;
  private String interestAccrualCommenceDate;
  private String version;
}