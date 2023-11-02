package com.elara.sahaplus.outstanding_loan.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PaymentsThatReducesOutsLoanBalancesResponse extends BaseResponse {
    private Data data;

    public PaymentsThatReducesOutsLoanBalancesResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private Object message;

    }


}
