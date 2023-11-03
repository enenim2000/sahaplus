package com.elara.bankone.modules.transaction.dto.response;

import com.elara.bankone.enums.RecordType;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomerTransactionsByReferenceNumberResponse extends BaseResponse {
    private Data data;

    public CustomerTransactionsByReferenceNumberResponse()
    {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String accountNumber;
        private String NUBAN;
        private String accountName;
        private LocalDateTime transactionDate;
        private LocalDateTime currentDate;
        private String referenceID;
        private String narration;
        private RecordType recordType;
        private BigDecimal amount;
    }
}
