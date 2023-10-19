package com.elara.sahaplus.account.dto.request;

import lombok.Data;

@Data
public class ChangeAccountLevelRequest {

  private String accountNumber;
  private long accessLevel;

  //Optional
  private String version;
}
