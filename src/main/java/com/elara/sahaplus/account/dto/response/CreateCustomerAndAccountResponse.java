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
public class CreateCustomerAndAccountResponse extends BaseResponse {

  private Data data;

  public CreateCustomerAndAccountResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String transactionTrackingRef;
    private String customerIDInString;
  }
}
