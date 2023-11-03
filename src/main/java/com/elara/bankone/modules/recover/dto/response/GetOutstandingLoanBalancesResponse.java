package com.elara.bankone.modules.recover.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetOutstandingLoanBalancesResponse extends BaseResponse {
    private Data data;

    public GetOutstandingLoanBalancesResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String accountNo;
        private BigDecimal loanFees;
        private BigDecimal outstandingPrincipal;
        private BigDecimal overdueLoanInterest;
        private BigDecimal outstandingPenalty;
    }
}
