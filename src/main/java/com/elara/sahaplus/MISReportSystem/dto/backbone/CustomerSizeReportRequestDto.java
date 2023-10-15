package com.elara.sahaplus.MISReportSystem.dto.backbone;

import javax.validation.constraints.NotNull;

public class CustomerSizeReportRequestDto {
    @NotNull
    private String identityCode;
    @NotNull
    private String dateFrom;
    @NotNull
    private String dateTo;
}
