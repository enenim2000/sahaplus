package com.elara.sahaplus.sanef.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateSanefGeneralSavingsWalletResponse extends BaseResponse {

  private String accountNumber;

  public CreateSanefGeneralSavingsWalletResponse() {
    super();
  }
}
