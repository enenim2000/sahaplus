package com.elara.sahaplus.standing_order.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingOrdersByCreditAccountNumberRequestDto {
    @NotNull
    @JsonProperty("creditaccountNumber")
    private String creditAccountNumber;
    private int pageIndex;
    private int pageSize;
}
