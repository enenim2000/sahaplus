package com.elara.bankone.modules.sanef.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateSanefGeneralSavingsAccountResponse extends BaseResponse {

  private String accountNumber;

  public CreateSanefGeneralSavingsAccountResponse() {
    super();
  }
}
