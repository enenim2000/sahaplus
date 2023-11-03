package com.elara.bankone.modules.account.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CloseAccountResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("TransactionTrackingRef")
    private String transactionTrackingRef;

    @JsonProperty("CustomerIDInString")
    private String customerIDInString;
}
