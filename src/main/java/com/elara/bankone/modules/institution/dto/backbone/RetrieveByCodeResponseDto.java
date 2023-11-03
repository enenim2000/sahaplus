package com.elara.bankone.modules.institution.dto.backbone;

import com.elara.bankone.modules.mis_report_system.Mfbs;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetrieveByCodeResponseDto {
    private Mfbs mfbs;
}
