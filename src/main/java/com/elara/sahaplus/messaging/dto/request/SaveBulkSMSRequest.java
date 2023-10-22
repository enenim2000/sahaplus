package com.elara.sahaplus.messaging.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveBulkSMSRequest {
    private String accountNumber;
    private String to;
    private long accountId;
    private String body;
    private String referenceNo;
    private String institutionCode;
}
