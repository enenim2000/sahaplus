package com.elara.sahaplus.account.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ChangeAccountLevelResponse extends BaseResponse {

  public ChangeAccountLevelResponse() {
    super();
  }

}
