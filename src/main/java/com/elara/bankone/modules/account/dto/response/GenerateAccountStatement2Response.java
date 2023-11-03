package com.elara.bankone.modules.account.dto.response;

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
public class GenerateAccountStatement2Response extends BaseResponse {

  private Data data;

  public GenerateAccountStatement2Response() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {

    private byte[] pdfData;
    private String result;
  }
}
