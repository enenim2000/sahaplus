package com.elara.sahaplus.recover.dto.request;

import com.elara.sahaplus.enums.TransactionType;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditLoanAccountRequest {
    @NotNull
    private String accountNumber;
    @NotNull
    private long amount;
    private String institutionCode;
    private long fee;
    private String instrumentNo;
    private String transactionReference;
    private TransactionType transactionType;
    private String narration;
}
