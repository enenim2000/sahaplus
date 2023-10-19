package com.elara.sahaplus.loan_application.dto.response;

import com.elara.sahaplus.loan_application.ApprovedLoansResponseData;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApprovedLoansResponse extends BaseResponse {
    private Data data;

    public ApprovedLoansResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private ApprovedLoansResponseData approvedLoansResponseData;
    }

}
