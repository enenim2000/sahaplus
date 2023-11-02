package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanRepaymentScheduleResponse extends BaseResponse {
    private Data data;

    public LoanRepaymentScheduleResponse() {
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
        private String principal;
        private String interest;
        private String fee;
        private boolean isPrincipalApplied;
        private boolean isInterestApplied;
        private boolean isFeeApplied;
        private String total;
    }


}
