package com.elara.sahaplus.loan.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DelinquentLoansRequest {
    private String institutionCode;
    private int page;
    private int pageSize;
}
