package com.elara.bankone.modules.fixed_deposit.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFixedDepositAccountResponseDto {

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("AccountName")
    private String accountName;

    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("LiquidationAccount")
    private String liquidationAccount;

    private boolean shouldRollOver;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("InterestAccrualCommencementDate")
    private LocalDateTime interestAccrualCommencementDate;

    private BigDecimal interestRate;

    @JsonProperty("TenureInDays")
    private int tenureInDays;

    @JsonProperty("ApplyMonthlyInterest")
    private boolean applyMonthlyInterest;

    @JsonProperty("ApplyInterestOnRollOver")
    private boolean applyInterestOnRollOver;

}
