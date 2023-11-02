package com.elara.sahaplus.loan_application.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeepDisbursedLoansInfoRequest {
    @NotNull
    private String beneficiaryCode;

    @NotNull
    private String accountNumbers;
}
