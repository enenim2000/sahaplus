package com.elara.bankone.modules.customer_and_account_creation.dto.response;

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
public class CreateCustomerAccountResponse extends BaseResponse {

  private Data data;

  public CreateCustomerAccountResponse() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {

    private String customerID;
    private String accountNumber;
    private String fullName;
  }
}

