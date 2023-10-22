package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.loan.ParInformationResponseData;
import com.elara.sahaplus.util.BaseResponse;
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
