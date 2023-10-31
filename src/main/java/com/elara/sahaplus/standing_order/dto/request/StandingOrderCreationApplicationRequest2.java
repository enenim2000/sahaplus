package com.elara.sahaplus.standing_order.dto.request;

import com.elara.sahaplus.enums.StandingOrderFrequency;
import lombok.*;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrderCreationApplicationRequest2 {
    @NotNull
    private String creditAccount;

    @NotNull
    private String debitAccount;

    @NotNull
    private BigDecimal amountToTransfer;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;
    private String name;
    private String description;
    private boolean allowForceDebit;
    private boolean isPercentage;
    private StandingOrderFrequency standingOrderFrequency;
    private Long standingOrderChargeFeeID;
    private BigDecimal standingOrderChargeFeeAmount;
}
