package com.elara.sahaplus.mis_report_system.dto.backbone;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSizeReportResponseDto {
    private List<Object> response;
}
