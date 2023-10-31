package com.elara.sahaplus.log.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogTransactionRequest {
    @NotNull
    private String institutionCode;
    private String accountNumber;
    private long amountInKobo;
    private String referenceNumber;
    private String narration;
    private String terminalID;
    private long mfbChargeInKobo;
    private long appzoneChargeInKobo;
}
