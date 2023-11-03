package com.elara.bankone.modules.mobile_teller.dto.backbone;

import com.elara.bankone.modules.mobile_teller.MobileTellerDetailsResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileTellerDetailsResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private MobileTellerDetailsResponseData mobileTellerDetailsResponseData;
}
