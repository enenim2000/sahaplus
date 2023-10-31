package com.elara.sahaplus.posting.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchDepositUploadResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private String message;
}
