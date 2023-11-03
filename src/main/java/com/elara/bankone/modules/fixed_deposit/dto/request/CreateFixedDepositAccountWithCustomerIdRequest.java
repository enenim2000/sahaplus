package com.elara.bankone.modules.fixed_deposit.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountWithCustomerIdRequest {

    @NotNull
    private String amount;
    @NotNull
    private String customerID;
    @NotNull
    private String productCode;
    @NotNull
    private String liquidationAccount;
    private boolean isDiscountDeposit;
    private int tenure;
    private boolean applyInterestMonthly;
    private boolean applyInterestOnRollOver;
    private boolean shouldRollOver;
    private String version;
}
