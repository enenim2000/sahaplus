package com.elara.sahaplus.loan.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRepaymentScheduleRequestDto {
    private String loanAccountNumber;
    private String mfbCode;
}
