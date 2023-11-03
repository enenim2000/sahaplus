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
public class GetAccountByTransactionTrackingRef2Response extends BaseResponse {

  private GetSupportingDocumentResponse.Data data;

  public GetAccountByTransactionTrackingRef2Response() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String availableBalance;
    private String withdrawableBalance;
    private String customerID;
    private String nuban;
    private String accountTier;
  }
}