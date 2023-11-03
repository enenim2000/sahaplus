package com.elara.bankone.modules.outstanding_loan.dto.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesRequest {
    private String accountNumber;
    private LocalDateTime financialDate;
}
