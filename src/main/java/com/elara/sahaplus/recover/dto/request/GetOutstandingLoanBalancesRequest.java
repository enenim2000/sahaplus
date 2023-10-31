package com.elara.sahaplus.recover.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetOutstandingLoanBalancesRequest {
    private String[] accountNos;
}
