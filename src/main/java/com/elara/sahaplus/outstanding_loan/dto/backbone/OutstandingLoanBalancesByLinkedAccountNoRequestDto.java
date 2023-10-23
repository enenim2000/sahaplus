package com.elara.sahaplus.outstanding_loan.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesByLinkedAccountNoRequestDto {
    private String mfbCode;
    private String accountNumber;
}
