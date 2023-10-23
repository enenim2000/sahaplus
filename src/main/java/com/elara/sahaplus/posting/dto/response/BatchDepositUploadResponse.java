package com.elara.sahaplus.posting.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class BatchDepositUploadResponse extends BaseResponse {
    private Data data;

    public BatchDepositUploadResponse() {
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
