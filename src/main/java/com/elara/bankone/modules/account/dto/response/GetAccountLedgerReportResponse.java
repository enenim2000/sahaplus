package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class GetAccountLedgerReportResponse extends BaseResponse {

  private Data data;

  public GetAccountLedgerReportResponse() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private String id;
    private String acctName;
    private String acctNo;
    private String accessLevel;
    private String currentBalance;
    private String dr;
    private String cr;
    private String refID;
    private String transDate;
    private String balance;
    private String narration;
    private String currentDate;
    private String openingBalance;
    private String instrumentNo;
    private String entryCode;
  }
}
