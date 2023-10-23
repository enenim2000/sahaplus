package com.elara.sahaplus.outstanding_loan.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class OutstandingLoanBalancesByLinkedAccountNoResponse {
    private Data data;

    public OutstandingLoanBalancesByLinkedAccountNoResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String outstandingLoanPrincipalBalance;
        private String outstandingCASABalance;
    }

}
