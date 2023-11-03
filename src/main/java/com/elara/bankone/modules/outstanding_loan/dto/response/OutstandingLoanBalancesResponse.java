package com.elara.bankone.modules.outstanding_loan.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class OutstandingLoanBalancesResponse extends BaseResponse {
    private Data data;

    public OutstandingLoanBalancesResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String principalBalance;
        private String pastDuePrincipal;
        private String totalPrincipalOutstanding;
        private String totalOutstandingBalance;
    }


}