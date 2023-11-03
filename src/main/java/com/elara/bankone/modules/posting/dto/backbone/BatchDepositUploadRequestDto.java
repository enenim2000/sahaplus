package com.elara.bankone.modules.posting.dto.backbone;

import com.elara.bankone.modules.posting.BatchDepositUploadEntries;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchDepositUploadRequestDto {
    @NotNull
    @JsonProperty("AccountOfficerCode")
    private String accountOfficerCode;

    @JsonProperty("CheckPostWithEmployeeCode")
    private boolean checkPostWithEmployeeCode;

    @JsonProperty("BatchDepositUploadEntries")
    private BatchDepositUploadEntries batchDepositUploadEntries;
}
