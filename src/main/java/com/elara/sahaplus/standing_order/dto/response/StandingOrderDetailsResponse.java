package com.elara.sahaplus.standing_order.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StandingOrderDetailsResponse extends BaseResponse {
    private Data data;

    public StandingOrderDetailsResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String id;
        private String name;
        private String description;
        private String debitNarration;
        private String creditNarration;
        private String creditAccount;
        private String debitAccount;
        private BigDecimal amountToTransfer;
        private boolean isContinuous;
        private boolean allowForceDebit;
        private boolean isPercentage;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
    }
}
