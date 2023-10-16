package com.elara.sahaplus.fixed_deposit.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetFixedDepositAccountResponse extends BaseResponse {
        private Data data;

        public GetFixedDepositAccountResponse() {
            super();
        }

        @Getter
        @Setter
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Data {
            private String accountNumber;
            private String accountName;
            private String customerID;
            private String productCode;
            private String productName;
            private String liquidationAccount;
            private boolean shouldRollOver;
            private BigDecimal amount;
            private LocalDateTime interestAccrualCommencementDate;
            private BigDecimal interestRate;
            private int tenureInDays;
            private boolean applyMonthlyInterest;
            private boolean applyInterestOnRollOver;
        }


}
