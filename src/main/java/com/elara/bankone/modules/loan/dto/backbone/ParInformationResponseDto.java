package com.elara.bankone.modules.loan.dto.backbone;

import com.elara.bankone.modules.loan.ParInformationResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParInformationResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private ParInformationResponseData parInformationResponseData;

}
