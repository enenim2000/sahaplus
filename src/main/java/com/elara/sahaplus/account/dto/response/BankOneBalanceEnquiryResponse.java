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
public class BankOneBalanceEnquiryResponse extends BaseResponse {

  private Data data;

  public BankOneBalanceEnquiryResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private String mfbCode;
    private String accountNumber;
    private String ledgerBalance;
    private String availableBalance;
    private String withdrawableAmount;
    private String financialDate;

    private String transactionTrackingRef;
    private String customerIDInString;
  }
}
