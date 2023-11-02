package com.elara.sahaplus.messaging.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveBulkSMSResponseDto {
    @JsonProperty("Status")
    private boolean status;

    @JsonProperty("ErrorMessage")
    private String errorMessage;
}
