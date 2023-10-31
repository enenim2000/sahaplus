package com.elara.sahaplus.standing_order.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StandingOrderCreationApplicationResponse extends BaseResponse {
    private Data data;

    public StandingOrderCreationApplicationResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String message;
    }

}
