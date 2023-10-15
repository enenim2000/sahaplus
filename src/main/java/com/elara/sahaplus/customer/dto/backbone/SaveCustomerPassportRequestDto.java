package com.elara.sahaplus.customer.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerPassportRequestDto {
    private String ID;

    private byte[] customerPassportInBytes;
}
