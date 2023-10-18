package com.elara.sahaplus.loan_account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountStatementResponseData {
    @JsonProperty("CurrentDate")
    private LocalDateTime currentDate;

    @JsonProperty("isReversed")
    private boolean IsReversed;

    @JsonProperty("ReversalReferenceNo")
    private String reversalReferenceNo;

    @JsonProperty("WithdrawableAmount")
    private BigDecimal withdrawableAmount;

    @JsonProperty("UniqueIdentifier")
    private String uniqueIdentifier;

    @JsonProperty("InstrumentNo")
    private String instrumentNo;

    @JsonProperty("TransactionDate")
    private LocalDateTime transactionDate;

    @JsonProperty("TransactionDateString")
    private String transactionDateString;

    @JsonProperty("ReferenceID")
    private String referenceID;

    @JsonProperty("Narration")
    private String narration;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("OpeningBalance")
    private BigDecimal openingBalance;

    @JsonProperty("Balance")
    private BigDecimal balance;

    @JsonProperty("PostingType")
    private String postingType;

    @JsonProperty("Debit")
    private String debit;

    @JsonProperty("Credit")
    private String credit;

    @JsonProperty("IsCardTransation")
    private boolean isCardTransaction;

    @JsonProperty("AccountNumber")
    private String accountNumber;
}
