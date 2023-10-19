package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class UploadSupportingDocumentRequestDto {
  private String authtoken;
  private String AccountNumber;
  private String CustomerImage;
  private String CustomerSignature;

  private String version;
}
