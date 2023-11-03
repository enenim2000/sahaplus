package com.elara.bankone.modules.standing_order.dto.backbone;

import com.elara.bankone.enums.ChannelMode;
import com.elara.bankone.enums.StandingOrderStatus;
import com.elara.bankone.enums.StandingOrderFrequency;
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
public class StandingOrderCreationApplicationRequestDto {
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

    @JsonProperty("CreditNarration")
    private String creditNarration;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DebitNarration")
    private String debitNarration;

    @JsonProperty("AmountToTransferInKobo")
    private BigDecimal amountToTransferInKobo;

    @JsonProperty("IsContinuous")
    private boolean isContinuous;

    @JsonProperty("AllowForceDebit")
    private boolean allowForceDebit;

    @JsonProperty("IsPercentage")
    private boolean isPercentage;

    @JsonProperty("HowCreated")
    private ChannelMode howCreated;

    @JsonProperty("StandingOrderFrequency")
    private StandingOrderFrequency standingOrderFrequency;

    @JsonProperty("StartDateString")
    private String startDateString;

    @JsonProperty("EndDateString")
    private String endDateString;

    @JsonProperty("StandingOrderStatus")
    private StandingOrderStatus standingOrderStatus;

    @JsonProperty("StartDateFrom")
    private LocalDateTime startDateFrom;

    @JsonProperty("StartDateTo")
    private LocalDateTime startDateTo;

    @JsonProperty("EndDateFrom")
    private LocalDateTime endDateFrom;

    @JsonProperty("EndDateTo")
    private LocalDateTime endDateTo;

    @JsonProperty("AllowBothDebits")
    private boolean allowBothDebits;

    @JsonProperty("AmountType")
    private String amountType;

    @JsonProperty("StandingOrderChargeFeeID")
    private long standingOrderChargeFeeID;

    @JsonProperty("StandingOrderChargeFeeAmount")
    private BigDecimal standingOrderChargeFeeAmount;
}

