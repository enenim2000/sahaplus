package com.elara.bankone.modules.customer.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerPassportRequest {
    @NotNull
    private String iD;

    @NotNull
    private byte[] customerPassportInBytes;
}
