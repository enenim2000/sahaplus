package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CloseAccountResponse extends BaseResponse {

    private Data data;

    public CloseAccountResponse() {
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
        private String transactionTrackingRef;
        private String customerIDInString;
    }
}
