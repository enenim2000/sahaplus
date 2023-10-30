package com.elara.sahaplus.account.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetDailyAccountStatementResponse extends BaseResponse {

  private Data data;

  public GetDailyAccountStatementResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
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
