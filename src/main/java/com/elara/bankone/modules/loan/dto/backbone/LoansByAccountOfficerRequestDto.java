package com.elara.bankone.modules.loan.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByAccountOfficerRequestDto {
    @NotNull
    private String institutionCode;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    @NotNull
    private String accountOfficerCode;

    private int page;
    private int pageSize;
}
