package com.elara.bankone.modules.quick_downloads.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinanceReportResponseDto {
    @JsonProperty("InstitutionName")
    private String institutionName;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("InstitutionStatus")
    private String institutionStatus;

    @JsonProperty("BillingMonth")
    private LocalDateTime billingMonth;

    @JsonProperty("TotalPaid")
    private BigDecimal totalPaid;

    @JsonProperty("OutStanding")
    private BigDecimal outStanding;

    @JsonProperty("SubscriptionCharged")
    private BigDecimal subscriptionCharged;

    @JsonProperty("TotalSubscriptionPaid")
    private BigDecimal totalSubscriptionPaid;

    @JsonProperty("MobileTellerSubscriptionCharged")
    private BigDecimal mobileTellerSubscriptionCharged;

    @JsonProperty("SMSPaid")
    private BigDecimal sMSPaid;

    @JsonProperty("VirtualAirtimePaid")
    private BigDecimal virtualAirtimePaid;

    @JsonProperty("Branchless")
    private BigDecimal branchless;

    @JsonProperty("Cards")
    private BigDecimal cards;

    @JsonProperty("InwardRemittance")
    private BigDecimal inwardRemittance;

    @JsonProperty("CorrespBanking")
    private BigDecimal correspBanking;

    @JsonProperty("SelfService")
    private BigDecimal selfService;

    @JsonProperty("BVN")
    private BigDecimal bvn;

    @JsonProperty("Email")
    private BigDecimal email;

    @JsonProperty("XDS")
    private BigDecimal xds;

    @JsonProperty("ChannelAccessFeeDifferential")
    private BigDecimal channelAccessFeeDifferential;

    @JsonProperty("InterBankFee")
    private BigDecimal interBankFee;

    @JsonProperty("TotalAppzoneChannelAccessCharge")
    private BigDecimal totalAppzoneChannelAccessCharge;

    @JsonProperty("ChannelAccessFeePaid")
    private BigDecimal channelAccessFeePaid;

    @JsonProperty("OutstandingBalanceEnquiryCharge")
    private BigDecimal outstandingBalanceEnquiryCharge;

    @JsonProperty("TotalChannelAccessCharge")
    private BigDecimal totalChannelAccessCharge;

    @JsonProperty("UsageDate")
    private int usageDate;

    @JsonProperty("MinimumUsageDate")
    private LocalDateTime minimumUsageDate;

    @JsonProperty("MiscReceivableForTheMonth")
    private BigDecimal miscReceivableForTheMonth;

    @JsonProperty("ReceivablesFromUserSubscription")
    private BigDecimal receivablesFromUserSubscription;
}
