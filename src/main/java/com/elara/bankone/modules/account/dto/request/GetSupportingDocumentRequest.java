package com.elara.bankone.modules.account.dto.request;

import lombok.Data;

@Data
public class GetSupportingDocumentRequest {
  private String accountNumber;
  private int doctype;

  private String version;
}
