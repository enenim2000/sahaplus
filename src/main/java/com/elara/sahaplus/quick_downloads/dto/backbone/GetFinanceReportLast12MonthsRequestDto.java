package com.elara.sahaplus.quick_downloads.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFinanceReportLast12MonthsRequestDto {
    private String mfbCode;
}