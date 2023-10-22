package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.loan.ProfitabilityParInformationData;
import com.elara.sahaplus.util.BaseResponse;
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
