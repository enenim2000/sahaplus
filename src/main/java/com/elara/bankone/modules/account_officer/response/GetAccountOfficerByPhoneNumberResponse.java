package com.elara.bankone.modules.account_officer.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class GetAccountOfficerByPhoneNumberResponse extends BaseResponse {

  private Data data;

  public GetAccountOfficerByPhoneNumberResponse() {
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
