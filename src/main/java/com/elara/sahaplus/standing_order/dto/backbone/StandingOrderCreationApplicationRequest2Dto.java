package com.elara.sahaplus.standing_order.dto.backbone;

import com.elara.sahaplus.enums.StandingOrderFrequency;
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
public class StandingOrderCreationApplicationRequest2Dto {
    @NotNull
    @JsonProperty("CreditAccount")
    private String creditAccount;

    @NotNull
    @JsonProperty("DebitAccount")
    private String debitAccount;

    @NotNull
    @JsonProperty("AmountToTransfer")
    private BigDecimal amountToTransfer;

    @NotNull
    @JsonProperty("StartDate")
    private LocalDateTime startDate;

    @NotNull
    @JsonProperty("EndDate")
    private LocalDateTime endDate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("AllowForceDebit")
    private boolean allowForceDebit;

    @JsonProperty("IsPercentage")
    private boolean isPercentage;

    @JsonProperty("StandingOrderFrequency")
    private StandingOrderFrequency standingOrderFrequency;

    @JsonProperty("StandingOrderChargeFeeID")
    private Long standingOrderChargeFeeID;

    @JsonProperty("StandingOrderChargeFeeAmount")
    private BigDecimal standingOrderChargeFeeAmount;
}
