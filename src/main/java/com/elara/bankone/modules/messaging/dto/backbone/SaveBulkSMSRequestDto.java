package com.elara.bankone.modules.messaging.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveBulkSMSRequestDto {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("To")
    private String to;

    @JsonProperty("AccountId")
    private long accountId;

    @JsonProperty("Body")
    private String body;

    @JsonProperty("ReferenceNo")
    private String referenceNo;

    @JsonProperty("InstitutionCode")
    private String institutionCode;
}
