package com.elara.sahaplus.account.dto.backbone;

import lombok.Data;

@Data
public class RetrieveAccountNumberResponseDto {
  private boolean IsSuccessful;
  private String Message;
  private String mfbCode;
  private Data AccountDetails;

  public static class Data {
    private String AccountNumber;
    private String CustomerID;
    private String FullName;
    private String CreationMessage;
  }
}
