package com.elara.sahaplus.customer.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerPassportRequest {
    private String iD;

    private byte[] customerPassportInBytes;
}
