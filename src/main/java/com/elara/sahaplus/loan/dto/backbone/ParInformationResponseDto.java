package com.elara.sahaplus.loan.dto.backbone;

import com.elara.sahaplus.loan.ParInformationResponseData;
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
