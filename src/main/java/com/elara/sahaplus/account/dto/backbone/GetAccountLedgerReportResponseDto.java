package com.elara.sahaplus.account.dto.backbone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountLedgerReportResponseDto {

  private boolean IsSuccessful;
  private Data Message;

  @Getter
  @Setter
  @ToString
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Data {
    private String ID;
    private String AcctName;
    private String AcctNo;
    private String AccessLevel;
    private String CurrentBalance;
    private String DR;
    private String CR;
    private String RefID;
    private String TransDate;
    private String Balance;
    private String Narration;
    private String CurrentDate;
    private String OpeningBalance;
    private String InstrumentNo;
    private String EntryCode;
  }
}