package com.elara.bankone.modules.standing_order.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelStandingOrderRequestDto {
    @NotNull
    private long standingOrderID;
    private String accountNumber;
}
