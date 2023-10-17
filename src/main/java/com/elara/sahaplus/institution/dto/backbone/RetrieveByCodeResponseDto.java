package com.elara.sahaplus.institution.dto.backbone;

import com.elara.sahaplus.mis_report_system.Mfbs;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetrieveByCodeResponseDto {
    private Mfbs mfbs;
}
