package com.elara.bankone.modules.mis_report_system.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomerSizeReportResponse extends BaseResponse {

    private Data data;

    public CustomerSizeReportResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private List<Object> response;
    }
}

