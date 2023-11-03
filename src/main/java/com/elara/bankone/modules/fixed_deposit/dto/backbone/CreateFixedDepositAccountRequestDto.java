package com.elara.bankone.modules.fixed_deposit.dto.backbone;

import com.elara.bankone.enums.AccountStatus;
import com.elara.bankone.enums.Delivery;
import com.elara.bankone.enums.MaturationStatus;
import com.elara.bankone.enums.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountRequestDto {
    @JsonProperty("IsDiscountDeposit")
    @NotNull
    private boolean isDiscountDeposit;

    @JsonProperty("ProductID")
    @NotNull
    private long productID;

    @JsonProperty("BranchID")
    @NotNull
    private long branchID;

    @JsonProperty("LiquidationAccount")
    @NotNull
    private String liquidationAccount;

    @JsonProperty("Amount")
    @NotNull
    private String amount;

    @JsonProperty("AccountName")
    private String accountName;

    private long ID;

    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("Tenure")
    private int tenure;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("InterestRate")
    private BigDecimal interestRate;

    @JsonProperty("MaturationDate")
    private String maturationDate;

    @JsonProperty("TotalFixedInterestPayable")
    private String totalFixedInterestPayable;

    @JsonProperty("TotalInterestPayable")
    private String totalInterestPayable;

    @JsonProperty("TotalInterestAccrued")
    private String totalInterestAccrued;

    @JsonProperty("AccountOfficerName")
    private String accountOfficerName;

    @JsonProperty("ShouldRollover")
    private boolean shouldRollover;

    @JsonProperty("ShouldRolloverWithInterest")
    private boolean shouldRolloverWithInterest;

    @JsonProperty("DropInterestMonthly")
    private boolean dropInterestMonthly;

    @JsonProperty("AccountOfficerID")
    private long accountOfficerID;

    @JsonProperty("AccountStatus")
    private AccountStatus accountStatus;

    @JsonProperty("AnnualPercentageYielding")
    private BigDecimal annualPercentageYielding;

    @JsonProperty("CustomerID")
    private long customerID;

    @JsonProperty("MaturationStatus")
    private MaturationStatus maturationStatus;

    @JsonProperty("Referee1CustomerID")
    private String referee1CustomerID;

    @JsonProperty("Referee2CustomerID")
    private String referee2CustomerID;

    @JsonProperty("ApplyInterestMonthly")
    private boolean applyInterestMonthly;

    @JsonProperty("StatementPreferencePeriod")
    private Period statementPreferencePeriod;

    @JsonProperty("StatementPreferenceDelivery")
    private Delivery statementPreferenceDelivery;

    @JsonProperty("InterestAccrualCommenceDate")
    private LocalDateTime interestAccrualCommenceDate;

    private String version;
}



