package com.elara.sahaplus.loan_application.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanCreationApplicationResponse2 {
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
