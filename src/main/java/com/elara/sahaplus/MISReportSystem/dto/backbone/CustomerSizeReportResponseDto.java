package com.elara.sahaplus.MISReportSystem.dto.backbone;

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
