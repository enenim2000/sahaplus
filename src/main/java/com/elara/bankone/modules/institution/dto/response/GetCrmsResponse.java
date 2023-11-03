package com.elara.bankone.modules.institution.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetCrmsResponse extends BaseResponse {

    private Data data;

    public GetCrmsResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;

        private Object message;
    }

}
