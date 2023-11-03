package com.elara.bankone.modules.fixed_deposit.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountRequest3 {

    @NotNull
    private boolean IsDiscountDeposit;

    @NotNull
    private String Amount;

    @NotNull
    private String LiquidationAccount;

    @NotNull
    private String ProductCode;
    private int Tenure;
    private String CustomerID;
    private String version;
}
