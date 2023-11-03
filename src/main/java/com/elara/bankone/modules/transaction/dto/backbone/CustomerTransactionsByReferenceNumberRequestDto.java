package com.elara.bankone.modules.transaction.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTransactionsByReferenceNumberRequestDto {
    private String referenceNumber;
}
