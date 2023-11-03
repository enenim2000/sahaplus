package com.elara.bankone.modules.fixed_deposit.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountWithCustomerIdRequestDto {
    @JsonProperty("Amount")
    @NotNull
    private String amount;

    @JsonProperty("CustomerID")
    @NotNull
    private String customerID;

    @JsonProperty("ProductCode")
    @NotNull
    private String productCode;

    @JsonProperty("LiquidationAccount")
    @NotNull
    private String liquidationAccount;

    @JsonProperty("IsDiscountDeposit")
    private boolean isDiscountDeposit;

    @JsonProperty("Tenure")
    private int tenure;

    @JsonProperty("ApplyInterestMonthly")
    private boolean applyInterestMonthly;

    @JsonProperty("ApplyInterestOnRollOver")
    private boolean applyInterestOnRollOver;

    @JsonProperty("ShouldRollOver")
    private boolean shouldRollOver;

    private String version;
}
