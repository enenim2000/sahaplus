package com.elara.sahaplus.account.dto.response;

import com.elara.sahaplus.util.BaseResponse;
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
public class CreateCustomerAccountResponse extends BaseResponse {

  private Data data;

  public CreateCustomerAccountResponse() {
    super();
  }

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String accountNumber;
    private String customerID;
    private String fullName;
  }
}