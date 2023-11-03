package com.elara.bankone.modules.messaging.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SaveEmailResponse extends BaseResponse {
    private Data data;

    public SaveEmailResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isMessageSent;
    }
}
