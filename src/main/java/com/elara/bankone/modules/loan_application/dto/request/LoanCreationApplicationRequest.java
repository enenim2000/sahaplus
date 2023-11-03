package com.elara.bankone.modules.loan_application.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreationApplicationRequest {
    @NotNull
    private int tenure;

    @NotNull
    private int moratorium;

    @NotNull
    private String loanProductCode;

    @NotNull
    private String transactionTrackingRef;

    @NotNull
    private String customerID;

    private String linkedAccountNumber;

    private LocalDateTime interestAccrualCommencementDate;

    private BigDecimal amount;

    private int principalPaymentFrequency;

    private int interestPaymentFrequency;

    private String version;
}
