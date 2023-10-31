package com.elara.sahaplus.mobile_teller.dto.response;

import com.elara.sahaplus.mobile_teller.MobileTellerDetailsResponseData;
import com.elara.sahaplus.util.BaseResponse;
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
