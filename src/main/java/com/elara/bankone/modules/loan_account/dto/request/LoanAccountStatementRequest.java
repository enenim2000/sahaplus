package com.elara.bankone.modules.loan_account.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountStatementRequest {
    @NotNull
    private String accountNumber;

    @NotNull
    private LocalDateTime fromDate;

    @NotNull
    private LocalDateTime toDate;

    private String institutionCode;

    private int numberOfItems;

    private String version;

}
