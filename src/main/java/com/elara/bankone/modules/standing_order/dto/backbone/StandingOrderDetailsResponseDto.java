package com.elara.bankone.modules.standing_order.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrderDetailsResponseDto {
    @JsonProperty("ID")
    private String id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DebitNarration")
    private String debitNarration;

    @JsonProperty("CreditNarration")
    private String creditNarration;

    @JsonProperty("CreditAccount")
    private String creditAccount;

    @JsonProperty("DebitAccount")
    private String debitAccount;

    @JsonProperty("AmountToTransfer")
    private BigDecimal amountToTransfer;

    @JsonProperty("IsContinuous")
    private boolean isContinuous;

    @JsonProperty("AllowForceDebit")
    private boolean allowForceDebit;

    @JsonProperty("IsPercentage")
    private boolean isPercentage;

    @JsonProperty("StartDate")
    private LocalDateTime startDate;

    @JsonProperty("EndDate")
    private LocalDateTime endDate;
}

