package com.elara.bankone.modules.recover.dto.backbone;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCurrentFinancialDateResponseDto {
    private LocalDateTime currentFinancialDate;
}
