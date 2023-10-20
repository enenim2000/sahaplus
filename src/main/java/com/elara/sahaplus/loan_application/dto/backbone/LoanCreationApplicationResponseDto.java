package com.elara.sahaplus.loan_application.dto.backbone;

import com.elara.sahaplus.loan_application.LoanCreationResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreationApplicationResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("CustomerIDInString")
    private String customerIDInString;

    @JsonProperty("TransactionTrackingRef")
    private String transactionTrackingRef;

    @JsonProperty("Message")
    private Object loanCreationResponseData;

}
