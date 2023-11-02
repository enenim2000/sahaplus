package com.elara.sahaplus.loan_application.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeepDisbursedLoansInfoRequestDto {
    @NotNull
    private String beneficiaryCode;

    @NotNull
    private String accountNumbers;
}
