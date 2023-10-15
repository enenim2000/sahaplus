package com.elara.sahaplus.MISReportSystem.dto.response;

import com.elara.sahaplus.MISReportSystem.Mfbs;
import com.elara.sahaplus.util.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MfbsResponse extends BaseResponse {
    private Data data;

    public MfbsResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        @JsonProperty("Count")
        private int count;
        private Mfbs mfbs;
    }



}
