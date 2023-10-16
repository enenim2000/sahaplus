package com.elara.sahaplus.institution.dto.response;

import com.elara.sahaplus.mis_report_system.Mfbs;
import com.elara.sahaplus.util.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
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
