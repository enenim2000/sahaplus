package com.elara.bankone.modules.outstanding_loan.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanRequestDto {
    private String accountNumber;
}
