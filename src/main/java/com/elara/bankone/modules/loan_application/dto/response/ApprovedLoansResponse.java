package com.elara.bankone.modules.loan_application.dto.response;

import com.elara.bankone.modules.loan_application.ApprovedLoansResponseData;
import com.elara.bankone.util.BaseResponse;
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
