package com.elara.bankone.modules.standing_order.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

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
