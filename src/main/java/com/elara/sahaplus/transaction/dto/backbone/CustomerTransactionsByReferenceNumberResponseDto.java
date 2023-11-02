package com.elara.sahaplus.transaction.dto.backbone;

import com.elara.sahaplus.enums.RecordType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTransactionsByReferenceNumberResponseDto {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    private String NUBAN;

    @JsonProperty("AccountName")
    private String accountName;

    @JsonProperty("TransactionDate")
    private LocalDateTime transactionDate;

    @JsonProperty("CurrentDate")
    private LocalDateTime currentDate;

    @JsonProperty("ReferenceID")
    private String referenceID;

    @JsonProperty("Narration")
    private String narration;

    @JsonProperty("RecordType")
    private RecordType recordType;

    @JsonProperty("Amount")
    private BigDecimal amount;
}
