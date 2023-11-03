package com.elara.bankone.modules.loan_application.dto.backbone;

import com.elara.bankone.enums.PaymentFrequency;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeepDisbursedLoansInfoResponseDto {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("LinkedAccountNumber")
    private String linkedAccountNumber;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("Tenure")
    private int tenure;

    @JsonProperty("RepaymentStartDate")
    private LocalDateTime repaymentStartDate;

    @JsonProperty("PastDueDate")
    private LocalDateTime pastDueDate;

    @JsonProperty("PastDueAmount")
    private BigDecimal pastDueAmount;

    @JsonProperty("TotalPaid")
    private BigDecimal totalPaid;

    @JsonProperty("TotalRepaymentAmount")
    private BigDecimal totalRepaymentAmount;

    @JsonProperty("TotalOutstanding")
    private BigDecimal totalOutstanding;

    @JsonProperty("LastPaymentDate")
    private LocalDateTime lastPaymentDate;

    @JsonProperty("InterestPaymentFrequency")
    private PaymentFrequency interestPaymentFrequency;

    @JsonProperty("PrincipalPaymentFrequency")
    private PaymentFrequency principalPaymentFrequency;
}
