package com.elara.bankone.modules.loan.dto.response;

import com.elara.bankone.modules.loan.ProfitabilityParInformationData;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProfitabilityParInformationResponse extends BaseResponse {
    private Data data;

    public ProfitabilityParInformationResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private ProfitabilityParInformationData profitabilityParInformationData;
    }
}
