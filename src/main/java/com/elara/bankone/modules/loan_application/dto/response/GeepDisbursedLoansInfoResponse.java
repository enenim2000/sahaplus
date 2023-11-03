package com.elara.bankone.modules.loan_application.dto.response;

import com.elara.bankone.enums.PaymentFrequency;
import com.elara.bankone.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GeepDisbursedLoansInfoResponse extends BaseResponse {
    private Data data;

    public GeepDisbursedLoansInfoResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String name;
        private String number;
        private String customerID;
        private String linkedAccountNumber;
        private BigDecimal amount;
        private int tenure;
        private LocalDateTime repaymentStartDate;
        private LocalDateTime pastDueDate;
        private BigDecimal pastDueAmount;
        private BigDecimal totalPaid;
        private BigDecimal totalRepaymentAmount;
        private BigDecimal totalOutstanding;
        private LocalDateTime lastPaymentDate;
        private PaymentFrequency interestPaymentFrequency;
        private PaymentFrequency principalPaymentFrequency;
    }
}
