package com.elara.sahaplus.MISReportSystem.dto.request;

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
