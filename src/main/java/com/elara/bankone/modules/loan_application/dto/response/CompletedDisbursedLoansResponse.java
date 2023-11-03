package com.elara.bankone.modules.loan_application.dto.response;

import com.elara.bankone.modules.loan_application.CompletedDisbursedLoansResponseData;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CompletedDisbursedLoansResponse extends BaseResponse {
    private Data data;

    public CompletedDisbursedLoansResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private CompletedDisbursedLoansResponseData completedDisbursedLoansResponseData;
    }
}
