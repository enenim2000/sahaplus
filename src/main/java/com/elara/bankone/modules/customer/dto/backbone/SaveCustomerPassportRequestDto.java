package com.elara.bankone.modules.customer.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerPassportRequestDto {
    @NotNull
    private String ID;

    @NotNull
    private byte[] customerPassportInBytes;
}
