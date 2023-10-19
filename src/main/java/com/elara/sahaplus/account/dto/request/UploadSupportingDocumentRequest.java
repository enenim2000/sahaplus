package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class UploadSupportingDocumentRequest {
  private String accountNumber;
  private String customerImage;
  private String customerSignature;

  private String version;
}
