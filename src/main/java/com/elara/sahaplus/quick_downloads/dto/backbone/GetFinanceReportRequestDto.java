package com.elara.sahaplus.quick_downloads.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFinanceReportRequestDto {
    @NotNull
    private String mfbCode;
    @NotNull
    private LocalDateTime monthToGenerate;
}
