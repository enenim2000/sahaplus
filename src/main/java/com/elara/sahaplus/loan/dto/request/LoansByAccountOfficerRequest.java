package com.elara.sahaplus.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByAccountOfficerRequest {
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
