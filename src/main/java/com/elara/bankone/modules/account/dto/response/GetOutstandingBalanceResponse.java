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
public class GetOutstandingBalanceResponse  extends BaseResponse {

  private Data data;

  public GetOutstandingBalanceResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String mfbCode;
    private String accountNumber;
    private String availableBalance;
    private String financialDate;
  }
}