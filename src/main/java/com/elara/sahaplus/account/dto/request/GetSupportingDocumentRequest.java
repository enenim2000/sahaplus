package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class GetSupportingDocumentRequest {
  private String accountNumber;
  private int doctype;

  private String version;
}
