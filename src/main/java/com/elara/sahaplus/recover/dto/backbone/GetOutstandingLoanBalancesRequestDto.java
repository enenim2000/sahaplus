package com.elara.sahaplus.recover.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetOutstandingLoanBalancesRequestDto {
    @JsonProperty("AccountNos")
    private String[] accountNos;
}
