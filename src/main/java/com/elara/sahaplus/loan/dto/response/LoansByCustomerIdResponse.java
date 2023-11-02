package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.loan.LoansResponseData;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoansByCustomerIdResponse extends BaseResponse {

    private Data data;

    public LoansByCustomerIdResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String customerIDInString;
        private Object message;
        private Object dates;
    }
}
