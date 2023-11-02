package com.elara.sahaplus.institution.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveByInstitutionCodeRequestDto {
    @JsonProperty("institutionCode")
    private String code;
}
