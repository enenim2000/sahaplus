package com.elara.bankone.modules.account_officer.response;

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
public class GetAccountOfficerByIdResponse extends BaseResponse {

  private Data data;

  public GetAccountOfficerByIdResponse() {
    super();
  }

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private String name;
    private String code;
    private String phoneNumber;
    private long id;
  }
}
