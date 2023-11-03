package com.elara.bankone.modules.account.dto.backbone;

import com.elara.bankone.enums.TransactionType;
import lombok.Data;

@Data
public class DoBalanceEnquiryRequestDto {

  private String authtoken;
  private String InstitutionCode;
  private String AccountNumber;

  //Optional
  private long Amount;
  private long Fee;
  private String InstrumentNo;
  private String TransactionReference;
  private TransactionType TransactionType;
}