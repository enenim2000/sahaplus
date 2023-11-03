package com.elara.bankone.modules.posting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchDepositUploadEntries {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("CreditAmount")
    private BigDecimal creditAmount;

    @JsonProperty("Narration")
    private String narration;

    @JsonProperty("BatchUploadAccountType")
    private String batchUploadAccountType;

    @JsonProperty("InstrumentNo")
    private String instrumentNo;

    @JsonProperty("EmployeeCode")
    private String employeeCode;
}
