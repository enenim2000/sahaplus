package com.elara.sahaplus.posting.dto.backbone;

import com.elara.sahaplus.posting.BatchDepositUploadEntries;
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
