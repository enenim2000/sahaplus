package com.elara.bankone.modules.outstanding_loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanResponseDto {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("PaymentDueDate")
    private String paymentDueDate;

    @JsonProperty("TotalPrincipal")
    private String totalPrincipal;

    @JsonProperty("TotalInterest")
    private String totalInterest;

    @JsonProperty("TotalFee")
    private String totalFee;

    @JsonProperty("TotalAmount")
    private String totalAmount;
}
