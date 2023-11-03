package com.elara.bankone.modules.account.dto.backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountSummaryResponseDto {

  private boolean IsSuccessful;
  private Data Message;

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {

    private String Name;
    private String AccountNumber;
    private String NUBAN;
    private String AccountOfficer;
    private String AccountStatus;
    private String Branch;
    private String IntroducerName;
    private String NotificationPreference;
    private String ReferenceNo;
    private String StatementPreference;
    private String TransactionPermission;
    private String LedgerBalance;
    private String AvailableBalance;
    private String CustomerId;
    private String Email;
    private String PhoneNumber;
  }
}
