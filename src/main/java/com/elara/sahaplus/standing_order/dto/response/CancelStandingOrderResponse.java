package com.elara.sahaplus.standing_order.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CancelStandingOrderResponse extends BaseResponse {
    private Data data;

    public CancelStandingOrderResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String responseCode;
        private String responseMessage;
    }
}
