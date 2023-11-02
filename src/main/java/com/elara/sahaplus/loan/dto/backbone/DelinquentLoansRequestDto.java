package com.elara.sahaplus.loan.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DelinquentLoansRequestDto {
    private String institutionCode;
    private int page;
    private int pageSize;
}
