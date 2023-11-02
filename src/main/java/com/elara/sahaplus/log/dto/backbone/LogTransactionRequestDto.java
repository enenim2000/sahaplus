package com.elara.sahaplus.log.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogTransactionRequestDto {
    @NotNull
    private String institutionCode;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("AmountInKobo")
    private long amountInKobo;

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    @JsonProperty("Narration")
    private String narration;

    @JsonProperty("TerminalID")
    private String terminalID;

    @JsonProperty("MfbChargeInKobo")
    private long mfbChargeInKobo;

    @JsonProperty("AppzoneChargeInKobo")
    private long appzoneChargeInKobo;
}
