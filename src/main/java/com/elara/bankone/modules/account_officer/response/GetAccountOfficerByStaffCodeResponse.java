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
public class GetAccountOfficerByStaffCodeResponse extends BaseResponse {

  private Data data;

  public GetAccountOfficerByStaffCodeResponse() {
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
