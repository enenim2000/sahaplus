package com.elara.bankone.util;

import com.elara.bankone.enums.ResponseCodes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {

  private String responseCode;
  private String responseMessage;

  public BaseResponse() {
    this.responseCode = ResponseCodes.SUCCESSFUL.getValue();
    this.responseMessage = "Successful";
  }
}
