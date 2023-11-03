package com.elara.bankone.modules.fixed_deposit.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateFixedDepositAccountRequest3Dto {

    @JsonProperty("IsDiscountDeposit")
    @NotNull
    private boolean isDiscountDeposit;

    @JsonProperty("Amount")
    @NotNull
    private String amount;

    @JsonProperty("LiquidationAccount")
    @NotNull
    private String liquidationAccount;

    @JsonProperty("ProductCode")
    @NotNull
    private String productCode;

    @JsonProperty("Tenure")
    private int Tenure;

    @JsonProperty("CustomerID")
    private String CustomerID;
    private String version;
}
