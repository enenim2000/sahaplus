package com.elara.sahaplus.outstanding_loan.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class OutstandingLoanResponse extends BaseResponse {
    private Data data;

    public OutstandingLoanResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String accountNumber;
        private String paymentDueDate;
        private String totalPrincipal;
        private String totalInterest;
        private String totalFee;
        private String totalAmount;
    }
}
