package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetAccountSummaryResponse extends BaseResponse {

  private Data data;

  public GetAccountSummaryResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String name;
    private String accountNumber;
    private String nuban;
    private String accountOfficer;
    private String accountStatus;
    private String branch;
    private String introducerName;
    private String notificationPreference;
    private String referenceNo;
    private String statementPreference;
    private String transactionPermission;
    private String ledgerBalance;
    private String availableBalance;
    private String customerId;
    private String email;
    private String phoneNumber;
  }
}
