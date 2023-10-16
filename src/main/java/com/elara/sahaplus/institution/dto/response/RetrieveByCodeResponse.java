package com.elara.sahaplus.institution.dto.response;

import com.elara.sahaplus.mis_report_system.Mfbs;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RetrieveByCodeResponse extends BaseResponse {

    private Data data;

    public RetrieveByCodeResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private Mfbs mfbs;
    }
}
