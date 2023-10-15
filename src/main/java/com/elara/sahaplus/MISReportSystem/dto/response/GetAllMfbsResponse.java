package com.elara.sahaplus.MISReportSystem.dto.response;

import com.elara.sahaplus.MISReportSystem.Mfbs;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetAllMfbsResponse extends BaseResponse {
    private Data data;

    public GetAllMfbsResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private int Count;
        private Mfbs mfbs;
    }



}
