package com.elara.bankone.modules.institution.dto.response;

import com.elara.bankone.modules.mis_report_system.Mfbs;
import com.elara.bankone.util.BaseResponse;
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
