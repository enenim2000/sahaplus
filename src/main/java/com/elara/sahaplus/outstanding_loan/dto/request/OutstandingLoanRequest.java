package com.elara.sahaplus.outstanding_loan.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanRequest {
    private String accountNumber;
}
