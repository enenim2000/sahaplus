package com.elara.bankone.modules.loan.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByIdRequestDto {
    @NotNull
    private String loanAccountNumber;
    private String institutionCode;
}
