package com.elara.bankone.modules.mis_report_system.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSizeReportRequestDto {
    @NotNull
    private String identityCode;
    @NotNull
    private String dateFrom;
    @NotNull
    private String dateTo;
}
