package com.elara.sahaplus.institution.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCrmsResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private Object message;
}
