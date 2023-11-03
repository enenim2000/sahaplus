package com.elara.bankone.modules.loan.dto.response;

import com.elara.bankone.util.BaseResponse;
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
