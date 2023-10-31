package com.elara.sahaplus.recover.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
