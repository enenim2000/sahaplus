package com.elara.bankone.modules.mis_report_system.dto.backbone;

import com.elara.bankone.modules.mis_report_system.Mfbs;
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
