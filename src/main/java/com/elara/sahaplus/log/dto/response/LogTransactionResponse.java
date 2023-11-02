package com.elara.sahaplus.log.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LogTransactionResponse extends BaseResponse {
    private Data data;

    public LogTransactionResponse() {
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
