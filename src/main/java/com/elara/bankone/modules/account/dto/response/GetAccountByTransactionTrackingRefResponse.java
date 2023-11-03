package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class GetAccountByTransactionTrackingRefResponse extends BaseResponse {

  private Data data;

  public GetAccountByTransactionTrackingRefResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String accessLevel;
    private String accountNumber;
    private String accountStatus;
    private String accountType;
    private String availableBalance;
    private String withdrawableBalance;
    private String branch;
    private String customerID;
    private String customerName;
    private String dateCreated;
    private String lastActivityDate;
    private String nuba;
    private String refree1CustomerID;
    private String refree2CustomerID;
    private String referenceNo;
    private boolean pndStatus;
    private String accountTier;
  }
}