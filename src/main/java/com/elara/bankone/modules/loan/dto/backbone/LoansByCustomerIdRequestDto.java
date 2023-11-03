package com.elara.bankone.modules.loan.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByCustomerIdRequestDto {
    @NotNull
    private String institutionCode;
    @NotNull
    private String CustomerId;
    private boolean addStartAndEndDate;
}
