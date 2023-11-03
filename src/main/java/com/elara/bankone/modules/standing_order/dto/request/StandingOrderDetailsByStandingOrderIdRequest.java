package com.elara.bankone.modules.standing_order.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrderDetailsByStandingOrderIdRequest {
    private String standingOrderId;
}
