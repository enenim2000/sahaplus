package com.elara.bankone.modules.loan_application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreationResponseData {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("FullName")
    private String fullName;
}
