package com.elara.bankone.modules.quick_downloads.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFinanceReportLast12MonthsRequest {
    private String mfbCode;
}
