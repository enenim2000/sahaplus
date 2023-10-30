package com.elara.sahaplus.account.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class DoNameEnquiryResponse extends BaseResponse {

  private String accountNumber;
  private String bvn;
  private String name;

  public DoNameEnquiryResponse() {
    super();
  }

}
