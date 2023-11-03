package com.elara.bankone.modules.loan_application.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanCreationApplicationResponse2 extends BaseResponse {
    private Data data;

    public LoanCreationApplicationResponse2() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String customerIDInString;
        private String transactionTrackingRef;
        private String message;
    }
}
