package com.elara.sahaplus.account.dto.backbone;

import com.elara.sahaplus.enums.TransactionType;
import lombok.Data;

@Data
public class DoFundsTransferRequestDto {

  private String authtoken;
  private String InstitutionCode;
  private String AccountNumber;
  private String TransactionReference;

  //Optional
  private long Amount;
  private long Fee;
  private String InstrumentNo;
  private TransactionType TransactionType;
}