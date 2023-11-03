package com.elara.bankone.modules.mis_report_system.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSizeReportRequest {
    @NotNull
    private String identityCode;

    @NotNull
    private String dateFrom;

    @NotNull
    private String dateTo;
}
