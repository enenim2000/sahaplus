package com.elara.sahaplus.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueLoansRequest {
    @NotNull
    private String accountOfficerCode;

    @NotNull
    private LocalDateTime financialDate;

    @NotNull
    private String accountNumber;

    private String institutionCode;
    private int page;
    private int pageSize;
}
