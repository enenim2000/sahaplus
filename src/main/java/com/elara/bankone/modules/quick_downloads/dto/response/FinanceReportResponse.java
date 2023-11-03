package com.elara.bankone.modules.quick_downloads.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class FinanceReportResponse extends BaseResponse {
    private Data data;

    public FinanceReportResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String institutionName;
        private String code;
        private String institutionStatus;
        private LocalDateTime billingMonth;
        private BigDecimal totalPaid;
        private BigDecimal outStanding;
        private BigDecimal subscriptionCharged;
        private BigDecimal totalSubscriptionPaid;
        private BigDecimal mobileTellerSubscriptionCharged;
        private BigDecimal sMSPaid;
        private BigDecimal virtualAirtimePaid;
        private BigDecimal branchless;
        private BigDecimal cards;
        private BigDecimal inwardRemittance;
        private BigDecimal correspBanking;
        private BigDecimal selfService;
        private BigDecimal bvn;
        private BigDecimal email;
        private BigDecimal xds;
        private BigDecimal channelAccessFeeDifferential;
        private BigDecimal interBankFee;
        private BigDecimal totalAppzoneChannelAccessCharge;
        private BigDecimal channelAccessFeePaid;
        private BigDecimal outstandingBalanceEnquiryCharge;
        private BigDecimal totalChannelAccessCharge;
        private int usageDate;
        private LocalDateTime minimumUsageDate;
        private BigDecimal miscReceivableForTheMonth;
        private BigDecimal receivablesFromUserSubscription;
    }
}
