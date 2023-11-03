package com.elara.bankone.modules.standing_order.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrderDetailsByStandingOrderIdRequestDto {
    private String standingOrderId;
}
