package com.elara.sahaplus.outstanding_loan.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesByLinkedAccountNoRequest {
    private String mfbCode;
    private String accountNumber;
}
