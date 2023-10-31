package com.elara.sahaplus.loan_account.dto.response;

import com.elara.sahaplus.loan_account.LoanAccountStatementResponseData;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanAccountStatementResponse {
    private Data data;

    public LoanAccountStatementResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private LoanAccountStatementResponseData loanAccountStatementResponseData;
    }
}

