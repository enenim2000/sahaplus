package com.elara.sahaplus.outstanding_loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentsThatReducesOutsLoanBalancesResponseDto {
    @JsonProperty("Message")
    private Object message;
}
