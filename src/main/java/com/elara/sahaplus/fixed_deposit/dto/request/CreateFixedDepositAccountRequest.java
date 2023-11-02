package com.elara.sahaplus.fixed_deposit.dto.request;

import com.elara.sahaplus.enums.AccountStatus;
import com.elara.sahaplus.enums.Delivery;
import com.elara.sahaplus.enums.MaturationStatus;
import com.elara.sahaplus.enums.Period;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountRequest {
    @NotNull
    private boolean isDiscountDeposit;

    @NotNull
    private long productID;

    @NotNull
    private long branchID;

    @NotNull
    private String liquidationAccount;

    @NotNull
    private String amount;

    private String accountName;

    private long ID;

    private String accountNo;

    private int tenure;

    private String productName;

    private BigDecimal interestRate;

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

    private BigDecimal annualPercentageYielding;

    private long customerID;

    private MaturationStatus maturationStatus;

    private String referee1CustomerID;

    private String referee2CustomerID;

    private boolean applyInterestMonthly;

    private Period statementPreferencePeriod;

    private Delivery statementPreferenceDelivery;

    private LocalDateTime interestAccrualCommenceDate;

    private String version;
}


