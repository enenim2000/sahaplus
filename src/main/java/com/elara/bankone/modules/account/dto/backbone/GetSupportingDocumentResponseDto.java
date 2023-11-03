package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetSupportingDocumentResponseDto {

  private String AccountNumber;
  private String CustomerImage;
  private String CustomerSignature;

}
