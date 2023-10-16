package com.elara.sahaplus.fixed_deposit.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFixedDepositAccountRequestDto {

    @NotNull
    private String accountNumber;
    private String version;
}

