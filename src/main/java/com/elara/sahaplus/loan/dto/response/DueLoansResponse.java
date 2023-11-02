package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.loan.DueLoansResponseData;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class DueLoansResponse extends BaseResponse {
    private Data data;

    public DueLoansResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private DueLoansResponseData dueLoansResponseData;

    }
}