package com.elara.bankone.modules.account.dto.backbone;

import lombok.Data;

@Data
public class ChangeAccountLevelRequestDto {

  private String authtoken;
  private String AccountNumber;
  private long AccessLevel;

  //Optional
  private String version;

}