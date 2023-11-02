package com.elara.sahaplus.standing_order.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrdersByCreditAccountNumberRequest {
    @NotNull
    private String creditaccountNumber;
    private int pageIndex;
    private int pageSize;
}
