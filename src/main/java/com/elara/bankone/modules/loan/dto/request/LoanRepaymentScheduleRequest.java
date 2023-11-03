package com.elara.bankone.modules.loan.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRepaymentScheduleRequest {
    private String loanAccountNumber;
    private String mfbCode;

}
