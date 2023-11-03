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
public class GetCumIntAccrualOnFixedDepositAccountResponse extends BaseResponse {

  private Data data;

  public GetCumIntAccrualOnFixedDepositAccountResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private boolean isDiscountDeposit;
    private String accountName;
    private String accountNo;
    private String amount;
    private int tenure;
    private String productName;
    private double interestRate;
    private String maturationDate;
    private String totalFixedInterestPayable;
    private String totalInterestPayable;
    private String totalInterestAccrued;
    private String accountOfficerName;
    private boolean shouldRollover;
    private boolean shouldRolloverWithInterest;
    private boolean dropInterestMonthly;
    private String accountOfficerID;
  }
}
