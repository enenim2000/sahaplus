package com.elara.bankone.modules.account.dto.response;

import com.elara.bankone.util.BaseResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class UploadSupportingDocumentResponse  extends BaseResponse {

  public UploadSupportingDocumentResponse() {
    super();
  }

}
