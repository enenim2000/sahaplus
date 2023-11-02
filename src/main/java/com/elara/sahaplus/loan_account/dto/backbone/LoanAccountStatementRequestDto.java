package com.elara.sahaplus.loan_account.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountStatementRequestDto {
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
