package com.elara.sahaplus.account.dto.backbone;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class GetAccountByTransactionTrackingRefResponseDto {

    private String AccessLevel;
    private String AccountNumber;
    private String AccountStatus;
    private String AccountType;
    private String AvailableBalance;
    private String WithdrawableBalance;
    private String Branch;
    private String CustomerID;
    private String CustomerName;
    private String DateCreated;
    private String LastActivityDate;
    private String NUBA;
    private String Refree1CustomerID;
    private String Refree2CustomerID;
    private String ReferenceNo;
    private boolean PNDStatus;
    private String AccountTier;
}