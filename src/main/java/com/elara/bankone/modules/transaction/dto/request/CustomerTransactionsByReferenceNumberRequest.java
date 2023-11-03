package com.elara.bankone.modules.transaction.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTransactionsByReferenceNumberRequest {
    private String referenceNumber;
}
