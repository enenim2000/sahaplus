package com.elara.sahaplus.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByCustomerIdRequest {
    @NotNull
    private String institutionCode;
    @NotNull
    private String CustomerId;
    private boolean addStartAndEndDate;
}
