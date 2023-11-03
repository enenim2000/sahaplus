package com.elara.bankone.modules.mobile_teller.dto.response;

import com.elara.bankone.modules.mobile_teller.MobileTellerDetailsResponseData;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MobileTellerDetailsResponse extends BaseResponse {
    private Data data;

    public MobileTellerDetailsResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private MobileTellerDetailsResponseData mobileTellerDetailsResponseData;

    }
}
