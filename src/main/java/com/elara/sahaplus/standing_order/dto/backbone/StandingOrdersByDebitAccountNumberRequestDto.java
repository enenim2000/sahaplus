package com.elara.sahaplus.standing_order.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrdersByDebitAccountNumberRequestDto {
    @NotNull
    @JsonProperty("debitaccountNumber")
    private String debitAccountNumber;
    private int pageIndex;
    private int pageSize;
}
