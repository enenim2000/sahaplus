package com.elara.bankone.modules.fixed_deposit.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFixedDepositAccountRequest {
    @NotNull
    private String accountNumber;
    private String version;
}
