package com.elara.bankone.modules.account.dto.backbone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccountQuickResponseDto {
  private boolean IsSuccessful;
  private Data Message;

  @Getter
  @Setter
  @Builder
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Data {
    private String AccountNumber;
    private String CustomerID;
    private String FullName;
  }
}