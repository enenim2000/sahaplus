package com.elara.bankone.modules.loan.dto.response;

import com.elara.bankone.modules.loan.LoansResponseData;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoansResponse extends BaseResponse {
    private Data data;

    public LoansResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private LoansResponseData loansResponseData;
    }
}
