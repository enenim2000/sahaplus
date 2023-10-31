package com.elara.sahaplus.transaction.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTransactionsByReferenceNumberRequestDto {
    private String referenceNumber;
}
