package com.elara.sahaplus.standing_order.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrdersByDebitAccountNumberRequest {
    @NotNull
    private String debitAccountNumber;
    private int pageIndex;
    private int pageSize;
}
