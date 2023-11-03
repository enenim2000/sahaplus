package com.elara.bankone.modules.loan_account.dto.response;

import com.elara.bankone.modules.loan_account.LoanAccountBalanceData;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanAccountBalanceResponse {
    private Data data;

    public LoanAccountBalanceResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private LoanAccountBalanceData loanAccountBalanceData;
    }
}
