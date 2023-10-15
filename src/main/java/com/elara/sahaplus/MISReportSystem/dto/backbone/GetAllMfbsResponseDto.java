package com.elara.sahaplus.MISReportSystem.dto.backbone;

import com.elara.sahaplus.MISReportSystem.Mfbs;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllMfbsResponseDto {
    private int Count;
    private Mfbs mfbs;
}
