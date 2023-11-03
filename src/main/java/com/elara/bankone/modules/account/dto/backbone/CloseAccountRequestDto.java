package com.elara.bankone.modules.account.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CloseAccountRequestDto {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("Narration")
    private String narration;
}
