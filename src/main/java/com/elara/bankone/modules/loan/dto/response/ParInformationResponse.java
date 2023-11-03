package com.elara.bankone.modules.loan.dto.response;

import com.elara.bankone.modules.loan.ParInformationResponseData;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ParInformationResponse extends BaseResponse {

    private Data data;

    public ParInformationResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private ParInformationResponseData parInformationResponseData;

    }
}
