package com.elara.sahaplus.messaging.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SaveBulkSMSResponse extends BaseResponse {
    private Data data;

    public SaveBulkSMSResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean status;
        private String errorMessage;
    }
}
