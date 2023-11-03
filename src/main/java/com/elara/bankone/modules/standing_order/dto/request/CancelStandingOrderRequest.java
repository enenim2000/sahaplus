package com.elara.bankone.modules.standing_order.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelStandingOrderRequest {
    @NotNull
    private long standingOrderID;
    private String accountNumber;
}
