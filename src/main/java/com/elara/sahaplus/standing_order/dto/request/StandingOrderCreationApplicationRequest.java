package com.elara.sahaplus.standing_order.dto.request;


import com.elara.sahaplus.enums.ChannelMode;
import com.elara.sahaplus.enums.StandingOrderFrequency;
import com.elara.sahaplus.enums.StandingOrderStatus;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrderCreationApplicationRequest {
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
    private String creditNarration;
    private String description;
    private String debitNarration;
    private BigDecimal amountToTransferInKobo;
    private boolean isContinuous;
    private boolean allowForceDebit;
    private boolean isPercentage;
    private ChannelMode howCreated;
    private StandingOrderFrequency standingOrderFrequency;
    private String startDateString;
    private String endDateString;
    private StandingOrderStatus standingOrderStatus;
    private LocalDateTime startDateFrom;
    private LocalDateTime startDateTo;
    private LocalDateTime endDateFrom;
    private LocalDateTime endDateTo;
    private boolean allowBothDebits;
    private String amountType;
    private long standingOrderChargeFeeID;
    private BigDecimal standingOrderChargeFeeAmount;
}
