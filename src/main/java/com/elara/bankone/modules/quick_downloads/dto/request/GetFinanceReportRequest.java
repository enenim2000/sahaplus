package com.elara.bankone.modules.quick_downloads.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFinanceReportRequest {
    @NotNull
    private String mfbCode;
    @NotNull
    private LocalDateTime monthToGenerate;
}
