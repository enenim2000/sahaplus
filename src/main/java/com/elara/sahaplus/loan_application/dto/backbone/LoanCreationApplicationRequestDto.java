package com.elara.sahaplus.loan_application.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreationApplicationRequestDto {
    @NotNull
    @JsonProperty("Tenure")
    private int tenure;

    @NotNull
    @JsonProperty("Moratorium")
    private int moratorium;

    @NotNull
    @JsonProperty("LoanProductCode")
    private String loanProductCode;

    @NotNull
    @JsonProperty("TransactionTrackingRef")
    private String transactionTrackingRef;

    @NotNull
    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("LinkedAccountNumber")
    private String linkedAccountNumber;

    @JsonProperty("InterestAccrualCommencementDate")
    private LocalDateTime interestAccrualCommencementDate;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("PrincipalPaymentFrequency")
    private int principalPaymentFrequency;

    @JsonProperty("InterestPaymentFrequency")
    private int interestPaymentFrequency;

    private String version;
}
