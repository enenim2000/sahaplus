
package com.elara.sahaplus.account.dto.request;

import com.elara.sahaplus.enums.TransactionType;
import lombok.Data;

@Data
public class DoBalanceEnquiryRequest {

  private String InstitutionCode;
  private String AccountNumber;

  //Optional
  private long Amount;
  private long Fee;
  private String InstrumentNo;
  private String TransactionReference;
  private TransactionType TransactionType;
}