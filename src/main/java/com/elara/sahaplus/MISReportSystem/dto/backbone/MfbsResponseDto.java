package com.elara.sahaplus.MISReportSystem.dto.backbone;

import com.elara.sahaplus.MISReportSystem.Mfbs;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MfbsResponseDto {
    @JsonProperty("Count")
    private int count;
    private Mfbs mfbs;
}
