package com.elara.sahaplus.recover.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import com.elara.sahaplus.enums.TransactionType;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditLoanAccountRequestDto {
    @NotNull
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @NotNull
    @JsonProperty("Amount")
    private long amount;
    @JsonProperty("InstitutionCode")
    private String institutionCode;
    @JsonProperty("Fee")
    private long fee;
    @JsonProperty("InstrumentNo")
    private String instrumentNo;
    @JsonProperty("TransactionReference")
    private String transactionReference;
    @JsonProperty("TransactionType")
    private TransactionType transactionType;
    @JsonProperty("Narration")
    private String narration;
}
