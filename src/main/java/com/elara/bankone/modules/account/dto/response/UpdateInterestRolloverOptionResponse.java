package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class UpdateInterestRolloverOptionResponse extends BaseResponse {

  public UpdateInterestRolloverOptionResponse() {
    super();
  }

}