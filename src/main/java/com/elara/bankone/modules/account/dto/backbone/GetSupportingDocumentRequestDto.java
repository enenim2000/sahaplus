package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class GetSupportingDocumentRequestDto {
  private String authtoken;
  private String accountNumber;
  private int doctype;

  private String version;
}
