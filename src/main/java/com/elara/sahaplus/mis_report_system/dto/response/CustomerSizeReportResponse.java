package com.elara.sahaplus.mis_report_system.dto.response;

import com.elara.sahaplus.util.BaseResponse;
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

