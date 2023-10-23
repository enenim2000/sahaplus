package com.elara.sahaplus.recover.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetCurrentFinancialDateResponse extends BaseResponse {
    private Data data;

    public GetCurrentFinancialDateResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private LocalDateTime currentFinancialDate;
    }
}
