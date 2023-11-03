package com.elara.bankone.modules.recover.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetOutstandingLoanBalancesRequest {
    private String[] accountNos;
}
