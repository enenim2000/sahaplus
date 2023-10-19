package com.elara.sahaplus.loan_application.dto.response;

import com.elara.sahaplus.loan_application.CompletedLoanRepaymentResponseData;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CompletedLoanRepaymentResponse extends BaseResponse {
    private Data data;

    public CompletedLoanRepaymentResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private CompletedLoanRepaymentResponseData completedLoanRepaymentData;

    }
}


