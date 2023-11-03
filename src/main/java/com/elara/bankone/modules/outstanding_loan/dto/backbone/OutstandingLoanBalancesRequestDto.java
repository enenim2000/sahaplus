package com.elara.bankone.modules.outstanding_loan.dto.backbone;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesRequestDto {
    private String accountNumber;
    private LocalDateTime financialDate;
}
