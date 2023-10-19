package com.elara.sahaplus.loan_application.dto.response;

import com.elara.sahaplus.loan_application.LoanCreationResponseData;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanCreationApplicationResponse {
    private Data data;

    public LoanCreationApplicationResponse() {
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
        private LoanCreationResponseData loanCreationResponseData;
    }
}
